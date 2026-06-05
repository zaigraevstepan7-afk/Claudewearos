package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzie {
    static final zzie zza = new zzie(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private final Map zzd;

    public zzie() {
        this.zzd = new HashMap();
    }

    public final zzir zza(zzke zzkeVar, int i10) {
        return (zzir) this.zzd.get(new zzid(zzkeVar, i10));
    }

    public zzie(boolean z2) {
        this.zzd = Collections.EMPTY_MAP;
    }
}
