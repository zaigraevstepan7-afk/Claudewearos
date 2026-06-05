package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdas extends zzdbm implements zzbiv {
    public zzdas(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final synchronized void zzb(final String str, final String str2) {
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzdar
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((gc.e) obj).onAppEvent(str, str2);
            }
        });
    }
}
