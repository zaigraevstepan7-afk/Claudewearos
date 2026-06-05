package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbth;
import nc.f;
import nc.p;
import nc.s;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class NotificationHandlerActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            p pVar = s.f12202f.f12204b;
            zzbpk zzbpkVar = new zzbpk();
            pVar.getClass();
            zzbth zzbthVar = (zzbth) new f(this, zzbpkVar).d(this, false);
            if (zzbthVar == null) {
                k.d("OfflineUtils is null");
            } else {
                zzbthVar.zze(getIntent());
            }
        } catch (RemoteException e10) {
            k.d("RemoteException calling handleNotificationIntent: ".concat(e10.toString()));
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
