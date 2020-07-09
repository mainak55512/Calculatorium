import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class mainctrl {
    Float data, ans;
    int operation = -1;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button plus;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button minus;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button multiply;

    @FXML
    private Button zero;

    @FXML
    private Button equals;

    @FXML
    private Button clear;

    @FXML
    private Button division;

    @FXML
    private TextField display;

    @FXML
    public void handleButtonAction(ActionEvent event) {
        if (event.getSource() == one) {
            display.setText(display.getText() + "1");
        } else if (event.getSource() == two) {
            display.setText(display.getText() + "2");
        } else if (event.getSource() == three) {
            display.setText(display.getText() + "3");
        } else if (event.getSource() == four) {
            display.setText(display.getText() + "4");
        } else if (event.getSource() == five) {
            display.setText(display.getText() + "5");
        } else if (event.getSource() == six) {
            display.setText(display.getText() + "6");
        } else if (event.getSource() == seven) {
            display.setText(display.getText() + "7");
        } else if (event.getSource() == eight) {
            display.setText(display.getText() + "8");
        } else if (event.getSource() == nine) {
            display.setText(display.getText() + "9");
        } else if (event.getSource() == zero) {
            display.setText(display.getText() + "0");
        } else if (event.getSource() == clear) {
            display.setText("");
        } else if (event.getSource() == plus) {
            data = Float.parseFloat(display.getText());
            operation = 1;
            display.setText("");
        } else if (event.getSource() == minus) {
            data = Float.parseFloat(display.getText());
            operation = 2;
            display.setText("");
        } else if (event.getSource() == multiply) {
            data = Float.parseFloat(display.getText());
            operation = 3;
            display.setText("");
        } else if (event.getSource() == division) {
            data = Float.parseFloat(display.getText());
            operation = 4;
            display.setText("");
        } else if (event.getSource() == equals) {
            Float secondOperand = Float.parseFloat(display.getText());
            switch (operation) {
                case 1:
                    ans = data + secondOperand;
                    display.setText(String.valueOf(ans));
                    break;
                case 2:
                    ans = data - secondOperand;
                    display.setText(String.valueOf(ans));
                    break;
                case 3:
                    ans = data * secondOperand;
                    display.setText(String.valueOf(ans));
                    break;
                case 4:
                    try {
                        ans = data / secondOperand;
                    } catch (Exception e) {
                        display.setText("!!ERROR!!");
                    }
                    display.setText(String.valueOf(ans));
                    break;
            }
        }
    }

}
