package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzegc implements zzgcx {
    final /* synthetic */ zzfbt zza;
    final /* synthetic */ zzegd zzb;

    public zzegc(zzegd zzegdVar, zzfbt zzfbtVar) {
        this.zza = zzfbtVar;
        this.zzb = zzegdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th2) {
        zzegd zzegdVar = this.zzb;
        synchronized (zzegdVar) {
            try {
                zzege zzegeVar = zzegdVar.zzh;
                zzfbt zzfbtVar = this.zza;
                zzegeVar.zzb(th2, zzfbtVar);
                zzfbt zzfbtVarZza = zzegdVar.zzh.zza();
                if (zzfbtVar.zzav) {
                    while (zzfbtVarZza != null) {
                        zzegdVar.zze(zzfbtVarZza);
                        zzfbtVarZza = zzegdVar.zzh.zza();
                    }
                } else if (zzfbtVarZza != null) {
                    zzegdVar.zze(zzfbtVarZza);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzegd zzegdVar = this.zzb;
        zzegu zzeguVar = (zzegu) obj;
        synchronized (zzegdVar) {
            try {
                zzegdVar.zzh.zzc(zzeguVar, this.zza);
                zzfbt zzfbtVarZza = zzegdVar.zzh.zza();
                if (zzfbtVarZza != null) {
                    zzegdVar.zze(zzfbtVarZza);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
