package com.google.android.gms.internal.ads;

import java.util.List;
import mc.n;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzdkm implements zzgcx {
    final /* synthetic */ zzdkn zza;

    public zzdkm(zzdkn zzdknVar) {
        this.zza = zzdknVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th2) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfC)).booleanValue()) {
            n.D.f11582h.zzw(th2, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final void zzb(List list) {
        try {
            zzcfe zzcfeVar = (zzcfe) list.get(0);
            if (zzcfeVar != null) {
                this.zza.zzb(zzcfeVar);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e10) {
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfC)).booleanValue()) {
                n.D.f11582h.zzw(e10, "omid native display exp");
            }
        }
    }
}
