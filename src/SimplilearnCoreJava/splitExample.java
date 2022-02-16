package SimplilearnCoreJava;

import java.util.HashMap;

public class splitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I LOVE MY INDIA";
		
		String[] words = str.split("\\s"); // \\s splits the string based on whitespace
		// HashMap<String, Integer> hashMap = new HashMap<>();
		for (String w: words)
		{
		System.out.println(w);	
			
		}

	}

}
