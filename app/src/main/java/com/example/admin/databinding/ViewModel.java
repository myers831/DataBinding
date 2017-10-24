package com.example.admin.databinding;

import android.util.Log;
import android.view.View;

/**
 * Created by Admin on 10/24/2017.
 */

public class ViewModel {

    private static final String TAG ="viewModelTag" ;

    public void printPerson(View view, Person person){
        Log.d(TAG, "printPerson: " + person.toString());
    }

    public void printPersonObs(View view, Person person){
        Log.d(TAG, "printPersonObs: " + person.getFirstNameObs().get() + " " + person.getLastNameObs().get() );
    }
}
