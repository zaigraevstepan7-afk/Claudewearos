package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgfu {
    private zzggf zza = null;
    private zzgwt zzb = null;
    private zzgwt zzc = null;
    private Integer zzd = null;

    private zzgfu() {
    }

    public final zzgfu zza(zzgwt zzgwtVar) {
        this.zzb = zzgwtVar;
        return this;
    }

    public final zzgfu zzb(zzgwt zzgwtVar) {
        this.zzc = zzgwtVar;
        return this;
    }

    public final zzgfu zzc(Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzgfu zzd(zzggf zzggfVar) {
        this.zza = zzggfVar;
        return this;
    }

    public final zzgfw zze() throws GeneralSecurityException {
        zzgws zzgwsVarZzb;
        zzggf zzggfVar = this.zza;
        if (zzggfVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        zzgwt zzgwtVar = this.zzb;
        if (zzgwtVar == null || this.zzc == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (zzggfVar.zzb() != zzgwtVar.zza()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (zzggfVar.zzc() != this.zzc.zza()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.zza.zza() && this.zzd == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzd != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzh() == zzggd.zzc) {
            zzgwsVarZzb = zzgnn.zza;
        } else if (this.zza.zzh() == zzggd.zzb) {
            zzgwsVarZzb = zzgnn.zza(this.zzd.intValue());
        } else {
            if (this.zza.zzh() != zzggd.zza) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.zza.zzh())));
            }
            zzgwsVarZzb = zzgnn.zzb(this.zzd.intValue());
        }
        return new zzgfw(this.zza, this.zzb, this.zzc, zzgwsVarZzb, this.zzd, null);
    }

    public /* synthetic */ zzgfu(zzgfv zzgfvVar) {
    }
}
