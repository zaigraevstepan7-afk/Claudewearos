package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzgmh {
    private final zzgws zza;
    private final Class zzb;

    public /* synthetic */ zzgmh(zzgws zzgwsVar, Class cls, zzgmg zzgmgVar) {
        this.zza = zzgwsVar;
        this.zzb = cls;
    }

    public static zzgmh zzb(zzgmf zzgmfVar, zzgws zzgwsVar, Class cls) {
        return new zzgme(zzgwsVar, cls, zzgmfVar);
    }

    public abstract zzgen zza(zzgop zzgopVar, zzgfb zzgfbVar);

    public final zzgws zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
