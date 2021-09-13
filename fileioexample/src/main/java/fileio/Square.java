package fileio;



public class Square extends Rectangle {

    @Override
    public void setBreadth(int breadth){
        super.setBreadth(breadth);
        super.setLength(breadth);

    }

    @Override
    public void setLength(int length){
        super.setBreadth(length);
        super.setLength(length);
    }
}
