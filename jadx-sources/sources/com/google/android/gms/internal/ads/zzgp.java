package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgp implements zzgi {
    private final Context zza;
    private final zzgi zzb;

    public zzgp(Context context) {
        zzgr zzgrVar = new zzgr();
        this.zza = context.getApplicationContext();
        this.zzb = zzgrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final /* bridge */ /* synthetic */ zzgj zza() {
        return new zzgq(this.zza, this.zzb.zza());
    }
}
