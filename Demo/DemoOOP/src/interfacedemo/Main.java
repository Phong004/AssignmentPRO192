package interfacedemo;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        MoveablePoint nvP = new MoveablePoint(1,1,2,2);
        System.out.println(nvP.toString());
        nvP.moveUp();
        System.out.println("Up:" + nvP.toString());
        nvP.moveRight();
        System.out.println("Right:" + nvP.toString());
        //I_B ib = new I_B();
    }

}
