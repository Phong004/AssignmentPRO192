package inheritance;

public class HinhTru extends Circle{
    double chieucao;

    public HinhTru(double chieucao, double radius) {
        super(radius);
        this.chieucao = chieucao;
    }
    
    public double tinhDienTichXungQuang(){
        //chu vi x chieu cao
        double dtxq = this.getCircumference()* this.chieucao;
        return dtxq;
    }
    
    public double tinhTheTich(){
        //dien tich x chieu cao
        double tt = this.getArea()* this.chieucao;
        return tt;
    }

    @Override
    public String toString() {
        return "HinhTru{" + super.toString() + ", chieucao=" + chieucao + '}';
    }
    
}
