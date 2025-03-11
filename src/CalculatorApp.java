import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 //Calculadora
public class CalculatorApp implements ActionListener {

    double num1 = 0;
    double num2 = 0;
    double result = 0;
    int calculation;


    JFrame frame = new JFrame("Calculator");
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("On");
    JRadioButton offRadioButton = new JRadioButton("Off");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("x");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonSquare = new JButton("x²");
    JButton buttonReciprocal = new JButton("1/x");
    JButton buttonSqrt = new JButton("√");


    CalculatorApp(){
        Gui();
        addComponents();
        addActionEvent();
    }

    public void Gui(){
        frame.setSize(305, 510);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponents(){
        label.setBounds(250,0,50,50);
        label.setForeground(Color.white);
        frame.add(label);

        textField.setBounds(10,40,270,40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        onRadioButton.setBounds(10,95,60,40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        onRadioButton.setBackground(Color.black);
        onRadioButton.setForeground(Color.white);
        onRadioButton.setFocusable(false);
        frame.add(onRadioButton);

        offRadioButton.setBounds(10,120,60,40);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        offRadioButton.setBackground(Color.black);
        offRadioButton.setForeground(Color.white);
        offRadioButton.setFocusable(false);
        frame.add(offRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);



        //Primeira Linha
        buttonClear.setBounds(80,110,60,40);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 20));
        buttonClear.setBackground(Color.red);
        frame.add(buttonClear);

        buttonDelete.setBounds(150,110,60,40);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 10));
        buttonDelete.setBackground(Color.red);
        frame.add(buttonDelete);

        buttonDiv.setBounds(220,110,60,40);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDiv.setBackground(Color.orange);
        frame.add(buttonDiv);

