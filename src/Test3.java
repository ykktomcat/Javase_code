import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Test3 {
    public static void main(String[] args) {
        //引用数据类型
        Integer num = new Integer(12);
        String s = Integer.toBinaryString(12);
        System.out.println(s);
        num.equals(1);
        //常量数据类型
        int num1 = 12;
        //num1.
        //自动拆装箱
        Long  l =12L;
        long l1 = new Long(12L);


        //Integer 相关笔试题
        Integer num11 = 127;
        Integer num22 = 127;
        // 引用数据类型比较的是内存地址
        // 缓存里有127缓存 以下显示为true
        System.out.println(num11 == num22);


        num11 = new Integer(127);
        num22 = new Integer(127);
        System.out.println(num11 == num22);

        //缓存里无128
        num11 = 128;
        num22 = 128;
        System.out.println(num11 == num22);






    }
}
