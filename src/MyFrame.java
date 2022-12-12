import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JTextField textField, textField1;
    JButton count;

    public MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        this.setTitle("Vowel Count");
        this.setSize(600,150);

        this.setResizable(true);

        textField = new JTextField(50);
        window.add(textField);

        count = new JButton("Count");
        window.add(count);
        count.addActionListener(this);

        textField1 = new JTextField(50);
        window.add(textField1, BorderLayout.SOUTH);

        this.setVisible(true);


    }

    public void actionPerformed(ActionEvent event){
        Object source = event.getSource();
        int countVowels;
        countVowels = findVowels();
        textField1.setText("There are " + countVowels + " vowels!");


    }

    public int findVowels(){
        int count1 = 0;
        for (int i = 0; i < textField.getText().length(); i++){
            if (textField.getText().charAt(i) == 'a' || textField.getText().charAt(i) == 'e' || textField.getText().charAt(i) == 'i'  || textField.getText().charAt(i) == 'o' || textField.getText().charAt(i) == 'u'){
                count1++;
            }
        }
        return count1;
    }
}
