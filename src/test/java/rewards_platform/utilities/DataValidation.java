package rewards_platform.utilities;

import java.util.List;

public class DataValidation {

//	public static boolean validateCharacters(String s){
//		char[] idCharacters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
//				'o','p','q','r','s','t','u','v','w','x','y','z', '-', '1', '2','3','4',
//				'5','6','7','8','9','0'};
//		int z=0;
//		boolean isValid=false;
//		for (int i=0; i<(s.length())-1;i++ ) {
//			
//			for(int k=0; k<idCharacters.length; k++){
//				if((idCharacters[k])==(s.charAt(i))){
//					z+=1;
//					System.out.print((idCharacters[k]));
//				}
//				System.out.println(z);
//			}
//		}
//		if(z==s.length()){
//			isValid=true;
//		}
//		return isValid;
//	}
//	String[] idCharacters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n",
//			"o","p","q","r","s","t","u","v","w","x","y","z", "-", "1", "2","3","4",
//			"5","6","7","8","9","0" };
	
	//method to validate if a string contains any invalid characters
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

	private static boolean sizeValidation(List<String> list) {

		for (String element : list) {
			if (!((element.length()) == 36))
				return false;
		}
		return true;
	}

	private static boolean nullValidation(List<String> list) {
		for (String element : list) {
			if (element.equals(null))
				return false;
		}
		return true;
	}

	public static boolean formatValidation(List<String> list) {
		boolean status = false;
		if(specialCaractersValidation(list)){
		if ((sizeValidation(list)) && (nullValidation(list))) {
			for (String element : list) {
				String string = element.substring(0, element.indexOf("-"));
				if (string.length() == 8) {

					String temp = ((element.substring((element.indexOf("-")) + 1)));
					if ((temp.substring(0, temp.indexOf("-")).length()) == 4) {

						String temp2 = (temp.substring(temp.indexOf("-") + 1));
						if ((temp2.substring(0, temp2.indexOf("-")).length()) == 4) {

							String temp3 = (temp2.substring(temp2.indexOf("-") + 1));
							if ((temp3.substring(0, temp3.indexOf("-")).length()) == 4) {

								String temp4 = (temp3.substring(temp3.indexOf("-") + 1));
								if (((temp4.length()) == 12) && (temp4.indexOf("-") == -1)) {
									status = true;
								} else {
									status = false;
									break;
								}
							} else {
								status = false;
								break;
							}
						} else {
							status = false;
							break;
						}
					} else {
						status = false;
						break;
					}
				} else {
					status = false;
					break;
				}
			}
		} else {
			status = false;
		}

		
	}
		return status;
	}
	
	//validate string
	public static boolean formatValidation(String id) {
		boolean status = false;

				String string = id.substring(0, id.indexOf("-"));
				if (string.length() == 8) {

					String temp = ((id.substring((id.indexOf("-")) + 1)));
					if ((temp.substring(0, temp.indexOf("-")).length()) == 4) {

						String temp2 = (temp.substring(temp.indexOf("-") + 1));
						if ((temp2.substring(0, temp2.indexOf("-")).length()) == 4) {

							String temp3 = (temp2.substring(temp2.indexOf("-") + 1));
							if ((temp3.substring(0, temp3.indexOf("-")).length()) == 4) {

								String temp4 = (temp3.substring(temp3.indexOf("-") + 1));
								if (((temp4.length()) == 12) && (temp4.indexOf("-") == -1)) {
									status = true;
								} else {
									status = false;
									return status; 
								}
							} else {
								status = false;
								return status;
							}
						} else {
							status = false;
							return status;
						}
					} else {
						status = false;
						return status;
					}
				} else {
					status = false;
					return status;
				}

		return status;
	}
	//to compare two list items (they must be in the same order!)
	public static boolean containsAll(List<String> listOne, List<String> listTwo){
		if((!(isDuplicate(listOne)))&&((!isDuplicate(listTwo)))){
			if (!(listOne.size()==listTwo.size())){
				return false;
			}	
			for(int i=0; i<listOne.size(); i++){
				if(!(listOne.get(i).equals(listTwo.get(i)))){
				return false;
				}
			}
		}
		return true;
	}
	
	//to check for duplicate items in the list
	public static boolean isDuplicate(List<String> list){
		String temp=list.get(0);
		int n=0;
		for (String element : list) {
			
			for (int i=0; i<list.size(); i++){
				temp=list.get(i);
				if(n!=i){
			if(element.equals(temp)){
				return true;
			}
				}
			}
			n++;
		}
		return false;
	}
}
