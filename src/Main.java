import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Say a number:");
        int number = scanner.nextInt();
        if(number<10 || number>20){
            System.out.println("this is truth");
        } else {
            System.out.println("this is false");
        }
    }
}
