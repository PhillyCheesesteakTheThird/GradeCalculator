import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main object = new Main();
        object.waitMethod();
//        Scanner response = new Scanner(System.in);
//        System.out.println("Please enter your grade: ");
//        double gradeIn = response.nextDouble();
//        System.out.println("Your grade is: " + gradeMachine(gradeIn));
//
    }
    private synchronized void waitMethod() {
        while(true) {
            Scanner response = new Scanner(System.in);
            System.out.println("Please enter your grade: ");
            double gradeIn = response.nextDouble();
            System.out.println("Your grade is: " + gradeMachine(gradeIn));
            try{
                this.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("\nSomething broke bub!");
            }
        }

    }
    public static String gradeMachine(double gradeIn) {
        String gradeOut = null;

        if ((gradeIn > 92)) {
            gradeOut = "A";
        }
        else if (gradeIn > 89) {
            gradeOut =  "A-";
        }
        else if (gradeIn > 87) {
            gradeOut =  "B+";
        }
        else if (gradeIn > 82) {
            gradeOut =  "B";
        }
        else if (gradeIn > 79) {
            gradeOut =  "B-";
        }
        else if (gradeIn > 77) {
            gradeOut =  "C+";
        }
        else if (gradeIn > 72) {
            gradeOut =  "C";
        }
        else if (gradeIn >= 69) {
            gradeOut =  "C-";
        }
        else if (gradeIn > 67) {
            gradeOut =  "D+";
        }
        else if (gradeIn > 60) {
            gradeOut =  "D";
        }
        else if ((gradeIn > 0) & (gradeIn < 100)) {
            gradeOut =  "F";
        }
        else if (gradeIn < 0) {
            gradeOut = "too low to be calculated. Bummer :(";
        }
        return gradeOut;

    }
}