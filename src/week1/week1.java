package week1;

import java.util.Scanner;

public class week1 {
    public static void main(String [] args) {
        week1 w = new week1();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("please enter the number: ");
//        int depth = sc.nextInt();
//        if(w.timeToSki(depth)) {
//            System.out.println("can ski");
//        }
//        else {
//            System.out.println("not enough snow");
//        }

        w.printStars(5);

    }

    public boolean timeToSki(int depth) {
        if(depth > 30) {
            return true;
        }
        else {
            return false;
        }
    }

    public void printStars(int n) {
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
