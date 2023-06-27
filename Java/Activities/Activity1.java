package activities;

public class Activity1 {
    public static void main(String[] args){
        Car obj = new Car();
//        System.out.println(obj.name);

    }
}
class Car {
    String Color;
    String Trasmission;
    int iMake;
    int iTyres;
    int iDoors;
    //create constructor
    int  numOfTyres;
    int numOfDoors;
    public Car (){
        //constructor
    numOfTyres = 4;
    numOfDoors = 4;
    }
}