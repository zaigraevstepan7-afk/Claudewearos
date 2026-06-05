package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzge extends zzgc {
    private Uri zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private final zzgd zzf;

    public zzge(byte[] bArr) {
        zzgd zzgdVar = new zzgd(bArr);
        super(false);
        this.zzf = zzgdVar;
        zzdd.zzd(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.zzd;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        byte[] bArr2 = this.zzb;
        zzdd.zzb(bArr2);
        System.arraycopy(bArr2, this.zzc, bArr, i10, iMin);
        this.zzc += iMin;
        this.zzd -= iMin;
        zzg(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final long zzb(zzgo zzgoVar) throws zzgk {
        zzi(zzgoVar);
        this.zza = zzgoVar.zza;
        byte[] bArr = this.zzf.zza;
        this.zzb = bArr;
        long j = zzgoVar.zze;
        int length = bArr.length;
        if (j > length) {
            throw new zzgk(2008);
        }
        int i10 = (int) j;
        this.zzc = i10;
        int i11 = length - i10;
        this.zzd = i11;
        long j4 = zzgoVar.zzf;
        if (j4 != -1) {
            this.zzd = (int) Math.min(i11, j4);
        }
        this.zze = true;
        zzj(zzgoVar);
        return j4 != -1 ? j4 : this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final Uri zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final void zzd() {
        if (this.zze) {
            this.zze = false;
            zzh();
        }
        this.zza = null;
        this.zzb = null;
    }
}
