package com.google.android.gms.internal.p002firebaseauthapi;

import gk.b;
import m6.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzahs extends zzaib {
    private final int zzc;
    private final int zzd;

    public zzahs(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzaho.zza(i10, i10 + i11, bArr.length);
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib, com.google.android.gms.internal.p002firebaseauthapi.zzaho
    public final byte zza(int i10) {
        int iZzb = zzb();
        if (((iZzb - (i10 + 1)) | i10) >= 0) {
            return this.zzb[this.zzc + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(a.d(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(b.l(i10, iZzb, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib, com.google.android.gms.internal.p002firebaseauthapi.zzaho
    public final byte zzb(int i10) {
        return this.zzb[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final int zzg() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib, com.google.android.gms.internal.p002firebaseauthapi.zzaho
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib, com.google.android.gms.internal.p002firebaseauthapi.zzaho
    public final void zza(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zzb, zzg(), bArr, 0, i12);
    }
}
