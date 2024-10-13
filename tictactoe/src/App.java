
//container: JFrame, JPanel
//component: JButton, JLabel
import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {

        /*BoxLayout, Flowlayout, BorderLayout
         Layout là những thành phần không nhìn thấy được nhưng nó giúp quản lý bố cục app, web
        */

        JPanel jPanel = new JPanel();
        BoxLayout boxLayout = new BoxLayout(jPanel, BoxLayout.Y_AXIS);
        jPanel.setLayout(boxLayout);

        Board board = new Board();
        board.setPreferredSize(new Dimension(300, 300));

        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER, 0, 0);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(flowLayout);
        // bottomPanel.setPreferredSize(new Dimension(300, 50));
        // bottomPanel.setBackground(Color.YELLOW);

        JButton btnStart = new JButton("Start"); 
        JLabel lblTime = new JLabel("00:00");
        bottomPanel.add(lblTime);
        bottomPanel.add(btnStart);
        
        jPanel.add(board);
        jPanel.add(bottomPanel);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();

        JFrame jFrame = new JFrame("Game tic tac toe");
        jFrame.setSize(600, 600);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(true);
        jFrame.add(jPanel);

        int x = (int) dimension.getWidth() / 2 - jFrame.getWidth() / 2;
        int y = (int) dimension.getHeight() / 2 - jFrame.getHeight() / 2;

        jFrame.setLocation(x, y);

        jFrame.pack();
        // show ra frame
        jFrame.setVisible(true);

    }
}
