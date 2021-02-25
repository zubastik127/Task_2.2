package com.company;

public class Phone {

    public static void main(String[] args) {

        String phoneNumber = "+7 (910) 555 44 33";

        System.out.println(correction(phoneNumber)[0]);
        System.out.println(correction(phoneNumber)[1]);

    }

    public static String[] correction(String phoneNumber) {

        String[] outcome = new String[2];

        String a;
        String b;
        String c;
        String d;
        String e;

        if (phoneNumber.contains("+7")) {
            phoneNumber = phoneNumber.replace("+7", "8");
            a = "Замена +7 на 8";
        } else {
            a = "";
        }

        if (phoneNumber.contains("(") || phoneNumber.contains(")")) {
            phoneNumber = phoneNumber.replace("(", "");
            phoneNumber = phoneNumber.replace(")", "");
            b = "В номере есть скобки";
        } else {
            b = "";
        }

        if (phoneNumber.contains(" ")) {
            phoneNumber = phoneNumber.replaceAll(" ", "");
            c = "В номере есть пробелы";
        } else {
            c = "";
        }

        if (phoneNumber.length() == 11) {
            d = phoneNumber;
            outcome[0] = d;
            outcome[1] = a + "; " + b + "; " + c;
        } else {
            d = "Введен некорректный номер";
            e = "Количество символов не равно 11";
            outcome[0] = d;
            outcome[1] = e;
        }

        return outcome;

    }
}

