package middle_exam;
/*
 * Student클래스를 정의하고 사용합니다
   이 클래스의 필드는 이름과 나이, 국어, 수학, 영어
   점수를 갖습니다
   메서드는 필드를 초기화하기 위한 생성자
            기본정보 출력(이름과 나이)
			전체정보 출력(전체 필드)
			총점 출력
			평균 출력
			toString()메서드는 문자열로 전체 정보를 반환
			equals(Object obj)는 필드들의 전체 값이 같은지
			                  여부를 판단해 구성합니다.
    이렇게 구성합니다.
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
		System.out.printf("이름:%s  나이:%d\n", this.name, this.age);
	}
	
	public void printInfo() {
		System.out.printf("이름:%s 나이:%d 국어:%s 수학:%s 영어:%s \n", 
				this.name, this.age, this.kor, this.math, this.eng);
	}
	public void totalScore() {
		int sum = this.kor + this.math + this.eng;
		System.out.println("총점: "+ sum);
	}
	public void avgValue() {
		double res = (double)(this.kor + this.math + this.eng)/3;
		System.out.println("평균: "+res);
	}
	public String toString() {
		return "이름:"+this.name+" 나이:"+this.age+" 국어:"+this.kor+" 수학:"+this.math+" 영어:"+this.eng;
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
		Student st1 = new Student("윤",20);
		
		st1.kor = 50;
		st1.math = 60;
		st1.eng = 70;
		st1.printInfo();
		st1.totalScore();
		st1.avgValue();
		String a = st1.toString();
		System.out.println(a);
		
		Student st2 = new Student("상",20);
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
