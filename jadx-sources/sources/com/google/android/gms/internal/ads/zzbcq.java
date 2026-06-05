package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbcq extends zzbct {
    public zzbcq(int i10, String str, Float f10, Float f11) {
        super(1, str, f10, f11, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final /* bridge */ /* synthetic */ Object zza(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(zzm(), ((Float) zzl()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzm())) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(zzm()))) : (Float) zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(zzm(), ((Float) zzl()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final /* bridge */ /* synthetic */ void zzd(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(zzm(), ((Float) obj).floatValue());
    }
}
