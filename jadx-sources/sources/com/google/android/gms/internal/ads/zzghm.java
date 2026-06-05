package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzghm extends zzgfn {
    private final zzghr zza;
    private final zzgwt zzb;
    private final zzgws zzc;
    private final Integer zzd;

    private zzghm(zzghr zzghrVar, zzgwt zzgwtVar, zzgws zzgwsVar, Integer num) {
        this.zza = zzghrVar;
        this.zzb = zzgwtVar;
        this.zzc = zzgwsVar;
        this.zzd = num;
    }

    public static zzghm zzc(zzghq zzghqVar, zzgwt zzgwtVar, Integer num) throws GeneralSecurityException {
        zzgws zzgwsVarZzb;
        zzghq zzghqVar2 = zzghq.zzc;
        if (zzghqVar != zzghqVar2 && num == null) {
            throw new GeneralSecurityException(m1.j("For given Variant ", zzghqVar.toString(), " the value of idRequirement must be non-null"));
        }
        if (zzghqVar == zzghqVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgwtVar.zza() != 32) {
            throw new GeneralSecurityException(m6.a.d(zzgwtVar.zza(), "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
        zzghr zzghrVarZzc = zzghr.zzc(zzghqVar);
        if (zzghrVarZzc.zzb() == zzghqVar2) {
            zzgwsVarZzb = zzgnn.zza;
        } else if (zzghrVarZzc.zzb() == zzghq.zzb) {
            zzgwsVarZzb = zzgnn.zza(num.intValue());
        } else {
            if (zzghrVarZzc.zzb() != zzghq.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzghrVarZzc.zzb().toString()));
            }
            zzgwsVarZzb = zzgnn.zzb(num.intValue());
        }
        return new zzghm(zzghrVarZzc, zzgwtVar, zzgwsVarZzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzgfn, com.google.android.gms.internal.ads.zzgen
    public final /* synthetic */ zzgfa zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgfn
    public final zzgws zzb() {
        return this.zzc;
    }

    public final zzghr zzd() {
        return this.zza;
    }

    public final zzgwt zze() {
        return this.zzb;
    }

    public final Integer zzf() {
        return this.zzd;
    }
}
