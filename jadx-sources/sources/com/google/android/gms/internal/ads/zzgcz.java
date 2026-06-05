package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgcz {
    private final boolean zza;
    private final zzfyf zzb;

    public /* synthetic */ zzgcz(boolean z2, zzfyf zzfyfVar, zzgda zzgdaVar) {
        this.zza = z2;
        this.zzb = zzfyfVar;
    }

    public final mf.a zza(Callable callable, Executor executor) {
        return new zzgco(this.zzb, this.zza, executor, callable);
    }
}
