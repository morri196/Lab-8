import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		// parallel array
		String[] student = { "Kari", "David", "Kim", "Tim", "Luke", "Kyle", "Stan", "Antonella"};
		String[] favFood = { "Japense", "Thai", "Barbque", "Cereal", "Sweets", "Hot Dag", "Pizza", "Fruit"};
		String[] hobby = { "Running", "Biking", "Reading", "Gaming", "Meditating", "Swimming", "Hockey", "Basketball"};
		
		System.out.println("Welcome to our Java class. ");
		
		int studentID = 0;
		for (int i = 0; i < 8; i++) {
			System.out.println( i + 1 + "." + student[i]);//print out all student names
			}
		try {	//to catch exceptions
			System.out.println("Which student would you like to learn more about? (enter number 1-8) ");
			studentID = scnr.nextInt();
			}	catch (Exception ex) {
			System.out.println("Please enter a valid entry 1-8. ");
			}
			
			
			System.out.println("What would you like to know about " + student[studentID - 1] + "? Favorite food or hobby? ( enter \"1 \" for food or \"2\" for hobby )");
			int favorite = scnr.nextInt();
			
			do {
			if (favorite == 1) {
				System.out.println( student[studentID - 1] + "'s favorite hobby is " + hobby[studentID - 1] + "." + " Would you like to know more? (y/n) ");
				String reply = scnr.next();
				//favorite = favorite + 2;
				
					while (reply == "y"); {
							
							System.out.println(student[studentID - 1] + "'s favorite food is " + favFood[studentID - 1] + "." + " Would you like to know more? (y/n) ");
							reply = scnr.next();
						}	
								System.out.println("Thanks!");
								
								}
					
			
				else if ( favorite == 2) {
					System.out.println( student[studentID - 1] + "'s favorite food is " + favFood[studentID - 1] + "." + " Would you like to know more? (y/n) ");
					String reply = scnr.next();
					//favorite = favorite + 2;
					
					while (reply == "y"); {
						
						System.out.println(student[studentID - 1] + "'s favorite hobby is " + hobby[studentID - 1] + "." + " Would you like to know more? (y/n) ");
						reply = scnr.next();
					}	
							System.out.println("Thanks!");
							}
					
				else if ( favorite != 1 || favorite != 2 ) {
				System.out.println("Please enter a valid input. ( enter \"1 \" for food or \"2\" for hobby ) !");
				 favorite = scnr.nextInt();
				 favorite = favorite + 2;
				 
				 
				} 
			} while (favorite == 1 || favorite == 2);
			
			
			//}
			//catch (NumberFormatException ex) {
				//System.out.println("Please enter a valid input. ( enter \"h \" for food or \"f\" for hobby ) ");
			//}
		
		//System.out.println("goodbye!!");
	
	}
}


