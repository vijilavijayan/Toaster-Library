package com.example.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Vijila P
 * Zerone Consulting Pvt Ltd
 * on 2/17/2021.
 * Modified on 2/17/2021
 */
public class ToasterMessage {

    public static void s(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
