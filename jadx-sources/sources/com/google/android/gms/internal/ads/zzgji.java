package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgji extends zzgfn {
    private final zzgjo zza;
    private final zzgwt zzb;
    private final zzgws zzc;
    private final Integer zzd;

    private zzgji(zzgjo zzgjoVar, zzgwt zzgwtVar, zzgws zzgwsVar, Integer num) {
        this.zza = zzgjoVar;
        this.zzb = zzgwtVar;
        this.zzc = zzgwsVar;
        this.zzd = num;
    }

    public static zzgji zzc(zzgjn zzgjnVar, zzgwt zzgwtVar, Integer num) throws GeneralSecurityException {
        zzgws zzgwsVarZzb;
        zzgjn zzgjnVar2 = zzgjn.zzc;
        if (zzgjnVar != zzgjnVar2 && num == null) {
            throw new GeneralSecurityException(m1.j("For given Variant ", zzgjnVar.toString(), " the value of idRequirement must be non-null"));
        }
        if (zzgjnVar == zzgjnVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgwtVar.zza() != 32) {
            throw new GeneralSecurityException(m6.a.d(zzgwtVar.zza(), "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
        zzgjo zzgjoVarZzc = zzgjo.zzc(zzgjnVar);
        if (zzgjoVarZzc.zzb() == zzgjnVar2) {
            zzgwsVarZzb = zzgnn.zza;
        } else if (zzgjoVarZzc.zzb() == zzgjn.zzb) {
            zzgwsVarZzb = zzgnn.zza(num.intValue());
        } else {
            if (zzgjoVarZzc.zzb() != zzgjn.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzgjoVarZzc.zzb().toString()));
            }
            zzgwsVarZzb = zzgnn.zzb(num.intValue());
        }
        return new zzgji(zzgjoVarZzc, zzgwtVar, zzgwsVarZzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzgfn, com.google.android.gms.internal.ads.zzgen
    public final /* synthetic */ zzgfa zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgfn
    public final zzgws zzb() {
        return this.zzc;
    }

    public final zzgjo zzd() {
        return this.zza;
    }

    public final zzgwt zze() {
        return this.zzb;
    }

    public final Integer zzf() {
        return this.zzd;
    }
}
