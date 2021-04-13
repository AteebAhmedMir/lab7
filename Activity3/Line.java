
package Activity3;


public class Line {
    int x1,y1,x2,y2;
    Point startPoint = new Point(x1, y1);
    Point endPoint = new Point(x2, y2);
    
    public double length(int x1, int y1, int x2, int y2){
        
        return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }
      
}
