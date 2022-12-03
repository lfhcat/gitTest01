public class Test {
    public static void main(String[] args) {
        int a = 1;
        float b = 1.0F;
        System.out.println(a+b);
        System.out.println("===============================");
         int c = 2;
         System.out.println((a+c)/2);//int类型转换会自动向下取整
        System.out.println("===============================");
        float d = (a+c)/2;
        System.out.println(d);
        System.out.println("===============================");
        d = ((float) a + (float) c)/2;
        System.out.println(d);
    }
}
