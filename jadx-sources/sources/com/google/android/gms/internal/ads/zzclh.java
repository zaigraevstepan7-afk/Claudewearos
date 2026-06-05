package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzclh implements zzclb {
    private final zzdvb zza;

    public zzclh(zzdvb zzdvbVar) {
        this.zza = zzdvbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zza(Map map) {
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 97520651) {
            if (iHashCode == 109399814 && str.equals("shake")) {
                this.zza.zzm(zzdux.SHAKE);
                return;
            }
        } else if (str.equals("flick")) {
            this.zza.zzm(zzdux.FLICK);
            return;
        }
        this.zza.zzm(zzdux.NONE);
    }
}
