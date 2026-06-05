package qc;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.telephony.TelephonyManager;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a {
    public int a(AudioManager audioManager) {
        return 0;
    }

    public int c(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    public void b(Activity activity) {
    }
}
