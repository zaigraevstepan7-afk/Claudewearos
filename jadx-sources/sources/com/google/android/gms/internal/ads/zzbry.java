package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbry implements vc.b {
    final /* synthetic */ zzbrq zza;

    public zzbry(zzbsa zzbsaVar, zzbrq zzbrqVar) {
        this.zza = zzbrqVar;
    }

    public final void onFailure(fc.a aVar) {
        try {
            this.zza.zzg(aVar.a());
        } catch (RemoteException e10) {
            k.e("", e10);
        }
    }

    public final void onSuccess(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e10) {
            k.e("", e10);
        }
    }

    public final void onFailure(String str) {
        try {
            this.zza.zzf(str);
        } catch (RemoteException e10) {
            k.e("", e10);
        }
    }
}
