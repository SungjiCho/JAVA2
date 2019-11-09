package hw;

import java.util.Scanner;

public class Hw1Ver2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("크기: "); int n = stdIn.nextInt();

		int height = n*3, width = n*4, middle = n*2, arm = (int)(0.5*(n+1));
		int slope = 0, scale = 0;
		
		for(int i = 0; i <= height; i++) { //전체높이					
			if(i == n) { //촉수
				for(int j = 0; j <= width; j++)
					System.out.print("*");
				
			}else if(n < i && i < n + arm) { //팔뚝
				for(int j = 0; j <= width-i; j++) {
					if(j < i)
						System.out.print(" ");
					else
						System.out.print("*");
				}
			}else if(i <= middle) { //머리부터 몸통	
				
				slope = (int)(0.5*i); //커지는 비율				
				for(int j = 0; j <= middle+slope; j++) {
					if(j < middle-slope)
						System.out.print(" ");
					else
						System.out.print("*");	
				}
			}else { //다리
				int right = i+n;
				for(int j = 0; j <= right; j++) {
					scale = height-i;					
					if((scale<=j && j<=2*scale) || j>=right-scale)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}		
	stdIn.close();

	}
}
