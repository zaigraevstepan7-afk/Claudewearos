package ai;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: h, reason: collision with root package name */
    public static final Date f515h = new Date(0);

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f516a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f517b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f518c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONArray f519d;

    /* renamed from: e, reason: collision with root package name */
    public final JSONObject f520e;

    /* renamed from: f, reason: collision with root package name */
    public final long f521f;

    /* renamed from: g, reason: collision with root package name */
    public final JSONArray f522g;

    public g(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f517b = jSONObject;
        this.f518c = date;
        this.f519d = jSONArray;
        this.f520e = jSONObject2;
        this.f521f = j;
        this.f522g = jSONArray2;
        this.f516a = jSONObject3;
    }

    public static g a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new g(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    public static f c() {
        f fVar = new f();
        fVar.f509a = new JSONObject();
        fVar.f510b = f515h;
        fVar.f511c = new JSONArray();
        fVar.f512d = new JSONObject();
        fVar.f513e = 0L;
        fVar.f514f = new JSONArray();
        return fVar;
    }

    public final HashMap b() throws JSONException {
        HashMap map = new HashMap();
        int i10 = 0;
        while (true) {
            JSONArray jSONArray = this.f522g;
            if (i10 >= jSONArray.length()) {
                return map;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                String string3 = jSONArray2.getString(i11);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f516a.toString().equals(((g) obj).f516a.toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.f516a.hashCode();
    }

    public final String toString() {
        return this.f516a.toString();
    }
}
