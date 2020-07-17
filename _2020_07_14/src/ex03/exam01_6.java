package ex03;

import java.util.HashSet;

/*
 *  HashSet
 *  -> 값을 저장하는 규칙.
 *  -> 집합을 본따 만든 객체이다. 즉 같은 값을 중복 저장하지 않는다.
 *  - 중복 여부 비교 방법
 *  => hashCode의 리턴 값이 같고,
 *  => equals()의 리턴 값이 true라면 같은 값으로 취급한다.
 *  -> null값 저장 가능
 *  -> 꺼낼 때 저장된 순서대로 꺼낼 수 없다.
 * 
 */
public class exam01_6 {

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<>();
		
		names.add("홍길동");
		names.add("홍길동");	
		names.add(null);
		names.add("임");
		names.add(null);	// 중복 저장 안됨
		names.add("임");		// 중복 저장 안됨
		names.add("유");
		names.add(new String("홍길동"));	// 인스턴스가 다른데도 불구하고 중복으로 간주된다.
		// 이유는? hashCode()의 리턴 값이 같고, equals 리턴 결과가 true이기 때문이다.
		
		for(String s: names) {
			System.out.println(s);
		}
		
		Object[] arr = names.toArray();
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("-------------");
		System.out.printf("홍길동: %d\n", "홍길동".hashCode());
		System.out.printf("홍길동: %d\n", new String("홍길동").hashCode());
		System.out.printf("임꺽정: %d\n", "임꺽정".hashCode());
		System.out.printf("홍길동.equals(other) %b\n", "홍길동".equals(new String("홍길동")));
		
	}

}

/*
 * HashSet의 값 저장 원리?
 * -> 인덱스를 사용하지 않고, 인스턴스의 해시코드를 사용하여 그 저장 위치를 결정한다.
 * -> 그래서 저장 순서는 인스턴스의 해시 값이 결정한다.
 * 
 * 해시 값(hash code)?
 * -> 객체 또는 값을 식별하기 위해 부여된 고유 번호.
 * -> 특별한 계산 공식(알고리즘)에 따라 각 인스턴스에 대해 값을 부여한다.
 */

