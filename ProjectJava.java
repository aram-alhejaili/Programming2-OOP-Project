/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

public class ProjectJava {
 //The main method
 public static void main(String[] args) {
     System.out.println("Information about some of the things people have made");
      System.out.println("---------------------------------------");
       System.out.println("In technology"+"\n 1- The mouse");
    // obj 1
    Mouse Mouse = new Mouse("HP",7);
  System.out.println(Mouse.toString());
  Mouse.specialRequest(4, 8, 2);
  Mouse.chargeable();
  Mouse.click();
  System.out.println("\n 2- The Screen");
 //obj 2 
  screen Screen = new screen(true,"Avarage");
    System.out.println(Screen.toString());
  Screen.Screen_size_and_price("Avarage");
  Screen.chargeable();
System.out.println("---------------------------------------");
       System.out.println("In industry"+"\n 1- The Ball");
   //obj 3
 Ship BALL = new Ball(3,true, "Black","Football");
  System.out.print(BALL.toString());
   BALL.delievery();
     System.out.println("---------------------------------------");
 }

}
interface ColorFul{
 public abstract String getColor();
}
interface TechnicalDevice{
 public abstract void chargeable();
 public abstract void turnOn();
 public abstract void turnOff();

}
//class bird
class bird extends Ship implements ColorFul{
protected String color;
int age;
private boolean Fly;
public bird(){}
public bird(String color,int age){
this.color=color;
this.age=age;
}
public bird(String color,int age,boolean Fly){
this(color,age);
this.Fly=Fly;
}
public void setcolor(String color){
this.color=color;
}
public void setage(int age){
this.age=age;
}
@Override
public String getColor(){
return color ;
}
double getage(){
return age;
}
public void canfly(){
if(Fly){
System.out.println("the bird can fly");
}
else{
System.out.println("the bird can not fly");}
}
@Override
public String toString(){
 return "bird\n color = " +color+"\n age = "+ age +"\n Fly = "+ Fly;
}
@Override
public void delievery(){
System.out.println("you can deilever a bird by the ship ");
}


}
//class mouse
class Mouse extends Ship implements TechnicalDevice {
 protected boolean wireless;
 private String brand;
 int weight;
public Mouse() {
 brand = null;
 wireless = false;
 weight = 0;
 }
public Mouse(String brand, int weight) {
 this.brand = brand;
 this.weight = weight;
 }
public Mouse(String brand, int weight, boolean wireless) {
 this(brand,weight);
 this.wireless = wireless;
 }
 public boolean isWireless() {
 return wireless;
 }
void setWireless(boolean wireless) {
 this.wireless = wireless;
 }
 public int getWeight() {
 return weight;
 }
void setWeight(int weight) {
 this.weight = weight;
 }
 @Override
 public String toString() {
 return "info about mouse: " + "\nbrand: " + brand + "\nis wireless? " + wireless + "\nweight = " + weight + "g";
 }
// this method is to make a special request for the mouse color
void specialRequest(int red, int green, int blue) {
 if (red >= 0 && red <= 255 && green >= 0 && green <= 255 && blue >= 0 && blue <= 255) {
 System.out.println("your special request has been sent. RGB: " + red + ", " + green + ", " + blue);
 } else {
 System.out.println("your RGB code is wrong");
 }
 }
void click() {
 System.out.println("mouse is clicked");
 }
 @Override
public void delievery(){
System.out.println("you can deilever a mous by the ship ");
}
@Override
public void chargeable(){
 if(wireless){
 System.out.println("the mouse is chargeable");
 }else{
 System.out.println("the mouse is unchargeable");
 }
}
 @Override
 public void turnOn(){
 System.out.println("the mouse is turning on");
 }

 @Override
 public void turnOff(){
 System.out.println("the mouse is turning off");
 }

}
//class banana
class Banana extends Ship implements ColorFul{
 protected String color="yellow";
 double length;
 private boolean isPeeled;

 public Banana(){
 }

 public Banana(String color,double length){
 this.color=color;
 this.length=length;
 }

 public Banana(String color,double length,boolean isPeeled){
 this(color,length);
 this.isPeeled=isPeeled;
 }

 public double getLength(){
 return length;
 }

