package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Enum;
import java.security.GeneralSecurityException;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzmh<E extends Enum<E>, O> {
    private final Map<E, O> zza;
    private final Map<O, E> zzb;

    public static <E extends Enum<E>, O> zzmk<E, O> zza() {
        return new zzmk<>();
    }

    private zzmh(Map<E, O> map, Map<O, E> map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final E zza(O o4) throws GeneralSecurityException {
        E e10 = this.zzb.get(o4);
        if (e10 != null) {
            return e10;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(o4)));
    }

    public final O zza(E e10) throws GeneralSecurityException {
        O o4 = this.zza.get(e10);
        if (o4 != null) {
            return o4;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(e10)));
    }
}
