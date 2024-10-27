package reviewchapter5.exer4;

public class RectangleV2 extends Rectangle implements Comparable<RectangleV2>{

    public RectangleV2(double width, double height) {
        super(width, height);
    }
    
    @Override
    public int compareTo(RectangleV2 o) {
        return (int) (this.area() - o.area());
    }
    
}
