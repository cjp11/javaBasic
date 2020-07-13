package ptr;

import java.util.Scanner;

public class PrinterMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		InkPrinter inkp = new InkPrinter("k-111","HP","USB");
		RazerPrinter razp = new RazerPrinter("r-502","Samsung","paraller port");
		
		System.out.println("어떤 종류의 프린터를 사용하시겠습니까?");
		System.out.println("1. 잉크젯/ 2. 레이저");
		int chooseOne = sc.nextInt();
		
		if(chooseOne == 1)  {
			System.out.println("잉크젯 인쇄매수: ");
			inkp.cntofPaper = sc.nextInt();
			for(int i=0; i<inkp.cntofPaper; i++) {
				inkp.print();
			}
			
			System.out.printf("모델명:%s ",inkp.modelName);
			System.out.printf("제조사:%s ",inkp.maker);
			System.out.printf("인터페이스:%s ",inkp.kindofInterface);
			System.out.printf("남은 인쇄 용지:%d ",inkp.restofPaper);
			System.out.printf("잉크 잔량:%.2f",inkp.restofInk);
			System.out.println("%");
		}
		else if(chooseOne == 2){
			System.out.println("레이저 인쇄매수: ");
			razp.cntofPaper = sc.nextInt();
			for(int i=0; i<razp.cntofPaper; i++) {
				razp.print();
			}
			
			System.out.printf("모델명:%s ",razp.modelName);
			System.out.printf("제조사:%s ",razp.maker);
			System.out.printf("인터페이스:%s ",razp.kindofInterface);
			System.out.printf("남은 인쇄 용지:%d ",razp.restofPaper);
			System.out.printf("잉크 잔량:%.2f",razp.restofToner);
			System.out.println("%");
		}
		
		
		sc.close();

	}

}
