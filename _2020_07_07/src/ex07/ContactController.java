package ex07;

import java.util.Scanner;

public class ContactController {
	static Scanner sc;
	
	
	//int i = 0;
	//int j = 0;
	String contactName;
	
	
	public ContactController(String contactName) {
		this.contactName = contactName;
	}
	
	public Contact inputInfo() {
		
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
	/*static boolean judge() {
		String s;
		System.out.println("��� �Է��Ͻðڽ��ϱ�?(y/n)");
		s = sc.nextLine();
		
		if(s.equals("n")) return true;
		else return false;
	}*/
	/*
	public void printInfo(Contact ct) {
		
		 System.out.print(ct.name + " "); 
		 System.out.print(ct.phone + " ");
		 System.out.print(ct.email + " "); 
		 System.out.print(ct.company + " ");
		 System.out.print(ct.position + " ");
		 System.out.println();
		 
		//System.out.printf("%s %s %s %s %s \n",ct.name,ct.phone,ct.email,ct.company,ct.position);
		
	}*/
	
	public void service() {
		// ����ó �ο� ���� �Է¹޾� �迭�� �������� ����غ���
		System.out.println("��  ���� ����ó�� �Է��Ͻðڽ��ϱ�?");
		int num = sc.nextInt();
		Contact[] cts = new Contact[num];
		
		for(int k=0; k<num;k++) {
			System.out.printf("[���� > %s]\n",this.contactName);
			cts[k] = inputInfo();
			
			//if(judge()) break;
		}
		for(int i=0; i<num; i++) {
			//System.out.println(cts[i]);
			System.out.printf("%s %s %s %s %s \n", cts[i].name, cts[i].phone, 
					cts[i].email, cts[i].company, cts[i].position );
			System.out.println();
			
		}
		
		/*
		for(int j=0; j<num; j++) {
			printInfo(cts[j]);
		}
		*/

	}
	

}
