package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzabg {
    private final Context zza;
    private final zzabr zzb;
    private zzca zzc;
    private boolean zzd;
    private zzdj zze = zzdj.zza;
    private boolean zzf;

    public zzabg(Context context, zzabr zzabrVar) {
        this.zza = context.getApplicationContext();
        this.zzb = zzabrVar;
    }

    public final zzabg zzd(zzdj zzdjVar) {
        this.zze = zzdjVar;
        return this;
    }

    public final zzabg zze(boolean z2) {
        this.zzd = true;
        return this;
    }

    public final zzabn zzf() {
        zzdd.zzf(!this.zzf);
        if (this.zzc == null) {
            this.zzc = new zzabk(false);
        }
        zzabn zzabnVar = new zzabn(this, null);
        this.zzf = true;
        return zzabnVar;
    }
}
