package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbbv implements com.google.android.gms.common.internal.c {
    final /* synthetic */ zzcai zza;
    final /* synthetic */ zzbbw zzb;

    public zzbbv(zzbbw zzbbwVar, zzcai zzcaiVar) {
        this.zza = zzcaiVar;
        this.zzb = zzbbwVar;
    }

    @Override // com.google.android.gms.common.internal.c
    public final void onConnectionFailed(nd.b bVar) {
        synchronized (this.zzb.zzd) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}
