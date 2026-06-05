package com.google.android.gms.internal.fido;

import gk.b;
import m6.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgr extends zzgu {
    private final int zzc;
    private final int zzd;

    public zzgr(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzgx.zzj(i10, i10 + i11, bArr.length);
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    public final byte zza(int i10) {
        int i11 = this.zzd;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.zza[this.zzc + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(a.d(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(b.l(i10, i11, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    public final byte zzb(int i10) {
        return this.zza[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.fido.zzgu
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, this.zzc, bArr, 0, i12);
    }
}
