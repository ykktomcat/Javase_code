//封装一个超级数组
public class SuperArray {

    //搞一个能存放data的数组
    private int[] elements;
    //用来维护当前存储的位置
    private int currentIndex = -1;


    //使用构造器进行初始化
    public SuperArray() {
        //elements = new int[10];
        this(10);
    }

    public SuperArray(int capacity) {
        elements = new int[capacity];
    }


    //对数据的增删改查
    //增加一个元素,尾插
    public void add(int data) {
        currentIndex++;
        //以下进行数组扩容
        if (currentIndex > elements.length - 1) {
            int[] temp = new int[elements.length + 1];
            for (int i = 0; i < elements.length; i++) {
                temp[i] = elements[i];
            }
            //改变引用
            elements = temp;
        }
        elements[currentIndex] = data;
    }



    //删除一个元素
    public void delete(int index) {
        if (index < 0 || index > elements.length) {
            System.out.println("删除的下标[" + index + "]不在范围之内");
        } else {
            for (int i = index; i < elements.length - 1; i++) {
                elements[i] = elements[i + 1];
                currentIndex--;
            }

        }
    }


    //修改一个元素
    public void set(int index, int data) {
        if (index < 0 || index > elements.length) {
            System.out.println("修改的下标[" + index + "]不在范围之内");
        } else {
            elements[index] = data;
        }

    }



    //用下标查询一个元素
    //返回值 改成引用数据类型Integer,未找到时返回null
    public Integer select(int index) {
        if (index < 0 || index > elements.length) {
            System.out.println("查询的下标[" + index + "]不在范围之内");
            return null;
        } else {
            return elements[index];
        }
    }



    //返回数组长度
    public int size() {
        return currentIndex + 1;
    }



    //数组转化成字符串
    public String arrayToString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < currentIndex + 1; i++) {
            result.append(elements[i]).append(",");
        }
        return result.substring(0, result.length() - 1) + "]";
    }

    //冒泡排序
    public void sort() {
        for (int i = 0; i < currentIndex + 1; i++) {
            for (int j = 0; j < currentIndex - i; j++) {
                if (elements[j] > elements[j + 1]) {
                    int temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }
    }

}
