package com.example.project;


public class Point {
  private int x;
  private int y;
  
  public Point(int x, int y) {
      this.x = x;
      this.y = y;
  }
  
 
  public int getX() {
      return x;
  }

  public int getY() {
      return y;
  }
  public void setX(int newx){
     x= newx;
  }
  public void setY(int newy){
    y= newy;
 }

  public double distanceTo(Point other) {
      int diffx = x - other.getX();
      int diffy = y - other.getY();
      return Math.sqrt(diffx * diffx + diffy * diffy);
  }

  public String pointInfo() {
      return "(" + getX() + ", " + getY() + ")";
  }
}