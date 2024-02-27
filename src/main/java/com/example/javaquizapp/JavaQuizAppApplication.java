package com.example.javaquizapp;

import java.util.Scanner;

public class JavaQuizAppApplication {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] answers = {"b", "c", "a"};
        String [] response = {"", "", ""};


        System.out.println("What is the difference between == and .equals() in Java?");
        System.out.println("a) There are no difference");
        System.out.println("b) == is used for primitive data types (int, char, etc.), whereas .equals() is used for objects to check logical equivalence");
        System.out.println("c) .equals() can be used if statements as well as in loops ");
        System.out.println();

        System.out.println("What is the purpose of the final keyword in Java when applied to classes?");
        System.out.println("a) it prevents the class from being overridden by subclasses");
        System.out.println("b) It needs to be applied at the end of the class code by that indicating its final stage");
        System.out.println("c) When applied to a class, it prevents the class from being subclassed, meaning no class can extend a final class ");
        System.out.println();

        System.out.println("Explain the use of the try-catch block in Java.");
        System.out.println("a) In Java, a try-catch block is used for exception handling.");
        System.out.println("b) In Java, a try-catch block is used for error handling.");
        System.out.println("c) In Java, a try-catch block can be used for exception and error handling together. ");
        System.out.println();

        response[0] = scan.next();
        response[1] = scan.next();
        response[2] = scan.next();

        int score   = 0;

       for(int i = 0; i < 3; i++){
           if(response[i].equalsIgnoreCase(answers[i])){
               score++;
           }
       }
        System.out.println("score:" + score + "/3");
    }
}
