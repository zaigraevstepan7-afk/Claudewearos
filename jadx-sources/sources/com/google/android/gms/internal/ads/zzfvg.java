package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfvg implements Serializable, zzfvf {
    private final List zza;

    public final boolean equals(Object obj) {
        if (obj instanceof zzfvg) {
            return this.zza.equals(((zzfvg) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z2 = true;
        for (Object obj : this.zza) {
            if (!z2) {
                sb2.append(',');
            }
            sb2.append(obj);
            z2 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final boolean zza(Object obj) {
        int i10 = 0;
        while (true) {
            List list = this.zza;
            if (i10 >= list.size()) {
                return true;
            }
            if (!((zzfvf) list.get(i10)).zza(obj)) {
                return false;
            }
            i10++;
        }
    }
}
