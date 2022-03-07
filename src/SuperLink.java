//超级链表
public class SuperLink {
    //链表的头部
    private Node head;

    //操作标识，当前链表有多长
    private int currentIndex = -1;

    // 对数据的增删改查

    // 增加一个元素，头插法
    public void addToHeader(int data) {
        this.add(0, data);
    }

    // 增加一个元素，头插法
    public void addToTail(int data) {
        this.add(currentIndex + 1, data);
    }


    // 指定位置增加一个元素
    public void add(int index, int data) {
        if (head == null) {
            head = new Node(data, null);
        } else {
            if (index == 0) {
                // 创建一个指向头部的node
                Node node = new Node(data, head);
                //新的node变成head
                head = node;
            } else {
                //先拉住后面的节点，再让前面的拉上自己。
                //找到下标为index -1的节点

                Node node =selectNode(index -1);
                //插入的核心
                Node temp = new Node(data, node.getNext());
                node.setNext(temp);
            }
        }
        currentIndex++;
    }


    //修改一个元素
    public void set(int index, int data) {
        //找到要修改的元素位置，自己存储的值改成data

        //找到下标为index的节点并修改
        selectNode(index).setData(data);



    }

    //删除一个元素
    public void delete(int index) {
        if (index == 0) {
            head = head.getNext();
        } else {
            //定义一个空的放在头部
            Node node = selectNode(index - 1);

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

    //抽离出共用的寻找节点node的方法
    public Node selectNode(int index) {
        //定义一个空的放在头部
        Node node = head;
        //找到下标为index 的节点
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node;
    }

    //链表转成字符串数组
    public String linkToString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < currentIndex + 1; i++) {
            result.append(select(i)).append(",");
        }
        return result.substring(0, result.length() - 1) + "]";
    }

    //链表冒泡排序
    public void sort(){
        for (int i = 0; i < currentIndex + 1; i++) {
            for (int j = 0; j < currentIndex - i; j++) {
                if (select(j) > select(j + 1) ){
                    int temp = select(j) ;
                    selectNode(j).setData(select(j + 1));
                    selectNode(j + 1).setData(temp);
                }
            }
        }
    }


    //链表冒泡排序优化
    public void sort2(){
        for (int i = 0; i < currentIndex + 1; i++) {
            for (int j = 0; j < currentIndex - i; j++) {
                //优化
                Node node = selectNode(j);
                Node next = node.getNext();
                if (node.getData() >  next.getData()){
                    int temp = node.getData() ;
                    node.setData(next.getData());
                    next.setData(temp);
                }
            }
        }
    }

    //链表冒泡排序优化
    public void sort3(){
        for (int i = 0; i < currentIndex + 1; i++) {
            Node node = null;
            for (int j = 0; j < currentIndex - i; j++) {
                if(j == 0) {
                    node = head;
                }else {
                    node = node.getNext();
                }
                //优化
                Node next = node.getNext();
                if (node.getData() >  next.getData()){
                    int temp = node.getData() ;
                    node.setData(next.getData());
                    next.setData(temp);
                }
            }
        }
    }

}

