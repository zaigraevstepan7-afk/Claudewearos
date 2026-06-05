package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzcym implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzcyo zzcyoVar = (zzcyo) this.zza.get();
        if (zzcyoVar != null) {
            zzcyoVar.zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzcyk
                @Override // com.google.android.gms.internal.ads.zzdbl
                public final void zza(Object obj) {
                    ((zzcyi) obj).zzb();
                }
            });
        }
    }
}
