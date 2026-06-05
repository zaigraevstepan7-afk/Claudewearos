package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zznj {
    private static final zznj zza = new zznj();
    private final Map<Class<? extends zzci>, zznm<? extends zzci>> zzb = new HashMap();

    public static zznj zza() {
        return zza;
    }

    public final synchronized <ParametersT extends zzci> void zza(zznm<ParametersT> zznmVar, Class<ParametersT> cls) {
        try {
            zznm<? extends zzci> zznmVar2 = this.zzb.get(cls);
            if (zznmVar2 != null && !zznmVar2.equals(zznmVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.zzb.put(cls, zznmVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
