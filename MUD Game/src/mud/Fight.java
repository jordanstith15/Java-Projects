//method for fighting monsters
package mud;
import java.util.*;
public class Fight {

	
	public static void main(String[] args) {
		
		System.out.println("Type '1' to fight and '2' to run");
		Scanner scan = new Scanner(System.in);
		int y = scan.nextInt();
		
		
		
		if(y==1){
			boolean fight=true;// boolean for while statement
			while(fight==true){
			System.out.println("Monsters HP: "+ Monster.hp2);
			System.out.println("Your HP: "+Character.hp);
			Monster.hp2-= Character.attack;// attacking monster
			if((Monster.attack2-Character.defense)>0)
				Character.hp-= (Monster.attack2 - Character.defense);// monster attacks you
			
			if(Character.hp <=0){
				System.out.println("You have died.");
				System.exit(0);// terminated game since you died.
			}// For if you die.
			else if(Monster.hp2<=0){
				fight=false;// end while statement.
				System.out.println("You have won!");
				World.endGame+=1;
				Monster.hp2=30;
				
				}// when you win.
			
			}// end while statement.
		}
	
		else if(y==2){
			System.out.println("You have fled.");
			
		}// when you choose to flee.
	
	}
}

