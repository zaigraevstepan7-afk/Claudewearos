package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzdhb implements zzbkd {
    private final WeakReference zza;

    public /* synthetic */ zzdhb(zzdhg zzdhgVar, zzdhf zzdhfVar) {
        this.zza = new WeakReference(zzdhgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        zzdhg zzdhgVar = (zzdhg) this.zza.get();
        if (zzdhgVar != null && "_ac".equals((String) map.get("eventName"))) {
            zzdhgVar.zzh.onAdClicked();
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzkY)).booleanValue()) {
                zzdhgVar.zzi.zzdf();
                if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    return;
                }
                zzdhgVar.zzi.zzu();
            }
        }
    }
}
