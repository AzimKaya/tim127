package A_Eylul_H_1;

public class e05_C01_stringManipulations {
    public static void main(String[] args) {

        String str ="Java en guzel programlama dili";

        System.out.println(str.substring(5));
        System.out.println(str.substring(0));

        System.out.println(str.substring(1));
        System.out.println(str.substring(str.length()-4));

        System.out.println(str.substring(0,4));
        System.out.println(str.substring(8,13));

        System.out.println(str.substring(0,1));
        System.out.println(str.substring(3,4));

        String index6dakiHarf=str.substring(6,7);
        System.out.println(index6dakiHarf);

        System.out.println("=========="+str.substring(5,5)+"=========");
    }
}
