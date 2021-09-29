public class odev6folksdev {
    public static void main(String[] args) {
        int sayi;
        for (int i = 0; i <10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.printf(" ");
            }
            sayi=1;
            for (int k = 0; k <=i ; k++) {
                System.out.printf(sayi+" ");
                sayi =sayi*(i-k)/(k+1);
            }
            System.out.printf("\n");
            
        }
    }
}
