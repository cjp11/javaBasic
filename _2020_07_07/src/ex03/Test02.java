package ex03;

import java.util.Scanner;

public class Test02 {
	static Scanner sc = new Scanner(System.in);
	static Contact inputInfo() {
		Contact ct = new Contact();
		
		System.out.println("[���� > ����ó]");
		System.out.print("�̸�? ");
		ct.name = sc.nextLine();
		System.out.print("��ȭ? ");
		ct.phone = sc.nextLine();
		System.out.print("�̸���? ");
		ct.email = sc.nextLine();
		System.out.print("ȸ��? ");
		ct.company = sc.nextLine();
		System.out.print("����? ");
		ct.position = sc.nextLine();
		return ct;
	}
	static boolean judge() {
		String s;
		System.out.println("��� �Է��Ͻðڽ��ϱ�?(y/n)");
		s = sc.nextLine();
		
		if(s.equals("n")) return true;
		else return false;
	}
	
	static void printInfo(Contact ct) {
		
		 System.out.println(ct.name); 
		 System.out.println(ct.phone);
		 System.out.println(ct.email); 
		 System.out.println(ct.company);
		 System.out.println(ct.position);
		 
		//System.out.printf("%s %s %s %s %s \n",ct.name,ct.phone,ct.email,ct.company,ct.position);
		
	}
	
	public static void main(String[] args) {
		
		
		Contact[] cts = new Contact[10];
		
		int i = 0;
		
		while(i<10) {
			
			cts[i] = inputInfo();
			i++;
			
			if(judge()) break;
		}
		
		for(int j=0; j<i; j++) {
			printInfo(cts[j]);
		}
		

	}
	

}
