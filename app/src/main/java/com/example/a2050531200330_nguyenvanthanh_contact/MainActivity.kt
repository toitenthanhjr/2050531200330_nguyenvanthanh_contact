package com.example.a2050531200330_nguyenvanthanh_contact

import android.app.Activity
import android.content.ContentResolver
import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import androidx.core.app.ActivityCompat
import java.util.jar.Manifest

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    public void btnGetContactPressed(View v) {

    }
    private void getPhoneContacts(){
        if(contextCompat.checkSelfPermission(this,Manifest.permission.READ.CONTACT)
            !=packageManager.PERMISSION.GRANTED ){
            ActivityCompat.requestPermissions(this, new String[] {Minafest.permission_READ.CONTACT},0);
        }
        ContentResolver contentResolver= getContentResolver();
        Uri uri ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
        Cursor cursor contentResolver.query(uri, null,null,null,null);
        log.i(tag:"CONTACT_PROVIDER_DEMO", msg:"TOTAL # of Contacts ::: " + Interger.toString(cursor.getCount()));
        if(cursor.getCount()>0){
            while (cursor.moveToNext()){
                String contactName= curcor.getString(curcor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
                String contactNumber= curcor.getString(curcor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
                Log.i(tag: "CONTACT_PROVIDER_DEMO", msg:"Contact Name :::  " + contactName +"Ph #  :::  " + contactNumber )

            }
        }
    }
}