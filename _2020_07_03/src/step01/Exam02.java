package step01;
// �� ������ Ÿ�� �����ϱ�(class)
public class Exam02 {
	// 1) �� ������ Ÿ�� ����
	static class Student{
		int no;
		float kor;
		float eng;
		float math;
		//���ʽ� ���� ������ִ� ����(����� ���� ������)
		void addBonus(int score) {
			kor += score;
			eng += score;
			math += score;
		}
		
		// ���� ������ִ� ������(�ż���)
		float sum() {
			return kor + eng + math;
		}
		// ��� ~ ������(�ż���)
		float avg() {
			return sum()/3;
		}
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
		s1.addBonus(5);
		// 5) ������ ����� ����Ѵ�. 
		float sum = s1.sum();
		float avg = s1.avg();
		
		System.out.printf("����: %f\n", sum);
		System.out.printf("���: %f\n", avg);
	}

}
