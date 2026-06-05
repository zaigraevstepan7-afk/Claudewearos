package com.google.android.gms.internal.ads;

import android.content.Context;
import qc.n0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbyf {
    private Context zza;
    private ud.a zzb;
    private n0 zzc;
    private zzbym zzd;

    private zzbyf() {
        throw null;
    }

    public final zzbyf zza(n0 n0Var) {
        this.zzc = n0Var;
        return this;
    }

    public final zzbyf zzb(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final zzbyf zzc(ud.a aVar) {
        aVar.getClass();
        this.zzb = aVar;
        return this;
    }

    public final zzbyf zzd(zzbym zzbymVar) {
        this.zzd = zzbymVar;
        return this;
    }

    public final zzbyn zze() {
        zzhgg.zzc(this.zza, Context.class);
        zzhgg.zzc(this.zzb, ud.a.class);
        zzhgg.zzc(this.zzc, n0.class);
        zzhgg.zzc(this.zzd, zzbym.class);
        return new zzbyg(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public /* synthetic */ zzbyf(zzbyh zzbyhVar) {
    }
}
