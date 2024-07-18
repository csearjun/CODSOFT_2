import java.util.*;
public class GradeCalc {
    public static void result(double avg_per){
        if(avg_per>=90){
            System.out.println("\nYou have got O(outstanding) grade");
        }
        else if(avg_per>=80){
            System.out.println("\nYou have got A+ grade");
        }
        else if(avg_per>=70){
            System.out.println("\nYou have got A grade");
        }
        else if(avg_per>=60){
            System.out.println("\nYou have got B+ grade");
        }
        else if(avg_per>=50){
            System.out.println("\nYou have got B grade");
        }
        else if(avg_per>=40){
            System.out.println("\nYou have got C grade");
        }
        else{
            System.out.println("\nYou have failed in the exam hence try again,All the best");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ch;
        do {
            System.out.println("\n****************STUDENT GRADE CALCULATOR****************");
            int n, total_sum = 0;
            System.out.println("\nEnter the number of subjects:");
            n = in.nextInt();
            int[] mark = new int[n];
            for (int i =0; i < n; i++) {
                System.out.println("\nEnter the mark for the Subject " + (i+1) + ": ");
                mark[i] = in.nextInt();
            }
            for (int marks : mark) {
                total_sum += marks;
            }
            double avg_per = (double) total_sum / n;
            System.out.println("The total marks obtained by the student is: " + total_sum);
            System.out.println("\nThe Average percentage obtained by the student is: " + avg_per + "%");
            result(avg_per);
            System.out.println("\nDo you want to calculate again, 0 to quit and 1 to continue: ");
            ch = in.nextInt();
        } while (ch == 1);
    }
}
