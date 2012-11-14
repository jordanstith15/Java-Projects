//for random monster fights.
package mud;
import java.util.*;
public class Monster {
	static int hp2=30;
	static int attack2 = 5;
	public static void main(String[] args) {
		String monsterName = "Slasher";
		
		System.out.printf("A %s has appeared\n", monsterName);
		
		Fight.main(args);
	}
	

}
