package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzame extends RuntimeException {
    private final List<String> zza;

    public zzame(zzakp zzakpVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.zza = null;
    }

    public final zzajk zza() {
        return new zzajk(getMessage());
    }
}
