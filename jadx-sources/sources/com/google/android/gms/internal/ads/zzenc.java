package com.google.android.gms.internal.ads;

import android.os.Bundle;
import nc.t;
import nc.v3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzenc implements zzett {
    private final v3 zza;
    private final boolean zzb;

    public zzenc(v3 v3Var, boolean z2) {
        this.zza = v3Var;
        this.zzb = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final void zzb(Object obj) {
        Bundle bundle = ((zzcut) obj).zza;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfE)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzb);
        }
        v3 v3Var = this.zza;
        if (v3Var != null) {
            int i10 = v3Var.f12256a;
            if (i10 == 1) {
                bundle.putString("avo", "p");
            } else if (i10 == 2) {
                bundle.putString("avo", "l");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* synthetic */ void zza(Object obj) {
    }
}
