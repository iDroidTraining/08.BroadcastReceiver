package ws.idroid.broadcastreceivers.receiver;

import android.content.*;
import android.widget.Toast;

public class BootReceiver extends BroadcastReceiver {
    @Deprecated
    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            Toast.makeText(context, "Device has been booted successfully!", Toast.LENGTH_LONG)
                    .show();
        }
    }
}
