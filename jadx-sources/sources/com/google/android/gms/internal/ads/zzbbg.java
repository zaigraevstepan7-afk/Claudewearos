package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbbg implements com.google.android.gms.common.internal.b {
    final /* synthetic */ zzbbi zza;

    public zzbbg(zzbbi zzbbiVar) {
        this.zza = zzbbiVar;
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnected(Bundle bundle) {
        zzbbi zzbbiVar = this.zza;
        synchronized (zzbbiVar.zzc) {
            try {
            } catch (DeadObjectException e10) {
                int i10 = l0.f13401b;
                k.e("Unable to obtain a cache service instance.", e10);
                zzbbi.zzh(this.zza);
            }
            if (zzbbiVar.zzd != null) {
                zzbbiVar.zzf = zzbbiVar.zzd.zzq();
                this.zza.zzc.notifyAll();
            } else {
                this.zza.zzc.notifyAll();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnectionSuspended(int i10) {
        zzbbi zzbbiVar = this.zza;
        synchronized (zzbbiVar.zzc) {
            zzbbiVar.zzf = null;
            zzbbiVar.zzc.notifyAll();
        }
    }
}
