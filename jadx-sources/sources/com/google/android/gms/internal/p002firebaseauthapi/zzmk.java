package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Enum;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzmk<E extends Enum<E>, O> {
    private Map<E, O> zza;
    private Map<O, E> zzb;

    public final zzmk<E, O> zza(E e10, O o4) {
        this.zza.put(e10, o4);
        this.zzb.put(o4, e10);
        return this;
    }

    private zzmk() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzmh<E, O> zza() {
        return new zzmh<>(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb));
    }
}
