import java.util.Scanner;

public class Takinginput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name");
        String s=sc.nextLine();// print with the space along name
        // String s=sc.next();//only print first name after space it not print any think
        System.out.println("Your name is"+" "+s);



        // System.out.println("Enter your lucy number");
        // int num=sc.nextInt();
        // System.out.println("Your Lucky number is"+" "+num);
        // System.out.println("Your name is"+" "+s);

    }
    
}
