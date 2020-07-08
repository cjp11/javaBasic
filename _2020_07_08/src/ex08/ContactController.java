package ex08;

import java.util.Scanner;

public class ContactController {
	static Scanner sc;
	
	Contact[] cts = new Contact[10];
	int i = 0;
	int j = 0;
	String contactName;
	
	
	public ContactController(String contactName) {
		this.contactName = contactName;
	}
	
	public void inputInfo() {
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
		cts[i++] = ct;
	}
	static boolean judge() {
		String s;
		System.out.println("��� �Է��Ͻðڽ��ϱ�?(y/n)");
		s = sc.nextLine();
		
		if(s.equals("n")) return true;
		else return false;
	}
	
	public void printInfo() {
		
		 System.out.print(cts[j].name + " "); 
		 System.out.print(cts[j].phone + " ");
		 System.out.print(cts[j].email + " "); 
		 System.out.print(cts[j].company + " ");
		 System.out.print(cts[j].position + " ");
		 System.out.println();
		 
		//System.out.printf("%s %s %s %s %s \n",ct.name,ct.phone,ct.email,ct.company,ct.position);
		
	}
	
	public void service() {
		
	
		
		while(true) {
			System.out.printf("[���� > %s]\n",this.contactName);
			inputInfo();
			
			if(judge()) break;
		}
		
		for(j=0; j<i; j++) {
			printInfo();
		}
		

	}
	

}
