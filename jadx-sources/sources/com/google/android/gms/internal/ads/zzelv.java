package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzelv implements zzetu {
    private final ud.a zza;
    private final zzfco zzb;

    public zzelv(ud.a aVar, zzfco zzfcoVar) {
        this.zza = aVar;
        this.zzb = zzfcoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        ud.a aVar = this.zza;
        zzfco zzfcoVar = this.zzb;
        ((ud.b) aVar).getClass();
        return zzgdb.zzh(new zzelw(zzfcoVar, System.currentTimeMillis()));
    }
}
