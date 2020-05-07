package com.learn.test01;

import java.util.Scanner;

/**
 * 编程实现控制台版并支持两人对战的五子棋游戏
 */


public class Checker {
    public static char[] arr = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
    public static char[][] arrs = new char[arr.length+1][arr.length+1];

        public static void drawChceker(){
            //初始化棋盘
            arrs[0][0]=' ';
            //赋值
            for(int i=0;i<arrs.length;i++){
                for(int j=0;j<arrs.length;j++){
                    if(0 == i && j !=0){
                        arrs[i][j]=arr[j-1];
                    }
                    else if(0 == j && i != 0){
                        arrs[i][j]=arr[i-1];
                    }else if(i != 0 && j !=0){
                        arrs[i][j]='+';
                    }
                }
            }
        }
    public static void showhceker(){
        //绘制棋盘 - 写一个成员方法实现
        for(int i=0;i<arrs.length;i++){
            for(int j=0;j<arrs.length;j++){
                System.out.print(arrs[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int dian(){
        int x = 0;
        Scanner sc =new Scanner(System.in);
        while (true) {
            try {
                x=sc.nextInt(16)+1;
                break;
            } catch (Exception e) {
                System.out.println("请重新输入");
                sc = new Scanner(System.in);
            }
        }
        return x;
    }

    public static boolean playChess(boolean player){
        //提示黑方和白方分别下棋并重新绘制棋盘

        int x;
        int y;
        if(player){
            System.out.println("请黑方落子");
            System.out.println("请输入横坐标");
            x=dian();
            System.out.println("请输入纵坐标");
            y=dian();


            while(arrs[x][y]!='+'){
                System.out.println("请重新输入");
                System.out.println("请输入横坐标");
                x=dian();
                System.out.println("请输入纵坐标");
                y=dian();
            }
            arrs[x][y]='●';
        }else{
            System.out.println("请白方输入落子的横纵坐标");
            System.out.println("请输入横坐标");
            x=dian();
            System.out.println("请输入纵坐标");
            y=dian();
            while(arrs[x][y]!='+'){
                System.out.println("请重新输入");
                System.out.println("请输入横坐标");
                x=dian();
                System.out.println("请输入纵坐标");
                y=dian();
            }
            arrs[x][y]='○';
        }
        showhceker();
        return success(x,y,arrs[x][y]);

    }

        public static boolean success(int x,int y,char color){
            //每当一方下棋后判断是否获胜
            int shu=1,heng=1,pie=1,na=1;//横竖撇捺计数器，累计到5则表示某方向出现五个相同的旗子
            for(int i=1;i<=4&&x+i<arrs.length;i++)//上
            {
                if(arrs[x+i][y]==arrs[x][y]&&arrs[x][y]!='+')
                    shu++;
                else
                    break;
            }
            for(int i=1;i<=4&&x-i>0;i++) //下
            {
                if(arrs[x-i][y]==arrs[x][y]&&arrs[x][y]!='+')
                    shu++;
                else
                    break;
            }
            for(int i=1;i<=4&&y-i>0;i++) //左
            {
                if(arrs[x][y-i]==arrs[x][y]&&arrs[x][y]!='+')
                    heng++;
                else
                    break;
            }
            for(int i=1;i<=4&&y+i<arrs.length;i++) //右
            {
                if(arrs[x][y+i]==arrs[x][y]&&arrs[x][y]!='+')
                    heng++;
                else
                    break;
            }
            for(int i=1;i<=4&&x+i<arrs.length&&y-i>0;i++) //左下
            {

                if(arrs[x+i][y-i]==arrs[x][y]&&arrs[x][y]!='+')
                    pie++;
                else
                    break;
            }
            for(int i=1;i<=4&&x-i>0&&y+i<arrs.length;i++) //右上
            {
                if(arrs[x-i][y+i]==arrs[x][y]&&arrs[x][y]!='+')
                    pie++;
                else
                    break;
            }
            for(int i=1;i<=4&&x+i<arrs.length&&y+i<arrs.length;i++) //右下
            {
                if(arrs[x+i][y+i]==arrs[x][y]&&arrs[x][y]!='+')
                    na++;
                else
                    break;
            }
            for(int i=1;i<=4&&x-i>=0&&y-i>0;i++) //左上
            {
                if(arrs[x-i][y-i]==arrs[x][y]&&arrs[x][y]!='+')
                    na++;
                else
                    break;
            }
            if(shu==5||heng==5||pie==5||na==5) return true;
            return false;

        }

        public static void main(String[] args) {
            drawChceker();
            boolean success=false;
            boolean player=true;
            Scanner sc = new Scanner(System.in);
            showhceker();
            while(!success){
                success=playChess(player);
                player=!player;
            }
            System.out.println("该方获胜，游戏结束");

        }
}

