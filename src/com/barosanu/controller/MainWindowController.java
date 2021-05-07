
package com.barosanu.controller;

import com.barosanu.EmailManager;
import com.barosanu.view.ViewFactory;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeView;
import javafx.scene.web.WebView;


public class MainWindowController extends BaseController{
    public MainWindowController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
		super(emailManager, viewFactory, fxmlName);
		// TODO Auto-generated constructor stub
	}

	@FXML
    private TableView<?> emailsTableView;

    @FXML
    private WebView emailWebView;

    @FXML
    private TreeView<?> emailsTreeView;

    @FXML
    void optionsAction() {

    }

}
