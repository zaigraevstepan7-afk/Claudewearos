package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbor {
    private static final Charset zzc = Charset.forName("UTF-8");
    public static final zzboo zza = new zzboq();
    public static final zzbom zzb = new zzbom() { // from class: com.google.android.gms.internal.ads.zzbop
        @Override // com.google.android.gms.internal.ads.zzbom
        public final Object zza(JSONObject jSONObject) {
            return zzbor.zza(jSONObject);
        }
    };

    public static /* synthetic */ InputStream zza(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(zzc));
    }
}
