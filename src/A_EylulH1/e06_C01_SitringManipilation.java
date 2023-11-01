package A_Eylul_H_1;

import java.util.Scanner;

public class e06_C01_SitringManipilation {
    public static void main(String[] args) {
        //kullanicidan bir mail alin
        //   - mail @ icermiyorsa "gecersiz mail"
        //   - mail @gmail.com icermiyorsa, "mail gmail olmali"
        //   - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var" yazdirin.


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen mail adresini giriniz");
        String mail =scanner.nextLine();

        if (!mail.contains("@")){
            System.out.println("gecersiz mail");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");

        } else if (mail.endsWith("@gmal.com")) {
            System.out.println("mailde yazim hatasi var");

        }

    }
}
