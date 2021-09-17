package innerclass;

public class OuterClass {


    private String name = "Mayur";
    /**
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }**/

    //1. Member inner class -- A class created within class and outside method
    class InnerClass{
        private String innerName;

        public String getInnerName() {
            return innerName;
        }

        public void setInnerName(String innerName) {
            this.innerName = innerName;
        }

        public void getNameOfOuterClass(){
            System.out.println("name of outer ---"+name);
        }
    }


}
