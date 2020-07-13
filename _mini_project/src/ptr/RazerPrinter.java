package ptr;

public class RazerPrinter extends Printer{
	double restofToner;
	public RazerPrinter() {
		this.restofPaper = 1000;
		this.restofToner = restofPaper/10;
	}
	public RazerPrinter(String modelName, String maker, String kindofInterface) {
		this();
		this.modelName =  modelName;
		this.maker = maker;
		this.kindofInterface = kindofInterface;
	
	}
	// Overriding
	void print() {
		restofPaper--;
		restofToner = restofPaper/10 + (restofPaper%10)*0.1;
	}
	
}
