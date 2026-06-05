package com.google.android.gms.internal.ads;

import fc.v;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzder extends zzdbm {
    private boolean zzb;

    public zzder(Set set) {
        super(set);
    }

    public final void zza() {
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzdeo
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((v) obj).onVideoEnd();
            }
        });
    }

    public final void zzb() {
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzden
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((v) obj).onVideoPause();
            }
        });
    }

    public final synchronized void zzc() {
        try {
            if (!this.zzb) {
                zzq(new zzdep());
                this.zzb = true;
            }
            zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzdeq
                @Override // com.google.android.gms.internal.ads.zzdbl
                public final void zza(Object obj) {
                    ((v) obj).onVideoPlay();
                }
            });
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzd() {
        zzq(new zzdep());
        this.zzb = true;
    }
}
