
/**
 * @author USER
 * 乘法口诀表
 */
public class Ch1_2_1 {
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 15; i++) {
			for (j = 1; j <= i; j++)
			
			System.out.print("" + j + "*" + i + "=" + (i * j) + "  ");
			System.out.printf("\n");
			System.out.println("这是第" + i + "行");
			
		}
	}
}
