package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeuq implements zzett {
    final String zza;
    final int zzb;

    public /* synthetic */ zzeuq(String str, int i10, zzeup zzeupVar) {
        this.zza = str;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final void zzb(Object obj) {
        zzcut zzcutVar = (zzcut) obj;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzkG)).booleanValue()) {
            String str = this.zza;
            if (!TextUtils.isEmpty(str)) {
                zzcutVar.zza.putString("topics", str);
            }
            int i10 = this.zzb;
            if (i10 != -1) {
                zzcutVar.zza.putInt("atps", i10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* synthetic */ void zza(Object obj) {
    }
}
