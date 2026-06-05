package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzrk {
    public static final zzrk zza = new zzrn().zza();
    private final Map<String, String> zzb;

    public final boolean equals(Object obj) {
        if (obj instanceof zzrk) {
            return this.zzb.equals(((zzrk) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final Map<String, String> zza() {
        return this.zzb;
    }

    private zzrk(Map<String, String> map) {
        this.zzb = map;
    }
}
