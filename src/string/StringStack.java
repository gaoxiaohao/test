package string;

/**
 * @author 高志浩
 * @version 1.0
 */
public class StringStack {

    String string = new String("gzh");
    char[] chars = {'a','b','c'};
    public void change(char[] chars){
        this.string = "java";
        chars[0]='j';
    }

    public static void main(String[] args) {
        StringStack stringStack = new StringStack();
        stringStack.change(stringStack.chars);
        System.out.println(stringStack.string+"and");
        System.out.println(stringStack.chars);
    }
}
