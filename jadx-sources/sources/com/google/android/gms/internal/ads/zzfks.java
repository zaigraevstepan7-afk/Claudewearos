package com.google.android.gms.internal.ads;

import nc.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfks implements Runnable {
    final /* synthetic */ h2 zza;
    final /* synthetic */ zzfkv zzb;

    public zzfks(zzfkv zzfkvVar, h2 h2Var) {
        this.zza = h2Var;
        this.zzb = zzfkvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzJ(this.zza);
    }
}
