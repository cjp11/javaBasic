package ptr;

public class InkPrinter extends Printer{
	int restofInk;
	
	InkPrinter() {		//왜 이 생성자를 안써주면 에러메시지가 뜰까
		
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
