
public class Atividade_palindromo {

	public static void main(String[] args) {
		palindromocheck("Rotator");
		palindromocheck("bob");
		palindromocheck("madam");
		palindromocheck("mAlAyAlam");
		palindromocheck("1");
		palindromocheck("Able was I, ere I saw Elba");
		palindromocheck("Madam I’m Adam");
		palindromocheck("Step on no pets");
		palindromocheck("Top spot");
		palindromocheck("02/02/2020");
		palindromocheck("xyz");
		palindromocheck("elephant");
		palindromocheck("Country");
		palindromocheck("Top . post!");
		palindromocheck("Wonderful-fool");
		palindromocheck("Wild imagination!");

	}

	public static Boolean palindromocheck(String text) {
		StringBuilder builder = new StringBuilder();
		for (char c : text.toCharArray()) {
			if (Character.isAlphabetic(c)) {
				builder.append(Character.toLowerCase(c));
			}
		}

		text = builder.toString();
		int len = text.length();
		
		for (int i = 0; i < len / 2; ++i) {
			if (text.charAt(i) != text.charAt(len - i - 1)) {
				System.out.println("Não é Palíndromo");
				return false;
			}
		}
		System.out.println("É Palíndromo");
		return true;
	}
}
