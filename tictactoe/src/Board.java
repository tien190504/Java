
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Board extends JPanel {
    private static final int N = 3;
    private static final int M = 3;

    private Image imgX;
    private Image imgO;
    private Cell[][] matrix = new Cell[N][M];

    public Board() {

        this.initMatrix();

        addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                int x = e.getX();
                int y = e.getY();

                // Tính toán xem x, y rơi vào ô nào trong board, sau đó vẽ hình x hay O
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        Cell cell = matrix[i][j];

                        int cXStart = cell.getX();
                        int cYStart = cell.getY();

                        int cXEnd = cXStart + cell.getW();
                        int cYEnd = cYStart + cell.getH();

                        if(x >= cXStart && x <= cXEnd && y >= cYStart && y <= cYEnd) {
                            System.out.println("click vao i: " + i + " j:  " + j);
                        }

                        

                    }
                }
            }
        });

        try {
            imgX = ImageIO.read(getClass().getResource("icons/x.png"));
            imgO = ImageIO.read(getClass().getResource("icons/o.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void initMatrix() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                Cell cell = new Cell();
                matrix[i][j] = cell;
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        int w = getWidth() / 3;
        int h = getHeight() / 3;

        Graphics2D graphic2d = (Graphics2D) g;

        int k = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int x = i * w;
                int y = j * h;

                // Cập nhật lại ma trận
                Cell cell = matrix[i][j];
                cell.setY(y);
                cell.setX(x);
                cell.setH(h);
                cell.setW(w);

                Color color = k % 2 == 0 ? Color.BLACK : Color.WHITE;
                graphic2d.setColor(color);
                graphic2d.fillRect(x, y, w, h);

                // Image img = k % 2 == 0 ? imgX : imgO;
                // graphic2d.drawImage(img, x, y, w, h, this);

                k++;
            }
        }
    }
}
