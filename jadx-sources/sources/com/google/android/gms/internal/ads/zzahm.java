package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzahm implements zzau {
    public final List zza;

    public zzahm(List list) {
        this.zza = list;
        boolean z2 = false;
        if (!list.isEmpty()) {
            long j = ((zzahl) list.get(0)).zzb;
            int i10 = 1;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (((zzahl) list.get(i10)).zza < j) {
                    z2 = true;
                    break;
                } else {
                    j = ((zzahl) list.get(i10)).zzb;
                    i10++;
                }
            }
        }
        zzdd.zzd(!z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzahm.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzahm) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.zza.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void zza(zzar zzarVar) {
    }
}
