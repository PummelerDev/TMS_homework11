
public class Document {

	private String docNumber;

	public String getDocNumber() {
		return docNumber;
	}

	public void setDocNumber(String documentNumber) {
		this.docNumber = documentNumber;
	}

	public Document(String docNumber) throws CheckDocException, StringIndexOutOfBoundsException {
		try {
			toCheck(docNumber);
			this.docNumber = docNumber;
		} catch (CheckDocException e) {
			System.out.println("Warning! The default value is set! 0000-aaa-1111-bbb-0a1b");
			this.docNumber = "0000-aaa-1111-bbb-0a1b";
		} catch (StringIndexOutOfBoundsException ex) {
			System.out.println("Warning! The default value is set! 0000-aaa-1111-bbb-0a1b");
			this.docNumber = "0000-aaa-1111-bbb-0a1b";
		}
	}

	private void toCheck(String docNumber) throws CheckDocException, StringIndexOutOfBoundsException {
		if (docNumber.equals(null) || docNumber.equals("")) {
			String s = "an empty value";
			throw new StringIndexOutOfBoundsException(s);
		}
		if (docNumber.length() != 22 && !docNumber.substring(0, 4).matches("^[0-9]*$")
				&& !docNumber.substring(9, 13).matches("^[0-9]*$") && !docNumber.substring(18, 19).matches("^[0-9]*$")
				&& !docNumber.substring(20, 21).matches("^[0-9]*$") && !docNumber.substring(5, 8).matches("^[a-zA-Z]*$")
				&& !docNumber.substring(14, 17).matches("^[a-zA-Z]*$")
				&& !docNumber.substring(19, 20).matches("^[a-zA-Z]*$")
				&& !docNumber.substring(21, 22).matches("^[a-zA-Z]*$")
				&& !docNumber.substring(4, 5).matches("^(.*)-(.*)*$")
				&& !docNumber.substring(8, 9).matches("^(.*)-(.*)*$")
				&& !docNumber.substring(13, 14).matches("^(.*)-(.*)*$")
				&& !docNumber.substring(17, 18).matches("^(.*)-(.*)*$")) {
			String dif = docNumber;
			String message = "confirm invalid";
			throw new CheckDocException(message, dif);
		}
	}

	public static void getTwoNumbersBlocks(Document doc) {
		StringBuilder docSB = new StringBuilder(doc.docNumber);
		System.out.println(docSB.substring(0, 4) + "\s" + docSB.substring(9, 13));
	}

	public static void getDocNumber(Document doc) {
		StringBuilder docSB = new StringBuilder(doc.docNumber);
		docSB.replace(5, 8, "***");
		docSB.replace(14, 17, "***");
		System.out.println(docSB);
	}

	public static void getLettersLowerCase(Document doc) {
		StringBuilder docSB = new StringBuilder(doc.docNumber);
//		for (int k = 0; k < docSB.length(); k++) {
		for (int i = 0, j = 1; j < docSB.length(); i++, j++) {
			if (docSB.substring(i, j).matches("[0-9]")) {
				docSB.replace(i, j, " ");
			}
		}
//		}
		System.out.println(docSB);
		System.out.println(
				docSB.toString().toLowerCase().replaceAll("\\s+", "").replaceAll("-", "/").replaceAll("//", "/"));
	}

	public static void getLettersLowerCase2(Document doc) {
		System.out.println(doc.docNumber.toString().toLowerCase().replaceAll("[0-9-]{4}-", "").replaceAll("[0-9-]", "/")
				.replaceAll("//", "/"));
	}

	public static void getLettersUpperCase(Document doc) {
		System.out.println("Letters: " + doc.docNumber.toString().toUpperCase().replaceAll("[0-9-]{4}-", "")
				.replaceAll("[0-9-]", "/").replaceAll("//", "/"));
	}

	public static void findString(Document doc, String s) {
		StringBuilder docSB = new StringBuilder(doc.docNumber.toLowerCase());
		if (docSB.indexOf(s.toLowerCase()) != -1) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	public static void toCheckNumber(Document doc, int number) {
		StringBuilder docSB = new StringBuilder(doc.docNumber);
		if (docSB.indexOf(Integer.toString(number)) != -1) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	public static void toCheckSequence(Document doc, String sequence) {
		StringBuilder docSB = new StringBuilder(doc.docNumber);
		if (docSB.indexOf(sequence) != -1) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}
}
