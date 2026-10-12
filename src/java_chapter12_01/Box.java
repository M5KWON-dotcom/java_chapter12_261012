package java_chapter12_01;

public class Box<T> { //제너릭을 사용한 클래스->자료형을 나중에 저장하겠다라는 의미

	private T itemName;  //String, int 등 자료형 대신 제너릭 T (T는 가변형 자료구조)
	
	
	public T getItemName() {
		return itemName;
	}
	public void setItemName(T itemName) {
		this.itemName = itemName;
	}
	public void printItem(T name) {
		System.out.println(name);
	}
	
	/*public String getItemName() {
		return itemName;
	}
	public String setItemName(String itemName) {
		
	this.itemName = itemName;*/
}
