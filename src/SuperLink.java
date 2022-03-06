//超级链表
public class SuperLink {
    //链表的头部
    private Node head;

    //操作标识，当前链表有多长
    private int currentIndex = -1;

    // 对数据的增删改查

    // 增加一个元素，头插法
    public void add(int data) {
        if (head == null) {
            head = new Node(data, null);
        } else {
            //创建一个指向头部的node
            Node node = new Node(data, head);
            //新的node变成head
            head = node;
        }
        currentIndex++;
    }


    // 指定位置增加一个元素，尾插法
    public void add(int index,int data) {
        if(head == null){
            add(data);
        }else{
            //先拉住后面的节点，再让前面的拉上自己。
            //找到下标为index -1的节点
            Node node = head;
            for (int i = 0; i < index -1; i++) {
                node = node.getNext();
            }
            //插入的核心
            Node temp = new Node(data,node.getNext());
            node.setNext(temp);
            currentIndex++;
        }

    }


    //修改一个元素
    public void set(int index, int data) {
        //找到要修改的元素位置，自己存储的值改成data

        //找到下标为index的节点
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        //修改的核心
        node.setData(data);
    }

    //删除一个元素
    public void delete(int index) {
        if (index == 0) {
            head = head.getNext();
        } else {
            //定义一个空的放在头部
            Node node = head;
            //找到下标为index - 1的节点
            for (int i = 0; i < index - 1; i++) {
                node = node.getNext();
            }
            //删除的核心
            node.setNext(node.getNext().getNext());
        }
        currentIndex--;

    }

    //根据下标查找一个元素
    public Integer select(int index) {
        //定义一个空的放在头部
        Node node = head;
        //找到下标为index 的节点
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getData();
    }

    //链表转成字符串数组
    public String linkToString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < currentIndex + 1; i++) {
            result.append(select(i)).append(",");
        }
        return result.substring(0, result.length() - 1) + "]";
    }

}

