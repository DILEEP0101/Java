public class BitWise {
    public static void main(String[] args) {
        int p=9,q=10;

        // bitwise operators first of all convert into binary form then operation after this gives output in decimal form
        System.out.println(p|q);//0 | 1 =>1
        System.out.println(p&q);//0 & 1 =>0
        System.out.println(p^q);// 0 ^ 0 =>0,1^1=>0,0^1=>1
        System.out.println(p<<1);//left shift 
        System.out.println(p<<2);//left shift
        System.out.println(q>>1);//right shift
        System.out.println(q>>2);//right shift

        System.out.println(~5);//invert all the bits ,0->1,1->0


    }
    
}
