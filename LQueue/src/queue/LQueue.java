/*
*链式队列实现类
 */
package queue;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LQueue {
    int length=0;
    Node    front;
    Node    rear;
    Scanner sc=new Scanner(System.in);
    public LQueue(){}

    public void DestoryLQueue(){
        if(!IsEmptyLQueue()){
            front=rear=null;
            length=0;
            System.out.println("销毁成功！");
        }
    }   //销毁队

    private boolean IsEmptyLQueue(){
        if(length==0)   {
            System.out.println("空队！\n");
            return true;
        }
        else            return false;
    }   //判断队是否为空

    public void GetHeadLQueue(){
        if(!IsEmptyLQueue()){
            System.out.println("头节点："+front.data);
        }
    }   //返回头节点

    public void LengthLQueue(){
        if(!IsEmptyLQueue()){
            System.out.println("队的长度："+length);
        }
    }   //返回队长

    public boolean BuildNode(){
        System.out.println("1   输入整数");
        System.out.println("2   输入小数");
        System.out.println("3   输入字符串");
        System.out.print("请输入你的选择：");
        int n=0;
        try {
            n=sc.nextInt();
        }catch(InputMismatchException e){
            System.out.println("输入有误！\n输入不是数字！");
            return false;
        }
        if(n==1){
            System.out.print("请输入数据：");
            int t=0;
            try {
                t=sc.nextInt();
            }catch(InputMismatchException e){
                System.out.println("输入有误！\n输入不是整数！");
                return false;
            }
            Node<Integer>   node1=new Node<>(t);
            Enqueue(node1);
        }
        else    if(n==2){
            System.out.print("请输入数据：");
            try{
                double d=sc.nextDouble();
                Node<Double>   node2=new Node<>(d);
                Enqueue(node2);
            } catch(InputMismatchException e){
                System.out.println("输入有误！\n输入不是小数！");
                return false;
            }
        }
        else    if(n==3){
            System.out.print("请输入数据：");
            String s=sc.next();
            Node<String>    node3=new Node<>(s);
            Enqueue(node3);
        }
        else{
            System.out.println("输入有误！");
        }
        return true;
    }   //创建队里某一节点的数据类型

    private void    Enqueue(Node node){
        if(length==0){
            front=rear=node;
            length=1;
        }
        else{
            rear.next=node;
            rear=node;
            length++;
        }
        System.out.println("入队成功！");
    }   //入队

    public void DeLQueue(){
        if(!IsEmptyLQueue()){
            System.out.println(front.data + " 已出队");
            front=front.next;
            length--;
        }
    }   //出队

    public void TraverseLQueue(){
        if(!IsEmptyLQueue()){
            Node    node=front;
            System.out.print(node.data);
            node=node.next;
            while(node!=null){
                System.out.print("->"+node.data);
                node=node.next;
            }
            System.out.println();
        }
    }   //遍历队

}
