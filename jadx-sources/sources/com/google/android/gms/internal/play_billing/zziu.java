package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zziu {
    public static final /* synthetic */ int zza = 0;
    private static final zziu zzb = new zziu();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zziy zzc = new zzie();

    private zziu() {
    }

    public static zziu zza() {
        return zzb;
    }

    public final zzix zzb(Class cls) {
        zzhp.zzc(cls, "messageType");
        zzix zzixVar = (zzix) this.zzd.get(cls);
        if (zzixVar != null) {
            return zzixVar;
        }
        zzix zzixVarZza = this.zzc.zza(cls);
        zzhp.zzc(cls, "messageType");
        zzix zzixVar2 = (zzix) this.zzd.putIfAbsent(cls, zzixVarZza);
        return zzixVar2 == null ? zzixVarZza : zzixVar2;
    }
}
