package Seasson1;

public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    if(walk.length != 10) return false;
    Point point = Point.getInstance();
    for(char w : walk){
      point.walkBlock(w);
    }
    return point.isInOrigin();
  }

}



class Point {
  private static Point point = null;
  private Integer x;
  private Integer y;

  private Point() {
    this.x = 0;
    this.y = 0;
  }

  public static Point getInstance(){
    point = new Point();
    return point;
  }

  public Integer getX(){
    return this.x;
  }
  public Integer getY(){
    return this.y;
  }

  public void walkBlock(char w){
    switch(w){
      case 'n':
        this.y = this.y + 1;
        break;
      case 's':
        this.y = this.y - 1;
        break;
      case 'e':
        this.x = this.x + 1;
        break;
      case 'w':
        this.x = this.x - 1;
        break;
    }
  }

  public boolean isInOrigin(){
    return this.x == 0 && this.y == 0;
  }
}
