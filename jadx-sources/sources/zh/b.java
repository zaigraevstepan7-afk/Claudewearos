package zh;

import ai.j;
import ai.k;
import ai.m;
import ai.p;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final dg.c f20623a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f20624b;

    /* renamed from: c, reason: collision with root package name */
    public final ai.e f20625c;

    /* renamed from: d, reason: collision with root package name */
    public final ai.e f20626d;

    /* renamed from: e, reason: collision with root package name */
    public final ai.e f20627e;

    /* renamed from: f, reason: collision with root package name */
    public final j f20628f;

    /* renamed from: g, reason: collision with root package name */
    public final k f20629g;

    /* renamed from: h, reason: collision with root package name */
    public final m f20630h;

    /* renamed from: i, reason: collision with root package name */
    public final ac.d f20631i;
    public final ac.d j;

    public b(dg.c cVar, Executor executor, ai.e eVar, ai.e eVar2, ai.e eVar3, j jVar, k kVar, m mVar, ac.d dVar, ac.d dVar2) {
        this.f20623a = cVar;
        this.f20624b = executor;
        this.f20625c = eVar;
        this.f20626d = eVar2;
        this.f20627e = eVar3;
        this.f20628f = jVar;
        this.f20629g = kVar;
        this.f20630h = mVar;
        this.f20631i = dVar;
        this.j = dVar2;
    }

    public static ArrayList e(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public final Task a() {
        j jVar = this.f20628f;
        long j = jVar.f538g.f550a.getLong("minimum_fetch_interval_in_seconds", j.f531i);
        HashMap map = new HashMap(jVar.f539h);
        map.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        return jVar.f536e.b().continueWithTask(jVar.f534c, new ac.m(jVar, j, map)).onSuccessTask(lg.i.f10960a, new vf.j(9)).onSuccessTask(this.f20624b, new a(this));
    }

    public final boolean b(String str) {
        Pattern pattern = k.f541f;
        Pattern pattern2 = k.f540e;
        k kVar = this.f20629g;
        ai.e eVar = kVar.f544c;
        String strB = k.b(eVar, str);
        if (strB != null) {
            if (pattern2.matcher(strB).matches()) {
                kVar.a(str, eVar.c());
                return true;
            }
            if (pattern.matcher(strB).matches()) {
                kVar.a(str, eVar.c());
                return false;
            }
        }
        String strB2 = k.b(kVar.f545d, str);
        if (strB2 != null) {
            if (pattern2.matcher(strB2).matches()) {
                return true;
            }
            if (pattern.matcher(strB2).matches()) {
                return false;
            }
        }
        k.c(str, "Boolean");
        return false;
    }

    public final String c(String str) {
        k kVar = this.f20629g;
        ai.e eVar = kVar.f544c;
        String strB = k.b(eVar, str);
        if (strB != null) {
            kVar.a(str, eVar.c());
            return strB;
        }
        String strB2 = k.b(kVar.f545d, str);
        if (strB2 != null) {
            return strB2;
        }
        k.c(str, "String");
        return "";
    }

    public final void d(boolean z2) {
        ac.d dVar = this.f20631i;
        synchronized (dVar) {
            ((p) dVar.f374c).f565e = z2;
            if (!z2) {
                synchronized (dVar) {
                    if (!((LinkedHashSet) dVar.f373b).isEmpty()) {
                        ((p) dVar.f374c).e(0L);
                    }
                }
            }
        }
    }
}
