public class odev2folksdev {
    public static void main(String[] args) {
        for (int i = 1; i <=6 ; i++) {

            for (int k = 1; k <=6-i ; k++) {
                System.out.printf(" ");
            }

            for (int j = 1; j <=i ; j++) {
                System.out.printf(String.valueOf(j));
            }
            System.out.printf("\n");
            
        }
    }

}
