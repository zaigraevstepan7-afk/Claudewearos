package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@Deprecated
/* loaded from: classes.dex */
public final class zzmj {
    private final zziw zza;

    @Deprecated
    public zzmj(Context context, zzcek zzcekVar) {
        this.zza = new zziw(context, zzcekVar);
    }

    @Deprecated
    public final zzmj zza(final zzkx zzkxVar) {
        zziw zziwVar = this.zza;
        zzdd.zzf(!zziwVar.zzs);
        zzkxVar.getClass();
        zziwVar.zzf = new zzfvw() { // from class: com.google.android.gms.internal.ads.zzio
            @Override // com.google.android.gms.internal.ads.zzfvw
            public final Object zza() {
                return zzkxVar;
            }
        };
        return this;
    }

    @Deprecated
    public final zzmj zzb(final zzzd zzzdVar) {
        zziw zziwVar = this.zza;
        zzdd.zzf(!zziwVar.zzs);
        zzzdVar.getClass();
        zziwVar.zze = new zzfvw() { // from class: com.google.android.gms.internal.ads.zziv
            @Override // com.google.android.gms.internal.ads.zzfvw
            public final Object zza() {
                return zzzdVar;
            }
        };
        return this;
    }

    @Deprecated
    public final zzmk zzc() {
        zziw zziwVar = this.zza;
        zzdd.zzf(!zziwVar.zzs);
        zziwVar.zzs = true;
        return new zzmk(zziwVar);
    }
}
