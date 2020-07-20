package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * DataOutputStream
 * -> �ڹ� ���� Ÿ�� �����͸� ����Ʈ �迭�� �ٲ� ����ϴ� ���� �Ѵ�.
 * DataInputStream
 * -> ����Ʈ �迭�� �о� �ڹ� ���� Ÿ�� �����ͷ� ������Ű�� ���� �Ѵ�.
 */
public class dataOutputStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream out = new FileOutputStream("exam0892_2.dat");
		
		
		int value = 0x2a883c65;
		out.write(value >> 24);
		out.write(value >> 16);
		out.write(value >> 8);
		out.write(value);		//�� ���常 �����ϸ� �� �� 65�� write��
		out.close();
		
		FileInputStream in = new FileInputStream("exam0892_2.dat");
		int ret;
		ret = in.read() << 24;
		ret += in.read() << 16;
		ret += in.read() << 8;
		ret += in.read();
		System.out.printf("value: %x\n", value);
		System.out.printf("ret: 0x%x\n", ret);
		System.out.println("�����Ͽ����ϴ�.");
	}

}
