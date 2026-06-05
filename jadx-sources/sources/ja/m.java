package ja;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import qi.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f8790b;

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f8791a;

    static {
        Object obj = n.f8792a;
        f8790b = n.f8792a;
    }

    public m(Context context) {
        this.f8791a = context.getSharedPreferences("home_grid_layout_store", 0);
    }

    public final Map a() {
        Object objR;
        String string = this.f8791a.getString("widget_sizes", null);
        if (string != null) {
            try {
                objR = new JSONObject(string);
            } catch (Throwable th2) {
                objR = uk.c.r(th2);
            }
            if (pi.k.a(objR) == null) {
                JSONObject jSONObject = (JSONObject) objR;
                ri.g gVar = new ri.g();
                Iterator<String> itKeys = jSONObject.keys();
                fj.l.e(itKeys, "keys(...)");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                    if (jSONObjectOptJSONObject != null) {
                        int iOptInt = jSONObjectOptJSONObject.optInt("width", 1);
                        int iOptInt2 = jSONObjectOptJSONObject.optInt("height", 1);
                        fj.l.c(next);
                        gVar.put(next, new o(next, iOptInt, iOptInt2));
                    }
                }
                return gVar.b();
            }
        }
        return t.f13521a;
    }

    public final void b(List list) {
        fj.l.f(list, "slotPackages");
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj == null) {
                obj = f8790b;
            }
            jSONArray.put(obj);
        }
        this.f8791a.edit().putString("grid_slots", jSONArray.toString()).putBoolean("grid_layout_initialized", true).commit();
    }

    public final void c(Set set) {
        fj.l.f(set, "packageNames");
        JSONArray jSONArray = new JSONArray();
        Iterator it = qi.l.K0(set).iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        this.f8791a.edit().putString("visible_packages", jSONArray.toString()).commit();
    }
}
