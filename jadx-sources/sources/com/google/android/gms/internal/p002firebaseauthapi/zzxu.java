package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzxu {
    private final BigInteger zza;

    private zzxu(BigInteger bigInteger) {
        this.zza = bigInteger;
    }

    public static zzxu zza(BigInteger bigInteger, zzcn zzcnVar) {
        if (zzcnVar != null) {
            return new zzxu(bigInteger);
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public final BigInteger zza(zzcn zzcnVar) {
        if (zzcnVar != null) {
            return this.zza;
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
