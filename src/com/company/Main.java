package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        Unary<Double> unary =sqrt() ;
        System.out.println(unary.sqrt1(sc.nextDouble()));

    }

    public static Unary<Double> sqrt (){
        return (x) ->Math.sqrt( x);

    }
}
    