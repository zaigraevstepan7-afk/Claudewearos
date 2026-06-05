package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzand {
    private final zzaez zza;
    private final SparseArray zzb = new SparseArray();
    private final SparseArray zzc = new SparseArray();
    private final byte[] zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private boolean zzl;

    public zzand(zzaez zzaezVar, boolean z2, boolean z10) {
        this.zza = zzaezVar;
        byte[] bArr = new byte[128];
        this.zzd = bArr;
        new zzfw(bArr, 0, 0);
        this.zzh = false;
    }

    public final void zza(zzft zzftVar) {
        this.zzc.append(zzftVar.zza, zzftVar);
    }

    public final void zzb(zzfu zzfuVar) {
        this.zzb.append(zzfuVar.zzd, zzfuVar);
    }

    public final void zzc() {
        this.zzh = false;
    }

    public final void zzd(long j, int i10, long j4, boolean z2) {
        this.zze = i10;
        this.zzg = j4;
        this.zzf = j;
        this.zzl = z2;
    }

    public final boolean zze(long j, int i10, boolean z2) {
        boolean z10 = false;
        if (this.zze == 9) {
            if (z2 && this.zzh) {
                long j4 = this.zzf;
                int i11 = i10 + ((int) (j - j4));
                long j10 = this.zzj;
                if (j10 != -9223372036854775807L) {
                    long j11 = this.zzi;
                    if (j4 != j11) {
                        this.zza.zzt(j10, this.zzk ? 1 : 0, (int) (j4 - j11), i11, null);
                    }
                }
            }
            this.zzi = this.zzf;
            this.zzj = this.zzg;
            this.zzk = false;
            this.zzh = true;
        }
        boolean z11 = this.zzl;
        boolean z12 = this.zzk;
        int i12 = this.zze;
        if (i12 == 5 || (z11 && i12 == 1)) {
            z10 = true;
        }
        boolean z13 = z12 | z10;
        this.zzk = z13;
        this.zze = 24;
        return z13;
    }
}
