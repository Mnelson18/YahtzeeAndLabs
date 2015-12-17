/**
 * Created by maxnelson on 12/3/15.
 */
import java.util.*;
public class DormRooms {

        private double myWidth;
        private double myLength;
        private String myName;

        public DormRooms()
        {
            myWidth=10;
            myLength=15;
            myName="Room";
        }
    public DormRooms(double width, double length){
       this.myLength = length;
       myWidth = width;
    }

    public DormRooms (String name){
        myLength = 15;
        myWidth = 10;
        myName = name;
    }

    public DormRooms(double width, double length, String name){
        myLength = length;
        myWidth = width;
        myName = name;
    }

    public double getMyWidth(){
        return myWidth;
    }
    public double getMyLength(){
        return myLength;
    }
    public String getMyName(){
        return myName;
    }

    public double getMyArea(){
        return myLength*myWidth;
    }
    public String toString(){
        return "Length: " + myLength + " Width: " + myWidth + " Name: " + myName;
    }

}

