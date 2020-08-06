package swing_test;

import javax.swing.*;
import java.awt.*;

public class SwingTest {
    public static void main(String[] args) {
        JFrame jf=new JFrame("测试");
        jf.setSize(600,500);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        GridLayout gl=new GridLayout(2,3);
        JPanel jPanel=new JPanel(gl);
        JButton jButton=new JButton("Button01");
        jPanel.add(jButton);

        jf.setContentPane(jPanel);
        jf.setVisible(true);
    }
}
