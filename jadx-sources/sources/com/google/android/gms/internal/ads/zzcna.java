package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzcna implements zzbkd {
    final /* synthetic */ zzcnd zza;

    public zzcna(zzcnd zzcndVar) {
        this.zza = zzcndVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        zzcnd zzcndVar = this.zza;
        if (zzcnd.zzg(zzcndVar, map)) {
            zzcndVar.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmz
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza.zzd.zzg();
                }
            });
        }
    }
}
