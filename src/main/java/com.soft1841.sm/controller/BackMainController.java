package com.soft1841.sm.controller;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import java.net.URL;
import java.util.ResourceBundle;
public class BackMainController implements Initializable {
    @FXML
    private StackPane mainContainer;
    public void initialize (URL location, ResourceBundle resources) {
        }
    //显示默认主页数据
    public void listbackmain() throws Exception {
        switchView("backmain.fxml");
    }
    //显示图书类别数据
    public void listType() throws Exception {
        switchView("type.fxml");
    }
    //显示图书数据
    public void listBook() throws Exception {
        switchView("book.fxml");
    }
    public  void  listReader()throws Exception{
        switchView("reader.fxml");
    }
    public  void  Admin()throws Exception{
        switchView("admin.fxml");
    }

    public  void  listBookAnalysis()throws Exception{
        switchView("book_analysis.fxml");
    }
    public  void  listViewBook()throws Exception{
        switchView("view_book.fxml");
    }
    public  void  Analysis()throws Exception{
        switchView("reader_analysis.fxml");
    }
    //封装一个切换视图的方法：用来根据fxml文件切换视图内容
    private void switchView(String fileName) throws Exception {
        //清除主面板之前内容
        ObservableList<Node> list = mainContainer.getChildren();
        mainContainer.getChildren().removeAll(list);
        //读取新的布局文件加入主面板
        AnchorPane anchorPane = new FXMLLoader(getClass().getResource("/fxml/" + fileName)).load();
        mainContainer.getChildren().add(anchorPane);

    }
    }
