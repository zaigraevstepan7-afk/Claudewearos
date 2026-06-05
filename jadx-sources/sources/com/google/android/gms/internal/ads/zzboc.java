package com.google.android.gms.internal.ads;

import nc.t;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzboc implements zzcak {
    final /* synthetic */ zzboa zza;

    public zzboc(zzbof zzbofVar, zzboa zzboaVar) {
        this.zza = zzboaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcak
    public final void zza() {
        l0.k("Rejecting reference for JS Engine.");
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzhT)).booleanValue()) {
            this.zza.zzh(new IllegalStateException("Unable to create JS engine reference."), "SdkJavascriptFactory.createNewReference.FailureCallback");
        } else {
            this.zza.zzg();
        }
    }
}
