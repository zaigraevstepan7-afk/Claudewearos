package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzalt {
    public static zzalu zza(zzalu zzaluVar, String[] strArr, Map map) {
        int length;
        int i10 = 0;
        if (zzaluVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (zzalu) map.get(strArr[0]);
            }
            if (length2 > 1) {
                zzalu zzaluVar2 = new zzalu();
                while (i10 < length2) {
                    zzaluVar2.zzl((zzalu) map.get(strArr[i10]));
                    i10++;
                }
                return zzaluVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                zzaluVar.zzl((zzalu) map.get(strArr[0]));
                return zzaluVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i10 < length) {
                    zzaluVar.zzl((zzalu) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return zzaluVar;
    }
}
