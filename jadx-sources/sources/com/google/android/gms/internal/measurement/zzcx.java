package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import com.anonlab.voidlauncher.R;
import com.google.android.gms.common.internal.e0;
import xd.b;
import yd.e;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzcx extends zzdt {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ zzee zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcx(zzee zzeeVar, String str, String str2, Context context, Bundle bundle) {
        super(zzeeVar, true);
        this.zze = zzeeVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = context;
        this.zzd = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() throws Resources.NotFoundException {
        String str;
        String str2;
        String str3;
        String packageName;
        try {
            zzee zzeeVar = this.zze;
            if (zzee.zzV(this.zza, this.zzb)) {
                str3 = this.zzb;
                str2 = this.zza;
                str = this.zze.zzd;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            e0.i(this.zzc);
            zzee zzeeVar2 = this.zze;
            zzeeVar2.zzj = zzeeVar2.zzf(this.zzc, true);
            if (this.zze.zzj == null) {
                Log.w(this.zze.zzd, "Failed to connect to measurement client.");
                return;
            }
            int iA = e.a(this.zzc, "com.google.android.gms.measurement.dynamite");
            int iD = e.d(this.zzc, "com.google.android.gms.measurement.dynamite", false);
            int iMax = Math.max(iA, iD);
            boolean z2 = iD < iA;
            long j = iMax;
            Bundle bundle = this.zzd;
            Context context = this.zzc;
            try {
                packageName = context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
            zzcl zzclVar = new zzcl(61000L, j, z2, str, str2, str3, bundle, packageName);
            zzcc zzccVar = this.zze.zzj;
            e0.i(zzccVar);
            zzccVar.initialize(new b(this.zzc), zzclVar, this.zzh);
        } catch (Exception e10) {
            this.zze.zzS(e10, true, false);
        }
    }
}
