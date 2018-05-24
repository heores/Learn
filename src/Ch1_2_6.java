/**
 * @author USER
 * 10进制转换16进制
 */
public class Ch1_2_6 {
	public static void main(String[] args) {
		int a = 287;
		System.out.println(new Ch1_2_6().get16Jz(a));
	}

	public String get16Jz(int n) {
		if (n / 16 < 16) {
			return getExp(n / 16) + "" + getExp(n % 16);
		}

		return get16Jz(n / 16) + "" + getExp(n % 16);
	}

	public String getExp(int a) {
		if (a < 10) {
			return a + "";
		}
		if (a >= 10) {
			switch (a) {
			case 10:
				return "a";
			case 11:
				return "b";
			case 12:
				return "c";
			case 13:
				return "d";
			case 14:
				return "e";
			case 15:
				return "f";
			}
		}
		return a + "";
	}
}