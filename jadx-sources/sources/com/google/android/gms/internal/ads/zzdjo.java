package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdjo {
    private final zzdsc zza;

    public zzdjo(zzdsc zzdscVar) {
        this.zza = zzdscVar;
    }

    public final void zza(View view, zzfbt zzfbtVar) {
        String str;
        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznc)).booleanValue() || view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        while (true) {
            if (parent == null) {
                str = "0";
                break;
            } else {
                if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                    str = "1";
                    break;
                }
                parent = parent.getParent();
            }
        }
        zzdsb zzdsbVarZza = this.zza.zza();
        zzdsbVarZza.zzb("action", "hcp");
        zzdsbVarZza.zzb("hcp", str);
        zzdsbVarZza.zzc(zzfbtVar);
        zzdsbVarZza.zzj();
    }
}
