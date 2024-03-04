package Day10;

public class BreakStatement {
    public static void main(String[] args) {

        // break use in switch or loop
        for (int i = 1; i < 100; i+=2) {
            if (i==53){
                System.out.println(i+ " : sayisi bulundu");
                break;
            }
            System.out.println(i);
        }

        // use break in switch case
        String mevsim = "kis";
        switch (mevsim){
            case "ilkbahar":
                System.out.println("Gelmis bahar, acmis cicekler, \nRenk renk doga, sevincle doldu gokler.");
                break;
            case "yaz":
                System.out.println("Sicak gunes yukseldi tepelere,\nDenizde serinlik, ferah bir esintiye.");
                break;
            case "sonbahar":
                System.out.println("Dusen yapraklar, kizillikla suslendi,\nRuzgar eserken, doganin sirri cozuldu.");
                break;
            case "kis":
                System.out.println("Beyaz ortu, dusmus tum yollara,\nSicacik caylarla isiniyor her evin odasi.");
                break;
            default:
                System.out.println("Gecersiz mevsim secimi!");
        }

    }
}
