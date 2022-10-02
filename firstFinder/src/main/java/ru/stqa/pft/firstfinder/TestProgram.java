package ru.stqa.pft.firstfinder;

import java.util.Scanner;

public class TestProgram {

       public static void main (String[] args) {
              hello(getName());

              Square s = new Square(2);
              System.out.println("Площадь квадрата со сторонами " + s.l + " = " + s.area());

              Rectangle r = new Rectangle(2, 4);
              System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

       }

       public static void hello(String somebody) {
              System.out.println("Hello " + somebody + "!");
       }
       public static String getName () {
//              System.out.print("Введите Ваше имя: ");
//              Scanner input = new Scanner(System.in);
//              String name = input.next();

              String name = "Nick";

              return name;
       }
}
