package java_chapter12_01;

public class GenericTest {

	public static void main(String[] args) {
		
		Box box = new Box();
		box.setItemName("사과박스");
		System.out.println(box.getItemName());

		box.setItemName(100);
		System.out.println(box.getItemName());
		//제네릭을 사용하면 클래스 하나로 해결됨
	}

}
