package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
abstract class zzce implements Comparable, Serializable {
    final Comparable zza = "";

    public zzce(Comparable comparable) {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzce) {
            try {
                if (compareTo((zzce) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public int compareTo(zzce zzceVar) {
        if (zzceVar == zzcd.zzb) {
            return 1;
        }
        if (zzceVar == zzcb.zzb) {
            return -1;
        }
        Comparable comparable = zzceVar.zza;
        int i10 = zzdh.zzc;
        int iCompareTo = "".compareTo("");
        return iCompareTo != 0 ? iCompareTo : Boolean.compare(this instanceof zzcc, zzceVar instanceof zzcc);
    }

    public abstract void zzc(StringBuilder sb2);

    public abstract void zzd(StringBuilder sb2);
}
