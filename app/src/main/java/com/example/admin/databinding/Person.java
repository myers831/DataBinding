package com.example.admin.databinding;

import android.databinding.ObservableField;
import android.text.Editable;
import android.text.TextWatcher;

import java.util.Observable;

import static android.R.attr.editable;

/**
 * Created by Admin on 10/24/2017.
 */

public class Person {
    String FirstName, LastName;

    ObservableField<String> firstNameObs = new ObservableField<>();
    ObservableField<String> lastNameObs = new ObservableField<>();

    public TextWatcher watcherFName = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            firstNameObs.set(s.toString());
        }
    };

    public TextWatcher watcherLName = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            lastNameObs.set(s.toString());
        }
    };

    public Person(String firstName, String lastName) {
        this.FirstName = firstName;
        this.LastName = lastName;
    }

    public ObservableField<String> getFirstNameObs() {
        return firstNameObs;
    }

    public void setFirstNameObs(ObservableField<String> firstNameObs) {
        this.firstNameObs = firstNameObs;
    }

    public ObservableField<String> getLastNameObs() {
        return lastNameObs;
    }

    public void setLastNameObs(ObservableField<String> lastNameObs) {
        this.lastNameObs = lastNameObs;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}
