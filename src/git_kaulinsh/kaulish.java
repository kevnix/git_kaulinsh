package git_kaulinsh;

import java.util.Random;
import java.util.Scanner;

public class kaulish {

	public static void main(String[] args) {
		int skaitlis, reizes;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("Cik reizes mest kaulu?");
		reizes=scan.nextInt();
		
		for(int i=0;i<reizes;i++){
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Uzkrita skaitlis: "+skaitlis);
		}
		
		scan.close();
	}

}
