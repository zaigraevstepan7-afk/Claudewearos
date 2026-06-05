package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfw {
    private byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    public zzfw(byte[] bArr, int i10, int i11) {
        this.zza = bArr;
        this.zzc = i10;
        this.zzb = i11;
        zzj();
    }

    private final int zzi() {
        int i10 = 0;
        while (!zzh()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? zza(i10) : 0);
    }

    private final void zzj() {
        int i10;
        int i11 = this.zzc;
        boolean z2 = false;
        if (i11 >= 0 && (i11 < (i10 = this.zzb) || (i11 == i10 && this.zzd == 0))) {
            z2 = true;
        }
        zzdd.zzf(z2);
    }

    private final boolean zzk(int i10) {
        if (i10 < 2 || i10 >= this.zzb) {
            return false;
        }
        byte[] bArr = this.zza;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 + (-1)] == 0;
    }

    public final int zza(int i10) {
        int i11;
        this.zzd += i10;
        int i12 = 0;
        while (true) {
            i11 = this.zzd;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.zzd = i13;
            byte[] bArr = this.zza;
            int i14 = this.zzc;
            i12 |= (bArr[i14] & 255) << i13;
            if (true != zzk(i14 + 1)) {
                i = 1;
            }
            this.zzc = i14 + i;
        }
        byte[] bArr2 = this.zza;
        int i15 = this.zzc;
        int i16 = i12 | ((bArr2[i15] & 255) >> (8 - i11));
        int i17 = 32 - i10;
        if (i11 == 8) {
            this.zzd = 0;
            this.zzc = i15 + (true != zzk(i15 + 1) ? 1 : 2);
        }
        int i18 = ((-1) >>> i17) & i16;
        zzj();
        return i18;
    }

    public final int zzb() {
        int iZzi = zzi();
        int i10 = iZzi % 2;
        return ((iZzi + 1) / 2) * (i10 == 0 ? -1 : 1);
    }

    public final int zzc() {
        return zzi();
    }

    public final void zzd() {
        int i10 = this.zzd;
        if (i10 > 0) {
            zzf(8 - i10);
        }
    }

    public final void zze() {
        int i10 = this.zzd + 1;
        this.zzd = i10;
        if (i10 == 8) {
            this.zzd = 0;
            int i11 = this.zzc;
            this.zzc = i11 + (true == zzk(i11 + 1) ? 2 : 1);
        }
        zzj();
    }

    public final void zzf(int i10) {
        int i11 = this.zzc;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.zzc = i13;
        int i14 = (i10 - (i12 * 8)) + this.zzd;
        this.zzd = i14;
        if (i14 > 7) {
            this.zzc = i13 + 1;
            this.zzd = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.zzc) {
                zzj();
                return;
            } else if (zzk(i11)) {
                this.zzc++;
                i11 += 2;
            }
        }
    }

    public final boolean zzg(int i10) {
        int i11 = this.zzc;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.zzd + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.zzb) {
                break;
            }
            if (zzk(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.zzb;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public final boolean zzh() {
        int i10 = this.zza[this.zzc] & (128 >> this.zzd);
        zze();
        return i10 != 0;
    }
}
