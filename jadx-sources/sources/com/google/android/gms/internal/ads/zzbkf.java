package com.google.android.gms.internal.ads;

import java.util.Map;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbkf implements zzbkd {
    private final zzbkg zza;

    public zzbkf(zzbkg zzbkgVar) {
        this.zza = zzbkgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
        zzcfe zzcfeVar = (zzcfe) obj;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f10 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f10 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e10) {
            int i10 = l0.f13401b;
            k.e("Fail to parse float", e10);
        }
        zzbkg zzbkgVar = this.zza;
        zzbkgVar.zzc(zEquals);
        zzbkgVar.zzb(zEquals2, f10);
        zzcfeVar.zzay(zEquals);
    }
}
