package kr.co.Homework0716;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LottoMain {
	
	static Scanner sc = new Scanner(System.in);
	static Random r = new Random();
	static Set<Integer> set = new TreeSet<>();
	
	public static void main(String[] args) {
	
		
		System.out.print("게임수를 입력하세요");
		int gamenum = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<gamenum; i++) {
			set = mkset();
			System.out.printf("게임 %d :  ",i+1);
			for(int setArr : set) {
				System.out.print(setArr + "\t");
			}
			System.out.println();
		}
		
			
	}

	private static Set<Integer> mkset() {
		
//		int selRand = r.nextInt(3)+1;
		int selRand = 1;
		Set<Integer> set = new TreeSet<>();
		
		switch (selRand) {
		
		case 1:
			while(true) {
				if(set.size() == 6) {
					break;
				} else {
					int randnum = r.nextInt(45)+1;
					set.add(randnum);
				}
			}
			break;
		case 2:
			
			
			break;
		
		case 3:

			break;
		
		}
		
		
		return set;
	}
	

}
