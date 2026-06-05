package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzle {
    public static final int zza(int i10, Object obj, Object obj2) {
        zzld zzldVar = (zzld) obj;
        if (zzldVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzldVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzld zzldVarZzb = (zzld) obj;
        zzld zzldVar = (zzld) obj2;
        if (!zzldVar.isEmpty()) {
            if (!zzldVarZzb.zze()) {
                zzldVarZzb = zzldVarZzb.zzb();
            }
            zzldVarZzb.zzd(zzldVar);
        }
        return zzldVarZzb;
    }
}
