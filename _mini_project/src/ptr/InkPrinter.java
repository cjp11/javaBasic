package ptr;

public class InkPrinter extends Printer{
	int restofInk;
	
	InkPrinter() {		//�� �� �����ڸ� �Ƚ��ָ� �����޽����� ���
		
	}
	
	public InkPrinter(int restofPaper, int restofInk) {
		
		this.restofPaper = restofPaper;
		this.restofInk = restofInk;
	}
	

	void print() {
		this.restofPaper--;
		this.restofInk--;
		//System.out.printf("%d %d %d",this.cntofPaper,this.restofPaper,this.restofInk);
	}
}
