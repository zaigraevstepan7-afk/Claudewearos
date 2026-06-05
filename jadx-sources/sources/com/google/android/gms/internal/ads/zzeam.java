package com.google.android.gms.internal.ads;

import nc.h2;
import nc.t;
import qc.n0;
import qc.o0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeam implements zzcxf, zzcvu {
    private static final Object zza = new Object();
    private static int zzb;
    private final n0 zzc;
    private final zzeaw zzd;

    public zzeam(zzeaw zzeawVar, n0 n0Var) {
        this.zzd = zzeawVar;
        this.zzc = n0Var;
    }

    private final void zzb(boolean z2) {
        int i10;
        int iIntValue;
        zzbct zzbctVar = zzbdc.zzgq;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() && !((o0) this.zzc).k()) {
            Object obj = zza;
            synchronized (obj) {
                i10 = zzb;
                iIntValue = ((Integer) tVar.f12230c.zzb(zzbdc.zzgr)).intValue();
            }
            if (i10 < iIntValue) {
                this.zzd.zzd(z2);
                synchronized (obj) {
                    zzb++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final void zzdD(h2 h2Var) {
        zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcxf
    public final void zzt() {
        zzb(true);
    }
}
