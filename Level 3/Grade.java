
import java.util.*;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics Marks : ");
        int phy = sc.nextInt();

        System.out.print("Enter Chemistry Marks : ");
        int chem = sc.nextInt();

        System.out.print("Enter Maths Marks : ");
        int Mat = sc.nextInt();

        int avg = (phy + chem + Mat) / 3;

        String grade;
        String remarks;

        if(avg >= 80){
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        }else if(avg >= 70 ){
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        }else if(avg >= 60 ){
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        }else if (avg >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (avg >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        System.out.println("--- Result ---");
        System.out.println("Average Marks :- "+ avg);
        System.out.println("Grade :- " + grade);
        System.out.println("Remarks :- " + remarks);

        sc.close();
    }
}
