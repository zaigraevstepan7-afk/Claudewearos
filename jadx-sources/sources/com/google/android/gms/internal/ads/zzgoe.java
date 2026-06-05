package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzgoe {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgoe(Class cls, Class cls2, zzgod zzgodVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgoe zzb(zzgoc zzgocVar, Class cls, Class cls2) {
        return new zzgob(cls, cls2, zzgocVar);
    }

    public abstract Object zza(zzgen zzgenVar);

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
