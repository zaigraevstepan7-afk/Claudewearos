package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mc.n;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzclx implements zzclb {
    private final CookieManager zza = n.D.f11580f.d();

    public zzclx(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zza(Map map) {
        CookieManager cookieManager = this.zza;
        if (cookieManager == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            cookieManager.setCookie((String) t.f12227d.f12230c.zzb(zzbdc.zzba), str);
            return;
        }
        String str2 = (String) t.f12227d.f12230c.zzb(zzbdc.zzba);
        String cookie = cookieManager.getCookie(str2);
        if (cookie != null) {
            List listZzf = zzfvt.zzb(zzfup.zzc(';')).zzf(cookie);
            for (int i10 = 0; i10 < listZzf.size(); i10++) {
                Iterator it = zzfvt.zzb(zzfup.zzc('=')).zzd((String) listZzf.get(i10)).iterator();
                it.getClass();
                if (!it.hasNext()) {
                    throw new IndexOutOfBoundsException(m6.a.e(0, "position (0) must be less than the number of elements that remained (", ")"));
                }
                cookieManager.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) t.f12227d.f12230c.zzb(zzbdc.zzaM))));
            }
        }
    }
}
