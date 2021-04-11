/*
*循环队列的数据类型
 */
package AQueue;

public class Data <E>{
    E   data;
    Data    next;

    public Data(E data) {
        this.data = data;
    }

    public Data() {
    }

    @Override
    public String toString() {
        return "Data{" +
                "data=" + data +
                '}';
    }
}
