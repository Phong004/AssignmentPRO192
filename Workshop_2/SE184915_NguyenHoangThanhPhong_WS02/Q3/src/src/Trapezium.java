import java.lang.Math;

public class Trapezium {
    private float firstEdge;
    private float secondEdge;
    private float height;
    
    public Trapezium() {
        
    }
    
    public Trapezium (float firstEdge, float secondEdge, float height) {
        this.firstEdge = firstEdge;
        this.secondEdge = secondEdge;
        this.height = height;
    }
    
    private float round2Decimal(float num) {
        int round = Math.round(num*100f);
        return (float)round/100f;
    }
    
    public float getAcreage() {
        float area = this.height * (this.firstEdge + this.secondEdge) / 2;
        return round2Decimal(area);
    }
    
    public String getInfo() {
        return (this.firstEdge != this.secondEdge)?"Regular trapezium":"Isosceles trapezium";
    }
    
    public void setFirstEdge(float fe) {
        if (fe > 0f) {
            this.firstEdge = fe;
            System.out.println("Success");
        }
        else {
            System.out.println("Invalid value");
        }
    }
    
    public void setSecondEdge(float se) {
        if (se > 0f) {
            this.secondEdge = se;
            System.out.println("Success");
        }
        else {
            System.out.println("Invalid value");
        }
    }
}
