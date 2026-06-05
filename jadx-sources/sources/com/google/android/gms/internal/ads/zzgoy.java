package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgoy {
    private zzgpi zza = null;
    private zzgwt zzb = null;
    private Integer zzc = null;

    private zzgoy() {
    }

    public final zzgoy zza(zzgwt zzgwtVar) {
        this.zzb = zzgwtVar;
        return this;
    }

    public final zzgoy zzb(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgoy zzc(zzgpi zzgpiVar) {
        this.zza = zzgpiVar;
        return this;
    }

    public final zzgpa zzd() throws GeneralSecurityException {
        zzgwt zzgwtVar;
        zzgws zzgwsVarZza;
        zzgpi zzgpiVar = this.zza;
        if (zzgpiVar == null || (zzgwtVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgpiVar.zzc() != zzgwtVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgpiVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzgpg.zzd) {
            zzgwsVarZza = zzgnn.zza;
        } else if (this.zza.zzf() == zzgpg.zzc || this.zza.zzf() == zzgpg.zzb) {
            zzgwsVarZza = zzgnn.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzgpg.zza) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
            }
            zzgwsVarZza = zzgnn.zzb(this.zzc.intValue());
        }
        return new zzgpa(this.zza, this.zzb, zzgwsVarZza, this.zzc, null);
    }

    public /* synthetic */ zzgoy(zzgoz zzgozVar) {
    }
}
