package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzanb {
    private final zzaez zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    public zzanb(zzaez zzaezVar) {
        this.zza = zzaezVar;
    }

    public final void zza(byte[] bArr, int i10, int i11) {
        if (this.zzc) {
            int i12 = this.zzf;
            int i13 = (i10 + 1) - i12;
            if (i13 >= i11) {
                this.zzf = (i11 - i10) + i12;
            } else {
                this.zzd = ((bArr[i13] & 192) >> 6) == 0;
                this.zzc = false;
            }
        }
    }

    public final void zzb(long j, int i10, boolean z2) {
        zzdd.zzf(this.zzh != -9223372036854775807L);
        if (this.zze == 182 && z2 && this.zzb) {
            this.zza.zzt(this.zzh, this.zzd ? 1 : 0, (int) (j - this.zzg), i10, null);
        }
        if (this.zze != 179) {
            this.zzg = j;
        }
    }

    public final void zzc(int i10, long j) {
        boolean z2;
        this.zze = i10;
        this.zzd = false;
        if (i10 == 182) {
            z2 = true;
        } else if (i10 == 179) {
            i10 = 179;
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = i10 == 182;
        this.zzf = 0;
        this.zzh = j;
    }

    public final void zzd() {
        this.zzb = false;
        this.zzc = false;
        this.zzd = false;
        this.zze = -1;
    }
}
