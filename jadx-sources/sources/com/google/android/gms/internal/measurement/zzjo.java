package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzjo {
    static final zzjo zza = new zzjo(true);
    private static volatile boolean zzb = false;
    private static volatile zzjo zzc;
    private static volatile zzjo zzd;
    private final Map zze;

    public zzjo() {
        this.zze = new HashMap();
    }

    public static zzjo zza() {
        zzjo zzjoVar;
        zzjo zzjoVar2 = zzc;
        if (zzjoVar2 != null) {
            return zzjoVar2;
        }
        synchronized (zzjo.class) {
            try {
                zzjoVar = zzc;
                if (zzjoVar == null) {
                    zzjoVar = zza;
                    zzc = zzjoVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzjoVar;
    }

    public static zzjo zzb() {
        zzjo zzjoVar = zzd;
        if (zzjoVar != null) {
            return zzjoVar;
        }
        synchronized (zzjo.class) {
            try {
                zzjo zzjoVar2 = zzd;
                if (zzjoVar2 != null) {
                    return zzjoVar2;
                }
                zzjo zzjoVarZzb = zzjw.zzb(zzjo.class);
                zzd = zzjoVarZzb;
                return zzjoVarZzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zzka zzc(zzlj zzljVar, int i10) {
        return (zzka) this.zze.get(new zzjn(zzljVar, i10));
    }

    public zzjo(boolean z2) {
        this.zze = Collections.EMPTY_MAP;
    }
}
