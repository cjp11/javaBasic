package phoneBook;

/*
 * ��ȭ��ȣ ���� ���α׷� ���� ������Ʈ
 * Version 0.2
 */

//import java.util.Scanner;

class PhoneInfo
{
	String name;
	String phoneNumber;
	String birth;
	
	
	public PhoneInfo(String name, String num, String birth)
	{
		this.name = name;
		phoneNumber = num;
		this.birth=birth;
		
	}
	public PhoneInfo(String name, String num)
	{
		this.name = name;
		phoneNumber = num;
		this.birth = null;
	
	}
	public void showPhoneInfo()
	{
		
		System.out.println("name: "+this.name);
		System.out.println("phone: "+phoneNumber);
		if(birth!=null)
			System.out.println("birth: "+this.birth);
	
		System.out.println("");	// ������ ������ ����
	}
}