package Day12;

public class InteractMethod {
    public static void main(String[] args) {
        int dob = 1980;
        int thisYear = 2024;

        int age = calculateAge(dob,thisYear);
        licenseEligibility(age);

    }

    private static void licenseEligibility(int age) {
        if (age>=18){
            System.out.println("You have right to get license.");
        }else {
            System.out.println("You can't get the license!");
        }
    }

    private static int calculateAge(int dob, int thisYear) {
        return thisYear-dob;
    }


}
