package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgco extends zzgcb {
    private zzgcn zza;

    public zzgco(zzfya zzfyaVar, boolean z2, Executor executor, Callable callable) {
        super(zzfyaVar, z2, false);
        this.zza = new zzgcm(this, callable, executor);
        zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public final void zzA(int i10) {
        super.zzA(i10);
        if (i10 == 1) {
            this.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final void zzk() {
        zzgcn zzgcnVar = this.zza;
        if (zzgcnVar != null) {
            zzgcnVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public final void zzy() {
        zzgcn zzgcnVar = this.zza;
        if (zzgcnVar != null) {
            zzgcnVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public final void zzx(int i10, Object obj) {
    }
}
