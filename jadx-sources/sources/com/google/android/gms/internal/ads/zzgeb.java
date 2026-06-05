package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgeb extends zzgdj {
    final /* synthetic */ zzgec zza;
    private final Callable zzb;

    public zzgeb(zzgec zzgecVar, Callable callable) {
        this.zza = zzgecVar;
        callable.getClass();
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final Object zza() {
        return this.zzb.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final void zzd(Throwable th2) {
        this.zza.zzd(th2);
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final void zze(Object obj) {
        this.zza.zzc(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
