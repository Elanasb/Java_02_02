package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Iveskite savo zodi ");
        Scanner sc = new Scanner(System.in);
        String zodis = sc.nextLine();
        System.out.println(zodis);
        System.out.println(zodis.length());
    }
}
