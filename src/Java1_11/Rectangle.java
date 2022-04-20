package Java1_11;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle(float l,float w){
        length = l;
        width = w;
    }
    public float getLength(){
        return length;
    }
    public void setLength(float l){
        length = l;
    }
    public float getWidth(){
        return width;
    }
    public void setWidth(float w){
        width = w;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return (length+width)*2;
    }
    public String toString(){
        return "Rectangle[length = "+ length + ", width = "+ width +"]";
    }
}