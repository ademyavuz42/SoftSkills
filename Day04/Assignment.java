package Day04;
class Assignment{
    public static void main(String[] args) {
        // Assignment operators
        int number = 5; // equal assignment

        number += 2;    // addition assignment
        System.out.println(number);

        number -= 1;    // subtraction assignment
        System.out.println(number);

        number *= 3;    // multiplication assignment
        System.out.println(number);

        number /= 2;    // division assignment
        System.out.println(number);

        int remain = number%2;  // modulus assignment
        System.out.println(remain);

        int numberOfCandy = 25;
        if (numberOfCandy %2==0){
            System.out.println("Number of candy is an even");
        } else {
            System.out.println("Number of candy is an odd");
        }

    }
}