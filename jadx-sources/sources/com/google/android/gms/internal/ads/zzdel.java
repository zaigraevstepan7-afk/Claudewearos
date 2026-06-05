package com.google.android.gms.internal.ads;

import java.util.Set;
import xc.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdel extends zzdbm {
    public zzdel(Set set) {
        super(set);
    }

    public final synchronized void zza(final v vVar) {
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzdej
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((zzdei) obj).zze(vVar);
            }
        });
    }

    public final synchronized void zzb(final String str) {
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzdek
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((zzdei) obj).zzf(str);
            }
        });
    }
}
