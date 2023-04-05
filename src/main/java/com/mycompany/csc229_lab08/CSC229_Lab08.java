/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.csc229_lab08;

import java.util.*;

/**
 *
 * @author mattl
 */
public class CSC229_Lab08 {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        LinkedList<Integer> primeList = new LinkedList<>();
        LinkedList<Integer> threeList = new LinkedList<>();

        for (int i = 0; i <= n; i++) {
            if (isPrime(i)) {
                primeList.add(i);
                if (String.valueOf(i).contains("3")) {
                    threeList.add(i);
                }
            }
        }
        System.out.println("Prime Numbers List: " + primeList);
        System.out.println("Prime Numbers with 3 List: " + threeList);
        int sum = 0;
        for (int i : threeList) {
            sum += i;
        }
        System.out.println("Sum of Prime Numbers with 3: " + sum);
    }
}
