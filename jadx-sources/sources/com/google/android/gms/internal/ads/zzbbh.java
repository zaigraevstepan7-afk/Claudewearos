package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbbh implements com.google.android.gms.common.internal.c {
    final /* synthetic */ zzbbi zza;

    public zzbbh(zzbbi zzbbiVar) {
        this.zza = zzbbiVar;
    }

    @Override // com.google.android.gms.common.internal.c
    public final void onConnectionFailed(nd.b bVar) {
        zzbbi zzbbiVar = this.zza;
        synchronized (zzbbiVar.zzc) {
            try {
                zzbbiVar.zzf = null;
                if (zzbbiVar.zzd != null) {
                    zzbbiVar.zzd = null;
                }
                zzbbiVar.zzc.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
