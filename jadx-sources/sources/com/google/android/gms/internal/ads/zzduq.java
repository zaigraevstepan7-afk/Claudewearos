package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzduq implements zzhfy {
    private final zzhgh zza;

    public zzduq(zzhgh zzhghVar, zzhgh zzhghVar2) {
        this.zza = zzhghVar;
    }

    public static zzddo zza(zzdup zzdupVar, Executor executor) {
        return new zzddo(zzdupVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza((zzdup) this.zza.zzb(), zzffm.zzc());
    }
}
