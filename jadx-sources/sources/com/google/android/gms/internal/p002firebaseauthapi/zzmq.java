package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzox;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class zzmq<SerializationT extends zzox> {
    private final zzxv zza;
    private final Class<SerializationT> zzb;

    public static <SerializationT extends zzox> zzmq<SerializationT> zza(zzms<SerializationT> zzmsVar, zzxv zzxvVar, Class<SerializationT> cls) {
        return new zzmp(zzxvVar, cls, zzmsVar);
    }

    public abstract zzbu zza(SerializationT serializationt, zzcn zzcnVar);

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }

    private zzmq(zzxv zzxvVar, Class<SerializationT> cls) {
        this.zza = zzxvVar;
        this.zzb = cls;
    }

    public final zzxv zza() {
        return this.zza;
    }
}
