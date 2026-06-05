package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Map;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzccx implements zzbkd {
    private final zzdlt zza;

    public zzccx(zzdlt zzdltVar) {
        this.zza = zzdltVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if (str == null) {
            int i10 = l0.f13401b;
            k.g("Action missing from video GMSG.");
            return;
        }
        if (str.equals("src")) {
            String str2 = (String) map.get("src");
            if (str2 == null) {
                int i11 = l0.f13401b;
                k.g("src missing from video GMSG.");
            } else {
                zzdlt zzdltVar = this.zza;
                Bundle bundle = new Bundle();
                bundle.putString("mediaUrl", str2);
                zzdltVar.zza.zzc(bundle);
            }
        }
    }
}
