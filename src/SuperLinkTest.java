public class SuperLinkTest {
    public static void main(String[] args) {
        SuperLink superLink = new SuperLink();
        superLink.add(1);
        superLink.add(2);
        superLink.add(3);
        superLink.add(4);
        superLink.add(5);
        superLink.add(1,88);
        System.out.println(superLink.linkToString());

    }


}
