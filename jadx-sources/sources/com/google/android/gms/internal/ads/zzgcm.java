package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgcm extends zzgcn {
    final /* synthetic */ zzgco zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgcm(zzgco zzgcoVar, Callable callable, Executor executor) {
        super(zzgcoVar, executor);
        this.zza = zzgcoVar;
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final Object zza() {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final String zzb() {
        return this.zzc.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgcn
    public final void zzc(Object obj) {
        this.zza.zzc(obj);
    }
}
