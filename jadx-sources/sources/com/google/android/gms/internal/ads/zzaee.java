package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaee {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final zzaed zzk;
    private final zzav zzl;

    private zzaee(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j, zzaed zzaedVar, zzav zzavVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
        this.zzf = zzi(i14);
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = zzh(i16);
        this.zzj = j;
        this.zzk = zzaedVar;
        this.zzl = zzavVar;
    }

    private static int zzh(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 20) {
            return 5;
        }
        if (i10 != 24) {
            return i10 != 32 ? -1 : 7;
        }
        return 6;
    }

    private static int zzi(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long zza() {
        long j = this.zzj;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.zze;
    }

    public final long zzb(long j) {
        String str = zzex.zza;
        return Math.max(0L, Math.min((j * this.zze) / 1000000, this.zzj - 1));
    }

    public final zzz zzc(byte[] bArr, zzav zzavVar) {
        bArr[4] = Byte.MIN_VALUE;
        zzav zzavVarZzd = zzd(zzavVar);
        zzx zzxVar = new zzx();
        zzxVar.zzah("audio/flac");
        int i10 = this.zzd;
        if (i10 <= 0) {
            i10 = -1;
        }
        zzxVar.zzX(i10);
        zzxVar.zzD(this.zzg);
        zzxVar.zzai(this.zze);
        zzxVar.zzab(zzex.zzn(this.zzh));
        zzxVar.zzT(Collections.singletonList(bArr));
        zzxVar.zzaa(zzavVarZzd);
        return zzxVar.zzan();
    }

    public final zzav zzd(zzav zzavVar) {
        zzav zzavVar2 = this.zzl;
        return zzavVar2 == null ? zzavVar : zzavVar2.zzd(zzavVar);
    }

    public final zzaee zze(List list) {
        return new zzaee(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(new zzav(list)));
    }

    public final zzaee zzf(zzaed zzaedVar) {
        return new zzaee(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzaedVar, this.zzl);
    }

    public final zzaee zzg(List list) {
        return new zzaee(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(zzaff.zzb(list)));
    }

    public zzaee(byte[] bArr, int i10) {
        zzem zzemVar = new zzem(bArr, bArr.length);
        zzemVar.zzl(i10 * 8);
        this.zza = zzemVar.zzd(16);
        this.zzb = zzemVar.zzd(16);
        this.zzc = zzemVar.zzd(24);
        this.zzd = zzemVar.zzd(24);
        int iZzd = zzemVar.zzd(20);
        this.zze = iZzd;
        this.zzf = zzi(iZzd);
        this.zzg = zzemVar.zzd(3) + 1;
        int iZzd2 = zzemVar.zzd(5) + 1;
        this.zzh = iZzd2;
        this.zzi = zzh(iZzd2);
        this.zzj = zzemVar.zze(36);
        this.zzk = null;
        this.zzl = null;
    }
}
