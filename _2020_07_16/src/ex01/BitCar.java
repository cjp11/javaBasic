package ex01;
/*
 * 인터페이스는 다중 상속이 가능하다
 * -> 어차피 구현되지 않은 메서드이기 때문에 여러 부모에 중복된 매서드가 있더라도 상관없다.
 * -> 그에 비해서 클래스는 구현된 매서드를 상속받기 때문에 다중 상속을 불허한다.
 * -> 이유: 같은 이름의 매서드가 여러 부모에 존재한다고 가정하자.
 * 		     어떤 부모의 매서드를 상속 받느냐에 따라 동작이 달라진다.
 * 		     따라서, 클래스는 다중 상속을 허용하지 않는다. 
 */
public interface BitCar extends Truck, Sedan {
	void stop();


}
