package com.mahe;
 
import java.util.Scanner;
 
public class Game {
 
    private Player player;
     
    public Game(Player player) {
        this.player=player;
    }
     
    public void start() {
         
        System.out.println("开始游戏");
        System.out.println(player.getName()+"进入游戏，初始积分为"+player.getScore());
        String[] arr=new String[] {"剪刀","石头","布"};
        Scanner sc=new Scanner(System.in);
        while(true) {
             
            System.out.println("请输入  石头  剪子  布");
            String s1=sc.next();//玩家输入
            int count=(int)(Math.random()*3);
            String s2=arr[count];
            int flag=rele(s1,s2);
            System.out.println("您出的"+s1+",系统出的"+s2);
            if(flag>0) {
                System.out.println("恭喜"+player.getName()+"赢了，奖励十积分");
                player.setScore(player.getScore()+10);
            }if(flag<0) {
                System.out.println("对不起"+player.getName()+"输了十积分");
                player.setScore(player.getScore()+10);
            }else {
                System.out.println("打平了");
            }
            System.out.println(player);
        }
    }
    
    public int rele(String s1, String s2) {
        
        if(s1.equals(s2)) {
            return 0;
        }
        if(s1.equals("剪刀")) {
            if(s2.equals("石头")) {
                return -1;
            }
            if(s2.equals("布")) {
                return 1;
            }
        }
        if(s1.equals("石头")) {
            if(s2.equals("剪刀")) {
                return 1;
            }
            if(s2.equals("布")) {
                return -1;
            }
        }
        if(s1.equals("布")) {
            if(s2.equals("石头")) {
                return 1;
            }
            if(s2.equals("剪刀")) {
                return -1;
            }
        }
        return 0;
    }
}

