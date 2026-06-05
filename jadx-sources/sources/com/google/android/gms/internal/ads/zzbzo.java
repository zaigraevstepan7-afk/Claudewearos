package com.google.android.gms.internal.ads;

import mc.n;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbzo {
    private final Object zza = new Object();
    private volatile int zzc = 1;
    private volatile long zzb = 0;

    private zzbzo() {
    }

    public final void zza() {
        n nVar = n.D;
        nVar.f11584k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.zza) {
            try {
                if (this.zzc == 3) {
                    if (this.zzb + ((Long) t.f12227d.f12230c.zzb(zzbdc.zzge)).longValue() <= jCurrentTimeMillis) {
                        this.zzc = 1;
                    }
                }
            } finally {
            }
        }
        nVar.f11584k.getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        synchronized (this.zza) {
            try {
                if (this.zzc != 2) {
                    return;
                }
                this.zzc = 3;
                if (this.zzc == 3) {
                    this.zzb = jCurrentTimeMillis2;
                }
            } finally {
            }
        }
    }

    public /* synthetic */ zzbzo(zzbzp zzbzpVar) {
    }
}
