package Canvas;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;

public class Paint extends JFrame {
    public Paint() {
        setTitle("Drawing");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        CanvasPanel canvas = new CanvasPanel();
        JToolBar toolBar = new JToolBar();

        // Nút chọn hình
        String[] types = {"Rectangle", "Circle", "Line"};
        for (String t : types) {
            JButton btn = new JButton(t);
            btn.addActionListener(e -> canvas.selectedType = t);
            toolBar.add(btn);
        }

        toolBar.addSeparator();

        // Nút chọn màu
        JButton colorBtn = new JButton("Choose Color");
        colorBtn.addActionListener(e -> {
            Color c = JColorChooser.showDialog(this, "Select Color", canvas.selectedColor);
            if (c != null) canvas.selectedColor = c;
        });
        toolBar.add(colorBtn);

        add(toolBar, BorderLayout.NORTH);
        add(canvas, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Paint().setVisible(true));
    }
}
