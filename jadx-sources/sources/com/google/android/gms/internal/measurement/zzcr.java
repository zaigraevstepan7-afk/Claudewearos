package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.e0;
import xd.b;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzcr extends zzdt {
    final /* synthetic */ Activity zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzee zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcr(zzee zzeeVar, Activity activity, String str, String str2) {
        super(zzeeVar, true);
        this.zzd = zzeeVar;
        this.zza = activity;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() {
        zzcc zzccVar = this.zzd.zzj;
        e0.i(zzccVar);
        zzccVar.setCurrentScreen(new b(this.zza), this.zzb, this.zzc, this.zzh);
    }
}
