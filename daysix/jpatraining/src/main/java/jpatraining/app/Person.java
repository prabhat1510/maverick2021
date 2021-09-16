package main.java.jpatraining.app;

public class Person implements Comparable<Person>{

    private int personId;
    private String personName;

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                '}';
    }


    @Override
    public int compareTo(Person o) {
        if(this.personId >o.personId){
            return  1;
        }else if(this.personId<o.personId){
            return -1;
        }else {
            return 0;
        }
    }
}
