package com.google.android.gms.internal.ads;

import android.view.ViewParent;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcpp implements zzcwl {
    private final zzcfe zza;
    private final zzdsc zzb;
    private final zzfbt zzc;

    public zzcpp(zzcfe zzcfeVar, zzdsc zzdscVar, zzfbt zzfbtVar) {
        this.zza = zzcfeVar;
        this.zzb = zzdscVar;
        this.zzc = zzfbtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzs() {
        zzcfe zzcfeVar;
        String str;
        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznc)).booleanValue() || (zzcfeVar = this.zza) == null) {
            return;
        }
        ViewParent parent = zzcfeVar.zzF().getParent();
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
        zzdsb zzdsbVarZza = this.zzb.zza();
        zzdsbVarZza.zzb("action", "hcp");
        zzdsbVarZza.zzb("hcp", str);
        zzdsbVarZza.zzc(this.zzc);
        zzdsbVarZza.zzj();
    }
}
