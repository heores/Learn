/*
 * 用多种方法
 * 打印100以内所有奇数
 */
public class Ch1_3_1 {
	public static void main(String []args){
		
		//方法1 for循环
		
		/*for(int i=1;i<100;i+=2){
			System.out.println(i);
		}*/
		
		//方法2 do while
		
		/*int i=1;
		do{
			System.out.println(i);
			i+=2;
		}while (i<100);*/
		
		//方法3 while
		
		int i=1;
		while(i<100){
			System.out.println(i);
			i+=2;
		}
	}

}
