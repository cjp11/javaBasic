package chap8_interface2;

public class MysqlDao implements DataAccessObject{
	public void select() {
		System.out.println("Mysql DB���� �˻�");
	}
	public void insert() {
		System.out.println("Mysql DB�� ����");
	}
	public void update() {
		System.out.println("Mysql DB���� ����");
	}
	public void delete() {
		System.out.println("Mysql DB���� ����");
	}
}
