package main;
import java.util.Scanner;
public class EncouragementAppV2 {

	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		int age;
		String hru;
		
	System.out.println("How old are you");
	age = userInput.nextInt();
	userInput.nextLine();
	
	System.out.println("How is your day going? (great, bad, alright)");
	hru = userInput.nextLine().toLowerCase();
	
	if (age < 20) {
		if (hru.equals("bad")) {
			System.out.println("Can I help?");
		} else if (hru.equals("great")) {
			System.out.println("What was good about today?");
		}else if (hru.equals("alright")) {
            System.out.println("Is there something I can do to cheer you up?");
        }
    	} 
	else {
        if (hru.equals("great")) {
            System.out.println("You did great today.");
        } else if (hru.equals("bad")) {
            System.out.println("What went wrong?");
        } else if (hru.equals("alright")) {
            System.out.println("Hope your day gets better!");
}
}
}
}
