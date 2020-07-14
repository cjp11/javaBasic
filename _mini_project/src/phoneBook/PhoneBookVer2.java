package phoneBook;
/*
 * 1. PhoneBookVer02.java 프로그램을 배열을 사용하도록 수정해서
   프로그램 사용자가 입력하는 정보가 최대 100개까지 유지되도록 프로그램을 변경하세요
   그리고 기능은 
   데이터 저장
   데이터 검색
   데이터 삭제
   데이터 수정
   데이터 전체 출력
   를 선택하도록 하세요

실행하면 이렇게 나타납니다


--선택하세요--
1. 데이터 입력
2. 데이터 검색
3. 데이터 삭제
4. 데이터 수정
5. 데이터 전체 출력
6. 프로그램 종료
선택 : 1
데이터 입력을 시작합니다..
이름: 홍길동
전화번호 : 222-3333
생년월일 : 99년 12월 25일생
데이터 입력이 완료되었습니다.

--선택하세요--
1. 데이터 입력
2. 데이터 검색
3. 데이터 삭제
4. 데이터 수정
5. 데이터 전체 출력
6. 프로그램 종료
선택 :
 */
import java.util.Scanner;

class PhoneBookVer02
{
	static Scanner keyboard=new Scanner(System.in);
	static PhoneInfo[] pinfo = new PhoneInfo[100];
	static int cnt = 0;
	
	public static void showMenu()
	{
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 데이터 수정");
		System.out.println("5. 데이터 전체 출력");
		System.out.println("6. 프로그램 종료");
		System.out.print("선택: ");
	}
	
	public static void readData()
	{
		System.out.print("이름: ");
		String name=keyboard.next();
		System.out.print("전화번호: ");
		String phone=keyboard.next();
		System.out.print("생년월일: ");
		String birth=keyboard.next();
		
		PhoneInfo info=new PhoneInfo(name, phone, birth);
		pinfo[cnt++] = info; 
		// pinfo[cnt].name = info.name -> 왜 안되는지 정확하게 알기.(이건 C의 구조체 접근 방식) 
		// ->상황: pinfo 배열에 100개가 null로 초기화 됨. 
		//		   각 요소마다 인스턴스를 연결 시켜줘야함
		
		System.out.println("\n입력된 정보 출력...");
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
		
		System.out.println("찾으려는 정보의 이름 입력:");	// 나중에 전번, 생년월일로도 찾을 수 있게 확장하기
		String name = keyboard.nextLine();
		while(i < cnt) {
			if(pinfo[i].name.equals(name)) {
				System.out.println("해당 데이터를 찾았습니다.");
				System.out.printf("이름:%s 전화번호:%s 생년월일:%s\n", 
						pinfo[i].name, pinfo[i].phoneNumber, pinfo[i].birth);
				flag = true;
				break;
				//return;
			}
			i++;
			
		}
		if(flag == false) {
			System.out.println("해당 정보는 없습니다.");
		}
		//System.out.println("해당 정보는 없습니다.");
	}
	
	public static void updateData() {
		int i = 0;
		PhoneInfo p = new PhoneInfo();
		System.out.println("수정하고자 하는 정보의 이름 입력: ");
		String name = keyboard.nextLine();
		for(i=0; i<cnt; i++) {
			if(pinfo[i].name.equals(name)) {
				System.out.printf("이름:%s 전화번호:%s 생년월일:%s\n", 
						pinfo[i].name, pinfo[i].phoneNumber, pinfo[i].birth);
				System.out.println("바꿀 이름: ");
				p.name = keyboard.nextLine();
				System.out.println("바꿀 전화번호: ");
				p.phoneNumber = keyboard.nextLine();
				System.out.println("바꿀 생년월일: ");
				p.birth = keyboard.nextLine();
				
				System.out.println("정말 바꾸시겠습니까?(y/n)");
				String yn = keyboard.nextLine(); 
				if(yn.equals("y")) {
					pinfo[i] = p;
					return;
				}else
					return;
				
			}
		}
		System.out.println("해당 정보는 없습니다.");
	}
	
	public static void deleteData() {
		System.out.println("삭제하고자 하는 정보의 이름 입력: ");
		String name = keyboard.nextLine();
		for(int i=0; i<cnt; i++) {
			if(pinfo[i].name.equals(name)) {
				System.out.printf("이름:%s 전화번호:%s 생년월일:%s\n", 
						pinfo[i].name, pinfo[i].phoneNumber, pinfo[i].birth);
				System.out.println("이 정보를 삭제하시겠습니까?(y/n)");
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
				System.out.println("프로그램을 종료합니다.");
				return;
		
			}
		}
	}
}