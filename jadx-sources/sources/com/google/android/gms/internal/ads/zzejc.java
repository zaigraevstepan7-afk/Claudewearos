package com.google.android.gms.internal.ads;

import android.view.View;
import mc.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzejc implements f {
    private f zza;

    @Override // mc.f
    public final synchronized void zza(View view) {
        f fVar = this.zza;
        if (fVar != null) {
            fVar.zza(view);
        }
    }

    @Override // mc.f
    public final synchronized void zzb() {
        f fVar = this.zza;
        if (fVar != null) {
            fVar.zzb();
        }
    }

    @Override // mc.f
    public final synchronized void zzc() {
        f fVar = this.zza;
        if (fVar != null) {
            fVar.zzc();
        }
    }

    public final synchronized void zzd(f fVar) {
        this.zza = fVar;
    }
}
