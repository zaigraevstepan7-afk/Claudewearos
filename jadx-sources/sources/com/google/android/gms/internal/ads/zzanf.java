package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzanf {
    private final zzaez zza;
    private long zzb;
    private boolean zzc;
    private int zzd;
    private long zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private boolean zzm;

    public zzanf(zzaez zzaezVar) {
        this.zza = zzaezVar;
    }

    private final void zze(int i10) {
        long j = this.zzl;
        if (j != -9223372036854775807L) {
            long j4 = this.zzb;
            long j10 = this.zzk;
            if (j4 == j10) {
                return;
            }
            int i11 = (int) (j4 - j10);
            this.zza.zzt(j, this.zzm ? 1 : 0, i11, i10, null);
        }
    }

    public final void zza(long j, int i10, boolean z2) {
        if (this.zzj && this.zzg) {
            this.zzm = this.zzc;
            this.zzj = false;
        } else if (this.zzh || this.zzg) {
            if (z2 && this.zzi) {
                zze(i10 + ((int) (j - this.zzb)));
            }
            this.zzk = this.zzb;
            this.zzl = this.zze;
            this.zzm = this.zzc;
            this.zzi = true;
        }
    }

    public final void zzb(byte[] bArr, int i10, int i11) {
        if (this.zzf) {
            int i12 = this.zzd;
            int i13 = (i10 + 2) - i12;
            if (i13 >= i11) {
                this.zzd = (i11 - i10) + i12;
            } else {
                this.zzg = (bArr[i13] & 128) != 0;
                this.zzf = false;
            }
        }
    }

    public final void zzc() {
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = false;
        this.zzj = false;
    }

    public final void zzd(long j, int i10, int i11, long j4, boolean z2) {
        this.zzg = false;
        this.zzh = false;
        this.zze = j4;
        this.zzd = 0;
        this.zzb = j;
        if (i11 >= 32 && i11 != 40) {
            if (this.zzi && !this.zzj) {
                if (z2) {
                    zze(i10);
                }
                this.zzi = false;
            }
            if (i11 <= 35 || i11 == 39) {
                this.zzh = !this.zzj;
                this.zzj = true;
            }
        }
        boolean z10 = i11 >= 16 && i11 <= 21;
        this.zzc = z10;
        this.zzf = z10 || i11 <= 9;
    }
}
