package Day07;

public class ForIterationLoop {
    public static void main(String[] args) {
        System.out.print("[");
        for (int i = 1; i < 100; i++) {
            if (i%2!=0 && i%3==0) {
                System.out.print(i+"\t");
            }
        }
        System.out.println("\b]");
    }
}
