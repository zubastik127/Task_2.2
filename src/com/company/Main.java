package com.company;

public class Main {

    public static void main(String[] args) {

        String phoneNumber = "+7 (910) 555 44 33";

        System.out.println(correction(phoneNumber)[0]);
        System.out.println(correction(phoneNumber)[1]);
    }

    public static String[] correction(String phoneNumber) {

        String[] outcome;

        String a;
        String b;
        String c;
        String d;
        String e;
        String f;

        if (phoneNumber.contains("+7") || phoneNumber.contains("(") || phoneNumber.contains(")") || phoneNumber.contains(" ") || phoneNumber.length() != 11) {

            if (phoneNumber.contains("+7")) {
                phoneNumber = phoneNumber.replace("+7", "8");
                a = "Замена +7 на 8; ";
            } else {
                a = "";
            }

            if (phoneNumber.contains("(") || phoneNumber.contains(")")) {
                phoneNumber = phoneNumber.replace("(", "");
                phoneNumber = phoneNumber.replace(")", "");
                b = "В номере есть скобки; ";
            } else {
                b = "";
            }

            if (phoneNumber.contains(" ")) {
                phoneNumber = phoneNumber.replaceAll(" ", "");
                c = "В номере есть пробелы; ";
            } else {
                c = "";
            }

            if (phoneNumber.length() == 11) {
                d = phoneNumber;
                f = "";
            } else {
                d = "Введен некорректный номер";
                f = "Количество символов не равно 11";
            }

            e = a + b + c + f;

            outcome = new String[]{d, e};

        } else {

            f = "Не было изменений";
            outcome = new String[]{phoneNumber, f};
        }

        return outcome;

    }
}

