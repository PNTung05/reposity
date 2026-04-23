package Canvas;

import java.awt.Shape;
import java.awt.Color;

// Lớp đại diện cho một hình vẽ
class Draw {
    Shape shape;
    Color color;
    boolean fill;

    Draw(Shape shape, Color color) {
        this.shape = shape;
        this.color = color;
    }
}