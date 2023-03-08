package git_kaulinsh;

import java.util.Random;

public class kaulish {
	static void mestKaulinu(int skaits){
		int skaitlis;
		Random rand = new Random();
		
		for(int i=0; i<skaits; i++){
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Uzkrita skaitlis: "+skaitlis);
		}
		
	}
	public static void main(String[] args) {
		mestKaulinu(3);

	}

}
