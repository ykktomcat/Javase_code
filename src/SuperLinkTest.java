import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class SuperLinkTest {
    public static void main(String[] args) {
        SuperLink superLink = new SuperLink();
//        superLink.addToTail(1);
//        superLink.addToTail(2);
//        superLink.addToTail(3);
//        superLink.addToTail(4);
//        superLink.addToTail(5);
//        superLink.add(1, 88);
//        System.out.println(superLink.linkToString());

        //尾插10w条数据用了7110毫秒
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            superLink.addToTail(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }


}
