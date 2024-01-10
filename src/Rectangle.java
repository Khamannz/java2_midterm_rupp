import java.util.Date;

public abstract class Rectangle {

    Double width=20.0;
    Double height= 200.0;

    public Rectangle(Double width, Double height, Double p, Double l) {
        this.width = width;
        this.height = height;
        P = p;
        L = l;
    }

    Double P= 32.0;
    Double L= 100.0;
     public Double getArea() {
        return width* height;
    }
    public Double getPerimeter(){
         return (L+P)*2;
    }

}
