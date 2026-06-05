package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgyf {
    static final zzgyf zza = new zzgyf(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzgyf zzd;
    private final Map zze;

    public zzgyf() {
        this.zze = new HashMap();
    }

    public static zzgyf zza() {
        int i10 = zzhaq.zza;
        return zza;
    }

    public static zzgyf zzb() {
        zzgyf zzgyfVar = zzd;
        if (zzgyfVar != null) {
            return zzgyfVar;
        }
        synchronized (zzgyf.class) {
            try {
                zzgyf zzgyfVar2 = zzd;
                if (zzgyfVar2 != null) {
                    return zzgyfVar2;
                }
                int i10 = zzhaq.zza;
                zzgyf zzgyfVarZzb = zzgyn.zzb(zzgyf.class);
                zzd = zzgyfVarZzb;
                return zzgyfVarZzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zzgyt zzc(zzhag zzhagVar, int i10) {
        return (zzgyt) this.zze.get(new zzgye(zzhagVar, i10));
    }

    public zzgyf(boolean z2) {
        this.zze = Collections.EMPTY_MAP;
    }
}
