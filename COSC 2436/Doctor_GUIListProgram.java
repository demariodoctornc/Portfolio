import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Collections;
import java.util.LinkedList;

public class Doctor_GUIListProgram extends JFrame {
    private JTextField inputField;
    private JTextArea displayArea;
    private JButton addButton, sortButton, shuffleButton, reverseButton;

    private LinkedList<Integer> numberList = new LinkedList<>();
    private LinkedList<Integer> originalList = new LinkedList<>();

    public Doctor_GUIListProgram() {
        setTitle("Number List Program");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Enter a Number: "));
        inputField = new JTextField(10);
        topPanel.add(inputField);

        addButton = new JButton("Add Number");
        topPanel.add(addButton);

        add(topPanel, BorderLayout.NORTH);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scroll = new JScrollPane(displayArea);
        add(scroll, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();

        sortButton = new JButton("Sort");
        shuffleButton = new JButton("Shuffle");
        reverseButton = new JButton("Reverse");

        buttonPanel.add(sortButton);
        buttonPanel.add(shuffleButton);
        buttonPanel.add(reverseButton);

        add(buttonPanel, BorderLayout.SOUTH);

        addButton.addActionListener(e -> addNumber());
        sortButton.addActionListener(e -> sortNumbers());
        shuffleButton.addActionListener(e -> shuffleNumbers());
        reverseButton.addActionListener(e -> reverseNumbers());
    }

    private void addNumber() {
        try {
            int num = Integer.parseInt(inputField.getText());

            if (numberList.size() >= 15) {
                JOptionPane.showMessageDialog(this, "Maximum of 15 numbers allowed.");
                return;
            }

            if (numberList.contains(num)) {
                JOptionPane.showMessageDialog(this, "Duplicate number NOT added.");
                return;
            }

            numberList.add(num);
            originalList.add(num);

            displayArea.setText("Original Numbers: " + originalList);

            inputField.setText("");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number.");
        }
    }

    private void sortNumbers() {
        LinkedList<Integer> tempList = new LinkedList<>(numberList);
        Collections.sort(tempList);
        displayArea.setText("Sorted Numbers: " + tempList);
    }

    private void shuffleNumbers() {
        LinkedList<Integer> tempList = new LinkedList<>(numberList);
        Collections.shuffle(tempList);
        displayArea.setText("Shuffled Numbers: " + tempList);
    }

    private void reverseNumbers() {
        LinkedList<Integer> tempList = new LinkedList<>(numberList);
        Collections.reverse(tempList);
        displayArea.setText("Reversed Numbers: " + tempList);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Doctor_GUIListProgram app = new Doctor_GUIListProgram();
            app.setVisible(true);
        });
    }
}
