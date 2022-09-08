package ru.stqa.pft.firstfinder;

import java.util.Scanner;

public class TestProgram {

       public static void main (String[] args) {
              hello(getName());
       }

       public static void hello(String somebody) {
              System.out.println("Hello " + somebody + "!");
       }
       public static String getName () {
              Scanner input = new Scanner(System.in);
              String name = input.next();

              return name;
       }
}
