package intro;

public class MiniProje2 {

	public static void main(String[] args) {
		// Verilen harfin kalın veya ince mi olduğunu bulan program.
		char harf = 'i';
		switch (harf) {
		case 'A':
		case 'O':
		case 'U':
		case 'I':
			System.out.println("Kalın ünlülere aittir");
			break;
		default:
			System.out.println("İnce ünlülere aittir.");
		}

	}

}
