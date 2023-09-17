package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchSmallestNumber implements ActionListener {
    private JFrame menuFrame;
    private int[] numbers;

    public SearchSmallestNumber(JFrame menuFrame, int[] numbers) {
        this.menuFrame = menuFrame;
        this.numbers = numbers;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int smallest = numbers[0];

        // Find the smallest number in the array
        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
        }

        // Display the smallest number
        JOptionPane.showMessageDialog(menuFrame, "Smallest number in the array: " + smallest);
    }
}
