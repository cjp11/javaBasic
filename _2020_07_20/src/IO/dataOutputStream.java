package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * DataOutputStream
 * -> 자바 원시 타입 데이터를 바이트 배열로 바꿔 출력하는 일을 한다.
 * DataInputStream
 * -> 바이트 배열을 읽어 자바 원시 타입 데이터로 복원시키는 일을 한다.
 */
public class dataOutputStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream out = new FileOutputStream("exam0892_2.dat");
		
		
		int value = 0x2a883c65;
		out.write(value >> 24);
		out.write(value >> 16);
		out.write(value >> 8);
		out.write(value);		//이 문장만 실행하면 맨 끝 65만 write됨
		out.close();
		
		FileInputStream in = new FileInputStream("exam0892_2.dat");
		int ret;
		ret = in.read() << 24;
		ret += in.read() << 16;
		ret += in.read() << 8;
		ret += in.read();
		System.out.printf("value: %x\n", value);
		System.out.printf("ret: 0x%x\n", ret);
		System.out.println("실행하였습니다.");
	}

}
