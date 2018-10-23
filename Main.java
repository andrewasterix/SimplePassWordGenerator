
import java.util.*;

public class Main {

	public static void main(String[] args) {

		// 1. PassWord Specification
		
		boolean UpperBool = false;
		boolean LowerBool = false;
		boolean NumberBool = false;
		
		Scanner in = new Scanner(System.in);
		
		Character c = 'N';
		
		System.out.println("Password Generator");
		
		// 1.1 Password Length Definition
		System.out.println("Password Length?");
		int long_pwd = in.nextInt();
		in.nextLine();
		
		if(!UpperBool && !LowerBool && !NumberBool) {
			System.out.println("PassWord Specification");
			
			do{
				System.out.println("UpperCase Letter? (s/n)");
				c = in.next().charAt(0);
				
				if((!c.equals('s') && !c.equals('n'))) {
					System.out.println("Incorrect Value; Try again!");
				}else if(c.equals('s')){
					UpperBool = true;
				}else {
					UpperBool = false;
				}
				
			}while(!c.equals('s') && !c.equals('n'));
			

			do{
				System.out.println("LowerCase Letter? (s/n)");
				c = in.next().charAt(0);
				
				if((!c.equals('s') && !c.equals('n'))) {
					System.out.println("Incorrect Value; Try again!");
				}else if(c.equals('s')){
					LowerBool = true;
				}else {
					LowerBool = false;
				}
				
			}while(!c.equals('s') && !c.equals('n'));

			do{
				System.out.println("Number? (s/n)");
				c = in.next().charAt(0);
				
				if((!c.equals('s') && !c.equals('n'))) {
					System.out.println("Incorrect Value; Try again!");
				}else if(c.equals('s')){
					NumberBool = true;
				}else {
					NumberBool = false;
				}
				
			}while(!c.equals('s') && !c.equals('n'));
			
		}else{
			System.out.println("Incurred in a Error");
			System.exit(-1);
		}
		
		if(!UpperBool && !LowerBool && !NumberBool) {
			// Error in case Spec == False
			System.out.println("No PassWord Generator");
		}else {
			// 2. PassWord Generator
			Password pwd = new Password(long_pwd, UpperBool, LowerBool, NumberBool);
			
			// 3. Print PassWord
			System.out.println("PassWord Generated");
			for (int i = 0; i < pwd.getPwd().length; i++) {
				System.out.print(pwd.getPwd()[i]);
			}
			
		}
		
		in.close();
		System.exit(-1);
	}

}
