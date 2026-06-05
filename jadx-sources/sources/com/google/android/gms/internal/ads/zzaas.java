package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzaas {
    private long zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private final boolean[] zzg = new boolean[15];
    private int zzh;

    public final long zza() {
        long j = this.zze;
        if (j == 0) {
            return 0L;
        }
        return this.zzf / j;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final void zzc(long j) {
        long j4 = this.zzd;
        if (j4 == 0) {
            this.zza = j;
        } else if (j4 == 1) {
            long j10 = j - this.zza;
            this.zzb = j10;
            this.zzf = j10;
            this.zze = 1L;
        } else {
            long j11 = j - this.zzc;
            int i10 = (int) (j4 % 15);
            if (Math.abs(j11 - this.zzb) <= 1000000) {
                this.zze++;
                this.zzf += j11;
                boolean[] zArr = this.zzg;
                if (zArr[i10]) {
                    zArr[i10] = false;
                    this.zzh--;
                }
            } else {
                boolean[] zArr2 = this.zzg;
                if (!zArr2[i10]) {
                    zArr2[i10] = true;
                    this.zzh++;
                }
            }
        }
        this.zzd++;
        this.zzc = j;
    }

    public final void zzd() {
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzh = 0;
        Arrays.fill(this.zzg, false);
    }

    public final boolean zze() {
        long j = this.zzd;
        if (j == 0) {
            return false;
        }
        return this.zzg[(int) ((j - 1) % 15)];
    }

    public final boolean zzf() {
        return this.zzd > 15 && this.zzh == 0;
    }
}
