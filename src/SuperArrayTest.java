public class SuperArrayTest {
    public static void main(String[] args) {
        SuperArray superArray = new SuperArray(2);

        superArray.addToTail(1);
        superArray.addToTail(2);
        superArray.addToTail(3);
        superArray.addToTail(4);
        superArray.addToTail(5);


//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 5; i++) {
//            superArray.addToHeader((int)(Math.random() * 100));
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);
//
//
//        superArray.sort();
//        System.out.println(superArray.arrayToString());
    }


}
