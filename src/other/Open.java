package other;

/**
 * @author gxh
 */
public class Open {

    private String name;
    public Open(){
        //this调用构造器，需要写在第一行
        this("name");
        System.out.println("ok");
    }
    public Open(String name){
        System.out.println("你好，我在这");
    }

    public static void main(String[] args) {
        Open open = new Open();

    }
}
