package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzqq {
    private final zzqp zza;
    private final int zzb;
    private final zzqr zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;

    public zzqq(AudioTrack audioTrack, zzqr zzqrVar) {
        this.zza = new zzqp(audioTrack);
        this.zzb = audioTrack.getSampleRate();
        this.zzc = zzqrVar;
        zzh(0);
    }

    private final long zzf(long j, float f10) {
        zzqp zzqpVar = this.zza;
        return zzg(zzqpVar.zza(), zzqpVar.zzb(), j, f10);
    }

    private final long zzg(long j, long j4, long j10, float f10) {
        long j11 = j10 - j4;
        return zzex.zzq(j11, f10) + zzex.zzt(j, this.zzb);
    }

    private final void zzh(int i10) {
        this.zzd = i10;
        long j = 10000;
        if (i10 == 0) {
            this.zzg = 0L;
            this.zzh = -1L;
            this.zzi = -9223372036854775807L;
            this.zze = System.nanoTime() / 1000;
        } else {
            if (i10 == 1) {
                this.zzf = 10000L;
                return;
            }
            j = (i10 == 2 || i10 == 3) ? 10000000L : 500000L;
        }
        this.zzf = j;
    }

    public final long zza(long j, float f10) {
        return zzf(j, f10);
    }

    public final void zzb(long j, float f10, long j4) {
        if (j - this.zzg < this.zzf) {
            return;
        }
        this.zzg = j;
        zzqp zzqpVar = this.zza;
        boolean zZzc = zzqpVar.zzc();
        if (zZzc) {
            long jZzb = zzqpVar.zzb();
            long jZzf = zzf(j, f10);
            if (Math.abs(jZzb - j) > 5000000) {
                this.zzc.zzd(zzqpVar.zza(), jZzb, j, j4);
                zzh(4);
            } else if (Math.abs(jZzf - j4) > 5000000) {
                this.zzc.zzc(zzqpVar.zza(), jZzb, j, j4);
                zzh(4);
            } else if (this.zzd == 4) {
                zzh(0);
            }
        }
        int i10 = this.zzd;
        if (i10 == 0) {
            if (!zZzc) {
                if (j - this.zze > 500000) {
                    zzh(3);
                    return;
                }
                return;
            } else {
                if (zzqpVar.zzb() >= this.zze) {
                    this.zzh = zzqpVar.zza();
                    this.zzi = zzqpVar.zzb();
                    zzh(1);
                    return;
                }
                return;
            }
        }
        if (i10 != 1) {
            if (i10 == 2) {
                if (zZzc) {
                    return;
                }
                zzh(0);
                return;
            } else {
                if (i10 == 3 && zZzc) {
                    zzh(0);
                    return;
                }
                return;
            }
        }
        if (!zZzc) {
            zzh(0);
            return;
        }
        long jZza = zzqpVar.zza();
        long j10 = this.zzh;
        if (jZza > j10) {
            if (Math.abs(zzf(j, f10) - zzg(j10, this.zzi, j, f10)) < 1000) {
                zzh(2);
                return;
            }
        }
        if (j - this.zze > 2000000) {
            zzh(3);
        } else {
            this.zzh = zzqpVar.zza();
            this.zzi = zzqpVar.zzb();
        }
    }

    public final void zzc() {
        zzh(0);
    }

    public final boolean zzd() {
        return this.zzd == 2;
    }

    public final boolean zze() {
        int i10 = this.zzd;
        return i10 == 0 || i10 == 1;
    }
}
