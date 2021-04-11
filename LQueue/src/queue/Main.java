/*
*链式队列
 */
package queue;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LQueue Q = new LQueue();
        boolean  p=true;
        int n;
        Scanner sc=new Scanner(System.in);
        while(p){
            show();
            try{
                n=sc.nextInt();
                switch(n){
                    case 1:Q.DestoryLQueue();break;
                    case 2:Q.GetHeadLQueue();break;
                    case 3:Q.LengthLQueue();break;
                    case 4:p=Q.BuildNode();break;
                    case 5:Q.DeLQueue();break;
                    case 6:Q.TraverseLQueue();break;
                    case 0:p=false;break;
                    default:
                        System.out.println("输入有误！");
            }
            }catch(InputMismatchException e) {
                System.out.println("输入有误！\n输入不是数字！");
                p=false;
            }
        }
    }
    private static void show(){
        System.out.println("1       销毁队");
        System.out.println("2       返回头节点");
        System.out.println("3       队的长度");
        System.out.println("4       入队");
        System.out.println("5       出队");
        System.out.println("6       遍历队");
        System.out.println("0       退出");
        System.out.print("请输入你的选择：");
    }
}