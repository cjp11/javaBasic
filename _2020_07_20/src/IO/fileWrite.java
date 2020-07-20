package IO;

import java.io.FileWriter;
import java.io.IOException;

public class fileWrite {

	public static void main(String[] args) throws IOException {
		FileWriter out = new FileWriter("test03.dat");
		
		/*
		 * 1) write(int)
		 * -> �Ķ���� ���� �����ڵ��� �����Ѵ�.
		 * 	  FileOutputStream�� �ٸ��� 4����Ʈ �Ķ���� ���߿��� �� 2����Ʈ�� ����Ѵ�.
		 * 	   ��, ���� ���Ŀ� ���� ����Ѵ�.
		 * 	  --> �����ڵ带 OS �⺻ ������������ ��ȯ�Ͽ� ����Ѵ�.
		 * 	  ex) A => 0x0041(�����ڵ�) => 0x41(��°�)
		 *    ex) �� => 0xAC00(�����ڵ�) => 0xEAB080(UTF-8), 0xB0A1(MS949)
		 *    
		 */					//	��                    Window OS(MS949)	  MacOs(UTF-8)
		out.write(100);		// 0x00000064 => 0x64				, 0x64
		out.write(256);		// 0x00000100 => 0x3f				, 0xC480
		out.write(100);		// 0x00000064 => 0x64				, 0x64
		out.write(180243);	// 0x0002c013 => 0x97D3				, 0xEC8093
		// Window, Mac�� ������ 100, 245 , 100, 180243 �� ���ڷ� ���� ���� ������
		
		out.close();
		System.out.println("�����Ͽ����ϴ�.");
	}

}
