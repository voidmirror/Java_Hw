//package com.company;
//
//import java.text.SimpleDateFormat;
//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) {
//        String name, sex;
//        int birthYear = 0;
//        Calendar calendar = new GregorianCalendar();
//        Date date;
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
//        date = calendar.getTime();
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your name: ");
//        name = scanner.next();
//        System.out.println("Enter your birthYear: ");
//        while (birthYear == 0) {
//            try {
//                birthYear = scanner.nextInt();
//                if (birthYear > date.getYear()) {
//                    System.out.println("Nope. Not from the future. Try again");
//                    birthYear = 0;
//                }
//                int age;
//                age = date.getYear() - birthYear + 1;
//                System.out.println("Age: " + age);
//            } catch (InputMismatchException e) {
//                System.out.println("Must be a number, repeat");
//            }
////            birthYear = scanner.nextInt();
//
//        }
////        System.out.println("Enter your sex (m/f): ");
////        sex = scanner.next();
//
//        StringBuffer stringBuffer = new StringBuffer();
//        int tmp;
//        ArrayList<String> fio = new ArrayList<>();
//        for (String retval : name.split(" ", 3)) {
//            fio.add(retval);
//        }
//
//        stringBuffer.append(fio.get(0));
//        System.out.println("Surname: " + stringBuffer);
//        stringBuffer.delete(0, stringBuffer.length());
//
//        stringBuffer.append(fio.get(2));
//        if (stringBuffer.charAt(stringBuffer.length() - 1) == 'а') {
//            sex = "f";
//        } else {
//            sex = "m";
//        }
//        System.out.println("Sex: " + sex);
//        stringBuffer.delete(0, stringBuffer.length());
//
//        StringBuffer initials = new StringBuffer();
//        initials.append(fio.get(0));
//        stringBuffer.append(initials.charAt(0));
//        initials.delete(0, initials.length());
//        initials.append(fio.get(1));
//        stringBuffer.append(initials.charAt(0));
//        initials.delete(0, initials.length());
//        initials.append(fio.get(2));
//        stringBuffer.append(initials.charAt(0));
//        initials.delete(0, initials.length());
//        System.out.println("Initials: " + stringBuffer);
//
//
//
//    }
//}
