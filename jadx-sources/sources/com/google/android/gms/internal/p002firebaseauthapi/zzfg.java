package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzfi;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class zzfg extends zzcu {
    private final zzfi zza;
    private final zzxv zzb;
    private final Integer zzc;

    private zzfg(zzfi zzfiVar, zzxv zzxvVar, Integer num) {
        this.zza = zzfiVar;
        this.zzb = zzxvVar;
        this.zzc = num;
    }

    public static zzfg zza(zzfi zzfiVar, Integer num) throws GeneralSecurityException {
        zzxv zzxvVarZzb;
        if (zzfiVar.zzc() == zzfi.zzc.zzb) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzxvVarZzb = zznt.zza;
        } else {
            if (zzfiVar.zzc() != zzfi.zzc.zza) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzfiVar.zzc())));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzxvVarZzb = zznt.zzb(num.intValue());
        }
        return new zzfg(zzfiVar, zzxvVarZzb, num);
    }

    public final zzfi zzb() {
        return this.zza;
    }

    public final zzxv zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbu
    public final Integer zza() {
        return this.zzc;
    }
}
