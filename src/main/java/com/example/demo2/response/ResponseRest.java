package com.example.demo2.response;

import java.util.ArrayList;
import java.util.HashMap;

public class ResponseRest {

    private ArrayList<HashMap<String, String>> metadata = new ArrayList<>();

    public ArrayList<HashMap<String, String>> getMetadata() {
        return metadata;
    }

    public void SetMetadata(String type, String code, String message) {

        HashMap<String, String> mapa = new HashMap<String, String>();
        mapa.put("type", type);
        mapa.put("code", code);
        mapa.put("message", message);
        metadata.add(mapa);
    }
}
