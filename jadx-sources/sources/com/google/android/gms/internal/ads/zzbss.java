package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class zzbss {
    private final zzcfe zza;
    private final String zzb;

    public zzbss(zzcfe zzcfeVar, String str) {
        this.zza = zzcfeVar;
        this.zzb = str;
    }

    public final void zzg(int i10, int i11, int i12, int i13) throws JSONException {
        try {
            this.zza.zze("onDefaultPositionReceived", new JSONObject().put("x", i10).put("y", i11).put("width", i12).put("height", i13));
        } catch (JSONException e10) {
            int i14 = l0.f13401b;
            k.e("Error occurred while dispatching default position.", e10);
        }
    }

    public final void zzh(String str) throws JSONException {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("message", str).put("action", this.zzb);
            zzcfe zzcfeVar = this.zza;
            if (zzcfeVar != null) {
                zzcfeVar.zze("onError", jSONObjectPut);
            }
        } catch (JSONException e10) {
            int i10 = l0.f13401b;
            k.e("Error occurred while dispatching error event.", e10);
        }
    }

    public final void zzi(String str) throws JSONException {
        try {
            this.zza.zze("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e10) {
            int i10 = l0.f13401b;
            k.e("Error occurred while dispatching ready Event.", e10);
        }
    }

    public final void zzj(int i10, int i11, int i12, int i13, float f10, int i14) throws JSONException {
        try {
            this.zza.zze("onScreenInfoChanged", new JSONObject().put("width", i10).put("height", i11).put("maxSizeWidth", i12).put("maxSizeHeight", i13).put("density", f10).put("rotation", i14));
        } catch (JSONException e10) {
            int i15 = l0.f13401b;
            k.e("Error occurred while obtaining screen information.", e10);
        }
    }

    public final void zzk(int i10, int i11, int i12, int i13) throws JSONException {
        try {
            this.zza.zze("onSizeChanged", new JSONObject().put("x", i10).put("y", i11).put("width", i12).put("height", i13));
        } catch (JSONException e10) {
            int i14 = l0.f13401b;
            k.e("Error occurred while dispatching size change.", e10);
        }
    }

    public final void zzl(String str) throws JSONException {
        try {
            this.zza.zze("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e10) {
            int i10 = l0.f13401b;
            k.e("Error occurred while dispatching state change.", e10);
        }
    }
}
