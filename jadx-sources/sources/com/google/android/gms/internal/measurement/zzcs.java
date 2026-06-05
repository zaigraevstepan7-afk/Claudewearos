package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzcs extends zzdt {
    final /* synthetic */ Boolean zza;
    final /* synthetic */ zzee zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcs(zzee zzeeVar, Boolean bool) {
        super(zzeeVar, true);
        this.zzb = zzeeVar;
        this.zza = bool;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() {
        if (this.zza != null) {
            zzcc zzccVar = this.zzb.zzj;
            e0.i(zzccVar);
            zzccVar.setMeasurementEnabled(this.zza.booleanValue(), this.zzh);
        } else {
            zzcc zzccVar2 = this.zzb.zzj;
            e0.i(zzccVar2);
            zzccVar2.clearMeasurementEnabled(this.zzh);
        }
    }
}
