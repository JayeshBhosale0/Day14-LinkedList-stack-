package practise;

import java.util.Random;

public class SnakeAndLadderUc3 {

	public static void main(String[] args) {
		 System.out.println("Welcome to Snake and Ladder Game ");
	        int playerPosition=0;
	        System.out.println("Starting player position is "+playerPosition+" ; Player rolls  to die");
	        Random random = new Random();
	        int rollsOutput,option;

	            rollsOutput = random.nextInt(6);
	            System.out.println("Die output : " + (rollsOutput+1));
	        
	        option=random.nextInt(3);
	}

}
