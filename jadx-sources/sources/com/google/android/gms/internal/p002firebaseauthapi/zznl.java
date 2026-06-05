package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zznl {
    private static final zznl zza = new zznl();
    private static final zzno zzb = new zzno();
    private final AtomicReference<zzrp> zzc = new AtomicReference<>();

    public static zznl zza() {
        return zza;
    }

    public final zzrp zzb() {
        zzrp zzrpVar = this.zzc.get();
        return zzrpVar == null ? zzb : zzrpVar;
    }
}
