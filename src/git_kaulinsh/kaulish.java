package git_kaulinsh;

import java.util.Random;
import java.util.Scanner;

public class kaulish {
	
	static void mestKaulinu(int skaits){
		int skaitlis, lielakais=0;
		Random rand = new Random();
		for(int i=0; i<skaits; i++){
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Uzkrita skaitlis: "+skaitlis);
			
			if(lielakais<skaitlis) lielakais=skaitlis;
		}
		
		System.out.println("Lielâkais skaitlis: "+lielakais);
	}

	public static void main(String[] args) {
		int reizes;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("Cik reizes mest kauliòu?");
			reizes=scan.nextInt();
		}while(reizes<1);
		mestKaulinu(reizes);
		scan.close();
	}
}
 