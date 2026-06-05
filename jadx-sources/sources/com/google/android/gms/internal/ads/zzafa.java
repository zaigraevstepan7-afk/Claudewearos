package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzafa {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza(zzaez zzaezVar, zzaey zzaeyVar) {
        if (this.zzc > 0) {
            zzaezVar.zzt(this.zzd, this.zze, this.zzf, this.zzg, zzaeyVar);
            this.zzc = 0;
        }
    }

    public final void zzb() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzc(zzaez zzaezVar, long j, int i10, int i11, int i12, zzaey zzaeyVar) {
        zzdd.zzg(this.zzg <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.zzb) {
            int i13 = this.zzc;
            int i14 = i13 + 1;
            this.zzc = i14;
            if (i13 == 0) {
                this.zzd = j;
                this.zze = i10;
                this.zzf = 0;
            }
            this.zzf += i11;
            this.zzg = i12;
            if (i14 >= 16) {
                zza(zzaezVar, zzaeyVar);
            }
        }
    }

    public final void zzd(zzadu zzaduVar) {
        if (this.zzb) {
            return;
        }
        byte[] bArr = this.zza;
        zzaduVar.zzh(bArr, 0, 10);
        zzaduVar.zzj();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }
}
