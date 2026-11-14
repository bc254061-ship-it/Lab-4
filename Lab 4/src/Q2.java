import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double bmi, waistSize;
        String gender, weightCategory, healthRisk;

        System.out.println("===== BMI AND HEALTH RISK =====");

        System.out.print("Enter BMI: ");
        bmi = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter Gender (Women / Men): ");
        gender = scan.nextLine();

        System.out.print("Enter Waist Size (inches): ");
        waistSize = scan.nextDouble();

        // Determine BMI Category

        if (bmi < 0) {
            System.out.println("Invalid BMI");
            scan.close();
            return;
        }
        else if (bmi < 18.5) {
            weightCategory = "BMI Category Not Specified";
        }
        else if (bmi <= 24.9) {
            weightCategory = "Normal";
        }
        else if (bmi <= 29.9) {
            weightCategory = "Overweight";
        }
        else if (bmi <= 34.9) {
            weightCategory = "Obese";
        }
        else {
            weightCategory = "Severely Obese";
        }

        System.out.println("Weight Category: " + weightCategory);

        // Determine Health Risk

        if (gender.equalsIgnoreCase("Women")) {

            if (waistSize > 35) {
                healthRisk = "Higher Risk";
            }
            else {
                healthRisk = "No Higher Risk";
            }
        }
        else if (gender.equalsIgnoreCase("Men")) {

            if (waistSize > 40) {
                healthRisk = "Higher Risk";
            }
            else {
                healthRisk = "No Higher Risk";
            }
        }
        else {
            System.out.println("Invalid Gender");
            scan.close();
            return;
        }

        System.out.println("Health Risk: " + healthRisk);

        if (healthRisk.equals("Higher Risk")) {
            System.out.println("********************************************");
            System.out.println("CAUTION!!");
            System.out.println("HIGHER RISK FOR HEART DISEASE AND TYPE 2 DIABETES!!");
            System.out.println("********************************************");
        }

        scan.close();
    }
}
