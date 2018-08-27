package ws.idroid.broadcastreceivers.receiver;

import android.content.*;
import android.widget.Toast;

public class BootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
            Toast.makeText(context, "Device has been booted successfully!", Toast.LENGTH_LONG)
                    .show();

    }
}
