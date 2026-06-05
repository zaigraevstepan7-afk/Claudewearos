package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgpf {
    private Integer zza = null;
    private Integer zzb = null;
    private zzgpg zzc = zzgpg.zzd;

    private zzgpf() {
    }

    public final zzgpf zza(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
        }
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzgpf zzb(int i10) throws GeneralSecurityException {
        if (i10 < 10 || i10 > 16) {
            throw new GeneralSecurityException(m6.a.d(i10, "Invalid tag size for AesCmacParameters: "));
        }
        this.zzb = Integer.valueOf(i10);
        return this;
    }

    public final zzgpf zzc(zzgpg zzgpgVar) {
        this.zzc = zzgpgVar;
        return this;
    }

    public final zzgpi zzd() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.zzc != null) {
            return new zzgpi(num.intValue(), this.zzb.intValue(), this.zzc, null);
        }
        throw new GeneralSecurityException("variant not set");
    }

    public /* synthetic */ zzgpf(zzgph zzgphVar) {
    }
}
