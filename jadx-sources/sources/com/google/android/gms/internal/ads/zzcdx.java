package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcdx implements zzkx {
    private final zzzm zza = new zzzm(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    public final void zza(boolean z2) {
        this.zzf = 0;
        this.zzg = false;
        if (z2) {
            this.zza.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final long zzb(zzph zzphVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final void zzc(zzph zzphVar) {
        zza(false);
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final void zzd(zzph zzphVar) {
        zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final void zze(zzph zzphVar) {
        zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final void zzf(zzkw zzkwVar, zzxk zzxkVar, zzyw[] zzywVarArr) {
        int i10;
        this.zzf = 0;
        for (zzyw zzywVar : zzywVarArr) {
            if (zzywVar != null) {
                int i11 = this.zzf;
                int i12 = zzywVar.zzc().zzc;
                if (i12 == 0) {
                    i10 = 144310272;
                } else if (i12 == 1) {
                    i10 = 13107200;
                } else if (i12 != 2) {
                    i10 = 131072;
                    if (i12 != 3 && i12 != 5 && i12 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i10 = 131072000;
                }
                this.zzf = i11 + i10;
            }
        }
        this.zza.zzf(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final boolean zzg(zzph zzphVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final boolean zzh(zzkw zzkwVar) {
        long j = zzkwVar.zzb;
        boolean z2 = true;
        char c6 = j > this.zzc ? (char) 0 : j < this.zzb ? (char) 2 : (char) 1;
        int iZza = this.zza.zza();
        int i10 = this.zzf;
        if (c6 != 2 && (c6 != 1 || !this.zzg || iZza >= i10)) {
            z2 = false;
        }
        this.zzg = z2;
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final /* synthetic */ boolean zzi(zzbl zzblVar, zzvh zzvhVar, long j) {
        zzea.zzf("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final boolean zzj(zzkw zzkwVar) {
        long j = zzkwVar.zzd ? this.zze : this.zzd;
        return j <= 0 || zzkwVar.zzb >= j;
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    public final zzzm zzk() {
        return this.zza;
    }

    public final synchronized void zzl(int i10) {
        this.zzd = i10 * 1000;
    }

    public final synchronized void zzm(int i10) {
        this.zze = i10 * 1000;
    }

    public final synchronized void zzn(int i10) {
        this.zzc = i10 * 1000;
    }

    public final synchronized void zzo(int i10) {
        this.zzb = i10 * 1000;
    }
}
