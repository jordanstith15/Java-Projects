// randomizes items found in chests throughout game
package mud;
import java.util.*;
public class Treasure {

	boolean newSword=true, newShield=true, newArmor=true, repeat=true;
	public void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(repeat==true){
		System.out.println("You have found a chest. Type '1' to open it.");
		int open = scan.nextInt();
		if(open==1){
			Random random = new Random();
			int x = random.nextInt(3);
			if(x==0)
				getSword();
			else if(x==1)
				getShield();
			else if(x==2){
				getArmor();
			}
			repeat=false;
			}
		else if(open<1||open>1){
			repeat=true;
		}
		}
		
		
	}
	public void getSword(){
		
		
		if(newSword == true){
		
		 Character.attack+=1; 
		 System.out.println("You found a sword. Your attack power is: "+Character.attack);
		}
		
		
		
	}
	public void getShield(){
		if(newShield==true){
			Character.defense += 1;
			System.out.println("You found a shield. Your defense is "+Character.defense);
		}
	}
	public void getArmor(){
		if(newArmor==true){
			Character.defense+=3;
			System.out.println("You found some armor. Your defense is "+Character.defense);
		}
	}

}
