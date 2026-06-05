package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import pc.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcrq implements m {
    private final zzcwy zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    public zzcrq(zzcwy zzcwyVar) {
        this.zza = zzcwyVar;
    }

    private final void zzh() {
        AtomicBoolean atomicBoolean = this.zzc;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.zza.zza();
    }

    @Override // pc.m
    public final void zzds() {
        zzh();
    }

    @Override // pc.m
    public final void zzdt() {
        this.zza.zzc();
    }

    @Override // pc.m
    public final void zzdw(int i10) {
        this.zzb.set(true);
        zzh();
    }

    public final boolean zzg() {
        return this.zzb.get();
    }

    @Override // pc.m
    public final void zzdH() {
    }

    @Override // pc.m
    public final void zzdk() {
    }

    @Override // pc.m
    public final void zzdv() {
    }
}
