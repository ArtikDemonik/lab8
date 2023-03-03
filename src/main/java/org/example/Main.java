package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Reader[] arr = new Reader[5];
        for(int i = 0; i < arr.length; i++){
            String fullname = in.next();
            String faculty = in.next();
            String dateOfBirth = in.next();
            String phone = in.next();
            arr[i] = new Reader(fullname, faculty, dateOfBirth, phone);
        }
    }
}
