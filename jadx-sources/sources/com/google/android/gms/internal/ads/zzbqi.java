package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbqi implements tc.b {
    final /* synthetic */ zzbmf zza;

    public zzbqi(zzbqp zzbqpVar, zzbmf zzbmfVar) {
        this.zza = zzbmfVar;
    }

    public final void onInitializationFailed(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e10) {
            k.e("", e10);
        }
    }

    public final void onInitializationSucceeded() {
        try {
            this.zza.zzf();
        } catch (RemoteException e10) {
            k.e("", e10);
        }
    }
}
