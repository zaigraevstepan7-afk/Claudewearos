package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzcv extends zzdt {
    final /* synthetic */ zzee zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcv(zzee zzeeVar) {
        super(zzeeVar, true);
        this.zza = zzeeVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() {
        zzcc zzccVar = this.zza.zzj;
        e0.i(zzccVar);
        zzccVar.resetAnalyticsData(this.zzh);
    }
}
