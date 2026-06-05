package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbhi {
    private final zzbhh zza;

    public zzbhi(zzbhh zzbhhVar) {
        Context context;
        this.zza = zzbhhVar;
        try {
            context = (Context) xd.b.u(zzbhhVar.zzh());
        } catch (RemoteException | NullPointerException e10) {
            k.e("", e10);
            context = null;
        }
        if (context != null) {
            try {
                this.zza.zzs(new xd.b(new ic.b(context)));
            } catch (RemoteException e11) {
                k.e("", e11);
            }
        }
    }

    public final zzbhh zza() {
        return this.zza;
    }

    public final String zzb() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e10) {
            k.e("", e10);
            return null;
        }
    }
}
