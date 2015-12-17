/**
 * Created by maxnelson on 12/10/15.
 */
public class DormRoom2 {
    private double myWidth;
    private double myLength;
    private String myName;

    public DormRoom2()
    {
        myWidth=10;
        myLength=15;
        myName="Room";
    }
    public DormRoom2(double width, double length){
        this.myLength = length;
        myWidth = width;
    }

    public DormRoom2 (String name){
        myLength = 15;
        myWidth = 10;
        myName = name;
    }

    public DormRoom2(double width, double length, String name){
        myLength = length;
        myWidth = width;
        myName = name;
    }

    public void setMyWidth(double myWidth) {
        this.myWidth = myWidth;
    }

    public void setMyLength(double myLength) {
        this.myLength = myLength;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }
    public void setProportionalWidth(double width){
        double area = myWidth * myLength;
        myWidth = width;
        myLength = area/width;
    }

    public void setProportionalLength(double length){
        double area = myWidth * myLength;
        myLength = length;
        myWidth = area/length;
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
