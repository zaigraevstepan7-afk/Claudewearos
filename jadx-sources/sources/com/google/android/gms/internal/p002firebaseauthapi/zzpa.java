package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzpa {
    private final Map<zzpe, zzmu<?, ?>> zza;
    private final Map<zzpc, zzmq<?>> zzb;
    private final Map<zzpe, zzoa<?, ?>> zzc;
    private final Map<zzpc, zznw<?>> zzd;

    private zzpa(zzoz zzozVar) {
        this.zza = new HashMap(zzozVar.zza);
        this.zzb = new HashMap(zzozVar.zzb);
        this.zzc = new HashMap(zzozVar.zzc);
        this.zzd = new HashMap(zzozVar.zzd);
    }

    public final <SerializationT extends zzox> zzbu zza(SerializationT serializationt, zzcn zzcnVar) throws GeneralSecurityException {
        zzpc zzpcVar = new zzpc(serializationt.getClass(), serializationt.zzb());
        if (this.zzb.containsKey(zzpcVar)) {
            return this.zzb.get(zzpcVar).zza(serializationt, zzcnVar);
        }
        throw new GeneralSecurityException(m1.j("No Key Parser for requested key type ", String.valueOf(zzpcVar), " available"));
    }

    public final <SerializationT extends zzox> boolean zzb(SerializationT serializationt) {
        return this.zzb.containsKey(new zzpc(serializationt.getClass(), serializationt.zzb()));
    }

    public final <SerializationT extends zzox> boolean zzc(SerializationT serializationt) {
        return this.zzd.containsKey(new zzpc(serializationt.getClass(), serializationt.zzb()));
    }

    public final <SerializationT extends zzox> zzci zza(SerializationT serializationt) throws GeneralSecurityException {
        zzpc zzpcVar = new zzpc(serializationt.getClass(), serializationt.zzb());
        if (this.zzd.containsKey(zzpcVar)) {
            return this.zzd.get(zzpcVar).zza(serializationt);
        }
        throw new GeneralSecurityException(m1.j("No Parameters Parser for requested key type ", String.valueOf(zzpcVar), " available"));
    }

    public final <KeyT extends zzbu, SerializationT extends zzox> SerializationT zza(KeyT keyt, Class<SerializationT> cls, zzcn zzcnVar) throws GeneralSecurityException {
        zzpe zzpeVar = new zzpe(keyt.getClass(), cls);
        if (this.zza.containsKey(zzpeVar)) {
            return (SerializationT) this.zza.get(zzpeVar).zza(keyt, zzcnVar);
        }
        throw new GeneralSecurityException(m1.j("No Key serializer for ", String.valueOf(zzpeVar), " available"));
    }

    public final <ParametersT extends zzci, SerializationT extends zzox> SerializationT zza(ParametersT parameterst, Class<SerializationT> cls) throws GeneralSecurityException {
        zzpe zzpeVar = new zzpe(parameterst.getClass(), cls);
        if (this.zzc.containsKey(zzpeVar)) {
            return (SerializationT) this.zzc.get(zzpeVar).zza(parameterst);
        }
        throw new GeneralSecurityException(m1.j("No Key Format serializer for ", String.valueOf(zzpeVar), " available"));
    }
}
