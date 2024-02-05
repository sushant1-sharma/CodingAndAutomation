package org.example.stepDefinition;

import io.cucumber.java.en.Given;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.testng.annotations.Test;
import com.github.fge.jsonschema.main.JsonSchema;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;





import io.cucumber.java.*;


import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;

public class SortHashMap {

    @Test
    public void sortHashMapByKey() {
        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("Sushant", 100);
        myMap.put("Aryan", 50);
        myMap.put("Vinod", 200);
        myMap.put("Gaurav", 110);
        myMap.put("Krish", 89);

        System.out.println(myMap);

        ArrayList<String> myList = new ArrayList<>(myMap.keySet());
        Collections.sort(myList);
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

        for (String key : myList) {
            sortedMap.put(key, myMap.get(key));
        }

        System.out.println(sortedMap);
    }

    @Test
    public void sortHashMapByValue() {
        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("Sushant", 100);
        myMap.put("Aryan", 50);
        myMap.put("Vinod", 200);
        myMap.put("Gaurav", 110);
        myMap.put("Krish", 89);

        System.out.println(myMap);
        ArrayList<Integer> myList = new ArrayList<>(myMap.values());
        Collections.sort(myList);

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

        for (Integer value : myList) {
            for (String key : myMap.keySet()) {
                if (myMap.get(key).equals(value)) {
                    sortedMap.put(key, value);
                }
            }
        }

        System.out.println(sortedMap);
    }
}
