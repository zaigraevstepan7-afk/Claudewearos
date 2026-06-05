package fc;

import android.os.Bundle;
import nc.h2;
import nc.u3;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final u3 f6706a;

    /* renamed from: b, reason: collision with root package name */
    public final a f6707b;

    public j(u3 u3Var) {
        this.f6706a = u3Var;
        h2 h2Var = u3Var.f12243c;
        this.f6707b = h2Var == null ? null : h2Var.b();
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        u3 u3Var = this.f6706a;
        jSONObject.put("Adapter", u3Var.f12241a);
        jSONObject.put("Latency", u3Var.f12242b);
        String str = u3Var.f12245e;
        if (str == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", str);
        }
        String str2 = u3Var.f12246f;
        if (str2 == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", str2);
        }
        String str3 = u3Var.f12247z;
        if (str3 == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", str3);
        }
        String str4 = u3Var.A;
        if (str4 == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", str4);
        }
        JSONObject jSONObject2 = new JSONObject();
        Bundle bundle = u3Var.f12244d;
        for (String str5 : bundle.keySet()) {
            jSONObject2.put(str5, bundle.get(str5));
        }
        jSONObject.put("Credentials", jSONObject2);
        a aVar = this.f6707b;
        if (aVar == null) {
            jSONObject.put("Ad Error", "null");
            return jSONObject;
        }
        jSONObject.put("Ad Error", aVar.b());
        return jSONObject;
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
