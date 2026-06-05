package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaxz extends zzayi {
    private final boolean zzh;

    public zzaxz(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i10, int i11) {
        super(zzawvVar, "jIv42z2v6FXxayFh75bTXtsxRSsCK/ciQjkFKmgks8cLq7HP+HDebRZyGvyOBC97", "2wHbvH170oRSgA6rj2BMxMfMsZs+WbUtizDquheRwWE=", zzasrVar, i10, 61);
        this.zzh = zzawvVar.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() {
        long jLongValue = ((Long) this.zze.invoke(null, this.zza.zzb(), Boolean.valueOf(this.zzh))).longValue();
        zzasr zzasrVar = this.zzd;
        synchronized (zzasrVar) {
            zzasrVar.zzC(jLongValue);
        }
    }
}
