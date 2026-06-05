package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfpx {
    final /* synthetic */ zzfpz zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzfpx(zzfpz zzfpzVar, byte[] bArr, zzfpy zzfpyVar) {
        this.zza = zzfpzVar;
        this.zzb = bArr;
    }

    public final zzfpx zza(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzfpx zzb(int i10) {
        this.zzc = i10;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzfpz zzfpzVar = this.zza;
            if (zzfpzVar.zzb) {
                zzfqc zzfqcVar = zzfpzVar.zza;
                zzfqcVar.zzj(this.zzb);
                zzfqcVar.zzi(this.zzc);
                zzfqcVar.zzg(this.zzd);
                zzfqcVar.zzh(null);
                zzfqcVar.zzf();
            }
        } catch (RemoteException e10) {
            Log.d("GASS", "Clearcut log failed", e10);
        }
    }
}
