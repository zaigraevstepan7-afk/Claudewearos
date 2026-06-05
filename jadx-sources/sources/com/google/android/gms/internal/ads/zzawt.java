package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbch;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzawt implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzawv zzb;

    public zzawt(zzawv zzawvVar, int i10, boolean z2) {
        this.zza = i10;
        this.zzb = zzawvVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        zzato zzatoVarZza;
        int i10 = this.zza;
        zzawv zzawvVar = this.zzb;
        if (i10 > 0) {
            try {
                Thread.sleep(i10 * zzbch.zzq.zzf);
            } catch (InterruptedException unused) {
            }
        }
        try {
            Context context = zzawvVar.zza;
            zzatoVarZza = zzfoh.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused2) {
            zzatoVarZza = null;
        }
        zzawv zzawvVar2 = this.zzb;
        zzawvVar2.zzk = zzatoVarZza;
        int i11 = this.zza;
        if (i11 < 4) {
            if (zzatoVarZza != null && zzatoVarZza.zzaf() && !zzatoVarZza.zzg().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzatoVarZza.zzag() && zzatoVarZza.zzf().zzg() && zzatoVarZza.zzf().zza() != -2) {
                return;
            }
            zzawvVar2.zzn(i11 + 1, true);
        }
    }
}
