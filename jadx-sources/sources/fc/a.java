package fc;

import nc.h2;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f6680a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6681b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6682c;

    /* renamed from: d, reason: collision with root package name */
    public final a f6683d;

    public a(int i10, String str, String str2, a aVar) {
        this.f6680a = i10;
        this.f6681b = str;
        this.f6682c = str2;
        this.f6683d = aVar;
    }

    public final h2 a() {
        h2 h2Var;
        a aVar = this.f6683d;
        if (aVar == null) {
            h2Var = null;
        } else {
            h2Var = new h2(aVar.f6680a, aVar.f6681b, aVar.f6682c, null, null);
        }
        return new h2(this.f6680a, this.f6681b, this.f6682c, h2Var, null);
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f6680a);
        jSONObject.put("Message", this.f6681b);
        jSONObject.put("Domain", this.f6682c);
        a aVar = this.f6683d;
        if (aVar == null) {
            jSONObject.put("Cause", "null");
            return jSONObject;
        }
        jSONObject.put("Cause", aVar.b());
        return jSONObject;
    }

    public String toString() {
        try {
            return b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
