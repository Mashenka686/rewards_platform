package rewards_platform.tests;

import java.util.List;

public class CharactTest {

	public static void main(String[] args) {
		String id="6706ccbd-ae33-4e6e-90c8-bc18fd119e4p";
		String id2="8aa!7586-016b-455d-8eb6-a6c06c0874ac";
		
		System.out.println(validateCharacters(id));
		System.out.println(validateCharacters(id2));
	}
	public static boolean validateCharacters(String s){
		char[] idCharacters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
				'o','p','q','r','s','t','u','v','w','x','y','z', '-', '1', '2','3','4',
				'5','6','7','8','9','0'};
		int z=0;
		boolean isValid=false;
		for (int i=0; i<s.length();i++ ) {
			
			for(int k=0; k<idCharacters.length; k++){
				if((idCharacters[k])==(s.charAt(i))){
					z+=1;
					//System.out.print(idCharacters[k]);
				}
			}
		}
		if(z==s.length()){
			
			isValid=true;
		}
		if(!isValid)
		System.out.println("Number of invalid characters in the string: "+(s.length()-z));
		return isValid;
	}
	private static boolean specialCaractersValidation(List<String> list) {

		for (String element : list) {
			if (element.contains("@") || element.contains("!") || element.contains("#") || element.contains("$")
					|| element.contains("*") || element.contains("%") || element.contains("&") || element.contains("^")
					|| element.contains("?")) {
				return false;

			}
		}
		return true;
	}
}
