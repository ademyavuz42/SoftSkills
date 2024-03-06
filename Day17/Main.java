package Day17;

public class Main {
    public static void main(String[] args) {

        String text = "Hello world!";
        String bos = "";

        // isEmpty() = true / false
        System.out.println(text.isEmpty()); // false
        System.out.println(bos.isEmpty());  // true

        // indexOf(String str)
        System.out.println(text.indexOf("w"));  // 6
        System.out.println(text.indexOf("p"));  // -1

        // indexOf(String str, int num)
        System.out.println(text.indexOf("o",5));    // 7

        // lastIndexOf()
        System.out.println(text.lastIndexOf("l"));  // 9

        // lenght()
        System.out.println(text.length());  // 12

        // toUpperCase()
        String updatedText = text.toUpperCase();
        System.out.println(updatedText); // HELLO WORLD!

        // toLowerCase()
        System.out.println(updatedText.toLowerCase());  // hello world!

        // concat()
        String mergedText = text.concat(" ".concat(updatedText));
        System.out.println(mergedText);     // Hello world! HELLO WORLD!






    }
}
