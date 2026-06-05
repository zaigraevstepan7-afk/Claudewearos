package com.google.android.gms.internal.auth;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgf {
    private static final zzgf zza = new zzgf();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzgj zzb = new zzfp();

    private zzgf() {
    }

    public static zzgf zza() {
        return zza;
    }

    public final zzgi zzb(Class cls) {
        zzfa.zzc(cls, "messageType");
        zzgi zzgiVar = (zzgi) this.zzc.get(cls);
        if (zzgiVar != null) {
            return zzgiVar;
        }
        zzgi zzgiVarZza = this.zzb.zza(cls);
        zzfa.zzc(cls, "messageType");
        zzgi zzgiVar2 = (zzgi) this.zzc.putIfAbsent(cls, zzgiVarZza);
        return zzgiVar2 == null ? zzgiVarZza : zzgiVar2;
    }
}
