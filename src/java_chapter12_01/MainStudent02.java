package java_chapter12_01;

import java.util.ArrayList;
import java.util.List;

public class MainStudent02 {

	public static void main(String[] args) {
	//List<Student> studentList =new ->List 인터페이스이므로 인스턴스화 불가능
    ArrayList<Student> studentList = new ArrayList<Student>();
    List<Student> list = new ArrayList<Student>();
    list = studentList;//업캐스팅
    //업캐스팅-> ArrayList를 List 인터페이스를 구현하고있음
    
    Student stu1 = new Student();
    stu1.name = "홍길동";
    studentList.add(stu1);
    studentList.add(stu1);
    studentList.add(stu1);
    //null값->Student 객체만 사용가능
    
    studentList.get(1);
    
    for(int i =0;i<studentList.size();i++) {
    	System.out.println(studentList.get(i).name);
    }
    for(Student student :studentList) {
    }
    ArrayList<Integer> ints = new ArrayList<Integer>();
    ints.add(10);
    ints.add(20);
    ints.add(30);
    
    for(Integer integer1 : ints) {
    	System.out.println(integer1);
    }
    //ArrayList인 ints에는 integer 정수만 넣겠다!
    ArrayList<String> strs = new ArrayList<String>();
    strs.add("Korea1");
    strs.add("Korea2");
    strs.add("Korea3");
    strs.add("Korea3");
    strs.add("Korea3");
    //ArrayList인 strs에는 String 문자열만 넣겠다!
    for(String string1 : strs) {
    	System.out.println(string1);
	}
    
    System.out.println(ints.get(2));
    System.out.println(strs.get(2));
    //ArrayList 메서드 5개-> add(추가할객체)추가, remove(인덱스)삭제, set(인덱스)수정,
    //get(인덱스)가져오기, size()크기
    System.out.println(strs.contains("Korea2"));
    System.out.println(ints.contains(120));
    
    System.out.println(ints);
    System.out.println(strs);
	}
	}
