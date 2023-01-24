import java.util.Scanner;

public class ReadChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter caracter");
        char ch = sc.next().charAt(4);//use for character to fetch any string
        System.out.println("Character is:"+ch);
    }
}
