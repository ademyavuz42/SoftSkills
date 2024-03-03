package Day08;

public class NestedForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i+".");
            for (int j = 0; j < 4; j++) {
                System.out.print(0);
            }
            System.out.println();
        }
        System.out.println("-----------");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i+".");
            for (int j = 1; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("-----------");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i+".(");
            for (int j = 5; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println(")");
        }
        System.out.println("-----------");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i+".(");
            for (int j = 5; j >= 1; j--) {
                System.out.print(j*2+" ");
            }
            System.out.println(")");
        }

    }
}
