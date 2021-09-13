package fileio;

import org.w3c.dom.css.Rect;

public class LSPExample {

    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.setBreadth(10);
        r.setLength(15);
        calculateArea(r);
        System.out.println("****************************");
        Square square = new Square();
        square.setBreadth(10);
        //square.setLength(10);
        calculateArea(square);
    }
    static void calculateArea(Rectangle r   ){

            System.out.println(r.getArea());
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());
    }

}
