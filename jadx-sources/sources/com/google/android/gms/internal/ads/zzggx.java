package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzggx {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private zzggy zzd = zzggy.zzc;

    private zzggx() {
    }

    public final zzggx zza(int i10) {
        this.zzb = 12;
        return this;
    }

    public final zzggx zzb(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzggx zzc(int i10) {
        this.zzc = 16;
        return this;
    }

    public final zzggx zzd(zzggy zzggyVar) {
        this.zzd = zzggyVar;
        return this;
    }

    public final zzgha zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        this.zzb.getClass();
        this.zzc.getClass();
        return new zzgha(iIntValue, 12, 16, this.zzd, null);
    }

    public /* synthetic */ zzggx(zzggz zzggzVar) {
    }
}
