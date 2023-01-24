import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter for count Digit sum");
        int num=sc.nextInt();
        int SumOfDigit=0;
        int original_n=num;

        while(num>0){
            SumOfDigit+=num%10;

            num=num/10;

        }
        System.out.println(SumOfDigit);
    }
}
