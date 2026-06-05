package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import rc.k;
import wc.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbsv implements j {
    private final zzbhh zza;

    public zzbsv(zzbhh zzbhhVar) {
        this.zza = zzbhhVar;
        try {
            zzbhhVar.zzm();
        } catch (RemoteException e10) {
            k.e("", e10);
        }
    }

    public final void setView(View view) {
        try {
            this.zza.zzp(new xd.b(view));
        } catch (RemoteException e10) {
            k.e("", e10);
        }
    }

    public final boolean start() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e10) {
            k.e("", e10);
            return false;
        }
    }
}
