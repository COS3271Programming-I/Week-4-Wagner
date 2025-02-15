package main;
import java.util.Scanner;
public class LetterGrades {
	public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter a test score (0-100):");
        int score = userinput.nextInt();
        String grade;
        if (score >= 90) grade = "A";
        else if (score >= 80) grade = "B";
        else if (score >= 70) grade = "C";
        else if (score >= 60) grade = "D";
        else grade = "F";
        if (score >= 60 && score < 100) {
            int lastDigit = score % 10;
            if (lastDigit >= 7 || score == 100) grade += "+";
            else if (lastDigit <= 2) grade += "-";
        }
        System.out.println("Grade = " + grade);
	}
}
