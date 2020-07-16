package step02;

public class Exam01_8 {

	public static void main(String[] args) {
		String[] arr = "홍길동 임꺽정 유곤순 임청하 왕조현 오천련".split(" ");	// "/" 로 작성하고 이름 사이에 /를 넣어줘도 같은 결과가 나옴
		
		for(String s : arr) {
			System.out.println(s);
		}

	}

}
