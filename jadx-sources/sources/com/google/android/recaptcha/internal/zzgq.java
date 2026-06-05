package com.google.android.recaptcha.internal;

import gk.b;
import m6.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzgq extends zzgt {
    private final int zzc;

    public zzgq(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzgw.zzk(0, i11, bArr.length);
        this.zzc = i11;
    }

    @Override // com.google.android.recaptcha.internal.zzgt, com.google.android.recaptcha.internal.zzgw
    public final byte zza(int i10) {
        int i11 = this.zzc;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.zza[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(a.d(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(b.l(i10, i11, "Index > length: ", ", "));
    }

    @Override // com.google.android.recaptcha.internal.zzgt, com.google.android.recaptcha.internal.zzgw
    public final byte zzb(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.recaptcha.internal.zzgt
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzgt, com.google.android.recaptcha.internal.zzgw
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzgt, com.google.android.recaptcha.internal.zzgw
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, 0, bArr, 0, i12);
    }
}
