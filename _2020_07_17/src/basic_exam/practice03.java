package basic_exam;
/*
 * StudentŬ������ �����ϰ� ����մϴ�
   �� Ŭ������ �ʵ�� �̸��� ����, ����, ����, ����
   ������ �����ϴ�
   �޼���� �ʵ带 �ʱ�ȭ�ϱ� ���� ������
            �⺻���� ���(�̸��� ����)
			��ü���� ���(��ü �ʵ�)
			���� ���
			��� ���
    �̷��� �����մϴ�.
 */

class Student {
	String name;
	int age;
	int kor;
	int math;
	int eng;
	
	Student(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.printf("�̸�:%s  ����:%d\n", this.name, this.age);
	}
	
	public void printInfo() {
		System.out.printf("�̸�:%s ����:%d ����:%s ����:%s ����:%s \n", 
				this.name, this.age, this.kor, this.math, this.eng);
	}
	public void totalScore() {
		int sum = this.kor + this.math + this.eng;
		System.out.println("����: "+ sum);
	}
	public void avgValue() {
		double res = (double)(this.kor + this.math + this.eng)/3;
		System.out.println("���: "+res);
	}
	
}

public class practice03 {

	public static void main(String[] args) {
		Student st1 = new Student("��",20);
		st1.kor = 50;
		st1.math = 60;
		st1.eng = 70;
		st1.printInfo();
		st1.totalScore();
		st1.avgValue();

	}

}
