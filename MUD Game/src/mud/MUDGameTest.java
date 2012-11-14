package mud;
import java.util.*;
public class MUDGameTest {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean start = true;
		while(start==true){
		System.out.println("Type 1 to start playing:");
		int play = scan.nextInt();
		Character.main(null);
		if(play == 1){
			World.main(null);
			start = false;
			
			
		}
		else{
			throw new IllegalArgumentException("Command not recognized");
		}
		}
	}
	
		
	


}
