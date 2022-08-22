package spring;

/**
 * @author 高志浩
 * @version 1.0
 */
public class Pad {


    private String bname;



    public void setBname(String bname) {
        this.bname = bname;
    }

    public void play(){
        System.out.println("play a computer");
        System.out.println(bname);
    }

}
