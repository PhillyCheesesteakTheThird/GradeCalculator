import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Initializes a new instance of the class Main
        Main object = new Main();
        //Runs the gradeRunner method of Main
        object.gradeRunner();
    }
    private synchronized void gradeRunner() {
        //While loop always returns true, as I use a true literal as its condition(not sure if I'm using literal correctly)
        while(true) {
            //Initalizes new response object of class scanner to listen for user responses
            Scanner response = new Scanner(System.in);
            System.out.println("Please enter your grade: ");
            //Initalizes user input variable as a double, to account for decimal values
            double gradeIn = response.nextDouble();
            //Invokes gradeMachine
            System.out.println("Your grade is: " + gradeMachine(gradeIn) + "\n");
            try{
                //Wait time before prompting user for next grade value
                this.wait(200);

                //Basic error handling
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("\nSomething broke bub!");
            }
        }
    }
    public static String gradeMachine(double gradeIn) {
        //Kind of a silly brute-force way to do it, but it works!
        //If value is equal to the excluded value in the grade range,
        //it is considered to be the next lowest grade.
        //I.E. as 92 is the cutoff for an A grade, inputting that value would return an A-
        String gradeOut = null;
        if ((gradeIn > 100)) {
            gradeOut = "Too high to be calculated :). Gold star for you ☆";
        }
        else if ((gradeIn > 92)) {
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
        else if (gradeIn > 69) {
            gradeOut =  "C-";
        }
        else if (gradeIn > 67) {
            gradeOut =  "D+";
        }
        else if (gradeIn > 60) {
            gradeOut =  "D";
        }
        else if (gradeIn > 0)  {
            gradeOut =  "F";
        }
        else if (gradeIn < 0) {
            gradeOut = "too low to be calculated. Bummer :(";
        }
        return gradeOut;
    }
}