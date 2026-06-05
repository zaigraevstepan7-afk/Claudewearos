package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;
import org.json.JSONException;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbkk implements zzbkd {
    static final Map zza;
    private final mc.b zzb;
    private final zzbsm zzc;
    private final zzbst zzd;

    static {
        String[] strArr = {"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {1, 2, 3, 4, 5, 6, 7};
        q.e eVar = new q.e(7);
        for (int i10 = 0; i10 < 7; i10++) {
            eVar.put(strArr[i10], numArr[i10]);
        }
        zza = Collections.unmodifiableMap(eVar);
    }

    public zzbkk(mc.b bVar, zzbsm zzbsmVar, zzbst zzbstVar) {
        this.zzb = bVar;
        this.zzc = zzbsmVar;
        this.zzd = zzbstVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws JSONException {
        zzcfe zzcfeVar = (zzcfe) obj;
        int iIntValue = ((Integer) zza.get((String) map.get("a"))).intValue();
        int i10 = 6;
        if (iIntValue != 5) {
            if (iIntValue != 7) {
                mc.b bVar = this.zzb;
                if (!bVar.b()) {
                    bVar.a(null);
                    return;
                }
                if (iIntValue == 1) {
                    this.zzc.zzc(map);
                    return;
                }
                if (iIntValue == 3) {
                    new zzbsp(zzcfeVar, map).zzb();
                    return;
                }
                if (iIntValue == 4) {
                    new zzbsj(zzcfeVar, map).zzc();
                    return;
                }
                if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        this.zzc.zzb(true);
                        return;
                    } else if (iIntValue != 7) {
                        int i11 = l0.f13401b;
                        k.f("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean z2 = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (zzcfeVar == null) {
            int i12 = l0.f13401b;
            k.g("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i10 = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i10 = z2 ? -1 : 14;
        }
        zzcfeVar.zzau(i10);
    }
}
