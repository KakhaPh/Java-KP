package MFinalExamPractice.Task_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class InventoryApp {
    private JFrame frame;
    private JTextField nameField;
    private JTextField priceField;
    private JTextField quantityField;
    private JTextArea outputArea;
    private File file;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                InventoryApp windows = new InventoryApp();
                windows.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public InventoryApp() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());

        file = new File("src/MFinalExamPractice/Task_5/inventory.txt");

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.NORTH);
        panel.setLayout(new GridLayout(4,2));

        JLabel nameLabel = new JLabel("სახელი:");
        panel.add(nameLabel);
        nameField = new JTextField();
        panel.add(nameField);

        JLabel priceLabel = new JLabel("ფასი:");
        panel.add(priceLabel);
        priceField = new JTextField();
        panel.add(priceField);

        JLabel quantityLabel = new JLabel("რაოდენობა");
        panel.add(quantityLabel);
        quantityField = new JTextField();
        panel.add(quantityField);

        JButton addButton = new JButton("დამატება");
        panel.add(addButton);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        frame.getContentPane().add(new JScrollPane(outputArea), BorderLayout.CENTER);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String price = priceField.getText();
                String quantity = quantityField.getText();

                if (name.isEmpty() || price.isEmpty() || quantity.isEmpty()) {
                    JOptionPane.showMessageDialog(frame,"გთხოვთ შეავსოთ ყველა ველი!");
                }

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                    writer.write("დასახელება: " + name + ", ფასი: " + price + ", რაოდენობა: " + quantity);
                    writer.newLine();
                    writer.flush();
                    outputArea.append("დამატებულია: " + name + " - " + price + " ლარი, " + quantity + " რაოდენობა.\n");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "ფაილში ჩაწერის დროს შეცდომა!");
                    ex.printStackTrace();
                }

                nameField.setText("");
                priceField.setText("");
                quantityField.setText("");
            }
        });
    }
}


