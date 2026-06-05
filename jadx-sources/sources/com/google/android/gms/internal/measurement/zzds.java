package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.e0;
import xd.b;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzds extends zzdt {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzee zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzds(zzee zzeeVar, String str, String str2, Object obj, boolean z2) {
        super(zzeeVar, true);
        this.zze = zzeeVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = z2;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() {
        zzcc zzccVar = this.zze.zzj;
        e0.i(zzccVar);
        zzccVar.setUserProperty(this.zza, this.zzb, new b(this.zzc), this.zzd, this.zzh);
    }
}
