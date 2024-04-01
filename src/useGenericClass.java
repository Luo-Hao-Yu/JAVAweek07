public class useGenericClass {
    public static void main(String[] args) {
//        泛型类
        GenericClass<String> g =new GenericClass<String>("hello word!");
        System.out.println(g.getData());
        g.setData("apple");
        System.out.println(g.getData());

//        继承自泛型接口的具体类
        realClass r = new realClass();
        r.setData("今天星期一");
        System.out.println(r.getData());

//        继承自泛型接口的泛型类
        generiClass<Integer> i =new  generiClass<Integer>();
        i.setData(648);
        System.out.println(i.getData());
    }
}