package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcwj extends zzdbm {
    private boolean zzb;

    public zzcwj(Set set) {
        super(set);
        this.zzb = false;
    }

    public final synchronized void zza() {
        if (this.zzb) {
            return;
        }
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzcwi
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((zzcwl) obj).zzs();
            }
        });
        this.zzb = true;
    }
}
