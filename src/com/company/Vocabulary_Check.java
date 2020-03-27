//package com.company;
//
//import java.io.*;
//import java.nio.CharBuffer;
//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) throws FileNotFoundException {
//        String path = "src\\com\\company\\src\\vocabulary_check.txt";
//        File file = new File(path);
//
//        HashMap<Character, Integer> hashMap = new HashMap<>();
//        for (char c = 'A'; c <= 'Z'; c++) {
//            hashMap.put(c, 0);
//        }
//        for (char c = 'a'; c <= 'z'; c++) {
//            hashMap.put(c, 0);
//        }
//
//        FileReader fileReader = new FileReader(file);
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
////        for (char c)
//        int cint;
//        try {
//            cint = fileReader.read();
//            char c = (char) cint;
//            while (cint != -1) {
//                if (hashMap.containsKey(c)) {
//                    hashMap.put(c, hashMap.get(c) + 1);
//                }
//                cint = fileReader.read();
//                c = (char) cint;
////                System.out.println(c);
//            }
//        } catch (EOFException e) {
//            System.out.println("End of File");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
////        for (Map.Entry<Character, Integer> pair: hashMap.entrySet()) {
////            System.out.println(pair.getKey() + ":" + pair.getValue());
////        }
//
//        for (Map.Entry<Character, Integer> pair: hashMap.entrySet()) {
//            System.out.print(pair.getKey() + " ");
//        }
//        System.out.println();
//        for (Map.Entry<Character, Integer> pair: hashMap.entrySet()) {
//            System.out.print(pair.getValue() + " ");
//        }
//    }
//}
