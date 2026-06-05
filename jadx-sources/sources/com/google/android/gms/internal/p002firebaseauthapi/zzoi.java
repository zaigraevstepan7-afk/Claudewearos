package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzoi {
    private final Map<zzoj, zzoe<?, ?>> zza;
    private final Map<Class<?>, zzch<?, ?>> zzb;

    public static zzoh zza(zzoi zzoiVar) {
        return new zzoh(zzoiVar);
    }

    private zzoi(zzoh zzohVar) {
        this.zza = new HashMap(zzohVar.zza);
        this.zzb = new HashMap(zzohVar.zzb);
    }

    public final Class<?> zza(Class<?> cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            return this.zzb.get(cls).zza();
        }
        throw new GeneralSecurityException(m1.j("No input primitive class for ", String.valueOf(cls), " available"));
    }

    public final <KeyT extends zzbu, PrimitiveT> PrimitiveT zza(KeyT keyt, Class<PrimitiveT> cls) throws GeneralSecurityException {
        zzoj zzojVar = new zzoj(keyt.getClass(), cls);
        if (this.zza.containsKey(zzojVar)) {
            return (PrimitiveT) this.zza.get(zzojVar).zza(keyt);
        }
        throw new GeneralSecurityException(m1.j("No PrimitiveConstructor for ", String.valueOf(zzojVar), " available"));
    }

    public final <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT zza(zzoo<InputPrimitiveT> zzooVar, Class<WrapperPrimitiveT> cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            zzch<?, ?> zzchVar = this.zzb.get(cls);
            if (zzooVar.zzc().equals(zzchVar.zza()) && zzchVar.zza().equals(zzooVar.zzc())) {
                return (WrapperPrimitiveT) zzchVar.zza(zzooVar);
            }
            throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(cls)));
    }
}
