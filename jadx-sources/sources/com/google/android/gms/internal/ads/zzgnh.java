package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgnh {
    private static final zzgnh zza = new zzgnh();
    private static final zzgnf zzb = new zzgnf(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzgnh zzb() {
        return zza;
    }

    public final zzgmx zza() {
        zzgmx zzgmxVar = (zzgmx) this.zzc.get();
        return zzgmxVar == null ? zzb : zzgmxVar;
    }
}
