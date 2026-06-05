package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaxs extends zzayi {
    private final zzawn zzh;

    public zzaxs(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i10, int i11, zzawn zzawnVar) {
        super(zzawvVar, "LLos9e8Ql/sv7oIXEM/FCVf2w4qxksYVSJjnFOiKAZfJ/fOB+3TAGyZw1OkiJRsU", "lmzfMnrRinUoapvwdylnImZxEAh1S0BzbHZ4/bdyts0=", zzasrVar, i10, 94);
        this.zzh = zzawnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() {
        int iIntValue = ((Integer) this.zze.invoke(null, this.zzh.zza())).intValue();
        zzasr zzasrVar = this.zzd;
        synchronized (zzasrVar) {
            zzasrVar.zzab(zzatd.zza(iIntValue));
        }
    }
}
