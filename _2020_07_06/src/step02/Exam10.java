package step02;

public class Exam10 {

	public static void main(String[] args) {
		//1) 레퍼런스 : 인스턴스 주소를 자정
		Board5 b = null;  //인스턴스 주소 저장 전. null ? 주소 변수를 초기화시킬 때 사용
//		b.title = "제목"; // 실행 오류(runtime error) 발생 => NullPointerException
		                 //인스턴스 주소가 없는 상태에서 인스턴스 변수에 접근할 수 없다.
		b = new Board5();
		b.title="제목";
		
		//2) 레퍼런스 배열: 배열 문법 사용하지 않기
		Board5 b0, b1, b2, b3, b4, b5 ,b6,b7;
		b0 = new Board5();
		b1 = new Board5();
		b2 = new Board5();
		
		Board5[] arr  =new Board5[5];
		
		for(int i = 0; i < arr.length;i++)
			arr[i] = new Board5();	
		
		arr[1].printInfo();
		arr[1].no = 5000;
		arr[1].printInfo();
		arr[10].printInfo();
	}
	
}
