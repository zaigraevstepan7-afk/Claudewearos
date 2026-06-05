package com.google.android.gms.internal.ads;

import java.net.URISyntaxException;
import java.util.Map;
import mc.n;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbkl implements zzgcx {
    final /* synthetic */ Map zza;
    final /* synthetic */ nc.a zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbkp zzd;

    public zzbkl(zzbkp zzbkpVar, Map map, nc.a aVar, String str) {
        this.zza = map;
        this.zzb = aVar;
        this.zzc = str;
        this.zzd = zzbkpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th2) {
        n.D.f11582h.zzw(th2, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zzb(Object obj) throws URISyntaxException {
        String str = (String) obj;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzko)).booleanValue()) {
            this.zza.put("u", str);
        }
        this.zzd.zzh(str, this.zzb, this.zza, this.zzc);
    }
}
