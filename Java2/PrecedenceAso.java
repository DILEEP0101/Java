public class PrecedenceAso {
    public static void main(String[] args) {
        int p=4,q=3,r=2;
        int s=p-++r-++q;
        System.out.println(s);
        System.out.println("Pqr"+4+2);
        System.out.println(4+2+"pqr");

    }
    
}
