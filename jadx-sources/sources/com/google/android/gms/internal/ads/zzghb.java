package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzghb {
    private zzghl zza = null;
    private zzgwt zzb = null;
    private Integer zzc = null;

    private zzghb() {
    }

    public final zzghb zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzghb zzb(zzgwt zzgwtVar) {
        this.zzb = zzgwtVar;
        return this;
    }

    public final zzghb zzc(zzghl zzghlVar) {
        this.zza = zzghlVar;
        return this;
    }

    public final zzghd zzd() throws GeneralSecurityException {
        zzgwt zzgwtVar;
        zzgws zzgwsVarZzb;
        zzghl zzghlVar = this.zza;
        if (zzghlVar == null || (zzgwtVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzghlVar.zzb() != zzgwtVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzghlVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzghj.zzc) {
            zzgwsVarZzb = zzgnn.zza;
        } else if (this.zza.zzd() == zzghj.zzb) {
            zzgwsVarZzb = zzgnn.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzghj.zza) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            zzgwsVarZzb = zzgnn.zzb(this.zzc.intValue());
        }
        return new zzghd(this.zza, this.zzb, zzgwsVarZzb, this.zzc, null);
    }

    public /* synthetic */ zzghb(zzghc zzghcVar) {
    }
}
