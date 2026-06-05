package xc;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbvo;
import com.google.android.gms.internal.ads.zzdrk;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final String f20024a;

    /* renamed from: b, reason: collision with root package name */
    public String f20025b;

    /* renamed from: d, reason: collision with root package name */
    public final zzbvo f20027d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle f20028e;

    /* renamed from: g, reason: collision with root package name */
    public final long f20030g;

    /* renamed from: h, reason: collision with root package name */
    public final long f20031h;

    /* renamed from: c, reason: collision with root package name */
    public String f20026c = null;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f20029f = new Bundle();

    public v(JsonReader jsonReader, zzbvo zzbvoVar) throws IOException {
        Bundle bundle;
        this.f20030g = -1L;
        this.f20031h = -1L;
        this.f20027d = zzbvoVar;
        HashMap map = new HashMap();
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName = strNextName == null ? "" : strNextName;
            switch (strNextName.hashCode()) {
                case -1573145462:
                    if (strNextName.equals("start_time")) {
                        this.f20030g = jsonReader.nextLong();
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                case -995427962:
                    if (strNextName.equals("params")) {
                        strNextString = jsonReader.nextString();
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                case -271442291:
                    if (strNextName.equals("signal_dictionary")) {
                        map = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            map.put(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                case 1725551537:
                    if (strNextName.equals("end_time")) {
                        this.f20031h = jsonReader.nextLong();
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        this.f20024a = strNextString;
        jsonReader.endObject();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f20029f.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzco)).booleanValue() || zzbvoVar == null || (bundle = zzbvoVar.zzm) == null) {
            return;
        }
        bundle.putLong(zzdrk.GET_SIGNALS_SDKCORE_START.zza(), this.f20030g);
        zzbvoVar.zzm.putLong(zzdrk.GET_SIGNALS_SDKCORE_END.zza(), this.f20031h);
    }
}
