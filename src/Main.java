
public class Main {

	public static void main(String[] args) throws CheckDocException {

		Document a = new Document("");

		Document.getTwoNumbersBlocks(a);
		Document.getDocNumber(a);
		Document.getLettersLowerCase(a);
		Document.getLettersLowerCase2(a);
		Document.getLettersUpperCase(a);
		Document.findString(a, "Kox");
		Document.toCheckNumber(a, 74);
		Document.toCheckSequence(a, "3h5t");

		String string = " abcde cba abefdc gggg cd abcdefg dfj as dessadsa223";
		ExtraTask.toFindLongestWord(string);
		ExtraTask.toFindShortestWord(string);
		ExtraTask.toFindMinDifferencesWord(string);
		ExtraTask.toFindPolyndrom(string, 3);
		ExtraTask.toDoubleWord("Hello World");
	}
}
