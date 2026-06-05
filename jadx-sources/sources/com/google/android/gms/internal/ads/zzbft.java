package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbft {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicReference zzb = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    public static zzbfr zza() {
        return (zzbfr) zza.get();
    }

    public static zzbfs zzb() {
        return (zzbfs) zzb.get();
    }

    public static void zzc(zzbfr zzbfrVar) {
        zza.set(zzbfrVar);
    }
}
