package com.google.android.gms.internal.ads;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfvz implements zzfvw {
    private static final zzfvw zza = new zzfvw() { // from class: com.google.android.gms.internal.ads.zzfvy
        @Override // com.google.android.gms.internal.ads.zzfvw
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    private final zzfwd zzb = new zzfwd();
    private volatile zzfvw zzc;
    private Object zzd;

    public zzfvz(zzfvw zzfvwVar) {
        this.zzc = zzfvwVar;
    }

    public final String toString() {
        Object objJ = this.zzc;
        if (objJ == zza) {
            objJ = m1.j("<supplier that returned ", String.valueOf(this.zzd), ">");
        }
        return m1.j("Suppliers.memoize(", String.valueOf(objJ), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzfvw
    public final Object zza() {
        zzfvw zzfvwVar = this.zzc;
        zzfvw zzfvwVar2 = zza;
        if (zzfvwVar != zzfvwVar2) {
            synchronized (this.zzb) {
                try {
                    if (this.zzc != zzfvwVar2) {
                        Object objZza = this.zzc.zza();
                        this.zzd = objZza;
                        this.zzc = zzfvwVar2;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.zzd;
    }
}
