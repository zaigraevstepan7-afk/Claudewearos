package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzhgl implements zzhgh {
    private static final Object zza = new Object();
    private volatile zzhgh zzb;
    private volatile Object zzc = zza;

    private zzhgl(zzhgh zzhghVar) {
        this.zzb = zzhghVar;
    }

    public static zzhgh zza(zzhgh zzhghVar) {
        return ((zzhghVar instanceof zzhgl) || (zzhghVar instanceof zzhfx)) ? zzhghVar : new zzhgl(zzhghVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        zzhgh zzhghVar = this.zzb;
        if (zzhghVar == null) {
            return this.zzc;
        }
        Object objZzb = zzhghVar.zzb();
        this.zzc = objZzb;
        this.zzb = null;
        return objZzb;
    }
}
