package com.google.android.gms.internal.ads;

import ud.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeoh implements zzetu {
    private final zzeyr zza;

    public zzeoh(zzeyr zzeyrVar) {
        this.zza = zzeyrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        zzeyr zzeyrVar = this.zza;
        if (zzeyrVar == null) {
            return zzgdb.zzh(new zzeog(null));
        }
        String strZza = zzeyrVar.zza();
        int i10 = f.f16993a;
        return (strZza == null || strZza.trim().isEmpty()) ? zzgdb.zzh(new zzeog(null)) : zzgdb.zzh(new zzeog(strZza));
    }
}
