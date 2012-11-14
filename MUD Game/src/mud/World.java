package mud;
import java.util.*;
public class World {

	static int endGame= 0;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random randNum=new Random();
		int[][] map=new int[10][10];
		int rowLoc=4, colLoc=4;
		String response;
		char direction;
		
		for(int row=0; row<map.length; row++){
			for(int column=0; column<map[row].length;column++){
				map[row][column]=randNum.nextInt(7)+1;				
			}
		}
		
		
		
		
		do{			
			
			System.out.println("Pressing \"W\" will move you north, pressing \"S\" will move you south,\n"+
					"Pressing \"D\" will move you east and pressing \"A\" will move you west.");
			System.out.println("Please enter W, S, D or A");
			
			direction=scan.next().charAt(0);
			
			switch(direction){
				case 'w':
				case 'W': rowLoc--;
				break;
				case 's':
				case 'S': rowLoc++;
				break;
				case 'd':
				case 'D': colLoc++;
				break;
				case 'a':
				case 'A': colLoc--;
				break;
			
			}
			Random random = new Random();
			
			int x = random.nextInt(4);
			if(x==0){
				Treasure trsr = new Treasure();
				trsr.main(args);
			}
			else if(x==1){
				
				Monster.main(args);
				if(endGame==5){
					System.out.println("Congratulations! You have vanquished all of the monsters!");
					System.exit(0);				
					}
			}
			
			
			System.out.println("Would you like to move again? y or n");
			response=scan.next();
		}while(response.equalsIgnoreCase("y"));		

	}

	

}
