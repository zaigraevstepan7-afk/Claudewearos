package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgne {
    private static final zzgne zza = new zzgne();
    private final Map zzb = new HashMap();

    public static zzgne zza() {
        return zza;
    }

    public final synchronized void zzb(zzgnd zzgndVar, Class cls) {
        try {
            Map map = this.zzb;
            zzgnd zzgndVar2 = (zzgnd) map.get(cls);
            if (zzgndVar2 != null && !zzgndVar2.equals(zzgndVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            map.put(cls, zzgndVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