        //Segunda Linha
        buttonSqrt.setBounds(10,170,60,40);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSqrt);

        buttonSquare.setBounds(80,170,60,40);
        buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSquare);

        buttonReciprocal.setBounds(150,170,60,40);
        buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 12));
        frame.add(buttonReciprocal);

        buttonMinus.setBounds(220,170,60,40);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMinus.setBackground(Color.orange);
        frame.add(buttonMinus);


        //Terceira Linha
        buttonSeven.setBounds(10,230,60,40);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSeven);

        buttonEight.setBounds(80,230,60,40);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonEight);

        buttonNine.setBounds(150,230,60,40);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonNine);

        buttonMul.setBounds(220,230,60,40);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMul.setBackground(Color.orange);
        frame.add(buttonMul);

        //Quarta Linha
        buttonFour.setBounds(10,290,60,40);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFour);

        buttonFive.setBounds(80,290,60,40);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFive);

        buttonSix.setBounds(150,290,60,40);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSix);

        buttonPlus.setBounds(220,290,60,40);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPlus.setBackground(Color.orange);
        frame.add(buttonPlus);

        //Quinta Linha
        buttonThree.setBounds(10,350,60,40);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonThree);

        buttonTwo.setBounds(80,350,60,40);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonTwo);

        buttonOne.setBounds(150,350,60,40);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonOne);

        //Sexta Linha
        buttonZero.setBounds(10,410,130,40);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonZero);

        buttonDot.setBounds(150,410,60,40);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonDot);

        buttonEqual.setBounds(220,350,60,100);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEqual.setBackground(Color.orange);
        frame.add(buttonEqual);
    }

    public void addActionEvent(){

        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        if(source == onRadioButton){
            enable();
        }else if(source == offRadioButton){
            disable();
        }else if(source == buttonClear){
            label.setText("");
            textField.setText("");
        }else if(source == buttonDelete){
            int length = textField.getText().length();
            int number = length-1;
            if(length>0){

              StringBuilder back = new StringBuilder(textField.getText());
              back.deleteCharAt(number);
              textField.setText(back.toString());
            }
            textField.getText();
            label.setText("");
        }else if (source == buttonZero) {
            if (textField.getText().equals("0")) {
                return;
            } else {
                textField.setText(textField.getText() + "0");
            }
        }else if (source == buttonOne){
            textField.setText(textField.getText() + "1");
        }else if (source == buttonTwo){
            textField.setText(textField.getText() + "2");
        }else if (source == buttonThree){
            textField.setText(textField.getText() + "3");
        }else if (source == buttonFour){
            textField.setText(textField.getText() + "4");
        }else if (source == buttonFive){
            textField.setText(textField.getText() + "5");
        }else if (source == buttonSix){
            textField.setText(textField.getText() + "6");
        }else if (source == buttonSeven){
            textField.setText(textField.getText() + "7");
        }else if (source == buttonEight){
            textField.setText(textField.getText() + "8");
        }else if (source == buttonNine){
            textField.setText(textField.getText() + "9");
        }else if (source == buttonDot){
            if(textField.getText().contains(".")){
            }else{
                textField.setText(textField.getText() + ".");
            }
        }else if (source == buttonPlus){
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 1;
            textField.setText("");
            label.setText(str + "+");
        }else if (source == buttonMinus) {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 2;
            textField.setText("");
            label.setText(str + "-");
        }else if (source == buttonMul) {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 3;
            textField.setText("");
            label.setText(str + "X");
        }else if (source == buttonDiv) {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 4;
            textField.setText("");
            label.setText(str + "/");
        }else if (source == buttonSquare){
            num1= Double.parseDouble(textField.getText());
            double square = Math.pow(num1, 2);
            String string = Double.toString(square);
            if(string.endsWith(".0")){
                textField.setText(string.replace(".0",""));
            }else{
                textField.setText(string);
            }
        }else if (source == buttonSqrt){
            num1= Double.parseDouble(textField.getText());
            double sqrt = Math.sqrt(num1);
            String string = Double.toString(sqrt);
            if(string.endsWith(".0")){
                textField.setText(string.replace(".0",""));
            }else{
                textField.setText(string);
            }
        }else if (source == buttonReciprocal){
            num1= Double.parseDouble(textField.getText());
            double reciprocal = 1/num1;
            String string = Double.toString(reciprocal);
            if(string.endsWith(".0")){
                textField.setText(string.replace(".0",""));
            }else {
                textField.setText(string);
            }
        }else if (source == buttonEqual){
             num2 = Double.parseDouble(textField.getText());
             switch(calculation){
                 case 1:
                     result = num1 + num2;
                     break;
                 case 2:
                     result = num1 - num2;
                     break;
                 case 3:
                     result = num1 * num2;
                     break;
                 case 4:
                     result = num1 / num2;
                     break;
             }if (Double.toString(result).endsWith(".0")){
                 textField.setText(Double.toString(result).replace(".0",""));
            }else{
                 textField.setText(Double.toString(result));
            }
            label.setText("");
            num1=result;
        }
    }

    public void enable(){
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        textField.setEnabled(true);
        label.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonReciprocal.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonDot.setEnabled(true);
    }

   public void disable(){
       onRadioButton.setEnabled(true);
       offRadioButton.setEnabled(false);
       textField.setEnabled(false);
       label.setEnabled(false);
       buttonClear.setEnabled(false);
       buttonDelete.setEnabled(false);
       buttonDiv.setEnabled(false);
       buttonSqrt.setEnabled(false);
       buttonSquare.setEnabled(false);
       buttonReciprocal.setEnabled(false);
       buttonMinus.setEnabled(false);
       buttonSeven.setEnabled(false);
       buttonEight.setEnabled(false);
       buttonNine.setEnabled(false);
       buttonMul.setEnabled(false);
       buttonFour.setEnabled(false);
       buttonFive.setEnabled(false);
       buttonSix.setEnabled(false);
       buttonPlus.setEnabled(false);
       buttonOne.setEnabled(false);
       buttonTwo.setEnabled(false);
       buttonThree.setEnabled(false);
       buttonEqual.setEnabled(false);
       buttonZero.setEnabled(false);
       buttonDot.setEnabled(false);

   }

     public static void main(String[] args) {
         CalculatorApp calculator = new CalculatorApp();
     }
}
