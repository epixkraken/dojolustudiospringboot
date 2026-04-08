package com.example.accessingdatarest;

import java.util.HashMap;
import java.util.Map;

public class Cache {

    // instancia es privada y estatica
    private static Cache instance;

    // aqui es como un mapa q va a guardar los datos
    private final Map<String, String> keyMap;

    // contructor privado para q nadie se aloque haga un new cache xd
    private Cache() {
        keyMap = new HashMap<>();
    }

    // metodo global para tener la inctancia
    public static synchronized Cache getInstance() {
        if (instance == null) {
            instance = new Cache();
        }
        return instance;
    }

    // metodos q intereactuan con el mapa
    public void setCacheValue(String key, String val) {
        keyMap.put(key, val);
    }

    public String getCacheValue(String key) {
        return keyMap.get(key);
    }
}