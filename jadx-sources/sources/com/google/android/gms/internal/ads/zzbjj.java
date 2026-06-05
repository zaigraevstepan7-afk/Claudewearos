package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbjj implements zzbkd {
    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZzb;
        zzcfe zzcfeVar = (zzcfe) obj;
        zzbgb zzbgbVarZzK = zzcfeVar.zzK();
        if (zzbgbVarZzK == null || (jSONObjectZzb = zzbgbVarZzK.zzb()) == null) {
            zzcfeVar.zze("nativeClickMetaReady", new JSONObject());
        } else {
            zzcfeVar.zze("nativeClickMetaReady", jSONObjectZzb);
        }
    }
}
