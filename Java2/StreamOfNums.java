import java.util.Scanner;

public class StreamOfNums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers");
        int num=sc.nextInt();
        int sum=0;

        while(num !=-1){
            sum+=num;
            num=sc.nextInt();
        }
        System.out.println("Sum of all num is :"+sum);
    }
}
