/*
 * 
 * 两种方法写出101到500之间的质数
 */
public class Ch1_3_4 {
	public static void main(String[] args) {
		for (int j = 11; j <= 50; j += 2) {
			boolean f = true;
			for (int k = 2; k < j; k++) {
				if (j % k == 0) {
					f = false;
					break;
				}
			}
			if (!f) {
				continue;
			}
			System.out.println(j);
		}
	}
}
