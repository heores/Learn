/*
 * 
 * ����һ��������ĳ���
 * 
 * 
 * 
 */
import java.util.ArrayList;  
import java.util.List;  
  
/** 
 * Created by Spirit on 2017/1/23. 
 */  
public class Ch1_1_6 {  
    //�����Сֵ  
    private static final float MINVALUE = 50F;  
    //������ֵ  
    private static final float MAXVALUE = 200F;  
  
    /** 
     * ����Ϊ�˱���ĳһ�����ռ�ô����ʽ�������Ҫ�趨�����һ��������������ǰ�������Ϊ������ƽ��ֵ��N���� 
     */  
    private static final float TIMES = 2F;  
  
    /** 
     * �жϺ���Ƿ������ 
     * @param money 
     * @param count 
     * @return 
     */  
    public boolean isRight(float money,int count) {  
        float avg = money/count;  
        float max = money/count*TIMES; 
        if(avg < MINVALUE) {  
            return false;  
        } else if(avg > max) {  
            return false;  
        }  
        return true;  
    }  
  
    /** 
     * �ֺ�������㷨 
     * @param money 
     * @param minS 
     * @param maxS 
     * @param count 
     * @return 
     */  
    public float randomRedPacket(float money,float minS,float maxS,int count) {  
        //������ʣ��һ��ʱ���ѵ�ǰʣ��ȫ������  
        if(count == 1) {  
            return money;  
        }  
        //�����ǰ��С��������������֮�䷵�ص�ǰ���  
        if(minS == maxS) {  
            return minS;  
        }  
        float max = maxS>money?money:maxS;  
        //�������һ�����  
        float one = (float)(Math.random()*(max-minS)+minS);  
        float balance = money - one;  
        //�жϴ˴η���󣬺����Ƿ����  
        if(isRight(balance,count-1)) {  
            return one;  
        } else {  
            //���·���  
            float avg = balance/(count-1);  
            //������κ�����󣬵����´β����֣�����һ��  
            if(avg < MINVALUE) {  
                return randomRedPacket(money, minS, one, count);  
            } else {  
                return randomRedPacket(money, one, maxS, count);  
            }  
        }  
    }  
    
    /** 
     * �ֺ�� 
     * @param money 
     * @param count 
     * @return 
     */  
    public List<Float> spiltRedPackets(float money,int count) {  
        //�����жϺ���Ƿ������  
        if(!isRight(money,count)) {  
            return null;  
        }  
        List<Float> list = new ArrayList<Float>();  
        float max = money/count*TIMES;  
        max = max>money?money:max;  
        for(int i = 0 ; i < count; i++) {  
            float value = randomRedPacket(money,MINVALUE,max,count-i);  
            list.add(value);  
            money -= value;  
        }  
        return list;  
    }  
  
    public static void main(String[] args) {  
        Ch1_1_6 red = new Ch1_1_6();  
        System.out.println(red.spiltRedPackets(1000,10));  
    }  
}  