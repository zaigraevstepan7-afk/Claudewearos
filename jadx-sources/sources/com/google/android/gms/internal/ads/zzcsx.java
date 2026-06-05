package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcsx implements zzdbj, zzcxf {
    private final ud.a zza;
    private final zzcsz zzb;
    private final zzfco zzc;
    private final String zzd;

    public zzcsx(ud.a aVar, zzcsz zzcszVar, zzfco zzfcoVar, String str) {
        this.zza = aVar;
        this.zzb = zzcszVar;
        this.zzc = zzfcoVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zza() {
        ud.a aVar = this.zza;
        zzcsz zzcszVar = this.zzb;
        String str = this.zzd;
        ((ud.b) aVar).getClass();
        zzcszVar.zze(str, SystemClock.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzcxf
    public final void zzt() {
        ud.a aVar = this.zza;
        String str = this.zzd;
        ((ud.b) aVar).getClass();
        this.zzb.zzd(this.zzc.zzf, str, SystemClock.elapsedRealtime());
    }
}
