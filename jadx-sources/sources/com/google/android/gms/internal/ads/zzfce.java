package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mc.n;
import nc.t;
import org.json.JSONException;
import org.json.JSONObject;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfce {
    public final List zza;
    public final zzfbw zzb;
    public final List zzc;
    public final Bundle zzd;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public zzfce(JsonReader jsonReader, Bundle bundle) throws JSONException, IOException {
        this.zzd = bundle;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzco)).booleanValue() && bundle != null) {
            m1.u(n.D.f11584k, bundle, zzdrk.SERVER_RESPONSE_PARSE_START.zza());
        }
        ?? arrayList = Collections.EMPTY_LIST;
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        zzfbw zzfbwVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        arrayList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList.add(new zzfbt(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        zzfbwVar = new zzfbw(jsonReader);
                        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcp)).booleanValue() && bundle != null) {
                            bundle.putLong(zzdrk.NORMALIZATION_AD_RESPONSE_START.zza(), zzfbwVar.zzs);
                            bundle.putLong(zzdrk.NORMALIZATION_AD_RESPONSE_END.zza(), zzfbwVar.zzt);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    JSONObject jSONObjectY = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if ("name".equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            jSONObjectY = hj.a.Y(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList2.add(new zzfcd(strNextString, jSONObjectY));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.zzc = arrayList2;
        this.zza = arrayList;
        this.zzb = zzfbwVar == null ? new zzfbw(new JsonReader(new StringReader("{}"))) : zzfbwVar;
    }

    public static zzfce zza(Reader reader, Bundle bundle) {
        try {
            try {
                return new zzfce(new JsonReader(reader), bundle);
            } finally {
                ud.c.d(reader);
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e10) {
            throw new zzfbx("unable to parse ServerResponse", e10);
        }
    }
}
