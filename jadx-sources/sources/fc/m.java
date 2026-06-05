package fc;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m extends a {

    /* renamed from: e, reason: collision with root package name */
    public final t f6709e;

    public m(int i10, String str, String str2, a aVar, t tVar) {
        super(i10, str, str2, aVar);
        this.f6709e = tVar;
    }

    @Override // fc.a
    public final JSONObject b() throws JSONException {
        JSONObject jSONObjectB = super.b();
        t tVar = this.f6709e;
        if (tVar == null) {
            jSONObjectB.put("Response Info", "null");
            return jSONObjectB;
        }
        jSONObjectB.put("Response Info", tVar.a());
        return jSONObjectB;
    }

    @Override // fc.a
    public final String toString() {
        try {
            return b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
