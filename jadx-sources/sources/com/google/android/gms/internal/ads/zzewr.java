package com.google.android.gms.internal.ads;

import java.util.Map;
import nc.s;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzewr implements zzett {
    private final Map zza;

    public zzewr(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final void zzb(Object obj) throws JSONException {
        try {
            ((JSONObject) obj).put("video_decoders", s.f12202f.f12203a.k(this.zza));
        } catch (JSONException e10) {
            l0.k("Could not encode video decoder properties: ".concat(String.valueOf(e10.getMessage())));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* synthetic */ void zza(Object obj) {
    }
}
