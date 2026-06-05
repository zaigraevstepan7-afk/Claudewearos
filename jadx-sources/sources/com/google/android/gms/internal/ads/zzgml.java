package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzgml {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgml(Class cls, Class cls2, zzgmk zzgmkVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgml zzb(zzgmj zzgmjVar, Class cls, Class cls2) {
        return new zzgmi(cls, cls2, zzgmjVar);
    }

    public abstract zzgop zza(zzgen zzgenVar, zzgfb zzgfbVar);

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
