package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzgnr {
    private final zzgws zza;
    private final Class zzb;

    public /* synthetic */ zzgnr(zzgws zzgwsVar, Class cls, zzgnq zzgnqVar) {
        this.zza = zzgwsVar;
        this.zzb = cls;
    }

    public static zzgnr zzb(zzgnp zzgnpVar, zzgws zzgwsVar, Class cls) {
        return new zzgno(zzgwsVar, cls, zzgnpVar);
    }

    public abstract zzgfa zza(zzgop zzgopVar);

    public final zzgws zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
