package lsid.app.javaculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    int op = 0;
    String op1 = "";
    String op2 = "";
    String symbol = "";

    protected void setOp(String ope) {
        if (op == 1) {
            op1 += ope;
            welcomeText.setText(op1);
        } else if (op == 2) {
            op2 += ope;
            welcomeText.setText(op2);
        } else if (op == 0) {
            op = 1;
            op1 += ope;
            welcomeText.setText(op1);
        }
    }

    @FXML
    private Label welcomeText;

    @FXML
    protected void setOpT0() {
        setOp("0");
    }

    @FXML
    protected void setOpT1() {
        setOp("1");
    }
    @FXML
    protected void setOpT2() {
        setOp("2");
    }
    @FXML
    protected void setOpT3() {
        setOp("3");
    }

    @FXML
    protected void setOpT4() {
        setOp("4");
    }

    @FXML
    protected void setOpT5() {
        setOp("5");
    }

    @FXML
    protected void setOpT6() {
        setOp("6");
    }

    @FXML
    protected void setOpT7() {
        setOp("7");
    }

    @FXML
    protected void setOpT8() {
        setOp("8");
    }

    @FXML
    protected void setOpT9() {
        setOp("9");
    }

    @FXML
    protected void setOp2() {
        op = 2;
    }

    @FXML
    protected void setOp1() {
        op = 1;
    }

    @FXML
    protected void SymbolMod() {
        symbol = "%";
    }

    @FXML
    protected void SymbolAdd() {
        symbol = "+";
    }

    @FXML
    protected void SymbolSub() {
        symbol = "-";
    }

    @FXML
    protected void SymbolMul() {
        symbol = "*";
    }

    @FXML
    protected void SymbolDiv() {
        symbol = "/";
    }

    @FXML
    protected void Calculate() {
        if (symbol.equals("+")) {
            welcomeText.setText(String.valueOf(Integer.valueOf(op1) + Integer.valueOf(op2)));
        }
        if (symbol.equals("-")) {
            welcomeText.setText(String.valueOf(Integer.valueOf(op1) - Integer.valueOf(op2)));
        }
        if (symbol.equals("/")) {
            welcomeText.setText(String.valueOf(Integer.valueOf(op1) / Integer.valueOf(op2)));
        }
        if (symbol.equals("*")) {
            welcomeText.setText(String.valueOf(Integer.valueOf(op1) * Integer.valueOf(op2)));
        }
        if (symbol.equals("%")) {
            welcomeText.setText(String.valueOf(Integer.valueOf(op1) % Integer.valueOf(op2)));
        }
        op1 = "";
        op2 = "";
        op = 0;
        symbol = "";
    }
    @FXML
    protected void Clear() {
        op1 = "";
        op2 = "";
        op = 0;
        symbol = "";
        welcomeText.setText("0");
    }

}