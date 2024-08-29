import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScientificCalculator extends JFrame {

    private JTextField display;
    private String currentInput;
    private double result;

    public ScientificCalculator() {
        setTitle("Scientific Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        display = new JTextField();
        display.setEditable(false);
        currentInput = "";
        result = 0;

        // Create buttons
        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "sin", "cos", "tan", "sqrt",
                "C"
        };

        setLayout(new GridLayout(5, 4));

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            add(button);
        }

        // Add display to the frame
        add(display);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String buttonText = source.getText();

            if (buttonText.equals("=")) {
                evaluateExpression();
            } else if (buttonText.equals("C")) {
                clear();
            } else if (buttonText.equals("sin") || buttonText.equals("cos") || buttonText.equals("tan") || buttonText.equals("sqrt")) {
                applyFunction(buttonText);
            } else {
                currentInput += buttonText;
                display.setText(currentInput);
            }
        }
    }

    private void evaluateExpression() {
        try {
            result = CalculatorEngine.evaluate(currentInput);
            display.setText(Double.toString(result));
            currentInput = "";
        } catch (Exception ex) {
            display.setText("Error");
        }
    }

    private void clear() {
        currentInput = "";
        result = 0;
        display.setText("");
    }

    private void applyFunction(String functionName) {
        try {
            double operand = Double.parseDouble(currentInput);
            switch (functionName) {
                case "sin":
                    result = Math.sin(Math.toRadians(operand));
                    break;
                case "cos":
                    result = Math.cos(Math.toRadians(operand));
                    break;
                case "tan":
                    result = Math.tan(Math.toRadians(operand));
                    break;
                case "sqrt":
                    result = Math.sqrt(operand);
                    break;
            }
            display.setText(Double.toString(result));
            currentInput = "";
        } catch (NumberFormatException ex) {
            display.setText("Error");
        }
    }

    public static void main(String[] args) {
        System.out.println("sunny kumar");
        System.out.println("2821106");
        SwingUtilities.invokeLater(() -> {
            ScientificCalculator calculator = new ScientificCalculator();
            calculator.setVisible(true);
        });
    }
}

class CalculatorEngine {
    static double evaluate(String expression) throws Exception {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < expression.length()) ? expression.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (Character.isWhitespace(ch)) nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < expression.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (; ; ) {
                    if (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (; ; ) {
                    if (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(expression.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = expression.substring(startPos, this.pos);
                    x = parseFactor();
                    switch (func) {
                        case "sin":
                            x = Math.sin(Math.toRadians(x));
                            break;
                        case "cos":
                            x = Math.cos(Math.toRadians(x));
                            break;
                        case "tan":
                            x = Math.tan(Math.toRadians(x));
                            break;
                        case "sqrt":
                            x = Math.sqrt(x);
                            break;
                        default:
                            throw new RuntimeException("Unknown function: " + func);
                    }
                } else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
}
