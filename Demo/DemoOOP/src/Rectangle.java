public class Rectangle {

    private double width = 1.0;
    private double height = 1.0;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) throws Exception {
        if (width>0 && width <20){
            this.width = width;
        }
        else{
            Exception ex = new Exception("width is 0 to 20");
            throw ex;
        }
    }

    public void setHeight(double height) throws Exception {
        if (height>0 && height <20){
            this.height = height;
        }
        else{
            Exception ex = new Exception("height is 0 to 20");
            throw ex;
        }
    }

    public static void main(String[] args){
        Rectangle rec = new Rectangle();
        System.out.println("width ="+ rec.getWidth());
        System.out.println("height ="+ rec.getHeight());
        
        try
        {
            rec.setHeight(20.1);            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
