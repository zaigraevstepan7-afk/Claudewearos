package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzkh {
    private static final String zza = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    private static final String zzb = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";

    @Deprecated
    private static final zzvu zzc = zzvu.zzb();

    @Deprecated
    private static final zzvu zzd = zzvu.zzb();

    @Deprecated
    private static final zzvu zze = zzvu.zzb();

    static {
        try {
            zza();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzkk.zzc();
        zzkl.zzc();
        zzcr.zza();
        zzix.zza();
        if (zzig.zzb()) {
            return;
        }
        zzjk.zza(true);
        zzlj.zza(true);
    }
}
