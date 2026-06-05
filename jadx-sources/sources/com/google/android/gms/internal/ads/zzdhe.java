package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;
import rc.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzdhe implements zzbkd {
    private final WeakReference zza;
    private final zzfjq zzb;
    private final p zzc;
    private final zzfhm zzd;

    public /* synthetic */ zzdhe(zzdhg zzdhgVar, zzfjq zzfjqVar, p pVar, zzfhm zzfhmVar, zzdhf zzdhfVar) {
        this.zza = new WeakReference(zzdhgVar);
        this.zzb = zzfjqVar;
        this.zzc = pVar;
        this.zzd = zzfhmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        zzdhg zzdhgVar = (zzdhg) this.zza.get();
        String str = (String) map.get("u");
        if (zzdhgVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.zzb.zzd(str, this.zzc, this.zzd, zzdhgVar.zzD);
    }
}
