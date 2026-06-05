package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzchg implements zzhfy {
    private final zzchc zza;

    public zzchg(zzchc zzchcVar) {
        this.zza = zzchcVar;
    }

    public static Context zzc(zzchc zzchcVar) {
        Context contextZzb = zzchcVar.zzb();
        zzhgg.zzb(contextZzb);
        return contextZzb;
    }

    public final Context zza() {
        return zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
