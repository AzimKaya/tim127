package Gt_Ekim_H1;

public class ek01İndexof {
    public static void main(String[] args) {

        String str = "Java candir, Selenium heyecan.";
        System.out.println(str.indexOf("Selenium"));

        if (str.indexOf("Java" )==-1){
            System.out.println("false");
        }else {
            System.out.println("true");

            System.out.println(str.indexOf("a", 4));
        }

        if (str.indexOf("a",28)==-1){
            System.out.println("str sadece 4 tane a iceriyor");
        }else {
            System.out.println("5. anin indexi:"+str.indexOf("a",28));
        }


    }
}
