package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzems {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzemr zzb;

    public final zzemr zza() {
        return this.zzb;
    }

    public final void zzb(zzemr zzemrVar) {
        this.zzb = zzemrVar;
    }

    public final void zzc(boolean z2) {
        this.zza.set(true);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}
