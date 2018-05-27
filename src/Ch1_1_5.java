/*
 * 
 * 这是一个发红包的程序
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
	// 方法1
	// 由HongBaotest.java主函数改写的方法
	public static int fhb(int total, int number) {
		int money;
		// 最小红包
		int min = 100;
		int max;
		int i = 1;
		List math = new ArrayList();
		DecimalFormat df = new DecimalFormat("#");
		while (i < number) {
			// 保证即使一个红包是最大的了,后面剩下的红包,每个红包也不会小于最小值
			max = total - min * (number - i);
			int k = (int) (number - i) / 2;
			// 保证最后两个人拿的红包不超出剩余红包
			if (number - i <= 2) {
				k = number - i;
			}
			// 最大的红包限定的平均线上下
			max = max / k;
			// 保证每个红包大于最小值,又不会大于最大值
			money = (int) (min * 100 + Math.random() * (max * 100 - min * 100 + 1));
			money = money / 100;
			// 保留两位小数
			money = (int) Float.parseFloat(df.format(money));
			total = (int) (total * 100 - money * 100);
			total = total / 100;
			math.add(money);
			System.out.println("第" + i + "个人拿到" + money + "剩下" + total);
			i++;
			// 最后一个人拿走剩下的红包
			if (i == number) {
				math.add(total);
				System.out.println("第" + i + "个人拿到" + total + "剩下0");
			}
		}
		// 取数组中最大的一个值的索引
		System.out.println("本轮发红包中第" + (math.indexOf(Collections.max(math)) + 1) + "个人手气最佳");
		return 0;

	}

	// 方法2
	@SuppressWarnings("unused")
	private static boolean wxhb(double moneySum, int redNum) {
		// 设置最小的金额
		double moneyMin = 10;
		Random random = new Random();
		// 精确小数点2位
		NumberFormat formatter = new DecimalFormat("#.#");
		for (int i = 1; i < redNum; i++) {
			// 随机一个数，数值范围在最小值与余额之间
			String money = formatter.format(random.nextDouble() * (moneySum - moneyMin) + moneyMin);
			// 数值转换
			moneySum = Double.valueOf(formatter.format(moneySum - Double.valueOf(money)));

			System.out.println("第" + i + "个红包：" + money + "元 ,余额：" + moneySum);
		}

		System.out.println("最后个红包：" + moneySum + "元 ,余额：" + (moneySum - moneySum));
		return false;
	}

	public static void main(String[] args) {
		// 方法1输出
		System.out.print(fhb(30000, 10));

		// 方法2输出
		// System.out.print(wxhb(30000, 10));
	}

}