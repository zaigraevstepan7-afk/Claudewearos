package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import nc.a2;
import nc.t3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzekt implements zzcyd {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(a2 a2Var) {
        this.zza.set(a2Var);
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzh(final t3 t3Var) {
        zzeyy.zza(this.zza, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzeks
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((a2) obj).i(t3Var);
            }
        });
    }
}
