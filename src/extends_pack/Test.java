package extends_pack;

public class Test {

    public static void main(String[] args) {

        PC pc = new PC("因特尔","金士顿","西部数据","小米");
        pc.printInfo();
        NotePad notePad = new NotePad("因特尔","金士顿","西部数据","红色");
        notePad.printInfo();
    }
}
