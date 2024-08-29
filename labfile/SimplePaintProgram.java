import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SimplePaintProgram extends JFrame {

    private int startX, startY, endX, endY;
    private ShapeType currentShape;

    public enum ShapeType {
        POINT, LINE, RECTANGLE
    }

    public SimplePaintProgram() {
        setTitle("Simple Paint Program");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        currentShape = ShapeType.LINE; // Default shape

        // Set up mouse listener for drawing
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                startX = e.getX();
                startY = e.getY();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                endX = e.getX();
                endY = e.getY();
                repaint(); // Request a repaint after the mouse is released
            }
        });

        // Set up menu for choosing the shape
        JMenuBar menuBar = new JMenuBar();
        JMenu shapeMenu = new JMenu("Shape");
        JMenuItem pointItem = new JMenuItem("Point");
        JMenuItem lineItem = new JMenuItem("Line");
        JMenuItem rectangleItem = new JMenuItem("Rectangle");

        pointItem.addActionListener(e -> currentShape = ShapeType.POINT);
        lineItem.addActionListener(e -> currentShape = ShapeType.LINE);
        rectangleItem.addActionListener(e -> currentShape = ShapeType.RECTANGLE);

        shapeMenu.add(pointItem);
        shapeMenu.add(lineItem);
        shapeMenu.add(rectangleItem);
        menuBar.add(shapeMenu);

        setJMenuBar(menuBar);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        switch (currentShape) {
            case POINT:
                g2d.drawLine(startX, startY, startX, startY);
                break;
            case LINE:
                g2d.drawLine(startX, startY, endX, endY);
                break;
            case RECTANGLE:
                int width = Math.abs(endX - startX);
                int height = Math.abs(endY - startY);
                int x = Math.min(startX, endX);
                int y = Math.min(startY, endY);
                g2d.drawRect(x, y, width, height);
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println("Rohan kumar");
        System.out.println("2821185");

        SwingUtilities.invokeLater(() -> {
            SimplePaintProgram paintProgram = new SimplePaintProgram();
            paintProgram.setVisible(true);
        });
    }
}
