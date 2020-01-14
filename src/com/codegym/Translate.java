package com.codegym;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Translate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input arr : ");
        String arr = sc.nextLine();
        Map<String,String> map = new HashMap<String, String>();

        map.put("professional","chuyen gia");
        map.put("castle","lau dai");
        map.put("palace","cung dien");
        map.put("knight","hiep si");
        map.put("stupid","ngu ngoc");

        Translate translate = new Translate();
        translate.find(arr, (HashMap<String, String>) map);
    }

    public void find(String arr, HashMap<String,String> map){
        for (String key: map.keySet()){
            if (map.containsKey(arr)){
                System.out.println(map.get(arr));
                break;
            }
            else {
                System.out.println("404. Not found");
                break;
            }
        }
    }
}
