package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock<0 || clock>23){
            return false;
        }
        if (isBarking && (clock >= 20 || clock < 8)) return true;

        return false;

    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       if((firstAge<=19&&firstAge>=13)||(secondAge<=19&&secondAge>=13)||(thirdAge<=19&&thirdAge>=13)){
           return true;
       }
       return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (!isSummer && temp >= 25 && temp <= 35) {
            return true;
        }
        else if (isSummer && temp >= 25 && temp <= 45) {
            return true;
        }
        return false;
    }

    public static double area(double width, double height) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("genişlik değerini giriniz");
        width = scanner.nextDouble();
        System.out.println("yükseklik değerini giriniz");
        height = scanner.nextDouble();
        if (width<0||height<0){
            return -1;
        }
        return width*height;
    }

    public static double area(double radius) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("yarıçap değerini giriniz");
        radius = scanner.nextDouble();
        if (radius<0){
            return -1;
        }
        return radius*radius*Math.PI;
    }
}
