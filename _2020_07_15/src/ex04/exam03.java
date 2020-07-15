package ex04;

import java.awt.Button;
import java.awt.Frame;

public class exam03 extends Frame {
	public exam03() {
		
		super("윈도우 제목");
		// 버튼 윈도우 생성 -> 버튼도 윈도우(작은 윈도우)이다.
		// 윈도우 프로그래밍 세계에서는 눈에 보이는 모든 것이 윈도우이다.
		// 예) 체크상자, 라디오버튼, 스크롤바, 탭, 메뉴, 대화상자, 슬라이드바 등
		Button yesBtn = new Button("예");
		Button noBtn = new Button("아니오");
		// 버튼 윈도우를 프레임 윈도우 위에 붙인다.
		// -> 윈도우에 자식 윈도우를 붙일 때 그 위치를 조정하는 배치 관리자가 있다.
		// -> Frame의 기본 배치 관리자는 "BorderLayout"라는 객체이다.
		// 여러 개를 붙이면, 계속 그 위에 덧붙여진다. 즉, 덮어쓴다.
		// 따라서 다음 두 개의 버튼을 프레임에 더하면, 맨 마지막에 더한 버튼이 맨 위에 놓인다.
		this.add(yesBtn);
		this.add(noBtn);
		setSize(400, 300);
	}

	public static void main(String[] args) {
		exam03 f = new exam03();
		f.setVisible(true);
	}

}
