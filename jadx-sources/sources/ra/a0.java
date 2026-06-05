package ra;

import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 extends fj.j implements ej.f {
    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) throws JSONException {
        String str = (String) obj;
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        fj.l.f(str, "p0");
        r0 r0Var = (r0) this.f6792b;
        r0Var.getClass();
        ja.m mVar = r0Var.f14152i;
        mVar.getClass();
        LinkedHashMap linkedHashMapN0 = qi.v.n0(mVar.a());
        linkedHashMapN0.put(str, new ja.o(str, iIntValue, iIntValue2));
        JSONObject jSONObject = new JSONObject();
        for (ja.o oVar : linkedHashMapN0.values()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", oVar.f8794b);
            jSONObject2.put("height", oVar.f8795c);
            jSONObject.put(oVar.f8793a, jSONObject2);
        }
        mVar.f8791a.edit().putString("widget_sizes", jSONObject.toString()).commit();
        r0Var.j(false);
        return pi.o.f13011a;
    }
}
