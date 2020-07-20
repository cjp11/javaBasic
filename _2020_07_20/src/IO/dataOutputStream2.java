package IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class dataOutputStream2 {

	public static void main(String[] args) throws IOException {
		FileOutputStream out = new FileOutputStream("exam0892_3.dat");
		DataOutputStream out2 = new DataOutputStream(out);
		
		int value = 0x2a883c65;
		
		/*
		 * FileOutputStream 을 직접 사용하지 말고,
		 * DataOutputStream를 사용해서 int 값을 출력하면
		 * 코딩이 쉬워진다.
		 */
		
		out2.writeInt(value);
		out.close();
		System.out.println("실행하였습니다.");
		
		FileInputStream in = new FileInputStream("exam0892_3.dat");
		DataInputStream in2 = new DataInputStream(in);
		
		int val = in2.readInt();
		in.close();
		System.out.printf("0x%x\n", val);
	}

}
