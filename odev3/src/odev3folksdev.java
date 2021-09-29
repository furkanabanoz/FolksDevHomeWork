public class odev3folksdev {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int k = 0; k < 6-(i+1); k++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < 2+(i*2); j++) {

                System.out.printf("*");
                
            }
            System.out.printf("\n");
        }
    }
}
