package ex03;

public class MyKey {
	int v1;
	int v2;
	public MyKey(int v1, int v2) {
		this.v1 = v1;
		this.v2 = v2;
	}
	
	@Override
	public String toString() {
		return "MyKey [v1= " + v1 + ", v2=" + v2 + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + v1;
		result = prime * result + v2;
		
		return result;
	}
	
	public boolean equals(Object obj) {
		if(this == obj)		
			return true;
		if(obj == null)
			return false;
		MyKey other = (MyKey)obj;
		
		if(v1 != other.v1) return false;
		if(v2 != other.v2) return false;
		
		
		return true;
	}
}
