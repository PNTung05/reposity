package Canvas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.ArrayList;

public class CanvasPanel extends JPanel {
    private ArrayList<Draw> shapes = new ArrayList<>();
    private Point startPoint;
    private java.awt.Shape currentShape = null;
    
    // Cài đặt mặc định
    public String selectedType = "Rectangle";
    public Color selectedColor = Color.BLACK;

    public CanvasPanel() {
        setBackground(Color.WHITE);

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                startPoint = e.getPoint();
            }

            public void mouseReleased(MouseEvent e) {
                if (currentShape != null) {
                    shapes.add(new Draw(currentShape, selectedColor));
                    currentShape = null;
                    repaint();
                }
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                int x = Math.min(startPoint.x, e.getX());
                int y = Math.min(startPoint.y, e.getY());
                int width = Math.abs(startPoint.x - e.getX());
                int height = Math.abs(startPoint.y - e.getY());

                // Logic tạo hình dựa trên lựa chọn
                switch (selectedType) {
                    case "Rectangle":
                        currentShape = new Rectangle2D.Double(x, y, width, height);
                        break;
                    case "Circle":
                        currentShape = new Ellipse2D.Double(x, y, width, height);
                        break;
                    case "Line":
                        currentShape = new Line2D.Double(startPoint.x, startPoint.y, e.getX(), e.getY());
                        break;
                }
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Vẽ các hình cũ đã lưu
        for (Draw s : shapes) {
            g2d.setColor(s.color);
            g2d.draw(s.shape);
        }

        // Vẽ hình hiện tại đang kéo chuột (preview)
        if (currentShape != null) {
            g2d.setColor(selectedColor);
            g2d.draw(currentShape);
        }
    }
}