package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgxy extends zzgxv {
    private final OutputStream zzg;

    public zzgxy(OutputStream outputStream, int i10) {
        super(i10);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.zzg = outputStream;
    }

    private final void zzI() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzJ(int i10) throws IOException {
        if (this.zzb - this.zzc < i10) {
            zzI();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzK() {
        if (this.zzc > 0) {
            zzI();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzL(byte b10) throws IOException {
        if (this.zzc == this.zzb) {
            zzI();
        }
        zzc(b10);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzM(int i10, boolean z2) throws IOException {
        zzJ(11);
        zzf(i10 << 3);
        zzc(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzN(int i10, zzgxn zzgxnVar) {
        zzu((i10 << 3) | 2);
        zzu(zzgxnVar.zzd());
        zzgxnVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgya, com.google.android.gms.internal.ads.zzgxe
    public final void zza(byte[] bArr, int i10, int i11) throws IOException {
        zzr(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzh(int i10, int i11) throws IOException {
        zzJ(14);
        zzf((i10 << 3) | 5);
        zzd(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzi(int i10) throws IOException {
        zzJ(4);
        zzd(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzj(int i10, long j) throws IOException {
        zzJ(18);
        zzf((i10 << 3) | 1);
        zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzk(long j) throws IOException {
        zzJ(8);
        zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzl(int i10, int i11) throws IOException {
        zzJ(20);
        zzf(i10 << 3);
        if (i11 >= 0) {
            zzf(i11);
        } else {
            zzg(i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzm(int i10) throws IOException {
        if (i10 >= 0) {
            zzu(i10);
        } else {
            zzw(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzn(int i10, zzhag zzhagVar, zzhaz zzhazVar) {
        zzu((i10 << 3) | 2);
        zzu(((zzgww) zzhagVar).zzaM(zzhazVar));
        zzhazVar.zzj(zzhagVar, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzo(int i10, zzhag zzhagVar) throws IOException {
        zzu(11);
        zzt(2, i10);
        zzu(26);
        zzu(zzhagVar.zzaY());
        zzhagVar.zzcZ(this);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzp(int i10, zzgxn zzgxnVar) throws IOException {
        zzu(11);
        zzt(2, i10);
        zzN(3, zzgxnVar);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzq(int i10, String str) throws IOException {
        zzu((i10 << 3) | 2);
        zzx(str);
    }

    public final void zzr(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.zzb;
        int i13 = this.zzc;
        int i14 = i12 - i13;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, this.zza, i13, i11);
            this.zzc += i11;
            this.zzd += i11;
            return;
        }
        byte[] bArr2 = this.zza;
        System.arraycopy(bArr, i10, bArr2, i13, i14);
        int i15 = i10 + i14;
        this.zzc = i12;
        this.zzd += i14;
        zzI();
        int i16 = i11 - i14;
        if (i16 <= i12) {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.zzc = i16;
        } else {
            this.zzg.write(bArr, i15, i16);
        }
        this.zzd += i16;
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzs(int i10, int i11) {
        zzu((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzt(int i10, int i11) throws IOException {
        zzJ(20);
        zzf(i10 << 3);
        zzf(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzu(int i10) {
        zzJ(5);
        zzf(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzv(int i10, long j) throws IOException {
        zzJ(20);
        zzf(i10 << 3);
        zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzw(long j) throws IOException {
        zzJ(10);
        zzg(j);
    }

    public final void zzx(String str) throws IOException {
        int iZze;
        try {
            int length = str.length() * 3;
            int iZzD = zzgya.zzD(length);
            int i10 = iZzD + length;
            int i11 = this.zzb;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int iZzd = zzhbx.zzd(str, bArr, 0, length);
                zzu(iZzd);
                zzr(bArr, 0, iZzd);
                return;
            }
            if (i10 > i11 - this.zzc) {
                zzI();
            }
            int iZzD2 = zzgya.zzD(str.length());
            int i12 = this.zzc;
            try {
                if (iZzD2 == iZzD) {
                    int i13 = i12 + iZzD2;
                    this.zzc = i13;
                    int iZzd2 = zzhbx.zzd(str, this.zza, i13, i11 - i13);
                    this.zzc = i12;
                    iZze = (iZzd2 - i12) - iZzD2;
                    zzf(iZze);
                    this.zzc = iZzd2;
                } else {
                    iZze = zzhbx.zze(str);
                    zzf(iZze);
                    this.zzc = zzhbx.zzd(str, this.zza, this.zzc, iZze);
                }
                this.zzd += iZze;
            } catch (zzhbw e10) {
                this.zzd -= this.zzc - i12;
                this.zzc = i12;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new zzgxx(e11);
            }
        } catch (zzhbw e12) {
            zzG(str, e12);
        }
    }
}
