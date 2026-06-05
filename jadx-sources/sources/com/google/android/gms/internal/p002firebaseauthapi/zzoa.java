package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzci;
import com.google.android.gms.internal.p002firebaseauthapi.zzox;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class zzoa<ParametersT extends zzci, SerializationT extends zzox> {
    private final Class<ParametersT> zza;
    private final Class<SerializationT> zzb;

    public static <ParametersT extends zzci, SerializationT extends zzox> zzoa<ParametersT, SerializationT> zza(zzoc<ParametersT, SerializationT> zzocVar, Class<ParametersT> cls, Class<SerializationT> cls2) {
        return new zznz(cls, cls2, zzocVar);
    }

    public abstract SerializationT zza(ParametersT parameterst);

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }

    private zzoa(Class<ParametersT> cls, Class<SerializationT> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final Class<ParametersT> zza() {
        return this.zza;
    }
}
