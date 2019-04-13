package graficacion;


import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Point2D;

public class Linea extends Figuras {
    Point2D punto1;
    Point2D punto2;
    
        Linea(Point _p1, Point _p2, Color _color) {
        punto1 = _p1;
        punto2 = _p2;
        color  = _color;
    }  
}
