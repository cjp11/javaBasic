package phoneBook;
/*
 * 1. PhoneBookVer02.java ���α׷��� �迭�� ����ϵ��� �����ؼ�
   ���α׷� ����ڰ� �Է��ϴ� ������ �ִ� 100������ �����ǵ��� ���α׷��� �����ϼ���
   �׸��� ����� 
   ������ ����
   ������ �˻�
   ������ ����
   ������ ����
   ������ ��ü ���
   �� �����ϵ��� �ϼ���

�����ϸ� �̷��� ��Ÿ���ϴ�


--�����ϼ���--
1. ������ �Է�
2. ������ �˻�
3. ������ ����
4. ������ ����
5. ������ ��ü ���
6. ���α׷� ����
���� : 1
������ �Է��� �����մϴ�..
�̸�: ȫ�浿
��ȭ��ȣ : 222-3333
������� : 99�� 12�� 25�ϻ�
������ �Է��� �Ϸ�Ǿ����ϴ�.

--�����ϼ���--
1. ������ �Է�
2. ������ �˻�
3. ������ ����
4. ������ ����
5. ������ ��ü ���
6. ���α׷� ����
���� :
 */
import java.util.Scanner;

class PhoneBookVer02
{
	static Scanner keyboard=new Scanner(System.in);
	static PhoneInfo[] pinfo = new PhoneInfo[100];
	static int cnt = 0;
	
	public static void showMenu()
	{
		System.out.println("�����ϼ���...");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ������ �˻�");
		System.out.println("3. ������ ����");
		System.out.println("4. ������ ����");
		System.out.println("5. ������ ��ü ���");
		System.out.println("6. ���α׷� ����");
		System.out.print("����: ");
	}
	
	public static void readData()
	{
		System.out.print("�̸�: ");
		String name=keyboard.next();
		System.out.print("��ȭ��ȣ: ");
		String phone=keyboard.next();
		System.out.print("�������: ");
		String birth=keyboard.next();
		
		PhoneInfo info=new PhoneInfo(name, phone, birth);
		pinfo[cnt++] = info; 
		// pinfo[cnt].name = info.name -> �� �ȵǴ��� ��Ȯ�ϰ� �˱�.(�̰� C�� ����ü ���� ���) 
		// ->��Ȳ: pinfo �迭�� 100���� null�� �ʱ�ȭ ��. 
		//		   �� ��Ҹ��� �ν��Ͻ��� ���� ���������
		
		System.out.println("\n�Էµ� ���� ���...");
		info.showPhoneInfo();
	}
	public static void showAllOfInfo() {
		for(int i=0; i<cnt; i++) {
			System.out.printf("<<pinfo[%d]>>\n",i);
			System.out.println(pinfo[i].name);
			System.out.println(pinfo[i].phoneNumber);
			System.out.println(pinfo[i].birth);
		}
		System.out.println();
	}
	
	public static void searchData() {
		int i = 0;
		boolean flag = false;
		
		System.out.println("ã������ ������ �̸� �Է�:");	// ���߿� ����, ������Ϸε� ã�� �� �ְ� Ȯ���ϱ�
		String name = keyboard.nextLine();
		while(i < cnt) {
			if(pinfo[i].name.equals(name)) {
				System.out.println("�ش� �����͸� ã�ҽ��ϴ�.");
				System.out.printf("�̸�:%s ��ȭ��ȣ:%s �������:%s\n", 
						pinfo[i].name, pinfo[i].phoneNumber, pinfo[i].birth);
				flag = true;
				break;
				//return;
			}
			i++;
			
		}
		if(flag == false) {
			System.out.println("�ش� ������ �����ϴ�.");
		}
		//System.out.println("�ش� ������ �����ϴ�.");
	}
	
	public static void updateData() {
		int i = 0;
		PhoneInfo p = new PhoneInfo();
		System.out.println("�����ϰ��� �ϴ� ������ �̸� �Է�: ");
		String name = keyboard.nextLine();
		for(i=0; i<cnt; i++) {
			if(pinfo[i].name.equals(name)) {
				System.out.printf("�̸�:%s ��ȭ��ȣ:%s �������:%s\n", 
						pinfo[i].name, pinfo[i].phoneNumber, pinfo[i].birth);
				System.out.println("�ٲ� �̸�: ");
				p.name = keyboard.nextLine();
				System.out.println("�ٲ� ��ȭ��ȣ: ");
				p.phoneNumber = keyboard.nextLine();
				System.out.println("�ٲ� �������: ");
				p.birth = keyboard.nextLine();
				
				System.out.println("���� �ٲٽðڽ��ϱ�?(y/n)");
				String yn = keyboard.nextLine(); 
				if(yn.equals("y")) {
					pinfo[i] = p;
					return;
				}else
					return;
				
			}
		}
		System.out.println("�ش� ������ �����ϴ�.");
	}
	
	public static void deleteData() {
		System.out.println("�����ϰ��� �ϴ� ������ �̸� �Է�: ");
		String name = keyboard.nextLine();
		for(int i=0; i<cnt; i++) {
			if(pinfo[i].name.equals(name)) {
				System.out.printf("�̸�:%s ��ȭ��ȣ:%s �������:%s\n", 
						pinfo[i].name, pinfo[i].phoneNumber, pinfo[i].birth);
				System.out.println("�� ������ �����Ͻðڽ��ϱ�?(y/n)");
				String yn = keyboard.nextLine();
				if(yn.equals("y")) {
					for(int j=i; j<cnt; j++) {
						pinfo[j] = pinfo[j+1];
					}
					pinfo[cnt] = null;
					cnt--;
				}
				
			}
		}
	}
	
	public static void main(String[] args)
	{
		int choice;
		
		while(true)
		{
			showMenu();
			choice=keyboard.nextInt();
			keyboard.nextLine();	
			
			switch(choice)
			{
			case 1:
				readData();
				break;
			case 2:
				searchData();
				break;
			case 3:
				deleteData();
				break;
			case 4:
				updateData();
				break;
			case 5:
				showAllOfInfo();
				break;
			case 6:
				System.out.println("���α׷��� �����մϴ�.");
				return;
		
			}
		}
	}
}