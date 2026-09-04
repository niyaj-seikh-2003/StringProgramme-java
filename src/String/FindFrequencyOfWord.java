package String;

import java.util.HashMap;

public class FindFrequencyOfWord {

	public static void main(String[] args) {
		HashMap<String,Integer>map=new HashMap<>();
		String str="Java is a fun language,Java is awosome,Java is beautiful";
		String []words=str.split(" ");
		for(String word:words) {
			map.put(word,map.getOrDefault(word,0)+1);
		}
		System.out.println("Frequency is:"+map);
	}

}
