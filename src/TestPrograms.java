public class TestPrograms {

    public static void main(String[] args) {
        TestPrograms.test1();
        TestPrograms.test2();
        TestPrograms.test3();
        TestPrograms.test4();
        TestPrograms.test5();
    }

    public static void test1(){

        System.out.println(Integer.MAX_VALUE );
    }

    public static void test2(){
        int a = 37, b= 5;

        System.out.println(a-a/b*b-a%b);
    }

    public static void test3(){
        //System.out.println(1/0);
        System.out.println(1.0/0);
    }

    public static void test4(){
        System.out.println  ("The snow is now on the ground.".indexOf  ("now", 8));
    }

    public static void test5(){
        String s = "This is isthumus";
        String d = s.replaceAll("\\bis\\b", "was");
        System.out.println(d);
    }
}
