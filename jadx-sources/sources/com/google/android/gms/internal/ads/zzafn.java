package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzafn implements zzafh {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzafn(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.zza = i10;
        this.zzb = i12;
        this.zzc = i13;
        this.zzd = i14;
        this.zze = i15;
        this.zzf = i16;
    }

    public static zzafn zzd(zzen zzenVar) {
        int iZzi = zzenVar.zzi();
        zzenVar.zzM(12);
        int iZzi2 = zzenVar.zzi();
        int iZzi3 = zzenVar.zzi();
        int iZzi4 = zzenVar.zzi();
        zzenVar.zzM(4);
        int iZzi5 = zzenVar.zzi();
        int iZzi6 = zzenVar.zzi();
        zzenVar.zzM(4);
        return new zzafn(iZzi, iZzi2, iZzi3, iZzi4, iZzi5, iZzi6, zzenVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzafh
    public final int zza() {
        return 1752331379;
    }

    public final int zzb() {
        int i10 = this.zza;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        zzea.zzf("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i10))));
        return -1;
    }

    public final long zzc() {
        return zzex.zzu(this.zzd, this.zzb * 1000000, this.zzc, RoundingMode.DOWN);
    }
}
