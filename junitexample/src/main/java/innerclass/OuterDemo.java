package innerclass;

public class OuterDemo {

    public static void main(String[] args){
        OuterClass outerClass = new OuterClass();
        //outerClass.setName("OuterClass");

        OuterClass.InnerClass outInnerClass = outerClass.new InnerClass();
        outInnerClass.setInnerName("InnerNameClass");
        System.out.println(outInnerClass.getInnerName());
        outInnerClass.getNameOfOuterClass();

    }
}
