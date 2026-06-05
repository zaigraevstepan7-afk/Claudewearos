package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzgnv {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgnv(Class cls, Class cls2, zzgnu zzgnuVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgnv zzb(zzgnt zzgntVar, Class cls, Class cls2) {
        return new zzgns(cls, cls2, zzgntVar);
    }

    public abstract zzgop zza(zzgfa zzgfaVar);

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
