package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzky {
    private long zza;
    private float zzb;
    private long zzc;

    public zzky() {
        this.zza = -9223372036854775807L;
        this.zzb = -3.4028235E38f;
        this.zzc = -9223372036854775807L;
    }

    public final zzky zzd(long j) {
        boolean z2 = true;
        if (j < 0) {
            if (j == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                z2 = false;
            }
        }
        zzdd.zzd(z2);
        this.zzc = j;
        return this;
    }

    public final zzky zze(long j) {
        this.zza = j;
        return this;
    }

    public final zzky zzf(float f10) {
        boolean z2 = true;
        if (f10 <= 0.0f && f10 != -3.4028235E38f) {
            z2 = false;
        }
        zzdd.zzd(z2);
        this.zzb = f10;
        return this;
    }

    public final zzla zzg() {
        return new zzla(this, null);
    }

    public /* synthetic */ zzky(zzla zzlaVar, zzkz zzkzVar) {
        this.zza = zzlaVar.zza;
        this.zzb = zzlaVar.zzb;
        this.zzc = zzlaVar.zzc;
    }
}
