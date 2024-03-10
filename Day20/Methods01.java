package Day20;

public class Methods01 {
    public static void main(String[] args) {

        // replace() ->replace the char or String
        String text = "Hafizo Turrahma";
        String newText = text.replace("o Turrahma", "e Yavuz");
        System.out.println(newText);

        // trim() -> remove the white space before beginning and after the text
        String rawText = "     adem yavuz     ";
        String trimmedText = rawText.trim();
        System.out.println(rawText);
        System.out.println(trimmedText);

        // startsWith() -> Checking starting part, return as true or false
        System.out.println(rawText.startsWith("ade"));
        System.out.println(trimmedText.startsWith("ade"));

        //endsWith() -> Checking ending part, return as true or false
        System.out.println(rawText.endsWith("vuz"));
        System.out.println(trimmedText.endsWith("vuz"));

        // Character
        int counter = 0;
        for (int i = 0; i < rawText.length(); i++) {
            char karakter = rawText.charAt(i);
            if (Character.isWhitespace(karakter)){
                counter++;
            }
        }
        System.out.println("number of white spaces : "+counter);


    }
}
