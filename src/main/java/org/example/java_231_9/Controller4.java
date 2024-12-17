package org.example.java_231_9;

import javafx.event.ActionEvent;
import javafx.scene.text.Text;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;


public class Controller4 {
    public String x="";
    public Text Text1;

    public void Onpls(ActionEvent actionEvent) {
        x=x+"+";
        Text1.setText(x);
    }

    public void Onminus(ActionEvent actionEvent) {
        x=x+"-";
        Text1.setText(x);
    }

    public void OnYm(ActionEvent actionEvent) {
        x=x+"*";
        Text1.setText(x);
    }

    public void On1(ActionEvent actionEvent) {
        x=x+"1";
        Text1.setText(x);
    }

    public void On2(ActionEvent actionEvent) {
        x=x+"2";
        Text1.setText(x);
    }

    public void On3(ActionEvent actionEvent) {
        x=x+"3";
        Text1.setText(x);
    }

    public void On4(ActionEvent actionEvent) {
        x=x+"4";
        Text1.setText(x);
    }

    public void On5(ActionEvent actionEvent) {
        x=x+"5";
        Text1.setText(x);
    }

    public void On6(ActionEvent actionEvent) {
        x=x+"6";
        Text1.setText(x);
    }

    public void On7(ActionEvent actionEvent) {
        x=x+"7";
        Text1.setText(x);
    }

    public void On8(ActionEvent actionEvent) {
        x=x+"8";
        Text1.setText(x);
    }

    public void On9(ActionEvent actionEvent) {
        x=x+"9";
        Text1.setText(x);
    }

    public void On0(ActionEvent actionEvent) {
        x=x+"0";
        Text1.setText(x);
    }

    public void OnDel(ActionEvent actionEvent) {
        x=x+"/";
        Text1.setText(x);
    }

    public void OnC(ActionEvent actionEvent) {
        x=null;
        Text1.setText("");
    }

    public void OnFloat(ActionEvent actionEvent) {
        x=x+".";
        Text1.setText(x);
    }

    public void OnOtvet(ActionEvent actionEvent) {
        Expression exp = new ExpressionBuilder(x).build();
            try {
                double y = exp.evaluate();
                Text1.setText(String.valueOf(y));
            }catch (ArithmeticException  e){
                Text1.setText("Error");
            }
        x=null;
    }
}
