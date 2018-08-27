package ws.idroid.broadcastreceivers;

import android.content.*;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import ws.idroid.broadcastreceivers.receiver.MyBroadcastReceiver;

public class BroadcastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad_cast);
        Button btnSend = findViewById(R.id.btn_send);
        btnSend.setOnClickListener(view -> {
            Intent i = new Intent();
            i.setAction("com.example.Broadcast");
            i.putExtra("name", "Android Course Broadcast");
            sendBroadcast(i);
        });

        //Define the Receiver
        IntentFilter filter = new IntentFilter("com.example.Broadcast");
        MyBroadcastReceiver receiver = new MyBroadcastReceiver();
        registerReceiver(receiver, filter);
        //unregisterReceiver(receiver);
    }

}
