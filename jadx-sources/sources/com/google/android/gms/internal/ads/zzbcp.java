package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbcp extends zzbct {
    public zzbcp(int i10, String str, Long l10, Long l11) {
        super(1, str, l10, l11, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final /* bridge */ /* synthetic */ Object zza(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(zzm(), ((Long) zzl()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzm())) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(zzm()))) : (Long) zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(zzm(), ((Long) zzl()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final /* bridge */ /* synthetic */ void zzd(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(zzm(), ((Long) obj).longValue());
    }
}
