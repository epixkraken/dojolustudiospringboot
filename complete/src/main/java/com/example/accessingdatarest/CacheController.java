package com.example.accessingdatarest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// esta clase hicimos para que se pueda ver el
// cache en el front end porque ya pues aesthetikkk
// tampoco entendimos muy bien lo del 1 y 0 del singleton
// y cache pero por eso decidimos hacerle al cache q apareca
// cuando se ingerse un nuevo person al people xd
@RestController
@CrossOrigin(origins = "*")
public class CacheController {

    @GetMapping("/api/cache")
    public String getCacheStatus() {
        // Recuperamos el valor del Singleton
        String valor = Cache.getInstance().getCacheValue("ultimo_ingreso");
        return (valor != null) ? valor : "Nadie todavía";
    }
}