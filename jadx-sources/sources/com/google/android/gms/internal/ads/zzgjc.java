package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgjc extends zzgfn {
    private final zzgjh zza;
    private final zzgwt zzb;
    private final zzgws zzc;
    private final Integer zzd;

    private zzgjc(zzgjh zzgjhVar, zzgwt zzgwtVar, zzgws zzgwsVar, Integer num) {
        this.zza = zzgjhVar;
        this.zzb = zzgwtVar;
        this.zzc = zzgwsVar;
        this.zzd = num;
    }

    public static zzgjc zzc(zzgjh zzgjhVar, zzgwt zzgwtVar, Integer num) throws GeneralSecurityException {
        zzgws zzgwsVarZzb;
        zzgjg zzgjgVarZzc = zzgjhVar.zzc();
        zzgjg zzgjgVar = zzgjg.zzb;
        if (zzgjgVarZzc != zzgjgVar && num == null) {
            throw new GeneralSecurityException(m1.j("For given Variant ", zzgjhVar.zzc().toString(), " the value of idRequirement must be non-null"));
        }
        if (zzgjhVar.zzc() == zzgjgVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgwtVar.zza() != 32) {
            throw new GeneralSecurityException(m6.a.d(zzgwtVar.zza(), "XAesGcmKey key must be constructed with key of length 32 bytes, not "));
        }
        if (zzgjhVar.zzc() == zzgjgVar) {
            zzgwsVarZzb = zzgnn.zza;
        } else {
            if (zzgjhVar.zzc() != zzgjg.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzgjhVar.zzc().toString()));
            }
            zzgwsVarZzb = zzgnn.zzb(num.intValue());
        }
        return new zzgjc(zzgjhVar, zzgwtVar, zzgwsVarZzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzgfn, com.google.android.gms.internal.ads.zzgen
    public final /* synthetic */ zzgfa zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgfn
    public final zzgws zzb() {
        return this.zzc;
    }

    public final zzgjh zzd() {
        return this.zza;
    }

    public final zzgwt zze() {
        return this.zzb;
    }

    public final Integer zzf() {
        return this.zzd;
    }
}