 @Override
 public String getColor(){
 return color;
 }

 public void setLength(double length){
 this.length=length;
 }

 public void setColor(String color){
 this.color=color;
 }
 public void eat(){
 if(isPeeled){
 System.out.println("the banana is peeled, you can eat it");
 }else{
 System.out.println("you can not eat the banana. please peel it first");
 }
 }

 @Override
 public String toString(){
 return "banana\n color= "+color+"\n length= "+length+"\n isPeeled= "+isPeeled;
 }


 @Override
public void delievery(){
System.out.println("you can deilever a banana by the ship ");
}
}
//class ship
class screen extends Ship implements TechnicalDevice{
 boolean on;
 private int resolution_video_quality;
 private String displaying;
 screen() {
 on = false;
 resolution_video_quality = 144;
 displaying = "empty";
 }
 screen(boolean on, int resolution_video_quality, String displaying) {
 this.on = on;
 this.resolution_video_quality = resolution_video_quality;
 this.displaying = displaying;
 }
 screen(boolean on, String displaying) {
 this.on = on;
 this.displaying = displaying;
 }
 public int getScreenQuality(){
 return this.resolution_video_quality;
 }
 public String getContentOnScreen() {
 return this.displaying;
 }
 public void setScreenQuality(int t) {
 resolution_video_quality = t;
 }
 public void setContentOnScreen(String t) {
 displaying = t;
 }
 public void Screen_size_and_price(String r) {
 String e = "small";
 String w = "Big";
 String i = "Avarage";
 if (r.equalsIgnoreCase(e)) {
 System.out.println("it's cheap");
 } else if (r.equalsIgnoreCase(w)) {
 System.out.println("it's expencive");
 } else if (r.equalsIgnoreCase(i)) {
 System.out.println("it's reaosenable price ");
 }
 }
 @Override
 public String toString() {
 return "the quality is " + resolution_video_quality +
 " and its displaying " + displaying;
 }

 @Override
public void delievery(){
System.out.println("you can deilever a screen by the ship ");
}
 @Override
 public void turnOn(){
 System.out.println("the mouse is turning on");
 }

 @Override
 public void turnOff(){
 System.out.println("the mouse is turning off");
 }
 @Override
 public void chargeable(){
 System.out.println("the screen is unchargeable");
 }

}
// class ball
class Ball extends Ship implements ColorFul {
 //Data fields
 private double radius;
 private String color;
 private String type;
 private boolean filled =true ;



 //counstracter
 protected Ball() {
 radius= 1.0;

 }

 protected Ball(double radius,String type) {
 this.radius = radius;
 this.type = type;
 }
 protected Ball(double radius,boolean filled,String color,String type) {
 this(radius,type);
 this.filled = filled;
 this.color = color;
 }
 // method Data 1
 @Override
 public String getColor(){
 return color;
}
 public void setColor( String color) {
 this.color = color;
 }
 //method data 2
 public String getType(){
 return type;
}
 public void setType( String tybe) {
 this.type = type;
 }
 //method Data3
 public boolean isFilled(){
 return filled;
}
 public void setFilled( boolean filled) {
 this.filled = filled;
}
 //method colculate size
 public double Ballsize(){

 return 4/3*radius*radius*radius*Math.PI;

 }
 //method to string
 @Override
 public String toString(){
 return "The ball color : "+color+"\n"+"The ball is filleed ? "+filled+"\n"+"The ball tybe : "
 +type+"\n"+"The ball size "+Ballsize()+"\n" ; }

 @Override
public void delievery(){
System.out.println("you can deilever a ball by the ship ");
}
} //end of class
 abstract class Ship {

private String name;
protected int yearBuilt;
protected double length;
public Ship() {
}
public Ship(String name, int yearBuilt) {
this.name = name;
this.yearBuilt = yearBuilt;
}
public Ship(String name, int yearBuilt, double length) {
this(name,yearBuilt);
this.length = length;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public double getLength() {
return length;
}
public void setLength(double length) {
this.length = length;
}
@Override
public String toString(){
 return"the name of Ship is:"+name+"/n year the ship was built:"+yearBuilt+"/n the length of the ship is:"+length;
}
public abstract void delievery();
}

