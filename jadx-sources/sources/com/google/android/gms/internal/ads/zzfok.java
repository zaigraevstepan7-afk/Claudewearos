package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfok {
    private final Context zza;
    private final Looper zzb;

    public zzfok(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfov zzfovVarZza = zzfoy.zza();
        Context context = this.zza;
        zzfovVarZza.zza(context.getPackageName());
        zzfovVarZza.zzc(2);
        zzfos zzfosVarZza = zzfou.zza();
        zzfosVarZza.zza(str);
        zzfosVarZza.zzb(2);
        zzfovVarZza.zzb(zzfosVarZza);
        new zzfol(context, this.zzb, (zzfoy) zzfovVarZza.zzbr()).zza();
    }
}
