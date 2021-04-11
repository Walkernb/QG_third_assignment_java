/*
*循环队列
* 队的最大长度为10
 */
package AQueue;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Aqueue  Q=new Aqueue();
        boolean p=true;
        Scanner sc=new Scanner(System.in);
        while(p){
            try{
                show();
                int n=sc.nextInt();
                switch(n){
                    case    1:Q.DestoryAQueue();break;
                    case    2:Q.GetHeadAQueue();break;
                    case    3:Q.LengthAQueue();break;
                    case    4:p=Q.Build();break;
                    case    5:Q.DeAQueue();break;
                    case    6:Q.TraverseAQueue();break;
                    case    0:p=false;break;
                    default:
                        System.out.println("你的选择不在范围内！");
                }
            }catch(InputMismatchException e){
                System.out.println("输入有误！\n输入的不是数字或正整数！");
                p=false;
            }
        }
    }
    private static  void show(){
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
