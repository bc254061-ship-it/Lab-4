import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Program code: ");
        String programCode = scan.next().toUpperCase();

        System.out.print("Semester number: ");
        int semesterNumber = scan.nextInt();

        System.out.print("Credit hours registered: ");
        int creditHours = scan.nextInt();

        String masterProgram;
        double firstFee;
        double subsequentFee;
        double feePerCredit;

        if (programCode.equals("MCS")) {
            masterProgram = "Master of Computer Science";
            firstFee = 1250;
            subsequentFee = 1000;
            feePerCredit = 250;
        }
        else if (programCode.equals("ME")) {
            masterProgram = "Master of Environment";
            firstFee = 1400;
            subsequentFee = 1100;
            feePerCredit = 250;
        }
        else if (programCode.equals("MPM")) {
            masterProgram = "Master in Plantation Management";
            firstFee = 1250;
            subsequentFee = 1000;
            feePerCredit = 275;
        }
        else if (programCode.equals("MEOH")) {
            masterProgram = "Master of Environmental and Occupational Health";
            firstFee = 1250;
            subsequentFee = 1000;
            feePerCredit = 350;
        }
        else {
            System.out.println("Invalid Program Code");
            scan.close();
            return;
        }

        if (semesterNumber < 1) {
            System.out.println("Invalid Semester Number");
            scan.close();
            return;
        }

        if (creditHours < 0) {
            System.out.println("Invalid Credit Hours");
            scan.close();
            return;
        }

        double semesterFee;

        if (semesterNumber == 1) {
            semesterFee = firstFee;
        }
        else {
            semesterFee = subsequentFee;
        }

        double totalTuitionFees = semesterFee + (creditHours * feePerCredit);

        System.out.println("----------------------------------------");
        System.out.println("Master program: " + masterProgram);
        System.out.println("Semester number: " + semesterNumber);
        System.out.println("Credit hours: " + creditHours);
        System.out.printf("Total tuition fees: RM%.2f%n", totalTuitionFees);

        scan.close();
    }
}