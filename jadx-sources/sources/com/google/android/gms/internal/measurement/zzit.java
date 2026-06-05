package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzit implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzjb zzjbVar = (zzjb) obj;
        zzjb zzjbVar2 = (zzjb) obj2;
        zzis zzisVar = new zzis(zzjbVar);
        zzis zzisVar2 = new zzis(zzjbVar2);
        while (zzisVar.hasNext() && zzisVar2.hasNext()) {
            int iCompareTo = Integer.valueOf(zzisVar.zza() & 255).compareTo(Integer.valueOf(zzisVar2.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(zzjbVar.zzd()).compareTo(Integer.valueOf(zzjbVar2.zzd()));
    }
}
