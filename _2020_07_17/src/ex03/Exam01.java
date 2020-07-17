package ex03;

import java.io.File;
import java.io.IOException;

/*
 * 주제: 파일을 다루는 도구 - File 사용법
 * File?
 * -> File System을 다루는 도구
 * -> File System? 디렉토리와 파일을 관리하는 시스템
 * -> 디렉토리 또는 파일의 정보를 다룰 수 있다.
 */
public class Exam01 {

	public static void main(String[] args) throws IOException {
		// 파일 정보 다루기
		// -> 경로를 지정하는 방법
		// 1) 절대 경로
		// -> 전체 경로를 지정한다.
		// 예) c:\Users\Bitcamp\test\a.txt <-Window OS
		// 예) /User/test/a.txt <-Unix, Linux, MaxOs

		// 2) 상대 경로
		// -> 현재 위치를 기준으로 경로를 지정한다.
		// 예) test/a.txt
		// -> 이클립스에서 실행할 때, 상대 경로는 프로젝트 폴더이다.
		
		File f = new File("board1.dat");
		System.out.println(f.exists());			// 현재 폴더(경로)에 이 파일이 존재하냐? 
		System.out.println(f.isDirectory());	// 이 파일이 디렉토리냐?
		System.out.println(f.isFile());
		
		File f2 = new File("../java01/test01/test53.java");
		System.out.println(f2.getCanonicalPath());
		System.out.println(f2.getAbsolutePath());
	}

}
