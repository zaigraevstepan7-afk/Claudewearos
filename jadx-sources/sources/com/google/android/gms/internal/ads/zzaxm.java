package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaxm extends zzayi {
    private final long zzh;

    public zzaxm(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, long j, int i10, int i11) {
        super(zzawvVar, "bz3lIaHWpCquphICM8d57wBZcB7vA3QBLpLSSF22FzCVTv7HI8nqsTojeybBUatg", "nJy2u10FH1OsIt1ONuXNmQ7d3Q3+he826LogUVDBAds=", zzasrVar, i10, 25);
        this.zzh = j;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() {
        long jLongValue = ((Long) this.zze.invoke(null, null)).longValue();
        zzasr zzasrVar = this.zzd;
        synchronized (zzasrVar) {
            try {
                zzasrVar.zzr(jLongValue);
                long j = this.zzh;
                if (j != 0) {
                    zzasrVar.zzR(jLongValue - j);
                    zzasrVar.zzS(j);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
