package testeos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

public class TextCorrector {

    private static final List<String> correctOrder = Arrays.asList("hola", "como", "estas","yo", "estoy", "bien","que","tal","buenos","dias");

    public static void main(String[] args) {
        JFrame frame = new JFrame("Corrector de Texto");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }


    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel inputLabel = new JLabel("Ingrese un texto:");
        inputLabel.setBounds(10, 20, 200, 25);
        panel.add(inputLabel);

        JTextField inputTextField = new JTextField();
        inputTextField.setBounds(220, 20, 150, 25);
        panel.add(inputTextField);

        JButton correctButton = new JButton("Sugerencia");
        correctButton.setBounds(220, 50, 150, 25);
        panel.add(correctButton);

        JTextArea correctionArea = new JTextArea();
        correctionArea.setBounds(10, 80, 360, 60);
        correctionArea.setEditable(false);
        panel.add(correctionArea);

        correctButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = inputTextField.getText().toLowerCase();
                String correctedText = correctText(inputText);
                correctionArea.setText("Texto corregido:\n" + correctedText);
            }
        });
    }

    private static String correctText(String inputText) {
        String[] inputWords = inputText.split("\\s+");
        StringBuilder correctedText = new StringBuilder();

        for (String word : correctOrder) {
            for (String inputWord : inputWords) {
                if (inputWord.equals(word)) {
                    correctedText.append(word).append(" ");
                    break;
                }
            }
        }

        return correctedText.toString().trim();
    }
}
