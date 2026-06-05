package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbrt implements tc.c {
    final /* synthetic */ zzbrb zza;
    final /* synthetic */ zzbpu zzb;

    public zzbrt(zzbsa zzbsaVar, zzbrb zzbrbVar, zzbpu zzbpuVar) {
        this.zza = zzbrbVar;
        this.zzb = zzbpuVar;
    }

    @Override // tc.c
    public final void onFailure(fc.a aVar) {
        try {
            this.zza.zzf(aVar.a());
        } catch (RemoteException e10) {
            k.e("", e10);
        }
    }

    public final /* synthetic */ Object onSuccess(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
        k.g("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.zza.zze("Adapter returned null.");
            return null;
        } catch (RemoteException e10) {
            k.e("", e10);
            return null;
        }
    }

    public final void onFailure(String str) {
        onFailure(new fc.a(0, str, "undefined", null));
    }
}
