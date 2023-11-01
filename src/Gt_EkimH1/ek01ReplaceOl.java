package Gt_Ekim_H1;

public class ek01ReplaceOl {
    public static void main(String[] args) {
        String str = "J1a5v8a +/can87dir15";
        // metindeki sayi ve karakterleri temizleyip
        // sadece harflerden olusan "Java candir" sekline donusturun

        // tum sayilari yok edelim

        // space'i korumak icin, space yerine bir rakam atayalim
        str=str.replaceAll("\\d", "");

        str=str.replaceAll("\\s", "5");

        str=str.replaceAll("5","");


        str=str.replaceAll("\\W","");

        System.out.println(str);

    }
}
