package lesson8;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Chat extends JFrame {

    public Chat() throws HeadlessException {
        setSize(300, 500);

        JPanel panel = new JPanel(new BorderLayout());
        JTextField textField = new JTextField();
        JTextArea textArea = new JTextArea();

        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println(e.getKeyChar());
            }
        });

        textField.addActionListener(event -> {
            textArea.append(textField.getText() + "\n");
            textField.setText("");
        });

        panel.add(textField, BorderLayout.SOUTH);
        panel.add(textArea, BorderLayout.CENTER);
        add(panel);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Chat();
    }
}
