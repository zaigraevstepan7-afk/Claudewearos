package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgxh extends zzgxk {
    private final int zzc;
    private final int zzd;

    public zzgxh(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzgxn.zzq(i10, i10 + i11, bArr.length);
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgxk, com.google.android.gms.internal.ads.zzgxn
    public final byte zza(int i10) {
        zzgxn.zzy(i10, this.zzd);
        return ((zzgxk) this).zza[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgxk, com.google.android.gms.internal.ads.zzgxn
    public final byte zzb(int i10) {
        return ((zzgxk) this).zza[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxk, com.google.android.gms.internal.ads.zzgxn
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxk, com.google.android.gms.internal.ads.zzgxn
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(((zzgxk) this).zza, this.zzc + i10, bArr, i11, i12);
    }
}
