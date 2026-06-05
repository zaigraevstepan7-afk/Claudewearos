package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbkv implements zzbkd {
    private final zzbku zza;

    public zzbkv(zzbku zzbkuVar) {
        this.zza = zzbkuVar;
    }

    public static void zzb(zzcfe zzcfeVar, zzbku zzbkuVar) {
        zzcfeVar.zzag("/reward", new zzbkv(zzbkuVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) throws NumberFormatException {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.zza.zzc();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.zza.zzb();
                    return;
                }
                return;
            }
        }
        zzbwm zzbwmVar = null;
        try {
            int i10 = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzbwmVar = new zzbwm(str2, i10);
            }
        } catch (NumberFormatException e10) {
            int i11 = l0.f13401b;
            k.h("Unable to parse reward amount.", e10);
        }
        this.zza.zza(zzbwmVar);
    }
}
