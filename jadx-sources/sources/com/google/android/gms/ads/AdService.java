package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbth;
import nc.f;
import nc.p;
import nc.s;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        try {
            p pVar = s.f12202f.f12204b;
            zzbpk zzbpkVar = new zzbpk();
            pVar.getClass();
            ((zzbth) new f(this, zzbpkVar).d(this, false)).zze(intent);
        } catch (RemoteException e10) {
            k.d("RemoteException calling handleNotificationIntent: ".concat(e10.toString()));
        }
    }
}
