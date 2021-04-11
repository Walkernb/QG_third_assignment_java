/*
*循环队列的实现类
 */
package AQueue;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aqueue {
    Data    Q[]=new Data[10];
    int front=-1;
    int rear=-1;
    int length=0;

    public Aqueue() {
    }

    public void DestoryAQueue(){
        if(!IsEmptyAQueue()){
            front=rear=-1;  length=0;
            System.out.println("销毁成功！");
        }
    }   //销毁队

    private boolean IsFullAQueue(){
        if(length>=10)   {
            System.out.println("队满！");
            return true;
        }
        else            return false;
        }   //判断队是否满

    private boolean IsEmptyAQueue(){
        if(length==0) {
            System.out.println("空队！");
            return true;
        }
        else                    return false;
    }   //判断队是否为空

    public void GetHeadAQueue(){
        if(!IsEmptyAQueue()) {
            System.out.println("头节点：" + Q[front]);
        }
    }   //返回头节点

    public void  LengthAQueue(){
        if(!IsEmptyAQueue()){
            System.out.println("队的长度："+length);
        }
    }   //返回队长

    public boolean  Build(){
        System.out.println("1       输入整数：");
        System.out.println("2       输入小数：");
        System.out.println("3       输入字符：");
        System.out.print("请输入你的选择：");
        Scanner sc=new Scanner(System.in);
        Integer n=null;
        try{
            n=sc.nextInt();
            System.out.print("请输入数据：");
        }catch (InputMismatchException e){
            System.out.println("输入有误！\n输入的不是数字或正整数！");
            return false;
        }
        if(n==1){
            try{
                int i=sc.nextInt();
                Data<Integer>   node1=new Data<>(i);
                EnQueue(node1);
            }catch (InputMismatchException e){
                System.out.println("输入有误！\n输入的不是整数！");
                return false;
            }
        }else{
            if(n==2){
                try{
                    double  d=sc.nextDouble();
                    Data<Double>    node2=new Data<>(d);
                    EnQueue(node2);
                }catch(InputMismatchException e){
                    System.out.println("输入有误！\n输入的不是小数！");
                    return false;
                }
            }else{
                if(n==3){
                    String s=sc.next();
                    Data<String>    node3=new Data<>(s);
                    EnQueue(node3);
                }else{
                    System.out.println("你的选择不在范围内！");
                }
            }
        }
        return true;
    }   //创建队里某一节点的数据类型

    private  void EnQueue(Data node){
        if(IsFullAQueue()) return ;
        if(front==-1&&rear==-1){
            front=rear=0;
            Q[rear]=node;
        }else{
            rear=(rear+1)%10;
            Q[rear]=node;
        }
        length++;
    }   //入队

    public void DeAQueue(){
        if(!IsEmptyAQueue()){
            System.out.println("头节点："+Q[front]+"已出队！");
            front=(front+1)%10;
            length--;
        }
    }   //出队

    public void TraverseAQueue(){
        if(!IsEmptyAQueue()){
            int i=front;
            System.out.print(Q[i]);
            i=(i+1)%10;
            for(;i!=((rear+1)%10);i++,i%=10){
                System.out.print("->"+Q[i]);
            }
            System.out.println();
        }
    }   //遍历队
}
