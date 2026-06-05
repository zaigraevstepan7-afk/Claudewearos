package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
class zzgxk extends zzgxj {
    protected final byte[] zza;

    public zzgxk(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgxn) || zzd() != ((zzgxn) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzgxk)) {
            return obj.equals(this);
        }
        zzgxk zzgxkVar = (zzgxk) obj;
        int iZzr = zzr();
        int iZzr2 = zzgxkVar.zzr();
        if (iZzr == 0 || iZzr2 == 0 || iZzr == iZzr2) {
            return zzg(zzgxkVar, 0, zzd());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public byte zza(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzgxj
    public final boolean zzg(zzgxn zzgxnVar, int i10, int i11) {
        if (i11 > zzgxnVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + i11 + zzd());
        }
        int i12 = i10 + i11;
        if (i12 > zzgxnVar.zzd()) {
            int iZzd = zzgxnVar.zzd();
            StringBuilder sbQ = gk.b.q("Ran off end of other: ", i10, ", ", i11, ", ");
            sbQ.append(iZzd);
            throw new IllegalArgumentException(sbQ.toString());
        }
        if (!(zzgxnVar instanceof zzgxk)) {
            return zzgxnVar.zzk(i10, i12).equals(zzk(0, i11));
        }
        zzgxk zzgxkVar = (zzgxk) zzgxnVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzgxkVar.zza;
        int iZzc = zzc() + i11;
        int iZzc2 = zzc();
        int iZzc3 = zzgxkVar.zzc() + i10;
        while (iZzc2 < iZzc) {
            if (bArr[iZzc2] != bArr2[iZzc3]) {
                return false;
            }
            iZzc2++;
            iZzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final int zzi(int i10, int i11, int i12) {
        return zzgzi.zzb(i10, this.zza, zzc() + i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final int zzj(int i10, int i11, int i12) {
        int iZzc = zzc() + i11;
        return zzhbx.zzf(i10, this.zza, iZzc, i12 + iZzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final zzgxn zzk(int i10, int i11) {
        int iZzq = zzgxn.zzq(i10, i11, zzd());
        return iZzq == 0 ? zzgxn.zzb : new zzgxh(this.zza, zzc() + i10, iZzq);
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final zzgxt zzl() {
        return zzgxt.zzH(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final void zzo(zzgxe zzgxeVar) {
        zzgxeVar.zza(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final boolean zzp() {
        int iZzc = zzc();
        return zzhbx.zzi(this.zza, iZzc, zzd() + iZzc);
    }
}
