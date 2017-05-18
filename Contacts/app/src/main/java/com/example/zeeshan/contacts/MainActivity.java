package com.example.zeeshan.contacts;


import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

class ContactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        Button pickContact = (Button) findViewById(R.id.contact);

        pickContact.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {

                Intent i = new Intent(Intent.ACTION_INSERT_OR_EDIT);         //Activity Action: Pick an existing item, or insert a new item, and then edit it
                i.setType(ContactsContract.Contacts.CONTENT_ITEM_TYPE);

                startActivity(i);
            }
        });

    }
}