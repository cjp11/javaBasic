package step01;
// �� ������ Ÿ�� �����ϱ�(class)
public class Exam01 {
	// 1) �� ������ Ÿ�� ����
	static class Student{
		int no;
		float kor;
		float eng;
		float math;
		
	}
	public static void main(String[] args) {
		// 2) Student �޸��� �ּҸ� ������ ���� ���� (���۷�����θ�)
		Student s1;	// C++�� ���ÿ� ������ ���� ��������. Java�� ���ÿ� ������ new�� ���� �Ҵ��ؼ� �����. 
		// 3) Student Ÿ���� �޸𸮸� �غ��Ѵ�. (�ν��Ͻ���θ�)
		// s1.no = 1; -> �޸� �Ҵ���� �ʾ����Ƿ� ����(initialize ���� �ʾ����Ƿ�)
		s1 = new Student();
		
		// 4) �޸𸮿� ���� �����Ѵ�.
		s1.no = 1;
		s1.kor = 95f;
		s1.eng = 100f;
		s1.math = 97.5f;
		
		// 5) ������ ����� ����Ѵ�. 
		float sum = s1.kor + s1.eng + s1.math;
		float avg = sum / 3;
		System.out.printf("����: %f\n", sum);
		System.out.printf("���: %f\n", avg);
	}

}
