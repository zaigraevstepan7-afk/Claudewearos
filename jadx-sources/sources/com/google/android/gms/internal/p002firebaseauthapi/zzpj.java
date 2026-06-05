package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzpq;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzpj extends zzqi {
    private final zzpq zza;
    private final zzxw zzb;
    private final zzxv zzc;
    private final Integer zzd;

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static class zza {
        private zzpq zza;
        private zzxw zzb;
        private Integer zzc;

        public final zza zza(zzxw zzxwVar) {
            this.zzb = zzxwVar;
            return this;
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }

        public final zza zza(Integer num) {
            this.zzc = num;
            return this;
        }

        public final zza zza(zzpq zzpqVar) {
            this.zza = zzpqVar;
            return this;
        }

        public final zzpj zza() throws GeneralSecurityException {
            zzxv zzxvVarZza;
            zzpq zzpqVar = this.zza;
            if (zzpqVar != null && this.zzb != null) {
                if (zzpqVar.zzc() == this.zzb.zza()) {
                    if (this.zza.zza() && this.zzc == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                    if (!this.zza.zza() && this.zzc != null) {
                        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                    }
                    if (this.zza.zze() == zzpq.zzb.zzd) {
                        zzxvVarZza = zznt.zza;
                    } else if (this.zza.zze() != zzpq.zzb.zzc && this.zza.zze() != zzpq.zzb.zzb) {
                        if (this.zza.zze() == zzpq.zzb.zza) {
                            zzxvVarZza = zznt.zzb(this.zzc.intValue());
                        } else {
                            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
                        }
                    } else {
                        zzxvVarZza = zznt.zza(this.zzc.intValue());
                    }
                    return new zzpj(this.zza, this.zzb, zzxvVarZza, this.zzc);
                }
                throw new GeneralSecurityException("Key size mismatch");
            }
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
    }

    public static zza zzb() {
        return new zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbu
    public final Integer zza() {
        return this.zzd;
    }

    public final zzpq zzc() {
        return this.zza;
    }

    public final zzxv zzd() {
        return this.zzc;
    }

    public final zzxw zze() {
        return this.zzb;
    }

    private zzpj(zzpq zzpqVar, zzxw zzxwVar, zzxv zzxvVar, Integer num) {
        this.zza = zzpqVar;
        this.zzb = zzxwVar;
        this.zzc = zzxvVar;
        this.zzd = num;
    }
}
