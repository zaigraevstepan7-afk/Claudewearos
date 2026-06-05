package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfln implements o7.d {
    final /* synthetic */ zzflo zza;

    public zzfln(zzflo zzfloVar) {
        this.zza = zzfloVar;
    }

    @Override // o7.d
    public final void onPostMessage(WebView webView, o7.c cVar, Uri uri, boolean z2, o7.a aVar) throws JSONException {
        int i10 = cVar.f12423b;
        if (i10 != 0) {
            StringBuilder sb2 = new StringBuilder("Wrong data accessor type detected. ");
            sb2.append(i10 != 0 ? i10 != 1 ? "Unknown" : "ArrayBuffer" : "String");
            sb2.append(" expected, but got ");
            sb2.append("String");
            throw new IllegalStateException(sb2.toString());
        }
        try {
            JSONObject jSONObject = new JSONObject(cVar.f12422a);
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                zzflo.zze(this.zza, string2);
            } else if (string.equals("finishSession")) {
                zzflo.zzc(this.zza, string2);
            } else {
                zzfla.zza.getClass();
            }
        } catch (JSONException e10) {
            zzfmw.zza("Error parsing JS message in JavaScriptSessionService.", e10);
        }
    }
}
