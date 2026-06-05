package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzcgb implements zzbkd {
    final /* synthetic */ zzcgd zza;

    public zzcgb(zzcgd zzcgdVar) {
        this.zza = zzcgdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i10 = Integer.parseInt(str);
                zzcgd zzcgdVar = this.zza;
                synchronized (zzcgdVar) {
                    try {
                        if (zzcgdVar.zzI != i10) {
                            zzcgdVar.zzI = i10;
                            zzcgdVar.requestLayout();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Exception e10) {
                int i11 = l0.f13401b;
                k.h("Exception occurred while getting webview content height", e10);
            }
        }
    }
}
