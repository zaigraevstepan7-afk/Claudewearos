package com.google.android.gms.internal.ads;

import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbny implements zzcam {
    final /* synthetic */ zzboa zza;

    public zzbny(zzboa zzboaVar) {
        this.zza = zzboaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        l0.k("Releasing engine reference.");
        this.zza.zzb.zzd();
    }
}
