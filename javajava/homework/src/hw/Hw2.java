package hw;

import java.util.Scanner;

public class Hw2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("단: "); int n = stdIn.nextInt(); //삼각형 단 갯수
		
		int m = 2*n - 1; int s1 = 1, s2 = 0;
		
		for(int i = 0; i <= m; i++) {			
			if(i >= n) { 	
				s1 = 0; s2 = 1; //중간에 반전됨
			}
			
			for(int j = 0; j < s1*(m-i)+s2*(i); j++) {
				if(j < s1*(i)+s2*(m-i))
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("\n버전2");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m-i; j++) {
				if(j < i)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i = n; i <= m; i++) {
			for(int j = 0; j < i; j++) {
				if(j < m-i)
					System.out.print("  ");
				else
					System.out.print("* ");
							
			}
			System.out.println();
		}	
		stdIn.close();
	}
}
