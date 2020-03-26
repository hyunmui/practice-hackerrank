package com.flexibledev.hackerrank.solutions;

import java.util.Scanner;

/**
 * Hacker Rank Solution Implementation
 */
public class SolutionImpl implements Solution {

    /**
     * Welcome to Java!
     */
    @Override
    public void solve_question_01() {
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }

    /**
     * Java Stdin and Stdout I
     * 
     * Input : 42 100 125 Output : 42 100 125
     */
    @Override
    public void solve_question_02() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        scan.close();
    }

    @Override
    /**
     * Java Stdin and Stdout I
     */
    public void solve_question_03() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        if (isOdd(N)) {
            System.out.println("Weird");
        } else if (isEven(N) && N >= 2 && N <= 5) {
            System.out.println("Not Weird");
        } else if (isEven(N) && N >= 6 && N <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }

    private boolean isEven(int n) {
        return n % 2 == 0;
    }

    private boolean isOdd(int n) {
        return !isEven(n);
    }

    /**
     * Java Stdin and Stdout II
     */
    @Override
    public void solve_question_04() {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    /**
     * Java Output Formatting
     */
    @Override
    public void solve_question_05() {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 1; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%04d %n", s1, x);
        }
        System.out.println("================================");
        sc.close();
    }

    /**
     * Java Loops I
     */
    @Override
    public void solve_question_06() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", n, i, n * i);
        }
    }

    /**
     * Java Loops II
     */
    @Override
    public void solve_question_07() {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int mul = 1;
            int result = a;

            for (int j = 0; j < n; j++) {
                result += mul * b;
                System.out.print(result + " ");
                mul *= 2;
            }
            System.out.println();
        }
        in.close();
    }
}