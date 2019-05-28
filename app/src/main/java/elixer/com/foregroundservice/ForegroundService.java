package elixer.com.foregroundservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class ForegroundService extends Service {
 
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
