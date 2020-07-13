package ptr;

import java.util.Scanner;

public class PrinterMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		InkPrinter inkp = new InkPrinter("k-111","HP","USB");
		RazerPrinter razp = new RazerPrinter("r-502","Samsung","paraller port");
		
		System.out.println("� ������ �����͸� ����Ͻðڽ��ϱ�?");
		System.out.println("1. ��ũ��/ 2. ������");
		int chooseOne = sc.nextInt();
		
		if(chooseOne == 1)  {
			System.out.println("��ũ�� �μ�ż�: ");
			inkp.cntofPaper = sc.nextInt();
			for(int i=0; i<inkp.cntofPaper; i++) {
				inkp.print();
			}
			
			System.out.printf("�𵨸�:%s ",inkp.modelName);
			System.out.printf("������:%s ",inkp.maker);
			System.out.printf("�������̽�:%s ",inkp.kindofInterface);
			System.out.printf("���� �μ� ����:%d ",inkp.restofPaper);
			System.out.printf("��ũ �ܷ�:%.2f",inkp.restofInk);
			System.out.println("%");
		}
		else if(chooseOne == 2){
			System.out.println("������ �μ�ż�: ");
			razp.cntofPaper = sc.nextInt();
			for(int i=0; i<razp.cntofPaper; i++) {
				razp.print();
			}
			
			System.out.printf("�𵨸�:%s ",razp.modelName);
			System.out.printf("������:%s ",razp.maker);
			System.out.printf("�������̽�:%s ",razp.kindofInterface);
			System.out.printf("���� �μ� ����:%d ",razp.restofPaper);
			System.out.printf("��ũ �ܷ�:%.2f",razp.restofToner);
			System.out.println("%");
		}
		
		
		sc.close();

	}

}
