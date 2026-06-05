package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzgw {
    static final zzgw zza = new zzgw(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzgw zzd;
    private final Map zze;

    public zzgw() {
        this.zze = new HashMap();
    }

    public static zzgw zza() {
        zzgw zzgwVar = zzd;
        if (zzgwVar != null) {
            return zzgwVar;
        }
        synchronized (zzgw.class) {
            try {
                zzgw zzgwVar2 = zzd;
                if (zzgwVar2 != null) {
                    return zzgwVar2;
                }
                int i10 = zziu.zza;
                zzgw zzgwVarZzb = zzhe.zzb(zzgw.class);
                zzd = zzgwVarZzb;
                return zzgwVarZzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zzhj zzb(zzim zzimVar, int i10) {
        return (zzhj) this.zze.get(new zzgv(zzimVar, i10));
    }

    public zzgw(boolean z2) {
        this.zze = Collections.EMPTY_MAP;
    }
}
