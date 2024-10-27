
public class Building {
    public byte floors;
    public double area;
    public int occupants;
    
    public double areaPerPerson(){
        return area/occupants;
    }
}
