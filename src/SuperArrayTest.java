public class SuperArrayTest {
    public static void main(String[] args) {
        SuperArray superArray = new SuperArray(2);
        superArray.add(5);
        superArray.add(4);
        superArray.add(3);
        superArray.add(2);
        superArray.add(1);
        superArray.sort();



        System.out.println(superArray.arrayToString());





    }


}
