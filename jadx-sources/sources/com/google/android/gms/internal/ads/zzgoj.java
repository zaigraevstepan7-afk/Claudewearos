package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgoj {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzgoj(zzgog zzgogVar, zzgoi zzgoiVar) {
        this.zza = new HashMap(zzgogVar.zza);
        this.zzb = new HashMap(zzgogVar.zzb);
    }

    public static zzgog zza() {
        return new zzgog(null);
    }

    public final Object zzb(zzgen zzgenVar, Class cls) throws GeneralSecurityException {
        zzgoh zzgohVar = new zzgoh(zzgenVar.getClass(), cls, null);
        Map map = this.zza;
        if (map.containsKey(zzgohVar)) {
            return ((zzgoe) map.get(zzgohVar)).zza(zzgenVar);
        }
        throw new GeneralSecurityException(m1.j("No PrimitiveConstructor for ", zzgohVar.toString(), " available, see https://developers.google.com/tink/faq/registration_errors"));
    }

    public final Object zzc(zzgmm zzgmmVar, zzgmv zzgmvVar, Class cls) throws GeneralSecurityException {
        Map map = this.zzb;
        if (!map.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        zzgok zzgokVar = (zzgok) map.get(cls);
        return zzgokVar.zze(zzgmmVar, zzgmvVar, new zzgof(this, zzgokVar));
    }
}
