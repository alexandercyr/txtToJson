/**
 * 
 * TxtToJson Converter
 * @author alexcyr
 *
 */

package textToJson;

import java.util.ArrayList;
import java.util.Scanner;


public class txtToJson {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to TxtToJson Converter");
		System.out.println("Enter the string you want to convert to JSON (ends on empty input): ");
		ArrayList <String> strArr = new ArrayList <String>();
		
		while(!scnr.nextLine().equals("")) {
			String line = scnr.nextLine();
			strArr.add(line);
		}
		
		String jsonStr = "{ \"WordList\": [";
		
		for (int i = 0; i<strArr.size(); i++) {
			jsonStr = jsonStr + "\"" + strArr.get(i) + "\"";
			if (i != (strArr.size() - 1)) {
				jsonStr = jsonStr + ", ";
			}
			
		}
		jsonStr = jsonStr + "]}";
		
		System.out.println(jsonStr);
	}
	
}
