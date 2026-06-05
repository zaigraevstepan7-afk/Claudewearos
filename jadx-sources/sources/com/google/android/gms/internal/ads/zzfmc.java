package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfmc {
    private final zzfnq zza;
    private final String zzb;
    private final zzflk zzc;
    private final String zzd = "Ad overlay";

    public zzfmc(View view, zzflk zzflkVar, String str) {
        this.zza = new zzfnq(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzflkVar;
    }

    public final zzflk zza() {
        return this.zzc;
    }

    public final zzfnq zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzb;
    }
}
