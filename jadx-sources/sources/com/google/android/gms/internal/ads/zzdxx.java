package com.google.android.gms.internal.ads;

import android.content.Context;
import qc.q;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzdxx implements zzgcx {
    final /* synthetic */ Context zza;

    public zzdxx(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th2) {
        if (((Boolean) zzbeu.zzh.zze()).booleanValue() && (th2 instanceof q)) {
            zzbcm.zze(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        if (((Boolean) zzbeu.zzj.zze()).booleanValue()) {
            zzbcm.zze(this.zza);
        }
    }
}
