package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzflc {
    private boolean zza;

    public final void zza(Context context) {
        zzfmz.zzc(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzfmh.zzb().zzd(context);
        zzfly.zza().zzd(context);
        zzfmu.zzb(context);
        zzfmv.zzd(context);
        zzfmy.zza(context);
        zzfme.zzb().zzc(context);
        zzflx.zza().zzd(context);
        zzfmj.zza().zze(context);
    }

    public final boolean zzb() {
        return this.zza;
    }
}
