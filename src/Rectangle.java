import java.util.Date;

public  class Rectangle {

    Double width=20.0;
    Double height= 200.0;

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;

    }

     public Double getArea() {
        return width* height;
    }
    public Double getPerimeter(){
         return (width+height)*2;
    }

}
