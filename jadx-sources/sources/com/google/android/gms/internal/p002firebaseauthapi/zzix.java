package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzix {
    private static final String zza = "type.googleapis.com/google.crypto.tink.AesSivKey";

    @Deprecated
    private static final zzvu zzb = zzvu.zzb();

    @Deprecated
    private static final zzvu zzc = zzvu.zzb();

    static {
        try {
            zza();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zziy.zzc();
        if (zzig.zzb()) {
            return;
        }
        zzio.zza(true);
    }
}
