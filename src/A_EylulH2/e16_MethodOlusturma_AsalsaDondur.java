package A_Eylul_H_2;

public class e16_MethodOlusturma_AsalsaDondur {
    public static void main(String[] args) {





        // Verilen pozitif bir tamsayinin
        // asal sayi olup olmadigini kontrol edip
        // asal ise true, asal degil ise false donduren
        // bir method olusturun


        asalsaDondur(47);

        System.out.println(asalsaDondur(3));
    }

    public static  boolean asalsaDondur(int sayi){
        boolean flag=true;

        for (int i = 2; i < sayi; i++) {

            if (sayi%i==0){
                flag=false;

                break;
            }

        }

        return flag;









    }
}
