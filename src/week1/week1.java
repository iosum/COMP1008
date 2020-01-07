import java.util.Scanner;

public class week1 {
    public static void main(String [] args) {
        week1 w = new week1();
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number: ");
        int depth = sc.nextInt();
        if(w.timeToSki(depth)) {
            System.out.println("can ski");
        }
        else {
            System.out.println("not enough snow");
        }

    }

    public boolean timeToSki(int depth) {
        if(depth > 30) {
            return true;
        }
        else {
            return false;
        }
    }
}
