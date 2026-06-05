package com.google.android.gms.internal.ads;

import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeab {
    private final zzbvi zza;

    public zzeab(zzbvi zzbviVar) {
        this.zza = zzbviVar;
    }

    public final void zza() {
        mf.a aVarZza = this.zza.zza();
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzhU)).booleanValue()) {
            zzcag.zzb(aVarZza, "persistFlags");
        } else {
            zzcag.zza(aVarZza, "persistFlags");
        }
    }
}
