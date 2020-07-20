package IO;

import java.io.Serializable;

public class Score implements Serializable{
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	float avg;
	public void compute() {
		this.sum = this.kor + this.eng + this.math;
		this.avg = this.sum/3f;
	}
	
	public String toString() {
		return "Score [name= " + name + ", kor= "+ kor + ", eng= " + eng +
				", math= " + math + ", sum= " + sum + ", avg= " + avg + "]";
	}
}
