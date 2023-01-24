import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Num:");
        int num=sc.nextInt();
        System.out.println((num%2==0)?"Even":"Odd");//use only two contion
    }
}
