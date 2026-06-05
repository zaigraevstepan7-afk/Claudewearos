package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzale {
    private final zzen zza = new zzen();
    private final int[] zzb = new int[256];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    public static /* bridge */ /* synthetic */ void zzb(zzale zzaleVar, zzen zzenVar, int i10) {
        int iZzo;
        if (i10 < 4) {
            return;
        }
        zzenVar.zzM(3);
        int i11 = i10 - 4;
        if ((zzenVar.zzm() & 128) != 0) {
            if (i11 < 7 || (iZzo = zzenVar.zzo()) < 4) {
                return;
            }
            zzaleVar.zzh = zzenVar.zzq();
            zzaleVar.zzi = zzenVar.zzq();
            zzaleVar.zza.zzI(iZzo - 4);
            i11 = i10 - 11;
        }
        zzen zzenVar2 = zzaleVar.zza;
        int iZzc = zzenVar2.zzc();
        int iZzd = zzenVar2.zzd();
        if (iZzc >= iZzd || i11 <= 0) {
            return;
        }
        int iMin = Math.min(i11, iZzd - iZzc);
        zzenVar.zzH(zzenVar2.zzN(), iZzc, iMin);
        zzenVar2.zzL(iZzc + iMin);
    }

    public static /* bridge */ /* synthetic */ void zzc(zzale zzaleVar, zzen zzenVar, int i10) {
        if (i10 < 19) {
            return;
        }
        zzaleVar.zzd = zzenVar.zzq();
        zzaleVar.zze = zzenVar.zzq();
        zzenVar.zzM(11);
        zzaleVar.zzf = zzenVar.zzq();
        zzaleVar.zzg = zzenVar.zzq();
    }

    public static /* bridge */ /* synthetic */ void zzd(zzale zzaleVar, zzen zzenVar, int i10) {
        if (i10 % 5 != 2) {
            return;
        }
        zzenVar.zzM(2);
        int[] iArr = zzaleVar.zzb;
        Arrays.fill(iArr, 0);
        int i11 = 0;
        for (int i12 = i10 / 5; i11 < i12; i12 = i12) {
            int iZzm = zzenVar.zzm();
            int iZzm2 = zzenVar.zzm();
            int iZzm3 = zzenVar.zzm();
            int iZzm4 = zzenVar.zzm();
            double d10 = iZzm2;
            int iZzm5 = zzenVar.zzm() << 24;
            String str = zzex.zza;
            double d11 = iZzm3 - 128;
            double d12 = iZzm4 - 128;
            iArr[iZzm] = (Math.max(0, Math.min((int) ((1.402d * d11) + d10), 255)) << 16) | iZzm5 | (Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 255)) << 8) | Math.max(0, Math.min((int) ((d12 * 1.772d) + d10), 255));
            i11++;
        }
        zzaleVar.zzc = true;
    }

    public final zzcu zza() {
        int i10;
        if (this.zzd == 0 || this.zze == 0 || this.zzh == 0 || this.zzi == 0) {
            return null;
        }
        zzen zzenVar = this.zza;
        if (zzenVar.zzd() == 0 || zzenVar.zzc() != zzenVar.zzd() || !this.zzc) {
            return null;
        }
        zzenVar.zzL(0);
        int i11 = this.zzh * this.zzi;
        int[] iArr = new int[i11];
        int i12 = 0;
        while (i12 < i11) {
            int iZzm = zzenVar.zzm();
            if (iZzm != 0) {
                i10 = i12 + 1;
                iArr[i12] = this.zzb[iZzm];
            } else {
                int iZzm2 = zzenVar.zzm();
                if (iZzm2 != 0) {
                    int iZzm3 = iZzm2 & 63;
                    if ((iZzm2 & 64) != 0) {
                        iZzm3 = (iZzm3 << 8) | zzenVar.zzm();
                    }
                    i10 = iZzm3 + i12;
                    Arrays.fill(iArr, i12, i10, (iZzm2 & 128) == 0 ? this.zzb[0] : this.zzb[zzenVar.zzm()]);
                }
            }
            i12 = i10;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
        zzcs zzcsVar = new zzcs();
        zzcsVar.zzc(bitmapCreateBitmap);
        zzcsVar.zzh(this.zzf / this.zzd);
        zzcsVar.zzi(0);
        zzcsVar.zze(this.zzg / this.zze, 0);
        zzcsVar.zzf(0);
        zzcsVar.zzk(this.zzh / this.zzd);
        zzcsVar.zzd(this.zzi / this.zze);
        return zzcsVar.zzq();
    }

    public final void zze() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zzI(0);
        this.zzc = false;
    }
}
