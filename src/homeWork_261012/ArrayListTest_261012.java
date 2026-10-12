package homeWork_261012;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayListTest_261012 {

	public static void main(String[] args) {
		 ArrayList<Integer> Number = new ArrayList<Integer>();
		   Number.add(10);
		   Number.add(20);
		   Number.add(30);
		   Number.add(40);
		   Number.add(50);
		   
		   System.out.println(Number);
		   System.out.println(Number.get(2));
		   System.out.println(Number.size());
		   Number.remove(1);
		   System.out.println(Number);
		   System.out.println("====================================");
				
		ArrayList<String> studentName = new ArrayList<String>();
		   studentName.add("홍길동");
		   studentName.add("이순신");
		   studentName.add("김유신");
		   studentName.add("강감찬");
		  		   
		    for(String string1 : studentName) {
		   if (string1.contains("이순신")) {
			   System.out.println("존재합니다.");
		   }else{
			   System.out.println("존재하지 않습니다.");
		   }
		   }
		   System.out.println("===================================="); 
		   
		   HashSet<String> stringSet = new HashSet<String>();
		   stringSet.add("Java");
		   stringSet.add("Spring");
		   stringSet.add("Java");
		   stringSet.add("React");
		   stringSet.add("Spring");
		   System.out.println(stringSet.size());
		   //hashSet 값이 중복되지않음
		   
		   HashMap<String, Integer> studentScore = new HashMap<String,Integer>(); 
		   studentScore.put("홍길동", 90);
		   studentScore.put("김철수", 80);
		   studentScore.put("이영희", 95);
			
		   System.out.println(studentScore.get("홍길동"));
		   studentScore.put("김철수", 88);
		   System.out.println(studentScore.get("김철수"));
	}
	}
