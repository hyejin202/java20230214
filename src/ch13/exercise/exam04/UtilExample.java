package ch13.exercise.exam04;

public class UtilExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);
		
		ChildPair<String, Integer> childPair = new ChildPair<>("홍상원", 20);
		Integer childAge =  Util.getValue(childPair, "홍상순");
		System.out.println(childAge);
		
		
		/*OtherPair<String, Integer> otherPair = new OtherPair<>("홍상원", 20);
//		OtherPair는 Pair을 상속하지 않으므로 컴파일 에러가 발생
		int otherAge = Util.getValue(otherPair, "홍상원");
		System.out.println(otherAge); */
	}
}

class Util {
		public static <P extends Pair<K, V>, K, V> V  getValue(P pair, K key) {
			K k = pair.getKey();
			
			if (k.equals(key)) {
				return pair.getValue();
			} 
			return null;
		}
}

class Pair<K, V> {
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {return key;}
	public V getValue() {return value;} 
}

class ChildPair<K, V> extends Pair<K, V> {
	public ChildPair(K k, V v) {
		super(k, v);
	}
}

class OtherPair<K, V> {
	private K key;
	private V value;
	
	public OtherPair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKy() {return key;}
	public V getValue() {return value;}
}