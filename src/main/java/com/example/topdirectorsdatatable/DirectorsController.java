package com.example.topdirectorsdatatable;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.StringConverter;
import javafx.util.converter.IntegerStringConverter;
import javafx.util.converter.LongStringConverter;

import java.util.ArrayList;

public class DirectorsController {

    public TableView AllDirectorsView;
    public TableColumn rank;
    public TableColumn name;
    public TableColumn average;
    public TableColumn numberOfFilms;
    public TableColumn worldwideTotal;


    public void initialize() {
        //restoreOrReadData();
        Directors.readAllData();

        ArrayList<Moviemaker> temporaryList = (ArrayList<Moviemaker>) Moviemaker.getAllmoviemakers();

        ObservableList<Object> temporaryObservableList = FXCollections.observableArrayList(temporaryList);
        AllDirectorsView.setItems(temporaryObservableList);

        rank.setCellValueFactory(new PropertyValueFactory<>("rank"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        average.setCellValueFactory(new PropertyValueFactory<>("average"));
        numberOfFilms.setCellValueFactory(new PropertyValueFactory<>("numberOfFilms"));
        worldwideTotal.setCellValueFactory(new PropertyValueFactory<>("worldwideTotal"));

        rank.setCellFactory(TextFieldTableCell.forTableColumn());
        name.setCellFactory(TextFieldTableCell.forTableColumn());
        average.setCellFactory(TextFieldTableCell.forTableColumn());
        numberOfFilms.setCellFactory(TextFieldTableCell.forTableColumn());
        worldwideTotal.setCellFactory(TextFieldTableCell.forTableColumn());



        //public void restoreOrReadData() {

        //}

    }
}