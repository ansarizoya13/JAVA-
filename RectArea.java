class Rectangle {

int length, width;              //Declaration of variables

void getData(int x, int y)     // Definition of method

{

length = x;

width = y;

}

int rectArea()     // Definition of another method

{

int area = length * width; 
return (area);

}

}

class RectArea       // Class with main method

{

public static void main (String args[])

{

int area1, area2;

Rectangle rect1 = new Rectangle();      // Creating objects
Rectangle rect2 = new Rectangle();

rect1.length = 15;

rect1.width = 10;     //Accessing variables

area1 = rect1.length * rect1.width;

rect2.getData (20,12);

area2 = rect2.rectArea();    //Accessing methods

System.out.println("Area1 " + area1);

System.out.println("Area2 " + area2);

}
}