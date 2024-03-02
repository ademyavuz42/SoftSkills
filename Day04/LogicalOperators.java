package Day04;

public class LogicalOperators {
    public static void main(String[] args) {
        // logical operators
        boolean statu01 = true;
        boolean statu02 = false;

        boolean statuMain = statu01 && statu02;     // and operator
        System.out.println(statuMain);
        statuMain = statu01 || statu02;             // or operator
        System.out.println(statuMain);
        statuMain = !statu01;                       // not operator
        System.out.println(statuMain);
    }
}
