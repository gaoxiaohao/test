package extends_pack;

public class NotePad extends Computer{
    private String color;

    public NotePad(String CPU, String YP, String NC, String color) {
        super(CPU, YP, NC);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo(){
        System.out.println(getDetails()+"color:"+this.getColor()+"\n");
    }
}
