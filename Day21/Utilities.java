package Day21;

public class Utilities {
    public int toplam(int x, int y) {

        return x + y;
    }

    public char ilkHarfAl(String text) {
        return text.charAt(0);
    }

    public String subStringAl(String text, int numberOfChar){
        return text.substring(0,numberOfChar);
    }

    public char sonKarakterAl(String text) {
        String lastChar = (text.charAt(text.length()-1)+"").toLowerCase();
        return lastChar.charAt(0);
    }
}
