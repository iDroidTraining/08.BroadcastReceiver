package ws.idroid.broadcastreceivers.receiver;

import android.content.*;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        // Implement code here to be performed when
        // broadcast is detected
        String name = intent.getStringExtra("name");
        Toast.makeText(context, name, Toast.LENGTH_LONG).show();
    }
}
