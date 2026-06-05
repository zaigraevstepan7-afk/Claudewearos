package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzbv {
    private final zzvc zza = null;
    private final zzci zzb;

    private zzbv(zzci zzciVar) {
        this.zzb = zzciVar;
    }

    public static zzbv zza(zzci zzciVar) {
        return new zzbv(zzciVar);
    }

    public final zzvc zza() {
        zzci zzciVar = this.zzb;
        return zzciVar instanceof zznc ? ((zznc) zzciVar).zzb().zza() : ((zzot) zzns.zza().zza((zzns) this.zzb, zzot.class)).zza();
    }
}
