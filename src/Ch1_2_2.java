
/**
 * @author USER
 * ���˷��ھ���
 */
public class Ch1_2_2 {
	public static void main(String[] args) {
		int i, j;
		for (i = 15; i > 0; i--) {
			for (j = 1; j <= i; j++)
				System.out.print("" + j + "*" + i + "=" + (j * i) + "  ");
			System.out.println("");
			System.out.println("���ǵ�" + (16-i) + "��");
		}
	}

}
