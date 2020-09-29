package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class ResultController {

    @FXML
    public Label lbDictOperator;

    @FXML
    public Label lbDictOperand;

    @FXML
    public Label lbCountOperator;

    @FXML
    public Label lbCountOperand;

    @FXML
    public Label lbDictProgram;

    @FXML
    public Label ldProgramLength;

    @FXML
    public Label lbProgramVolume;

    @FXML
    public TextArea txarPairs;

    @FXML
    public Button btnExit;

    public void initialize(){
        String s = "Suck!";
        lbDictOperator.setText(s);
        lbDictOperand.setText(s);
        lbCountOperand.setText(s);
        txarPairs.appendText(s);
    }


}
