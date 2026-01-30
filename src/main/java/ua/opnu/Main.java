package ua.opnu;

import com.google.gson.Gson;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Map<String, String> result = new LinkedHashMap<>();
        result.put("name", "Maksym");
        result.put("lastName", "Slyvka");

        System.out.println(gson.toJson(result));
    }
}