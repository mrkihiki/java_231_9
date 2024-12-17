package org.example.java_231_9;

import javafx.event.ActionEvent;
import javafx.scene.control.RadioButton;
import javafx.scene.text.Text;

public class Controller5 {
    public RadioButton RadB11;
    public RadioButton RadB21;
    public RadioButton RadB31;
    public RadioButton RadB12;
    public RadioButton RadB22;
    public RadioButton RadB32;
    public RadioButton RadB13;
    public RadioButton RadB23;
    public RadioButton RadB33;
    public Text Text1;

    public void RadB11(ActionEvent actionEvent) {
        if(RadB11.isSelected()){
            RadB21.setSelected(false);
            RadB31.setSelected(false);
        }
    }

    public void RadB21(ActionEvent actionEvent) {
        if(RadB21.isSelected()){
            RadB11.setSelected(false);
            RadB31.setSelected(false);
        }
    }

    public void RadB31(ActionEvent actionEvent) {
        if(RadB31.isSelected()){
            RadB21.setSelected(false);
            RadB11.setSelected(false);
        }
    }

    public void RadB12(ActionEvent actionEvent) {
        if(RadB12.isSelected()){
            RadB22.setSelected(false);
            RadB32.setSelected(false);
        }
    }

    public void RadB22(ActionEvent actionEvent) {
        if(RadB22.isSelected()){
            RadB12.setSelected(false);
            RadB32.setSelected(false);
        }
    }

    public void RadB32(ActionEvent actionEvent) {
        if(RadB32.isSelected()){
            RadB22.setSelected(false);
            RadB12.setSelected(false);
        }
    }

    public void RadB13(ActionEvent actionEvent) {
        if(RadB13.isSelected()){
            RadB23.setSelected(false);
            RadB33.setSelected(false);
        }
    }

    public void RadB23(ActionEvent actionEvent) {
        if(RadB23.isSelected()){
            RadB13.setSelected(false);
            RadB33.setSelected(false);
        }
    }

    public void RadB33(ActionEvent actionEvent) {
        if(RadB33.isSelected()){
            RadB23.setSelected(false);
            RadB13.setSelected(false);
        }
    }

    public void PrintFlag(ActionEvent actionEvent) {
        String x="";
        if(RadB11.isSelected()){x=RadB11.getText();}
        else if(RadB21.isSelected()){x=RadB21.getText();}
        else if(RadB31.isSelected()){x=RadB31.getText();}
        if(RadB12.isSelected()){x=x+"; "+RadB12.getText();}
        else if(RadB22.isSelected()){x=x+"; "+RadB22.getText();}
        else if(RadB32.isSelected()){x=x+"; "+RadB32.getText();}
        if(RadB13.isSelected()){x=x+"; "+RadB13.getText();}
        else if(RadB23.isSelected()){x=x+"; "+RadB23.getText();}
        else if(RadB33.isSelected()){x=x+"; "+RadB33.getText();}
        Text1.setText(x);
    }
}
