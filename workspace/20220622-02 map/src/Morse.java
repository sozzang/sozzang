//모스부호 변환 프로그램

import java.util.HashMap;
import java.util.Map;

public class Morse {
public static void main(String[] args) {
	
	Map<Character, String> map = new HashMap<>();
    map.put('A', "ㆍ－");
    map.put('B', "－ㆍㆍㆍ");
    map.put('C', "－ㆍ－ㆍ");
    map.put('D', "－ㆍㆍ");
    map.put('E', "ㆍ");
    map.put('F', "ㆍㆍ－ㆍ");
    map.put('G', "－－ㆍ");
    map.put('H', "ㆍㆍㆍㆍ");
    map.put('I', "ㆍㆍ");
    map.put('J', "ㆍ－－－");
    map.put('K', "－ㆍ－");
    map.put('L', "ㆍ－ㆍㆍ");
    map.put('M', "－－");
    map.put('N', "－ㆍ");
    map.put('O', "－－－");
    map.put('P', "ㆍ－－ㆍ");
    map.put('Q', "－－ㆍ－ ");
    map.put('R', "ㆍ－ㆍ ");
    map.put('S', "ㆍㆍㆍ");
    map.put('T', "－ ");
    map.put('U', "ㆍㆍ－");
    map.put('V', "ㆍㆍㆍ－");
    map.put('W', "ㆍ－－ ");
    map.put('X', "－ㆍㆍ－ ");
    map.put('Y', "－ㆍ－－ ");
    map.put('Z', "－－ㆍㆍ");
    
   String a = "SOS";
   String b = "";
   
   for(int i = 0; i < a.length();i++) { 
	    b += map.get(a.charAt(i));
	  
   }
    
    
}
}
