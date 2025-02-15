package main;
import java.util.Scanner;

public class PieceWiseApp {

	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {

        int input;
        int equation = 0;


        System.out.println("what number would you like to use for the piecewise equations?");
        input = userInput.nextInt();

        if(input<0) {equation = -3*input + 7;}
        if(input >= 0 && input <= 10) {equation = (int) Math.pow(input, 2) + 8;}
        if (input > 10) { equation = (int) Math.pow(input, 3) - 6*input*input;}
        System.out.println(equation);
    }

    }


