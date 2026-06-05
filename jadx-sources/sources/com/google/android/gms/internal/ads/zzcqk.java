package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcqk implements zzcxf, zzazb, zzdaq {
    private final zzfbt zza;
    private final zzcwj zzb;
    private final zzcxo zzc;
    private final zzcyf zzf;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();
    private final AtomicBoolean zzg = new AtomicBoolean();

    public zzcqk(zzfbt zzfbtVar, zzcwj zzcwjVar, zzcxo zzcxoVar, zzcyf zzcyfVar) {
        this.zza = zzfbtVar;
        this.zzb = zzcwjVar;
        this.zzc = zzcxoVar;
        this.zzf = zzcyfVar;
    }

    private final void zzd() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdaq
    public final void zzdq() {
        if (this.zza.zze == 4) {
            zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazb
    public final void zzdr(zzaza zzazaVar) {
        int i10 = this.zza.zze;
        if (i10 == 1) {
            if (zzazaVar.zzj) {
                zzd();
            }
        } else if (i10 == 4 && zzazaVar.zzj && this.zzg.compareAndSet(false, true)) {
            this.zzf.zza();
        }
        if (zzazaVar.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxf
    public final synchronized void zzt() {
        int i10 = this.zza.zze;
        if (i10 == 1 || i10 == 4) {
            return;
        }
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzdaq
    public final void zzdp() {
    }
}
