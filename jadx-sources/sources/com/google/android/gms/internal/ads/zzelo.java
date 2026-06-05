package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzelo implements zzetu {
    private final Context zza;

    public zzelo(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        return zzgdb.zzh(new zzelp(i4.c.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
    }
}
