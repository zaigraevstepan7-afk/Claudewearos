package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzabr {
    private final zzabq zza;
    private final zzabv zzb;
    private boolean zzc;
    private long zzf;
    private boolean zzi;
    private boolean zzl;
    private boolean zzm;
    private int zzd = 0;
    private long zze = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private float zzj = 1.0f;
    private zzdj zzk = zzdj.zza;

    public zzabr(Context context, zzabq zzabqVar, long j) {
        this.zza = zzabqVar;
        this.zzb = new zzabv(context);
    }

    private final void zzo(int i10) {
        this.zzd = Math.min(this.zzd, i10);
    }

    public final int zza(long j, long j4, long j10, long j11, boolean z2, boolean z10, zzabp zzabpVar) {
        boolean z11;
        zzabp.zzg(zzabpVar);
        if (this.zzc && this.zze == -9223372036854775807L) {
            this.zze = j4;
        }
        if (this.zzg != j) {
            this.zzb.zzd(j);
            this.zzg = j;
        }
        long jZzs = (long) ((j - j4) / this.zzj);
        if (this.zzc) {
            jZzs -= zzex.zzs(this.zzk.zzb()) - j10;
        }
        zzabpVar.zza = jZzs;
        if (z2 && !z10) {
            return 3;
        }
        if (!this.zzl) {
            this.zzm = true;
            if (this.zza.zzaY(zzabpVar.zza, j4, j10, z10, true)) {
                return 4;
            }
            return (!this.zzc || zzabpVar.zza >= 30000) ? 5 : 3;
        }
        long j12 = zzabpVar.zza;
        if (this.zzh == -9223372036854775807L || this.zzi) {
            int i10 = this.zzd;
            if (i10 == 0) {
                z11 = false;
                if (this.zzc) {
                    return 0;
                }
            } else {
                if (i10 == 1) {
                    return 0;
                }
                if (i10 == 2) {
                    z11 = false;
                    if (j4 >= j11) {
                        return 0;
                    }
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    z11 = false;
                    long jZzs2 = zzex.zzs(this.zzk.zzb()) - this.zzf;
                    if (this.zzc) {
                        long j13 = this.zze;
                        if (j13 != -9223372036854775807L && j13 != j4 && j12 < -30000 && jZzs2 > 100000) {
                            return 0;
                        }
                    }
                }
            }
        } else {
            z11 = false;
        }
        if (!this.zzc || j4 == this.zze) {
            return 5;
        }
        long jZzc = this.zzk.zzc();
        zzabpVar.zzb = this.zzb.zza((zzabpVar.zza * 1000) + jZzc);
        zzabpVar.zza = (zzabpVar.zzb - jZzc) / 1000;
        boolean z12 = (this.zzh == -9223372036854775807L || this.zzi) ? z11 : true;
        if (this.zza.zzaY(zzabpVar.zza, j4, j10, z10, z12)) {
            return 4;
        }
        return (zzabpVar.zza >= -30000 || z10) ? zzabpVar.zza > 50000 ? 5 : 1 : z12 ? 3 : 2;
    }

    public final void zzb() {
        if (this.zzd == 0) {
            this.zzd = 1;
        }
    }

    public final void zzc(boolean z2) {
        this.zzi = z2;
        this.zzh = -9223372036854775807L;
    }

    public final void zzd() {
        this.zzc = true;
        this.zzf = zzex.zzs(this.zzk.zzb());
        this.zzb.zzg();
    }

    public final void zze() {
        this.zzc = false;
        this.zzh = -9223372036854775807L;
        this.zzb.zzh();
    }

    public final void zzf(int i10) {
        if (i10 == 0) {
            this.zzd = 1;
        } else if (i10 != 1) {
            zzo(2);
        } else {
            this.zzd = 0;
        }
    }

    public final void zzg() {
        this.zzb.zzf();
        this.zzg = -9223372036854775807L;
        this.zze = -9223372036854775807L;
        zzo(1);
        this.zzh = -9223372036854775807L;
    }

    public final void zzh(int i10) {
        this.zzb.zzj(i10);
    }

    public final void zzi(zzdj zzdjVar) {
        this.zzk = zzdjVar;
    }

    public final void zzj(float f10) {
        this.zzb.zzc(f10);
    }

    public final void zzk(Surface surface) {
        this.zzl = surface != null;
        this.zzm = false;
        this.zzb.zzi(surface);
        zzo(1);
    }

    public final void zzl(float f10) {
        zzdd.zzd(f10 > 0.0f);
        if (f10 == this.zzj) {
            return;
        }
        this.zzj = f10;
        this.zzb.zze(f10);
    }

    public final boolean zzm(boolean z2) {
        if (z2 && (this.zzd == 3 || (!this.zzl && this.zzm))) {
            this.zzh = -9223372036854775807L;
            return true;
        }
        if (this.zzh == -9223372036854775807L) {
            return false;
        }
        if (this.zzk.zzb() < this.zzh) {
            return true;
        }
        this.zzh = -9223372036854775807L;
        return false;
    }

    public final boolean zzn() {
        int i10 = this.zzd;
        this.zzd = 3;
        this.zzf = zzex.zzs(this.zzk.zzb());
        return i10 != 3;
    }
}
