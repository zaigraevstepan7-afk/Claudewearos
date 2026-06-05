package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzns {
    private static final zzns zza = (zzns) zzpf.zza(new zzpi() { // from class: com.google.android.gms.internal.firebase-auth-api.zznr
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpi
        public final Object zza() {
            zzns zznsVar = new zzns();
            zznsVar.zza(zzmu.zza(new zzmw() { // from class: com.google.android.gms.internal.firebase-auth-api.zznu
                @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmw
                public final zzox zza(zzbu zzbuVar, zzcn zzcnVar) {
                    return ((zzna) zzbuVar).zza(zzcnVar);
                }
            }, zzna.class, zzou.class));
            return zznsVar;
        }
    });
    private final AtomicReference<zzpa> zzb = new AtomicReference<>(new zzoz().zza());

    public final <SerializationT extends zzox> zzbu zza(SerializationT serializationt, zzcn zzcnVar) {
        return this.zzb.get().zza((zzpa) serializationt, zzcnVar);
    }

    public final <SerializationT extends zzox> boolean zzb(SerializationT serializationt) {
        return this.zzb.get().zzb((zzpa) serializationt);
    }

    public final <SerializationT extends zzox> boolean zzc(SerializationT serializationt) {
        return this.zzb.get().zzc((zzpa) serializationt);
    }

    public final <SerializationT extends zzox> zzci zza(SerializationT serializationt) {
        return this.zzb.get().zza((zzpa) serializationt);
    }

    public static zzns zza() {
        return zza;
    }

    public final <KeyT extends zzbu, SerializationT extends zzox> SerializationT zza(KeyT keyt, Class<SerializationT> cls, zzcn zzcnVar) {
        return (SerializationT) this.zzb.get().zza(keyt, cls, zzcnVar);
    }

    public final <ParametersT extends zzci, SerializationT extends zzox> SerializationT zza(ParametersT parameterst, Class<SerializationT> cls) {
        return (SerializationT) this.zzb.get().zza((zzpa) parameterst, (Class) cls);
    }

    public final synchronized <SerializationT extends zzox> void zza(zzmq<SerializationT> zzmqVar) {
        this.zzb.set(new zzoz(this.zzb.get()).zza(zzmqVar).zza());
    }

    public final synchronized <KeyT extends zzbu, SerializationT extends zzox> void zza(zzmu<KeyT, SerializationT> zzmuVar) {
        this.zzb.set(new zzoz(this.zzb.get()).zza(zzmuVar).zza());
    }

    public final synchronized <SerializationT extends zzox> void zza(zznw<SerializationT> zznwVar) {
        this.zzb.set(new zzoz(this.zzb.get()).zza(zznwVar).zza());
    }

    public final synchronized <ParametersT extends zzci, SerializationT extends zzox> void zza(zzoa<ParametersT, SerializationT> zzoaVar) {
        this.zzb.set(new zzoz(this.zzb.get()).zza(zzoaVar).zza());
    }
}
