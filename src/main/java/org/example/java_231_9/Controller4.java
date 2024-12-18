package org.example.java_231_9;

import javafx.event.ActionEvent;
import javafx.scene.text.Text;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;


public class Controller4 {
    public String expressionx ="";
    public Text Text1;
    public boolean netTocham=true;

    public void Onpls(ActionEvent actionEvent) {
        expressionx = expressionx +"+";
        Text1.setText(expressionx);
        netTocham=true;
    }

    public void Onminus(ActionEvent actionEvent) {
        expressionx = expressionx +"-";
        Text1.setText(expressionx);
        netTocham=true;
    }

    public void OnYm(ActionEvent actionEvent) {
        expressionx = expressionx +"*";
        Text1.setText(expressionx);
        netTocham=true;
    }

    public void On1(ActionEvent actionEvent) {
        expressionx = expressionx +"1";
        Text1.setText(expressionx);
    }

    public void On2(ActionEvent actionEvent) {
        expressionx = expressionx +"2";
        Text1.setText(expressionx);
    }

    public void On3(ActionEvent actionEvent) {
        expressionx = expressionx +"3";
        Text1.setText(expressionx);
    }

    public void On4(ActionEvent actionEvent) {
        expressionx = expressionx +"4";
        Text1.setText(expressionx);
    }

    public void On5(ActionEvent actionEvent) {
        expressionx = expressionx +"5";
        Text1.setText(expressionx);
    }

    public void On6(ActionEvent actionEvent) {
        expressionx = expressionx +"6";
        Text1.setText(expressionx);
    }

    public void On7(ActionEvent actionEvent) {
        expressionx = expressionx +"7";
        Text1.setText(expressionx);
    }

    public void On8(ActionEvent actionEvent) {
        expressionx = expressionx +"8";
        Text1.setText(expressionx);
    }

    public void On9(ActionEvent actionEvent) {
        expressionx = expressionx +"9";
        Text1.setText(expressionx);
    }

    public void On0(ActionEvent actionEvent) {
        expressionx = expressionx +"0";
        Text1.setText(expressionx);
    }

    public void OnDel(ActionEvent actionEvent) {
        expressionx = expressionx +"/";
        Text1.setText(expressionx);
        netTocham=true;
    }

    public void OnC(ActionEvent actionEvent) {
        expressionx ="";
        Text1.setText("");
        netTocham=true;
    }

    public void OnFloat(ActionEvent actionEvent) {
        if(netTocham) {
            expressionx = expressionx + ".";
            Text1.setText(expressionx);
            netTocham=false;
        }
    }

    public void OnOtvet(ActionEvent actionEvent) {
        Expression exp = new ExpressionBuilder(expressionx).build();
            try {
                double y = exp.evaluate();
                Text1.setText(String.valueOf(y));
            }catch (ArithmeticException  e){
                Text1.setText("Error");
            }
        expressionx ="";
        netTocham=true;
    }
}
