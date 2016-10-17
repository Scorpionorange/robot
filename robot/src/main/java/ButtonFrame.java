import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by ScorpionOrange on 2016/08/24.
 */

/**
 * A Frame with a button panel
 */
public class ButtonFrame extends JFrame {
    private JPanel buttonPanel;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public ButtonFrame(){
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        buttonPanel = new JPanel();

        /*
        //create buttons
        JButton yellowButton = new JButton("Yellow");
        JButton blueButton = new JButton("Blue");
        JButton redButton = new JButton("Red");

        //add buttons to panel
        buttonPanel.add(yellowButton);
        buttonPanel.add(blueButton);
        buttonPanel.add(redButton);

        //create button actions
        ColorAction yellowAction = new ColorAction(Color.YELLOW);
        ColorAction blueAction = new ColorAction(Color.BLUE);
        ColorAction redAction = new ColorAction(Color.RED);

        //associate actions with buttons
        yellowButton.addActionListener(yellowAction);
        blueButton.addActionListener(blueAction);
        redButton.addActionListener(redAction);
        */

        /*
        public void makeButton(String name, final Color backgroundColor){
            final JButton button = new JButton(name);
            buttonPanel.add(button);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    buttonPanel.setBackground(backgroundColor);
                }
            });
        }
        */

        //add panel to frame
        add(buttonPanel);

    }

    public void makeButton(String name, final Color backgroundColor){
        final JButton button = new JButton(name);
        buttonPanel.add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonPanel.setBackground(backgroundColor);
            }
        });
    }

    /**
     * An action listener that sets the panel's background color.
     */
    private class ColorAction implements ActionListener {
        private Color blackgroundColor;

        public ColorAction(Color c){
            blackgroundColor = c;
        }

        public void actionPerformed(ActionEvent event){
            buttonPanel.setBackground(blackgroundColor);
        }
    }

}
