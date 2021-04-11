/*
*节点数据类
 */
package queue;

public class Node <E>{
    E   data;
    Node    next;

    public Node(E data) {
        this.data = data;
        next=null;
    }

    public Node() {
    }
}
