package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzkn implements zzbs {
    private final zzoo<zzbs> zza;
    private final zzro zzb;

    public zzkn(zzoo<zzbs> zzooVar) {
        this.zza = zzooVar;
        if (zzooVar.zzf()) {
            this.zzb = zznl.zza().zzb().zza(zzne.zza(zzooVar), "hybrid_encrypt", "encrypt");
        } else {
            this.zzb = zzne.zza;
        }
    }
}
