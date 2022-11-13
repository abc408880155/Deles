package com.example.deles;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import java.io.File;

public class Controller {
    @FXML
    private Button buttonReg;

    @FXML
    private Button buttonTarget;

    @FXML
    private Label labelInfo;

    @FXML
    private Label labelReg;

    @FXML
    private Label labelTarget;

    @FXML
    private TextField textReg;

    @FXML
    private TextArea textResult;

    @FXML
    private TextField textTarget;

    @FXML
    void actionQuit(ActionEvent event) {

    }

    @FXML
    void actionAbout(ActionEvent event) {

    }

    @FXML
    void actionReg(ActionEvent event) {
        if ((textReg.getText().equals("") || textTarget.getText().equals(""))) {    //路径文本框和字符文本框是否为空
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);  //弹出警告提示
            alert.setTitle("警告");
            alert.setHeaderText(null);
            alert.setContentText("目标文件夹或匹配字符不能为空!");
            alert.show();
        } else {
            String s = Dele.deleteFile(new File(textTarget.getText()), textReg.getText());
            textResult.setText(s);  //将选择的文件夹的绝对路径显示在文本框中
        }
    }

    @FXML
    void actionTarget(ActionEvent event) {
        DirectoryChooser dirChooser = new DirectoryChooser(); //创建文件选择对话框
        File file = dirChooser.showDialog(null);
        if(file!= null) {   //排除用户在文件选择对话框里没有选择任何文件
            textTarget.setText(file.getAbsolutePath());
        }
    }
}