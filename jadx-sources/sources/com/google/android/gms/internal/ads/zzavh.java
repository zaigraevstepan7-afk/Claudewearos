package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzavh implements zzfpa {
    final /* synthetic */ zzfnz zza;

    public zzavh(zzfnz zzfnzVar) {
        this.zza = zzfnzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpa
    public final void zza(int i10, long j) {
        this.zza.zzd(i10, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfpa
    public final void zzb(int i10, long j, String str) {
        this.zza.zze(i10, System.currentTimeMillis() - j, str);
    }
}
