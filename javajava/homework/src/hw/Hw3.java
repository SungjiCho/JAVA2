package hw;

import java.util.Scanner;
import static java.lang.Math.sqrt;


public class Hw3 {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("원점: "); int r = stdIn.nextInt(); //반지름
		
		int dm = r*2; //원지름
		
		for(int i = 0; i <=dm; i++) {
			for(int j = 0; j <= dm; j++) {
				int dt = (int)sqrt((i-r)*(j-r) + (i-r)*(j-r));  //원점과 인덱스간 거리
				
				if(dt <= r)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		stdIn.close();
	}
}
