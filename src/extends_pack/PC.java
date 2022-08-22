package extends_pack;

/**
 * @author gxh
 */
public class PC extends Computer{
    private String brand;

    public PC(String CPU, String YP, String NC,String brand) {
        super(CPU, YP, NC);
        this.brand=brand;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo(){
        System.out.println(getDetails()+"brand:"+this.getBrand()+"\n");
    }
}
