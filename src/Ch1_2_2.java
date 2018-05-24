
/**
 * @author USER
 * 倒乘法口诀表
 */
public class Ch1_2_2 {
	public static void main(String[] args) {
		int i, j;
		for (i = 15; i > 0; i--) {
			for (j = 1; j <= i; j++)
				System.out.print("" + j + "*" + i + "=" + (j * i) + "  ");
			System.out.println("");
			System.out.println("这是第" + (16-i) + "行");
		}
	}

}
