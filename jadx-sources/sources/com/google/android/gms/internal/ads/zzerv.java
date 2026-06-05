package com.google.android.gms.internal.ads;

import android.os.Bundle;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzerv implements zzett {
    public final zzfbs zza;

    public zzerv(zzfbs zzfbsVar) {
        this.zza = zzfbsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final void zzb(Object obj) {
        zzcut zzcutVar = (zzcut) obj;
        zzfbs zzfbsVar = this.zza;
        if (zzfbsVar != null) {
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzmh)).booleanValue()) {
                return;
            }
            Bundle bundle = zzcutVar.zza;
            bundle.putBoolean("render_in_browser", zzfbsVar.zzd());
            bundle.putBoolean("disable_ml", zzfbsVar.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* synthetic */ void zza(Object obj) {
    }
}
