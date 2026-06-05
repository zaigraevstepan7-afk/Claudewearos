package com.google.android.gms.internal.ads;

import java.io.Serializable;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfvx implements Serializable, zzfvw {
    final zzfvw zza;
    volatile transient boolean zzb;
    transient Object zzc;
    private final transient zzfwd zzd = new zzfwd();

    public zzfvx(zzfvw zzfvwVar) {
        this.zza = zzfvwVar;
    }

    public final String toString() {
        return m1.j("Suppliers.memoize(", (this.zzb ? m1.j("<supplier that returned ", String.valueOf(this.zzc), ">") : this.zza).toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzfvw
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this.zzd) {
                try {
                    if (!this.zzb) {
                        Object objZza = this.zza.zza();
                        this.zzc = objZza;
                        this.zzb = true;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
