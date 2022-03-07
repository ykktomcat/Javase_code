import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class SuperLinkTest {
    public static void main(String[] args) {
        SuperLink superLink = new SuperLink();
        for (int i = 0; i < 30000; i++) {
            superLink.addToHeader((int)(Math.random() * 10000));
        }
//        superLink.addToTail(5);
//        superLink.addToTail(4);
//        superLink.addToTail(3);
//        superLink.addToTail(2);
//        superLink.addToTail(1);
//        System.out.println(superLink.linkToString());
        long start = System.currentTimeMillis();
        superLink.sort3();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println(superLink.linkToString());

//        //尾插10w条数据用了7110毫秒
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            superLink.addToTail(i);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);

    }


}
