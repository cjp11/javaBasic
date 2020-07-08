package ex09;

import java.util.Scanner;

public class MemberController {
	
	static Scanner sc;
	Member[] mb = new Member[10];
		
	
	public void add() {
		Member mem = new Member();
		System.out.println("�̸�: ");
		mem.name = sc.nextLine();
		System.out.println("�̸���: ");
		mem.email = sc.nextLine();
		System.out.println("��й�ȣ: ");
		mem.password = sc.nextLine();
		mb[Member.cnt-1] = mem;
		
		
	}
	public void list() {
		if(Member.cnt < 1) {
			System.out.println("ȸ�� ����� �����ϴ�.");
			return;
		}
		for(int i=0; i<Member.cnt; i++) {
			System.out.printf("%s %s %s %s\n",mb[i].name,mb[i].email, mb[i].password, mb[i].signedUpdate);
		}
	}
	
	public void delete() {
		if(Member.cnt < 1) {
			System.out.println("������ ȸ�� ����� �����ϴ�.");
			return;
		}
		
		String del;
		int i = 0;
		System.out.println("�����Ϸ��� ȸ�� �̸��� �Է�: ");
		del = sc.nextLine();
		System.out.println("���� �����Ͻðڽ��ϱ�?(y/n)");
		String yorn = sc.nextLine();
		
		if(yorn.equals("y")) {
			while(true) {
				if(del.equals(mb[i].name)) {
					for(int j=i; j<Member.cnt; j++) {
						mb[j] = mb[j+1];	
					}
					break;
				}
				i++;
			}
		}else return;
		Member.cnt--;	// ȸ���� ����
		mb[Member.cnt] = null;
	}
	
	public void update() {
		System.out.println("������Ʈ�� ȸ�� �̸��� �Է�: ");
		String upd = sc.nextLine();
		int i = 0;
		
		Member member = new Member();	// ������Ʈ�� ȸ�� ���� ����.
										// ������Ʈ�� ���� �ʴ��� �Լ� ���ϵǸ� ������Ƿ� ���� ����
										// �䱸 ���׿� �°� �ۼ��� ����(Member.cnt �� ����������ؼ� ȿ�������� ���ѵ�)
		
		while(true) {
			if(upd.equals(mb[i].name)) {
				System.out.printf("%s -> \n", mb[i].name);
				member.name = sc.nextLine();
				System.out.printf("%s -> \n", mb[i].email);
				member.email = sc.nextLine();
				System.out.printf("%s -> \n", mb[i].password);
				member.password = sc.nextLine();
				System.out.printf("%s -> \n", mb[i].signedUpdate);
				member.signedUpdate = sc.nextLine();
				break;
			}
			i++;
		}
		
		System.out.println("������Ʈ �Ͻðڽ��ϱ�?(y/n)");
		String yorn = sc.nextLine();
		if(yorn.equals("y")) {				
			mb[i] = member;
		}
		Member.cnt--; //member ���� ������ ������ Member.cnt���� ���� ���������
	}
	
	public void detail() {
		if(Member.cnt < 1) {
			System.out.println("������ ȸ���� �����ϴ�.");
			return;
		}
		System.out.println("�������ϴ� ȸ�� �̸�: ");
		String n = sc.nextLine();
		int i = 0;
		while(true) {
			if(n.equals(mb[i].name)) {
				System.out.printf("�̸�: %s, �̸���: %s, ��й�ȣ: %s, ��� ��¥: %s\n", mb[i].name, 
						mb[i].email, mb[i].password, mb[i].signedUpdate);
				break;
			}
			i++;
		}
	}
	
	
	public void service() {
		
		String command;
	
		while(true) {
			
			System.out.println("1. ���� �޴��� �̵�(main)");
			System.out.println("2. ȸ�� �߰�(add)");
			System.out.println("3. ȸ�� ��Ϻ���(list)");
			System.out.println("4. ȸ�� ���λ���(detail)");
			System.out.println("5. ȸ�� ����(delete)");
			System.out.println("6. ȸ�� ������Ʈ(update)");
			System.out.println("�޴� �������ּ���: ");
			command = sc.nextLine();
			
			switch(command) {
			case "main":	return;/*System.out.println("main()");*/
			case "add":		add(); /*System.out.println("add()")*/ break;
			case "list":	list(); break;
			case "detail":	detail(); break;
			case "delete":	delete(); break;
			case "update":	update(); break;
			default:	System.out.println("����� �� ���� ��ɾ� �Դϴ�."); 
			
			}
		}
	}
	
	
}
