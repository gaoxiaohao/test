package extends_pack;

public class Computer {
    private String CPU;
    private String YP;
    private String NC;

    public Computer(String CPU, String YP, String NC) {
        this.CPU = CPU;
        this.YP = YP;
        this.NC = NC;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getYP() {
        return YP;
    }

    public void setYP(String YP) {
        this.YP = YP;
    }

    public String getNC() {
        return NC;
    }

    public void setNC(String NC) {
        this.NC = NC;
    }

    public String getDetails(){
        return  "CPU:"+this.getCPU()+"\n"+"YP:"+this.getYP()+"\n"+"NC:"+this.getNC()+"\n";
    }
}
