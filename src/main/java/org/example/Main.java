package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void method-1(){
      System.out.println("Hello World");
    }
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        if(Constant.data < 15) {
            System.out.println("data is below 10 ");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
