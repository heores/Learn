/*
 * 
 * ����һ��������ĳ���
 * 
 * 
 * 
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Ch1_1_5 {
	// ����1
	// ��HongBaotest.java��������д�ķ���
	public static int fhb(int total, int number) {
		int money;
		// ��С���
		int min = 100;
		int max;
		int i = 1;
		List math = new ArrayList();
		DecimalFormat df = new DecimalFormat("#");
		while (i < number) {
			// ��֤��ʹһ�������������,����ʣ�µĺ��,ÿ�����Ҳ����С����Сֵ
			max = total - min * (number - i);
			int k = (int) (number - i) / 2;
			// ��֤����������õĺ��������ʣ����
			if (number - i <= 2) {
				k = number - i;
			}
			// ���ĺ���޶���ƽ��������
			max = max / k;
			// ��֤ÿ�����������Сֵ,�ֲ���������ֵ
			money = (int) (min * 100 + Math.random() * (max * 100 - min * 100 + 1));
			money = money / 100;
			// ������λС��
			money = (int) Float.parseFloat(df.format(money));
			total = (int) (total * 100 - money * 100);
			total = total / 100;
			math.add(money);
			System.out.println("��" + i + "�����õ�" + money + "ʣ��" + total);
			i++;
			// ���һ��������ʣ�µĺ��
			if (i == number) {
				math.add(total);
				System.out.println("��" + i + "�����õ�" + total + "ʣ��0");
			}
		}
		// ȡ����������һ��ֵ������
		System.out.println("���ַ�����е�" + (math.indexOf(Collections.max(math)) + 1) + "�����������");
		return 0;

	}

	// ����2
	@SuppressWarnings("unused")
	private static boolean wxhb(double moneySum, int redNum) {
		// ������С�Ľ��
		double moneyMin = 10;
		Random random = new Random();
		// ��ȷС����2λ
		NumberFormat formatter = new DecimalFormat("#.#");
		for (int i = 1; i < redNum; i++) {
			// ���һ��������ֵ��Χ����Сֵ�����֮��
			String money = formatter.format(random.nextDouble() * (moneySum - moneyMin) + moneyMin);
			// ��ֵת��
			moneySum = Double.valueOf(formatter.format(moneySum - Double.valueOf(money)));

			System.out.println("��" + i + "�������" + money + "Ԫ ,��" + moneySum);
		}

		System.out.println("���������" + moneySum + "Ԫ ,��" + (moneySum - moneySum));
		return false;
	}

	public static void main(String[] args) {
		// ����1���
		System.out.print(fhb(30000, 10));

		// ����2���
		// System.out.print(wxhb(30000, 10));
	}

}