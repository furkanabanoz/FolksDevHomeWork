public class odev5folksdev {
    public static void main(String[] args) {
        int a=0,b=1,c;
        System.out.printf(a+" + "+b+" = 1");

        for (int i = 2; i <=16 ; i++) {
            c=a+b;

            System.out.printf(a+" + "+b+" = "+c+"\n");
            a=b;
            b=c;
        }
    }
}
