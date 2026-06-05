package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaxk extends zzayi {
    public zzaxk(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i10, int i11) {
        super(zzawvVar, "ptULCqFpkxWHwh0HVZoMpk0Xr91rKWbEROvrSrbrHF8bfcD+J1G9qxssmqT2HcO0", "gABvx04l+Prrr7UIzRlxJTdbXEyGkYLmeTdDcw+INuA=", zzasrVar, i10, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() {
        zzasr zzasrVar = this.zzd;
        zzasrVar.zzm(-1L);
        zzasrVar.zzl(-1L);
        int[] iArr = (int[]) this.zze.invoke(null, this.zza.zzb());
        synchronized (zzasrVar) {
            try {
                zzasrVar.zzm(iArr[0]);
                zzasrVar.zzl(iArr[1]);
                int i10 = iArr[2];
                if (i10 != Integer.MIN_VALUE) {
                    zzasrVar.zzk(i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
