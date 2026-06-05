package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzadj implements zzadu {
    private final zzl zzb;
    private final long zzc;
    private long zzd;
    private int zzf;
    private int zzg;
    private byte[] zze = new byte[65536];
    private final byte[] zza = new byte[4096];

    static {
        zzaq.zzb("media3.extractor");
    }

    public zzadj(zzl zzlVar, long j, long j4) {
        this.zzb = zzlVar;
        this.zzd = j;
        this.zzc = j4;
    }

    private final int zzp(byte[] bArr, int i10, int i11) {
        int i12 = this.zzg;
        if (i12 == 0) {
            return 0;
        }
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.zze, 0, bArr, i10, iMin);
        zzu(iMin);
        return iMin;
    }

    private final int zzq(byte[] bArr, int i10, int i11, int i12, boolean z2) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iZza = this.zzb.zza(bArr, i10 + i12, i11 - i12);
        if (iZza != -1) {
            return i12 + iZza;
        }
        if (i12 == 0 && z2) {
            return -1;
        }
        throw new EOFException();
    }

    private final int zzr(int i10) {
        int iMin = Math.min(this.zzg, i10);
        zzu(iMin);
        return iMin;
    }

    private final void zzs(int i10) {
        if (i10 != -1) {
            this.zzd += i10;
        }
    }

    private final void zzt(int i10) {
        int i11 = this.zzf + i10;
        int length = this.zze.length;
        if (i11 > length) {
            String str = zzex.zza;
            this.zze = Arrays.copyOf(this.zze, Math.max(65536 + i11, Math.min(length + length, i11 + 524288)));
        }
    }

    private final void zzu(int i10) {
        int i11 = this.zzg - i10;
        this.zzg = i11;
        this.zzf = 0;
        byte[] bArr = this.zze;
        byte[] bArr2 = i11 < bArr.length + (-524288) ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.zze = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzadu, com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        int iZzp = zzp(bArr, i10, i11);
        if (iZzp == 0) {
            iZzp = zzq(bArr, i10, i11, 0, true);
        }
        zzs(iZzp);
        return iZzp;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final int zzb(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        zzadj zzadjVar;
        int iMin;
        zzt(i11);
        int i12 = this.zzg;
        int i13 = this.zzf;
        int i14 = i12 - i13;
        if (i14 == 0) {
            zzadjVar = this;
            iMin = zzadjVar.zzq(this.zze, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            zzadjVar.zzg += iMin;
        } else {
            zzadjVar = this;
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(zzadjVar.zze, zzadjVar.zzf, bArr, i10, iMin);
        zzadjVar.zzf += iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final int zzc(int i10) throws EOFException, InterruptedIOException {
        int iZzr = zzr(1);
        if (iZzr == 0) {
            iZzr = zzq(this.zza, 0, Math.min(1, 4096), 0, true);
        }
        zzs(iZzr);
        return iZzr;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zze() {
        return this.zzd + this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzg(int i10) throws EOFException, InterruptedIOException {
        zzl(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzh(byte[] bArr, int i10, int i11) {
        zzm(bArr, i10, i11, false);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzi(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        zzn(bArr, i10, i11, false);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzj() {
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzk(int i10) throws EOFException, InterruptedIOException {
        zzo(i10, false);
    }

    public final boolean zzl(int i10, boolean z2) throws EOFException, InterruptedIOException {
        zzt(i10);
        int iZzq = this.zzg - this.zzf;
        while (iZzq < i10) {
            int i11 = i10;
            boolean z10 = z2;
            iZzq = zzq(this.zze, this.zzf, i11, iZzq, z10);
            if (iZzq == -1) {
                return false;
            }
            this.zzg = this.zzf + iZzq;
            i10 = i11;
            z2 = z10;
        }
        this.zzf += i10;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzm(byte[] bArr, int i10, int i11, boolean z2) {
        if (!zzl(i11, z2)) {
            return false;
        }
        System.arraycopy(this.zze, this.zzf - i11, bArr, i10, i11);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzn(byte[] bArr, int i10, int i11, boolean z2) throws EOFException, InterruptedIOException {
        int iZzp = zzp(bArr, i10, i11);
        while (iZzp < i11 && iZzp != -1) {
            iZzp = zzq(bArr, i10, i11, iZzp, z2);
        }
        zzs(iZzp);
        return iZzp != -1;
    }

    public final boolean zzo(int i10, boolean z2) throws EOFException, InterruptedIOException {
        int iZzr = zzr(i10);
        while (iZzr < i10 && iZzr != -1) {
            iZzr = zzq(this.zza, -iZzr, Math.min(i10, iZzr + 4096), iZzr, false);
        }
        zzs(iZzr);
        return iZzr != -1;
    }
}
