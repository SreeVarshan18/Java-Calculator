package com.harman.proj2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Integer a,b,c,d,e,f;

        Additon obj=new Additon();
        Sub obj2=new Sub();
        Mul obj3=new Mul();
        Div obj4=new Div();

        System.out.println("Enter 1st Number");
        a=input.nextInt();
        System.out.println("Enter 2nd Number");
        b= input.nextInt();

        c = obj.add(a, b);
        System.out.println(c);

        d= obj2.Subtract(a,b);
        System.out.println(d);

        e= obj3.Multiply(a,b);
        System.out.println(e);

        f= obj4.Divide(a,b);
        System.out.println(f);
    }
}
