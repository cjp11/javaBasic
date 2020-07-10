package ptr;

import java.util.Scanner;

public class PrinterMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		InkPrinter inkp = new InkPrinter(1000,1000);
		//inkp.print();
		
		
		System.out.println("À×Å©Á¬ ÀÎ¼â¸Å¼ö: ");
		inkp.cntofPaper = sc.nextInt();
		
		for(int i=0; i<inkp.cntofPaper; i++) {
			inkp.print();
		}
		System.out.println(inkp.restofPaper);
		System.out.println(inkp.restofInk);
		
		
		sc.close();

	}

}
