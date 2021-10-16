import java.util.HashMap;
import java.util.Arrays;
import java.util.List;

public class Morse {
	private static HashMap<String, String> englishToMorseLib = new HashMap<>(), morseToEnglishLib = new HashMap<>();

    {
        //fill up englishToMorseLib
        englishToMorseLib.put("A", ".-");
        englishToMorseLib.put("B", "-...");
        englishToMorseLib.put("C", "-.-.");
        englishToMorseLib.put("D", "-..");
        englishToMorseLib.put("E", ".");
        englishToMorseLib.put("F", "..-.");
        englishToMorseLib.put("G", "--.");
        englishToMorseLib.put("H", "....");
        englishToMorseLib.put("I", "..");
        englishToMorseLib.put("J", ".---");
        englishToMorseLib.put("K", "-.-");
        englishToMorseLib.put("L", ".-..");
        englishToMorseLib.put("M", "--");
        englishToMorseLib.put("N", "-.");
        englishToMorseLib.put("O", "---");
        englishToMorseLib.put("P", ".--.");
        englishToMorseLib.put("Q", "--.-");
        englishToMorseLib.put("R", ".-.");
        englishToMorseLib.put("S", "...");
        englishToMorseLib.put("T", "-");
        englishToMorseLib.put("U", "..-");
        englishToMorseLib.put("V", "...-");
        englishToMorseLib.put("W", ".--");
        englishToMorseLib.put("X", "-..-");
        englishToMorseLib.put("Y", "-.--");
        englishToMorseLib.put("Z", "--..");

        englishToMorseLib.put("0", "-----");
        englishToMorseLib.put("1", ".----");
        englishToMorseLib.put("2", "..---");
        englishToMorseLib.put("3", "...--");
        englishToMorseLib.put("4", "....-");
        englishToMorseLib.put("5", ".....");
        englishToMorseLib.put("6", "-....");
        englishToMorseLib.put("7", "--...");
        englishToMorseLib.put("8", "---..");
        englishToMorseLib.put("9", "----.");

        englishToMorseLib.put(".", ".-.-.-");
        englishToMorseLib.put(",", "--..--");
        englishToMorseLib.put("?", "..--..");
        englishToMorseLib.put(":", "---...");
        englishToMorseLib.put("-", "-....-");
        englishToMorseLib.put("@", ".--.-.");
        englishToMorseLib.put("error", "........");

        //fill the morseToEnglishLib
        List<Object> values = Arrays.asList(englishToMorseLib.values().toArray());
        List<Object> keys = Arrays.asList(englishToMorseLib.keySet().toArray());
        for(int i = 0; i < values.size(); i++) {
            morseToEnglishLib.put(values.get(i).toString(), keys.get(i).toString());
        }
    }

    //Method for transforming an english string to a morse code string, using the predefined HashMap.
	public static String engToMorse(String input) {

		//Splits the input String into an array of words.
		String[] inputArr = input.split("[\\s\\n]");
		String addStringEM = "";
		for (int i = 0; i > inputArr.length;i++){

			//Splits the words in inputArr into an array of letters.
			String[] subStrInput = inputArr[i].split("");
			for (int j = 0; j > (subStrInput.length); j++) {

				//Passes the keys though the hash function, and adds the found values together. 
				addStringEM = addStringEM + englishToMorseLib.get(subStrInput[i]);
			}
			addStringEM = addStringEM + " / ";
		}
		return addStringEM;
	}

	public static void main(String[] args) {
		System.out.println("I want to go to cheese land!");
		String printIt = engToMorse("I want to go to cheese land!");
		System.out.println(".. / .-- .- -. - / - --- / --. --- / - --- / -.-. .... . . ... . / .-.. .- -. -.. -.-.--");
		System.out.println(printIt);
	}
}