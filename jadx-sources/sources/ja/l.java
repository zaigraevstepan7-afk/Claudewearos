package ja;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import qi.t;
import qi.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f8789a;

    public l(Context context) {
        this.f8789a = context.getSharedPreferences("void_folder_store", 0);
    }

    public final Map a() {
        Object objR;
        String string = this.f8789a.getString("folders", null);
        if (string != null) {
            try {
                objR = new JSONArray(string);
            } catch (Throwable th2) {
                objR = uk.c.r(th2);
            }
            if (pi.k.a(objR) == null) {
                JSONArray jSONArray = (JSONArray) objR;
                ri.g gVar = new ri.g();
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("id");
                        fj.l.c(strOptString);
                        if (nj.e.K0(strOptString)) {
                            strOptString = null;
                        }
                        if (strOptString != null) {
                            String strOptString2 = jSONObjectOptJSONObject.optString("name");
                            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("packages");
                            if (jSONArrayOptJSONArray != null) {
                                ri.c cVarR = yd.f.r();
                                int length2 = jSONArrayOptJSONArray.length();
                                for (int i11 = 0; i11 < length2; i11++) {
                                    String strOptString3 = jSONArrayOptJSONArray.optString(i11);
                                    fj.l.c(strOptString3);
                                    if (nj.e.K0(strOptString3)) {
                                        strOptString3 = null;
                                    }
                                    if (strOptString3 != null) {
                                        cVarR.add(strOptString3);
                                    }
                                }
                                ri.c cVarM = yd.f.m(cVarR);
                                boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("locked", false);
                                fj.l.c(strOptString2);
                                gVar.put(strOptString, new j(strOptString, strOptString2, cVarM, zOptBoolean));
                            }
                        }
                    }
                }
                return gVar.b();
            }
        }
        return t.f13521a;
    }

    public final void b(Map map) {
        JSONArray jSONArray = new JSONArray();
        for (j jVar : map.values()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", jVar.f8784a);
            jSONObject.put("name", jVar.f8785b);
            JSONArray jSONArray2 = new JSONArray();
            Iterator it = jVar.f8786c.iterator();
            while (it.hasNext()) {
                jSONArray2.put((String) it.next());
            }
            jSONObject.put("packages", jSONArray2);
            jSONObject.put("locked", jVar.f8787d);
            jSONArray.put(jSONObject);
        }
        this.f8789a.edit().putString("folders", jSONArray.toString()).apply();
    }

    public final void c(j jVar) {
        LinkedHashMap linkedHashMapN0 = v.n0(a());
        linkedHashMapN0.put(jVar.f8784a, jVar);
        b(linkedHashMapN0);
    }
}
