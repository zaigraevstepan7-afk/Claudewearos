package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzaiq {
    static final zzaiq zza = new zzaiq(true);
    private static volatile boolean zzb = false;
    private static boolean zzc = true;
    private final Map<zzait, zzaje.zzd<?, ?>> zzd;

    public zzaiq() {
        this.zzd = new HashMap();
    }

    public static zzaiq zza() {
        return zza;
    }

    public final <ContainingType extends zzakp> zzaje.zzd<ContainingType, ?> zza(ContainingType containingtype, int i10) {
        return (zzaje.zzd) this.zzd.get(new zzait(containingtype, i10));
    }

    private zzaiq(boolean z2) {
        this.zzd = Collections.EMPTY_MAP;
    }
}
