package edu.exam01.labelbreak18;

public class LabeledBreak {

	public static void main(String[] args) {
		outerLoop:						// ���⿡ �����ϸ� 2,2 ����� �ƿ� ���α׷��� ��. 
		for(int i=1;i<10;i++) {
			//outerLoop:
			for(int j=1;j<10;j++) {
				System.out.printf("[%d, %d]",i,j);
				if(i%2 == 0 && j%2 == 0) break outerLoop;
			}
		System.out.println();
		}
	
		System.out.println(); //outerLoop�� ������ �� ���� ����.
	
	// outerLoop�� �Ȱ��� ���� ����
		boolean isStop = false;
		for(int k=1;k<10;k++) {
			
			for(int l=1;l<10;l++) {
				System.out.printf("[%d, %d]",k,l);
				if(k%2 == 0 && l%2 == 0) {
					isStop = true; 
					break;
				}
			}
			if(isStop) break;
			//System.out.println();
		}

		System.out.println(); 
	
	}

}
