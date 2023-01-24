import java.util.Scanner;
//Given numbers a and b raise to the power of b.

public class RaiseToPower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        int res=1;
        for(int i=1;i<=b;i++){
            res=res*a;
        }
        System.out.println("Power of a^b is:"+res);
    }
}
