/**
 * @author USER
 * 10进制转换16进制
 */
public class Ch1_2_5 {
	public static void main(String[] args) {
		int a = 287;
		System.out.println(new Ch1_2_5().jz16_10(a));
	}

	public String jz16_10(int n) {
		if (n / 16 < 16) {
			return Getexp(n / 16) + Getexp(n % 16);
		}
		return jz16_10(n / 16) + Getexp(n % 16);
	}

	public String Getexp(int t) {
		if (t < 10) {
			return t + "";
		}
		if (t >= 10) {
			switch (t) {
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
		return t + "";
	}
}