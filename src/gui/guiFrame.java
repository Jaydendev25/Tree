package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class guiFrame extends JFrame{
    public guiFrame() {
        this.setTitle("Tree App");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        addGuiComponents();
        this.setVisible(true);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    private void addGuiComponents() {
        GridBagConstraints gc = new GridBagConstraints();

        JPanel uiPanel = new JPanel(new GridBagLayout());
        uiPanel.setPreferredSize(new Dimension(1000,100));
        uiPanel.setBackground(Color.WHITE);
        this.add(uiPanel, BorderLayout.NORTH);

        gc.gridx = 1;
        gc.gridy = 1;
        String[] choices = {"Inorder Traversal", "Preorder Traversal", "Postorder Traversal", "Level Order Traversal"};
        JComboBox<String> cb = new JComboBox<String>(choices); 
        uiPanel.add(cb, gc);

        gc.gridx = 2;
        JButton submit = new JButton("Start");
        submit.setPreferredSize(new Dimension(100, 25));
        uiPanel.add(submit, gc);
        
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setPreferredSize(new Dimension(1000,800));
        panel.setBackground(Color.black);
        this.add(panel, BorderLayout.CENTER);

        drawTree(panel);
       
    }

    private void drawTree(JPanel panel) {
        GridBagConstraints gc = new GridBagConstraints();
        gc.weightx = 1;
        gc.weighty = 1;
        gc.gridx = 4;
        gc.gridy = 1;
        JButton One = new JButton("1");
        panel.add(One, gc);

        gc.gridx = 2;
        gc.gridy = 2;
        JButton two = new JButton("2");
        panel.add(two, gc);

        gc.gridx = 6;
        gc.gridy = 2;
        JButton three = new JButton("3");
        panel.add(three, gc);

        gc.gridx = 1;
        gc.gridy = 3;
        JButton four = new JButton("4");
        panel.add(four, gc);

        gc.gridx = 3;
        gc.gridy = 3;
        JButton five = new JButton("5");
        panel.add(five, gc);

        gc.gridx = 5;
        gc.gridy = 3;
        JButton six = new JButton("6");
        panel.add(six, gc);

        gc.gridx = 7;
        gc.gridy = 3;
        JButton seven = new JButton("7");
        panel.add(seven, gc);

        gc.gridx = 1;
        gc.gridy = 4;
        JButton eight = new JButton("8");
        panel.add(eight, gc);

        gc.gridx = 4;
        gc.gridy = 4;
        JButton nine = new JButton("9");
        panel.add(nine, gc);

        gc.gridx = 6;
        gc.gridy = 4;
        JButton ten = new JButton("10");
        panel.add(ten, gc);
    }
}
