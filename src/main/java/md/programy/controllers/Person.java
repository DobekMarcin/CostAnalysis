package md.programy.controllers;

import com.mysql.cj.conf.IntegerProperty;
import com.mysql.cj.conf.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Person {

    private SimpleIntegerProperty kod = new SimpleIntegerProperty();
    private SimpleStringProperty dane = new SimpleStringProperty();


    public Person(SimpleIntegerProperty kod, SimpleStringProperty dane) {
        this.kod = kod;
        this.dane = dane;
    }
    public Person(Integer kod,String dane){
        this.kod.set(kod);
        this.dane.set(dane);
    }

    public Person() {

    }

    public int getKod() {
        return kod.get();
    }

    public SimpleIntegerProperty kodProperty() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod.set(kod);
    }

    public String getDane() {
        return dane.get();
    }

    public SimpleStringProperty daneProperty() {
        return dane;
    }

    public void setDane(String dane) {
        this.dane.set(dane);
    }
}
