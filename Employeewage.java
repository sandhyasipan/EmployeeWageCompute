package com.bridgelab;


    public class Employeewage {
        public static void main(String[] args) {
            int ispresent = 1;
            int emptype = (int) (Math.random() * 100) % 2;
            if (emptype == ispresent) {
                System.out.println("Employee is present");
            } else
                System.out.println("Employee is absent");
        }
    }

