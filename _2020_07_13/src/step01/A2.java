package step01;

public class A2 {
	// equals�� �������Ͽ� �������̵�
	int var1 = 100;
	int var2 = 200;
	
	public /*native*/ int hashCode() {
		// �������� hashCode()�� �ν��Ͻ� ���� ���� ������� 
		// ������ �� �ν��Ͻ����� ������ �ĺ��ڵ带 �����Ѵ�. 
		// -> ������
		// ���� ���� ���� �ν��Ͻ��� ���� �ؽ��ڵ���� �����ϰ� ������
		return this.var1;
	}
	
	public String toString() {
		return "A2[var1 = "+this.var1+ "]\n" +
				"A2[var1 = "+this.var2+ "]";
	}
	public boolean equals(Object obj) {
		// obj ������ A2 ��ü�� �Ѿ�� ���̱� ������ �� ��ȯ�Ͽ� �������. 
		A2 other = (A2)obj;
		if(this.var1 == other.var1) {
			return true;
		}
		else {
			return false;
		}
	}
}
