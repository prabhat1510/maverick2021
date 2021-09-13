package com.designpatterndemo.adapter;

import com.designpatterndemo.adapter.thirdparty.GShape;
import com.designpatterndemo.adapter.thirdparty.Rhombus;
import com.designpatterndemo.adapter.thirdparty.Triangle;

//Object Adapter Pattern
public class ShapeObjectAdapter implements Shape {
    private GShape adaptee;
    public ShapeObjectAdapter(GShape adaptee) {
          super();
          this.adaptee = adaptee;
    }
    @Override
    public void draw() {
    adaptee.drawShape();
    }
    @Override
    public void resize() {
    System.out.println(description() + " can't be resized. Please create new one with required values.");
    }
    @Override
    public String description() {
          if (adaptee instanceof Triangle) {
          return "Triangle object";
          } else if (adaptee instanceof Rhombus) {
          return "Rhombus object";
          } else {
          return "Unknown object";
          }
    }
    @Override
    public boolean isHide() {
    return false;
    }
}
