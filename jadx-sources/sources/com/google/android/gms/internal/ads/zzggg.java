package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzggg {
    private zzggp zza = null;
    private zzgwt zzb = null;
    private Integer zzc = null;

    private zzggg() {
    }

    public final zzggg zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzggg zzb(zzgwt zzgwtVar) {
        this.zzb = zzgwtVar;
        return this;
    }

    public final zzggg zzc(zzggp zzggpVar) {
        this.zza = zzggpVar;
        return this;
    }

    public final zzggi zzd() throws GeneralSecurityException {
        zzgwt zzgwtVar;
        zzgws zzgwsVarZzb;
        zzggp zzggpVar = this.zza;
        if (zzggpVar == null || (zzgwtVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzggpVar.zzc() != zzgwtVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzggpVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzggn.zzc) {
            zzgwsVarZzb = zzgnn.zza;
        } else if (this.zza.zze() == zzggn.zzb) {
            zzgwsVarZzb = zzgnn.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzggn.zza) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
            }
            zzgwsVarZzb = zzgnn.zzb(this.zzc.intValue());
        }
        return new zzggi(this.zza, this.zzb, zzgwsVarZzb, this.zzc, null);
    }

    public /* synthetic */ zzggg(zzggh zzgghVar) {
    }
}
