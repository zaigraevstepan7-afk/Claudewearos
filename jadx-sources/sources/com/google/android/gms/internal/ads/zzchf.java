package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzchf implements zzhfy {
    private final zzhgh zza;

    public zzchf(zzhgh zzhghVar) {
        this.zza = zzhghVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        ApplicationInfo applicationInfo = ((zzchg) this.zza).zza().getApplicationInfo();
        zzhgg.zzb(applicationInfo);
        return applicationInfo;
    }
}
