package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import mc.n;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbkj implements zzbkd {
    private final Context zza;
    private final Map zzb;

    public zzbkj(Context context, Map map) {
        this.zza = context;
        this.zzb = map;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        n nVar = n.D;
        zzbym zzbymVar = nVar.f11599z;
        Context context = this.zza;
        if (zzbymVar.zzp(context)) {
            String str = (String) map.get("eventName");
            String str2 = (String) map.get("eventId");
            int iHashCode = str.hashCode();
            if (iHashCode != 94399) {
                if (iHashCode != 94401) {
                    if (iHashCode == 94407 && str.equals("_ai")) {
                        nVar.f11599z.zzk(context, str2, (Map) this.zzb.get("_ai"));
                        return;
                    }
                } else if (str.equals("_ac")) {
                    nVar.f11599z.zzj(context, str2, (Map) this.zzb.get("_ac"));
                    return;
                }
            } else if (str.equals("_aa")) {
                nVar.f11599z.zzh(context, str2);
                return;
            }
            int i10 = l0.f13401b;
            k.d("logScionEvent gmsg contained unsupported eventName");
        }
    }
}
