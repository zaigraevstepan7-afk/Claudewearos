package com.google.android.gms.internal.ads;

import java.util.List;
import rc.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdea {
    private final List zza;
    private final zzfjq zzb;
    private final p zzc;
    private boolean zzd;

    public zzdea(zzfbt zzfbtVar, zzfjq zzfjqVar) {
        this.zza = zzfbtVar.zzp;
        this.zzb = zzfjqVar;
        this.zzc = zzfbtVar.zzax;
    }

    public final void zza() {
        if (this.zzd) {
            return;
        }
        this.zzb.zze(this.zza, this.zzc);
        this.zzd = true;
    }
}
