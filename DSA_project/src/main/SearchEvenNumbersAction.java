package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchEvenNumbersAction implements ActionListener {
    private JFrame menuFrame;
    private int[] numbers;

    public SearchEvenNumbersAction(JFrame menuFrame, int[] numbers) {
        this.menuFrame = menuFrame;
        this.numbers = numbers;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = JOptionPane.showInputDialog(menuFrame, "Enter an odd number:");
        try {
            int userInput = Integer.parseInt(input);
            if (userInput % 2 == 0 && userInput >= 1 && userInput <= 10) {
                String result = "Even numbers in the array: ";
                for (int number : numbers) {
                    if (number % 2 == 0) {
                        result += number + " ";
                    }
                }
                JOptionPane.showMessageDialog(menuFrame, result);
            } else {
                JOptionPane.showMessageDialog(menuFrame, "Invalid input. Please enter an odd number between 1 and 10.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(menuFrame, "Invalid input. Please enter a valid number.");
        }
    }
}
