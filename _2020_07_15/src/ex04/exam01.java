package ex04;

import java.awt.Frame;
//has A 관계
public class exam01 {

	public static void main(String[] args) {
		//1) 윈도우를 생성해주는 도구를 준비
		//-> 윈도우를 생성하는데 필요한 변수를 준비하고, 
		//   적절히 유요한 값으로 초기화 시킨다.
		
		Frame f = new Frame("첫번째 윈도우");
		
		//2) 윈도우의 너비와 높이를 설정한다.
		f.setSize(400,300);
		
		//3) 윈도우 객체에 저장된 정보를 바탕으로 윈도우를 출력한다.
		f.setVisible(true);
		
	}

}
