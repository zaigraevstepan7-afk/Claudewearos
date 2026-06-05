package com.google.android.gms.internal.ads;

import android.app.Activity;
import pc.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzebh extends zzece {
    private Activity zza;
    private i zzb;
    private String zzc;
    private String zzd;

    @Override // com.google.android.gms.internal.ads.zzece
    public final zzece zza(Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Null activity");
        }
        this.zza = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzece
    public final zzece zzb(i iVar) {
        this.zzb = iVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzece
    public final zzece zzc(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzece
    public final zzece zzd(String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzece
    public final zzecf zze() {
        Activity activity = this.zza;
        if (activity != null) {
            return new zzebj(activity, this.zzb, this.zzc, this.zzd, null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
