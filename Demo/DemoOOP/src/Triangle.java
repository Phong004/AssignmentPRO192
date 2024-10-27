
public class Triangle {

    private float width = 0.0f;
    private float height = 0.0f;

    public Triangle() {
    }

    public Triangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle{" + "width=" + width + ", height=" + height + '}';
    }

}
