package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.e0;
import nc.v2;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class MobileAds {
    private static void setPlugin(String str) {
        v2 v2VarC = v2.c();
        synchronized (v2VarC.f12253e) {
            e0.k("MobileAds.initialize() must be called prior to setting the plugin.", v2VarC.f12254f != null);
            try {
                v2VarC.f12254f.zzt(str);
            } catch (RemoteException e10) {
                k.e("Unable to set plugin.", e10);
            }
        }
    }
}
