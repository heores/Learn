package com.mahe;
 
import java.util.Scanner;
 
public class Game {
 
    private Player player;
     
    public Game(Player player) {
        this.player=player;
    }
     
    public void start() {
         
        System.out.println("��ʼ��Ϸ");
        System.out.println(player.getName()+"������Ϸ����ʼ����Ϊ"+player.getScore());
        String[] arr=new String[] {"����","ʯͷ","��"};
        Scanner sc=new Scanner(System.in);
        while(true) {
             
            System.out.println("������  ʯͷ  ����  ��");
            String s1=sc.next();//�������
            int count=(int)(Math.random()*3);
            String s2=arr[count];
            int flag=rele(s1,s2);
            System.out.println("������"+s1+",ϵͳ����"+s2);
            if(flag>0) {
                System.out.println("��ϲ"+player.getName()+"Ӯ�ˣ�����ʮ����");
                player.setScore(player.getScore()+10);
            }if(flag<0) {
                System.out.println("�Բ���"+player.getName()+"����ʮ����");
                player.setScore(player.getScore()+10);
            }else {
                System.out.println("��ƽ��");
            }
            System.out.println(player);
        }
    }
    
    public int rele(String s1, String s2) {
        
        if(s1.equals(s2)) {
            return 0;
        }
        if(s1.equals("����")) {
            if(s2.equals("ʯͷ")) {
                return -1;
            }
            if(s2.equals("��")) {
                return 1;
            }
        }
        if(s1.equals("ʯͷ")) {
            if(s2.equals("����")) {
                return 1;
            }
            if(s2.equals("��")) {
                return -1;
            }
        }
        if(s1.equals("��")) {
            if(s2.equals("ʯͷ")) {
                return 1;
            }
            if(s2.equals("����")) {
                return -1;
            }
        }
        return 0;
    }
}

