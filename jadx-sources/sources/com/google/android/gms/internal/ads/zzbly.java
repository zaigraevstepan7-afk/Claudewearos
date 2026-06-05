package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbly implements com.google.android.gms.common.internal.b {
    final /* synthetic */ zzcai zza;
    final /* synthetic */ zzbma zzb;

    public zzbly(zzbma zzbmaVar, zzcai zzcaiVar) {
        this.zza = zzcaiVar;
        this.zzb = zzbmaVar;
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnected(Bundle bundle) {
        try {
            this.zza.zzc(this.zzb.zza.zzp());
        } catch (DeadObjectException e10) {
            this.zza.zzd(e10);
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnectionSuspended(int i10) {
        this.zza.zzd(new RuntimeException(m6.a.d(i10, "onConnectionSuspended: ")));
    }
}
