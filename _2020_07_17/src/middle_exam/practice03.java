package middle_exam;
/*
 * StudentŬ������ �����ϰ� ����մϴ�
   �� Ŭ������ �ʵ�� �̸��� ����, ����, ����, ����
   ������ �����ϴ�
   �޼���� �ʵ带 �ʱ�ȭ�ϱ� ���� ������
            �⺻���� ���(�̸��� ����)
			��ü���� ���(��ü �ʵ�)
			���� ���
			��� ���
			toString()�޼���� ���ڿ��� ��ü ������ ��ȯ
			equals(Object obj)�� �ʵ���� ��ü ���� ������
			                  ���θ� �Ǵ��� �����մϴ�.
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
	public String toString() {
		return "�̸�:"+this.name+" ����:"+this.age+" ����:"+this.kor+" ����:"+this.math+" ����:"+this.eng;
    }
	public boolean equals(Object obj) {
        Student other = (Student) obj;	
		if(this.name == other.name &&
				this.age == other.age &&
				this.kor == other.kor &&
				this.math == other.math &&
				this.eng == other.eng) {
			return true;
		}
		else return false;

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
		String a = st1.toString();
		System.out.println(a);
		
		Student st2 = new Student("��",20);
		st2.kor = 50;
		st2.math = 60;
		st2.eng = 70;
	
		
		if(st1.equals(st2)) {
			System.out.println("st1.equals(st2)");
		}
		else {
			System.out.println("not equal!");
		}
		

	}

}
