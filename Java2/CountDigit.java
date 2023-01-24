import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to Count length:");
        int num=sc.nextInt();
       int NumOfCount=0;


        while(num>0){
            num/=10;
            NumOfCount++;
        }
    System.out.println("Length of Num is:"+NumOfCount);
    }
}
