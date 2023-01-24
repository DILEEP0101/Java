import java.util.Scanner;

public class ReveDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Num to Reverse Digit");
        int num=sc.nextInt();
        int rev=0;
        // while(num>0){
        //     rev=num%10;
        //     num=num/10;
        //     System.out.print(rev);
        // }
        while(num>0){
            rev=rev*10+num%10;
            num/=10;
        }
        System.out.print(rev);

    }
}
