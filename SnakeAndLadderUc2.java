package practise;

import java.util.Random;

public class SnakeAndLadderUc2 {

	public static void main(String[] args) {
		  System.out.println("Welcome to Snake and Ladder Game ");
	        int playerPosition=0;
	        System.out.println("Starting player position is "+playerPosition+" ; Player rolls die between 1 and 6");
	        Random random=new Random();
	        int rollOutput;
	        rollOutput= random.nextInt(6);
	        if (rollOutput ==0){
	            rollOutput =1;
	        }

	}

}
