package edu.exam01.continue17;

/*±¸±¸´Ü
 * 2*1 = 2	2*2 = 4 ... 2*9 = 18
 * 3*1 ...
 * ...
 * 9*1 = 9 ...			9*9 = 81
 * 
 */
public class Continue {

	public static void main(String[] args) {
		for(int i=1; i<10; i=i+1) {
			if(i==5) continue;
			for(int j=1; j<10; j++) {
				if(j==5) continue;
				System.out.print(i+"x"+j+"="+i*j+"  ");
				
			}
			System.out.println();
		}

	}

}
