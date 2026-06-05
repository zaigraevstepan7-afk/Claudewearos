package com.google.android.recaptcha.internal;

import java.util.Comparator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzgo implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzgw zzgwVar = (zzgw) obj;
        zzgw zzgwVar2 = (zzgw) obj2;
        zzgn zzgnVar = new zzgn(zzgwVar);
        zzgn zzgnVar2 = new zzgn(zzgwVar2);
        while (zzgnVar.hasNext() && zzgnVar2.hasNext()) {
            int iCompareTo = Integer.valueOf(zzgnVar.zza() & 255).compareTo(Integer.valueOf(zzgnVar2.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(zzgwVar.zzd()).compareTo(Integer.valueOf(zzgwVar2.zzd()));
    }
}
