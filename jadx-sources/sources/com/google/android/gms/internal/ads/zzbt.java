package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbt {
    public static final zzbt zza = new zzbt(zzfyf.zzn());
    private final zzfyf zzb;

    static {
        String str = zzex.zza;
        Integer.toString(0, 36);
    }

    public zzbt(List list) {
        this.zzb = zzfyf.zzl(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzbt.class != obj.getClass()) {
            return false;
        }
        return this.zzb.equals(((zzbt) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final zzfyf zza() {
        return this.zzb;
    }

    public final boolean zzb(int i10) {
        int i11 = 0;
        while (true) {
            zzfyf zzfyfVar = this.zzb;
            if (i11 >= zzfyfVar.size()) {
                return false;
            }
            zzbs zzbsVar = (zzbs) zzfyfVar.get(i11);
            if (zzbsVar.zzc() && zzbsVar.zza() == i10) {
                return true;
            }
            i11++;
        }
    }
}
