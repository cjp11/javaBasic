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
		
		System.out.println("[메인 > 연락처]");
		System.out.print("이름? ");
		ct.name = sc.nextLine();
		System.out.print("전화? ");
		ct.phone = sc.nextLine();
		System.out.print("이메일? ");
		ct.email = sc.nextLine();
		System.out.print("회사? ");
		ct.company = sc.nextLine();
		System.out.print("직위? ");
		ct.position = sc.nextLine();
		return ct;
	}
	/*static boolean judge() {
		String s;
		System.out.println("계속 입력하시겠습니까?(y/n)");
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
		// 연락처 인원 수를 입력받아 배열을 지역으로 사용해보기
		System.out.println("몇  명의 연락처를 입력하시겠습니까?");
		int num = sc.nextInt();
		Contact[] cts = new Contact[num];
		
		for(int k=0; k<num;k++) {
			System.out.printf("[메인 > %s]\n",this.contactName);
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
