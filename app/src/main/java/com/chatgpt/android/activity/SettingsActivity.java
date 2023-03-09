package com.chatgpt.android.activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.chatgpt.android.R;

public class SettingsActivity extends AppCompatActivity {

TextView restorePurchases_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        restorePurchases_text=findViewById(R.id.restorePurchases_text);
        restorePurchases_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlert(SettingsActivity.this,"Purchases Restored","Your Purchases were restored");

            }
        });
    }
        public static void showAlert(Context context,String title,String message) {
            try {
                new AlertDialog.Builder(context)
                        .setTitle(title)
                        .setMessage(message)
                        .setPositiveButton("Complete", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        // Specifying a listener allows you to take an action before dismissing the dialog.
                        // The dialog is automatically dismissed when a dialog button is clicked.
//                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog, int which) {
//                                // Continue with delete operation
//                            }
//                        })
                        // A null listener allows the button to dismiss the dialog and take no further action.
                       // .setIcon(android.R.drawable.ic_dialog_alert)

            }catch (Exception e){}


    }
}