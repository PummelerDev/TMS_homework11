import java.util.Arrays;

public class ExtraTask {

	public static void toFindLongestWord(String str) {
		StringBuilder strSB = new StringBuilder(str.trim() + " ");
		int wordLength = 0;
		int wordMaxLength = Integer.MIN_VALUE;
		int wordPosition = 0;
		for (int i = 0; i < strSB.length(); i++) {
			if (strSB.charAt(i) != '\s') {
				wordLength++;
			} else {
				if (wordMaxLength <= wordLength) {
					wordMaxLength = wordLength;
					wordPosition = i - wordMaxLength;
				}
				wordLength = 0;
			}
		}
		System.out.println(strSB.substring(wordPosition, wordPosition + wordMaxLength));
	}

	public static void toFindShortestWord(String str) {
		String[] words = str.trim().split(" ");
		String value = words[0];
		for (int i = 0; i < words.length; i++) {
			if (value.length() >= words[i].length()) {
				value = words[i];
			}
		}
		System.out.println(value);
	}

	public static void toFindMinDifferencesWord(String str) {
		String[] wordsStart = str.trim().split(" ");
		String[] words = str.trim().split(" ");
		int matches = 0;
		int maxMatches = 0;
		int maxMatchesResult = 0;
		String value = "";
		char[] chars;
		for (int i = 0; i < words.length; i++) {
			chars = words[i].toCharArray();
			Arrays.sort(chars);
			words[i] = new String(chars);
		}
		StringBuilder strSB = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			for (int j = 0, k = 1; k < words[i].length(); j++, k++) {
				strSB = new StringBuilder(words[i]);
				if (strSB.charAt(j) == strSB.charAt(k)) {
					matches++;
				}
				if (maxMatches < matches) {
					maxMatches = matches;
				}
				matches = 0;
			}
			if (maxMatchesResult < maxMatches) {
				maxMatchesResult = maxMatches;
				value = new String(wordsStart[i]);
			}
		}
		System.out.println(value);
	}

	public static void toFindPolyndrom(String str, int wordNumber) {
		String[] words = str.trim().split(" ");
		if (wordNumber >= words.length) {
			System.out.println("there aren't so many words here!");
			return;
		}
		if (new StringBuilder(words[wordNumber]).toString()
				.equals(new StringBuilder(words[wordNumber]).reverse().toString())) {
			System.out.println("It is a polyndrom!");
		} else {
			System.out.println("It is not a polyndrom!");
		}
	}

	public static void toDoubleWord(String str) {
		char[] chars = str.toCharArray();
		String value = "";
		for (int i = 0; i < chars.length; i++) {
			value += chars[i] + "" + chars[i];
		}
		System.out.println(value);
	}
}
