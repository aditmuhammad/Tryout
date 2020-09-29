public class BasicFunction {
    static void hello(String name){
        if(name.isEmpty()){
            System.out.println("Hello World!");
        }else{
            System.out.println("Hello " + name + "!");
        }
    }
    public static void main(String[] args){
        hello("John");
        hello("Alice");
        hello("");
    }
}
