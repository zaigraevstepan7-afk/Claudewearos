package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzblz implements com.google.android.gms.common.internal.c {
    final /* synthetic */ zzcai zza;

    public zzblz(zzbma zzbmaVar, zzcai zzcaiVar) {
        this.zza = zzcaiVar;
    }

    @Override // com.google.android.gms.common.internal.c
    public final void onConnectionFailed(nd.b bVar) {
        this.zza.zzd(new RuntimeException("Connection failed."));
    }
}
