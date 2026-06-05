package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzot implements zzox {
    private final zzxv zza;
    private final zzvc zzb;

    private zzot(zzvc zzvcVar, zzxv zzxvVar) {
        this.zzb = zzvcVar;
        this.zza = zzxvVar;
    }

    public static zzot zza(zzvc zzvcVar) {
        return new zzot(zzvcVar, zzph.zza(zzvcVar.zzf()));
    }

    public static zzot zzb(zzvc zzvcVar) {
        return new zzot(zzvcVar, zzph.zzb(zzvcVar.zzf()));
    }

    public final zzvc zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzox
    public final zzxv zzb() {
        return this.zza;
    }
}
