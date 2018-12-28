package com.soft1841.controller;

import cn.hutool.db.Entity;
import com.mysql.fabric.xmlrpc.base.Param;
import com.soft1841.dao.CashierDAO;
import com.soft1841.entity.Cashier;
import com.soft1841.utils.ComponentUtil;
import com.soft1841.utils.DAOFactory;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

public class CashiersController implements Initializable {
    //布局文件中的表格视图对象，用来显示数据库中读取的所有收银员信息
    @FXML
    private TableView<Cashier> cashierTable;
    private ObservableList<Cashier> cashierData;
    List<Entity> cashierList = null;
    private CashierDAO cashierDAO = DAOFactory.getCashierDAOInstance();
    private ObservableList<Cashier> cashiersData = FXCollections.observableArrayList();
    private TableColumn<Cashier,Cashier> delCol = new TableColumn<>("操作");


    @Override
    public void initialize(URL location, ResourceBundle resources) {
     //   initTable();
    }

    private void initTable() {
       // cashierTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        try {
            cashierList = cashierDAO.selectAllCashiers();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        showCashierData(cashierList);
        //删除列的相关设置
        delCol.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue()));
        delCol.setCellFactory(param -> new TableCell<Cashier,Cashier>() {
            private final  Button deleteButton = ComponentUtil.getButton("删除","blue-word");
            @Override
            protected void updateItem(Cashier cashier,boolean empty) {
                super.updateItem(cashier,empty);
                if (cashier == null) {
                    setGraphic(null);
                    return;
                }
                setGraphic(deleteButton);

                deleteButton.setOnAction(event -> {
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("确认对话框");
                    alert.setHeaderText("请确认");
                    alert.setContentText("确认要删除这行记录吗？");
                    Optional<ButtonType> result = alert.showAndWait();
                    if (result.get() == ButtonType.OK) {
                        cashierData.remove(cashier);
                        cashierDAO.deleteCashierById(cashier.getId());
                    }
                } );
            }
        });
        cashierTable.getColumns().add(delCol);
    }

    private void showCashierData(List<Entity> cashierList) {
        for (Entity entity : cashierList) {
            Cashier cashier = new Cashier();
            cashier.setId(entity.getInt("id"));
            cashier.setName(entity.getStr("name"));
            cashier.setNumber(entity.getStr("number"));
            cashier.setPassword(entity.getStr("password"));
            cashierData.add(cashier);
        }
        cashierTable.setItems(cashierData);
    }

    //弹出新增收银员界面方法
    public void newcashierStage() throws Exception {
        Stage addCashierStage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/add_cashier.fxml"));
        AnchorPane root = fxmlLoader.load();
        Scene scene = new Scene(root);
        AddCashierController addCashierController = fxmlLoader.getController();
        addCashierController.setCashierData(cashierData);
        addCashierController.setTitle("新增收银员界面");
        addCashierStage.setResizable(false);
        addCashierStage.setScene(scene);
        addCashierStage.show();
    }


    public ObservableList<Cashier> getCashierData() {
        return cashierData;
    }

    public void setCashierData(ObservableList<Cashier> cashierData) {
        this.cashierData = cashierData;
    }
}

