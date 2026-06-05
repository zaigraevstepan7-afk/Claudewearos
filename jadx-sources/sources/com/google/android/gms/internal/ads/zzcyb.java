package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import nc.t;
import nc.t3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcyb extends zzdbm implements zzcwl, zzcxq {
    private final zzfbt zzb;
    private final AtomicBoolean zzc;
    private final zzfcf zzd;

    public zzcyb(Set set, zzfbt zzfbtVar, zzfcf zzfcfVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfbtVar;
        this.zzd = zzfcfVar;
    }

    private final void zzb() {
        final t3 t3Var;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzia)).booleanValue() && this.zzc.compareAndSet(false, true) && (t3Var = this.zzb.zzae) != null && t3Var.f12235a == 3) {
            zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzcxz
                @Override // com.google.android.gms.internal.ads.zzdbl
                public final void zza(Object obj) {
                    ((zzcyd) obj).zzh(t3Var);
                }
            });
        }
    }

    public final void zza(final t3 t3Var) {
        if (u3.c.y(this.zzd.zza.zza) == 1 || !this.zzb.zzaB) {
            return;
        }
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzcya
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((zzcyd) obj).zzh(t3Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxq
    public final void zzg() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzs() {
        int i10 = this.zzb.zzb;
        if (i10 == 2 || i10 == 5 || i10 == 4 || i10 == 6 || i10 == 7) {
            zzb();
        }
    }
}
