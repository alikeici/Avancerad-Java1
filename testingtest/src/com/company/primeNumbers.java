package com.company;


class primeNumbersTo350 implements Runnable {
    private String name;

    public primeNumbersTo350(String name) {
        this.name = name;
    }


    public void run() {
        // print prime numbers from 1 - 350 000
        System.out.println("Prime numbers from 1 to 350 000 ");

        for (int i = 2; i <= 350000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

    }

    public static boolean isPrime(int num) {
        if (num == 2 || num == 3) {
            return true;
        }

        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 3; i < Math.sqrt(num); i += 2) {
            if (num % i == 0 || num % Math.sqrt(num) == 0) {
                return false;
            }
        }
        return true;

    }
}

class primeNumbersTo500 implements Runnable {
    private String name;

    public primeNumbersTo500(String name) {
        this.name = name;
    }


    public void run() {
        // print prime numbers from 350 001 - 500 000
        System.out.println("Prime numbers from 350 001 to 500 000 ");


        for (int i = 350001; i <= 500000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }

        }
    }


    public static boolean isPrime(int num) {
        if (num == 2 || num == 3) {
            return true;
        }

        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 3; i < Math.sqrt(num); i += 2) {
            if (num % i == 0 || num % Math.sqrt(num) == 0) {
                return false;
            }
        }
        return true;
    }
}





