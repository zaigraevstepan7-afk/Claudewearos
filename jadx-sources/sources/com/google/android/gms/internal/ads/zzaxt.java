package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaxt extends zzayi {
    private final zzavy zzh;
    private final long zzi;
    private final long zzj;

    public zzaxt(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i10, int i11, zzavy zzavyVar, long j, long j4) {
        super(zzawvVar, "Q2alXHIIp2vvtZN4ZNw4W3dXvS5FZxkSx8F3noC2XP6gq0/XB0ulYQV32h8ZSW0i", "bHzouddPHTqhUNsOeni/FRK++KVVMe5yU+yUqilZ/gg=", zzasrVar, i10, 11);
        this.zzh = zzavyVar;
        this.zzi = j;
        this.zzj = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() {
        zzavy zzavyVar = this.zzh;
        if (zzavyVar != null) {
            zzavw zzavwVar = new zzavw((String) this.zze.invoke(null, zzavyVar.zzb(), Long.valueOf(this.zzi), Long.valueOf(this.zzj)));
            zzasr zzasrVar = this.zzd;
            synchronized (zzasrVar) {
                try {
                    zzasrVar.zzx(zzavwVar.zza.longValue());
                    if (zzavwVar.zzb.longValue() >= 0) {
                        zzasrVar.zzO(zzavwVar.zzb.longValue());
                    }
                    if (zzavwVar.zzc.longValue() >= 0) {
                        zzasrVar.zzf(zzavwVar.zzc.longValue());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
