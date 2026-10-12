package java_chapter12_01;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest2 {

	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		//<Student>-> 제너릭이 자료형에 맞지않는 데이터는 받지않겠다!
		ArrayList sList = new ArrayList(); //제네릭 쓰지않고 선언하기
		sList.add("홍길동");
		sList.add(200);
		
		sList.get(0);
		sList.get(1); //향상된for문 사용 불가능
		
		for(Object obj:sList) {
			System.out.println(obj); //타입을 정하지 않고 백엔드 사용하지않는다
		}
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		Student stu4 = new Student();
		
		stu1.name = "홍길동";
		stu2.name = "이순신";
		stu3.name = "김유신";
		stu4.name = "강감찬";
		
		studentList.add(stu1);
		studentList.add(stu2);
		studentList.add(stu3);
		studentList.add(stu4);
		
		Iterator<Student> iterator = studentList.iterator();
		
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.name);
		}
		
	}

}
