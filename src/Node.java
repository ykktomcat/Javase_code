//封装一个超级链表 node
public class Node {
    //一个是真正存入的数据，另一个是指向下一个的引用
    private Integer data;
    private Node next;

    //无参构造
    public Node() {

    }

    //有参构造
    public Node(Integer data, Node next) {

    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


}
