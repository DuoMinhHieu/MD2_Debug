public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static void m1()throws Exception{
    }
    public static void m2(){
        try{
            m1();
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public static void m3()throws Exception{
        try {
            m1();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}