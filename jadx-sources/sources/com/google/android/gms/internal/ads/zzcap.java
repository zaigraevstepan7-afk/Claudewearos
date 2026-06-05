package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;
import mc.n;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@Deprecated
/* loaded from: classes.dex */
public class zzcap {
    private final zzcai zza;
    private final AtomicInteger zzb;

    public zzcap() {
        zzcai zzcaiVar = new zzcai();
        this.zza = zzcaiVar;
        this.zzb = new AtomicInteger(0);
        zzgdb.zzr(zzcaiVar, new zzcan(this), zzcad.zzg);
    }

    @Deprecated
    public final int zze() {
        return this.zzb.get();
    }

    @Deprecated
    public final void zzg() {
        this.zza.zzd(new Exception());
    }

    @Deprecated
    public final void zzh(Throwable th2, String str) {
        this.zza.zzd(th2);
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzhT)).booleanValue()) {
            n.D.f11582h.zzv(th2, str);
        }
    }

    @Deprecated
    public final void zzi(Object obj) {
        this.zza.zzc(obj);
    }

    @Deprecated
    public final void zzj(zzcam zzcamVar, zzcak zzcakVar) {
        zzgdb.zzr(this.zza, new zzcao(this, zzcamVar, zzcakVar), zzcad.zzg);
    }
}
