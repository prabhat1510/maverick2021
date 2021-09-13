/**
 * 
 */
package com.designpatterndemo.factory;

/**
 * @author Admin
 *
 */
public class ApplicationClient {
	public static void main(String[] args){
    Shape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
    if (circle != null) {
        circle.draw();
    } else {
        System.out.println("This shape can not be drawn.");
    }
    //requests non existent shape
    Shape triangle = ShapeFactory.getShape(ShapeType.TRIANGLE);
    if (triangle != null) {
        triangle.draw();
    } else {
        System.out.println("This shape can't be drawn");
    }
}
}
