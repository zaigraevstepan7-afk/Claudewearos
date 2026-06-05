package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import mc.n;
import nc.t;
import qc.p;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcdd extends p {
    final zzcbz zza;
    final zzcdl zzb;
    private final String zzc;
    private final String[] zzd;

    public zzcdd(zzcbz zzcbzVar, zzcdl zzcdlVar, String str, String[] strArr) {
        this.zza = zzcbzVar;
        this.zzb = zzcdlVar;
        this.zzc = str;
        this.zzd = strArr;
        n.D.B.zzb(this);
    }

    @Override // qc.p
    public final void zza() {
        try {
            this.zzb.zzu(this.zzc, this.zzd);
        } finally {
            r0.f13445l.post(new zzcdc(this));
        }
    }

    @Override // qc.p
    public final mf.a zzb() {
        return (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcg)).booleanValue() && (this.zzb instanceof zzcdu)) ? zzcad.zzf.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcdb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzcdd zzcddVar = this.zza;
                return Boolean.valueOf(zzcddVar.zzb.zzw(zzcddVar.zzc, zzcddVar.zzd, zzcddVar));
            }
        }) : super.zzb();
    }

    public final String zze() {
        return this.zzc;
    }
}
