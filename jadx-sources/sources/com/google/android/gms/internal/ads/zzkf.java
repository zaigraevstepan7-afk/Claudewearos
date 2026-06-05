package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzkf implements zzlg {
    private final Object zza;
    private zzbl zzb;

    public zzkf(Object obj, zzvc zzvcVar) {
        this.zza = obj;
        this.zzb = zzvcVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final zzbl zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final Object zzb() {
        return this.zza;
    }

    public final void zzc(zzbl zzblVar) {
        this.zzb = zzblVar;
    }
}
