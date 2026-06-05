package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzdhd implements zzbkd {
    private final WeakReference zza;
    private final WeakReference zzb;

    public zzdhd(zzdhg zzdhgVar, View view, zzdhf zzdhfVar) {
        this.zza = new WeakReference(zzdhgVar);
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznc)).booleanValue()) {
            this.zzb = new WeakReference(view);
        } else {
            this.zzb = new WeakReference(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        zzdhg zzdhgVar = (zzdhg) this.zza.get();
        if (zzdhgVar == null) {
            return;
        }
        zzdhgVar.zzg.zza();
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznc)).booleanValue()) {
            zzdhgVar.zzE.zza((View) this.zzb.get(), zzdhgVar.zzj);
        }
    }
}
