package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzrn {
    private HashMap<String, String> zza = new HashMap<>();

    public final zzrk zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzrk zzrkVar = new zzrk(Collections.unmodifiableMap(this.zza));
        this.zza = null;
        return zzrkVar;
    }
}
