public class odev4folksdev {
    public static void main(String[] args) {
        int sayac = 0;
        for (int i = 2; i <101 ; i++) {
            for (int j = 1; j <=i ; j++) {

                if(i%j==0)
                {
                    sayac++;
                }

            }
            if (sayac==2)
            {
                System.out.printf("%d sayisi asaldir \n",i);
                sayac=0;
            }
            else
            {
                sayac=0;
            }

        }
    }
}
