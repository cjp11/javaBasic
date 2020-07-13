package ptr;

public class InkPrinter extends Printer{
	double restofInk;
	
	public InkPrinter() {
		this.restofPaper = 1000;
		this.restofInk = restofPaper/10;
	}
	public InkPrinter(String modelName, String maker, String kindofInterface) {
		this();
		this.modelName =  modelName;
		this.maker = maker;
		this.kindofInterface = kindofInterface;
	
	}
	// Overriding
	void print() {
		restofPaper--;
		restofInk = restofPaper/10 + (restofPaper%10)*0.1;
	}
	
}
