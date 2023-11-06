package md.programy.controllers;

import com.mysql.cj.conf.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

public class MainWindowController {

    public TableView tabelka;
    public TableColumn kolumnaKod;
    public TableColumn<Person,String> kolumnaDane;
    public TableColumn<Person,Person> kolumnaPrzycisk;
    ObservableList<Person> lista;

    public MainWindowController() {
        lista = FXCollections.observableArrayList(new Person(1,"Marcin Dobek"),new Person(2,"Aleksandra Dobek"));
    }

    public void initialize(){
        kolumnaKod.setCellValueFactory(new PropertyValueFactory<Person,Integer>("kod"));
        kolumnaDane.setCellValueFactory(cellDataFeatures -> cellDataFeatures.getValue().daneProperty());
        kolumnaPrzycisk.setCellValueFactory(personButtonCellDataFeatures -> new SimpleObjectProperty<>(personButtonCellDataFeatures.getValue()));
        kolumnaPrzycisk.setCellFactory(personPersonTableColumn -> new TableCell<Person,Person>(){
            DatePicker przycisk = new DatePicker();
            @Override
            protected void updateItem(Person person, boolean b) {
                super.updateItem(person, b);
                if(b==false){
                    setGraphic(przycisk);
                }else{
                    setGraphic(null);
                }
            }
        });
        tabelka.setItems(lista);
     //   tabelka.getSelectionModel().setCellSelectionEnabled(true);

    }


}
