package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import mc.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeir implements f {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzcvp zzb;
    private final zzcwj zzc;
    private final zzddy zzd;
    private final zzddq zze;
    private final zzcni zzf;

    public zzeir(zzcvp zzcvpVar, zzcwj zzcwjVar, zzddy zzddyVar, zzddq zzddqVar, zzcni zzcniVar) {
        this.zzb = zzcvpVar;
        this.zzc = zzcwjVar;
        this.zzd = zzddyVar;
        this.zze = zzddqVar;
        this.zzf = zzcniVar;
    }

    @Override // mc.f
    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzs();
            this.zze.zza(view);
        }
    }

    @Override // mc.f
    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override // mc.f
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
