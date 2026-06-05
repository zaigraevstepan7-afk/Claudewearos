package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgmr extends zzgen {
    private final zzgol zza;
    private final zzgws zzb;

    public zzgmr(zzgol zzgolVar, zzgfb zzgfbVar) throws GeneralSecurityException {
        zzgws zzgwsVarZza;
        zze(zzgolVar, zzgfbVar);
        this.zza = zzgolVar;
        if (zzgolVar.zzc().equals(zzgut.RAW)) {
            zzgwsVarZza = zzgws.zzb(new byte[0]);
        } else if (zzgolVar.zzc().equals(zzgut.TINK)) {
            zzgwsVarZza = zzgnn.zzb(zzgolVar.zzf().intValue());
        } else {
            if (!zzgolVar.zzc().equals(zzgut.LEGACY) && !zzgolVar.zzc().equals(zzgut.CRUNCHY)) {
                throw new GeneralSecurityException("Unknown output prefix type");
            }
            zzgwsVarZza = zzgnn.zza(zzgolVar.zzf().intValue());
        }
        this.zzb = zzgwsVarZza;
    }

    private static void zze(zzgol zzgolVar, zzgfb zzgfbVar) {
        int i10 = zzgmo.zzb[zzgolVar.zzb().ordinal()];
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    public final zzgfa zza() {
        zzgol zzgolVar = this.zza;
        return new zzgmp(zzgolVar.zzg(), zzgolVar.zzc(), null);
    }

    public final zzgol zzb(zzgfb zzgfbVar) {
        zzgol zzgolVar = this.zza;
        zze(zzgolVar, zzgfbVar);
        return zzgolVar;
    }

    public final zzgws zzc() {
        return this.zzb;
    }

    public final Integer zzd() {
        return this.zza.zzf();
    }
}
