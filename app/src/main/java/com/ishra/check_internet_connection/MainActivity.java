package com.ishra.check_internet_connection;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonAction(View view){
        ConnectivityManager cm= (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo[]=cm.getAllNetworkInfo();
        int i;
        for(i=0;i<networkInfo.length;++i){
            if(networkInfo[i].getState()==NetworkInfo.State.CONNECTED){
                Toast.makeText(getApplicationContext(),"Internet connected",Toast.LENGTH_SHORT).show();
            break;
            }
        }
        if(i==networkInfo.length){
            Toast.makeText(getApplicationContext(),"Internet not connected,pls connect with internet",Toast.LENGTH_SHORT).show();
        }
    }
}
