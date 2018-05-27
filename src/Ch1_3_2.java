/*
 * break
 * continue
 */

//break
public class Ch1_3_2 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if (i == 4)
				break;
			System.out.println(i);

		}
	}

}

//continue
class test {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if (i == 4)
				continue;
			System.out.println(i);

		}
	}

}