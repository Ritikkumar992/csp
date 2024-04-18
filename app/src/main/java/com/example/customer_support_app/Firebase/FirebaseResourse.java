package com.example.customer_support_app.Firebase;

import java.util.HashMap;
import java.util.Map;

public class FirebaseResourse {
    private Map<String, Object> map;

    public FirebaseResourse(){
        map = new HashMap<>();
    }

    // Getter method to access the map
    public  Map<String, Object> getMap() {
        return map;
    }


}
