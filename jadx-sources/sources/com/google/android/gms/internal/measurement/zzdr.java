package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzdr extends zzdt {
    final /* synthetic */ Long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ zzee zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdr(zzee zzeeVar, Long l10, String str, String str2, Bundle bundle, boolean z2, boolean z10) {
        super(zzeeVar, true);
        this.zzg = zzeeVar;
        this.zza = l10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bundle;
        this.zze = z2;
        this.zzf = z10;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() {
        Long l10 = this.zza;
        long jLongValue = l10 == null ? this.zzh : l10.longValue();
        zzcc zzccVar = this.zzg.zzj;
        e0.i(zzccVar);
        zzccVar.logEvent(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, jLongValue);
    }
}
