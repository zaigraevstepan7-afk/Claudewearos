package p9;

import a5.b;
import ag.l;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.CancellationSignal;
import c3.e;
import ef.m;
import java.io.Serializable;
import java.security.KeyFactory;
import java.security.Provider;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import nb.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r4.d;
import t.m1;
import t4.q;
import ti.g;
import uk.c;
import z4.h;
import z4.j;
import zg.k;
import zg.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class a implements l, q, g, ug.a, xg.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12822a;

    public /* synthetic */ a(int i10) {
        this.f12822a = i10;
    }

    public static a d(Context context, int i10) throws Resources.NotFoundException {
        c.n("Cannot create a CalendarItemStyle with a styleResId of 0", i10 != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, me.a.f11653m);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        wd.a.z(context, typedArrayObtainStyledAttributes, 4);
        wd.a.z(context, typedArrayObtainStyledAttributes, 9);
        wd.a.z(context, typedArrayObtainStyledAttributes, 7);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        m.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new ef.a(0)).a();
        typedArrayObtainStyledAttributes.recycle();
        a aVar = new a(4);
        c.o(rect.left);
        c.o(rect.top);
        c.o(rect.right);
        c.o(rect.bottom);
        return aVar;
    }

    public static Serializable e(Object obj) {
        if (obj instanceof Number) {
            return (Serializable) obj;
        }
        if (obj instanceof String) {
            return (Serializable) obj;
        }
        if (obj instanceof Boolean) {
            return (Serializable) obj;
        }
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.has("@type")) {
                String strOptString = jSONObject.optString("@type");
                String strOptString2 = jSONObject.optString("value");
                if (strOptString.equals("type.googleapis.com/google.protobuf.Int64Value")) {
                    try {
                        return Long.valueOf(Long.parseLong(strOptString2));
                    } catch (NumberFormatException unused) {
                        throw new IllegalArgumentException(m1.i("Invalid Long format:", strOptString2));
                    }
                }
                if (strOptString.equals("type.googleapis.com/google.protobuf.UInt64Value")) {
                    try {
                        return Long.valueOf(Long.parseLong(strOptString2));
                    } catch (NumberFormatException unused2) {
                        throw new IllegalArgumentException(m1.i("Invalid Long format:", strOptString2));
                    }
                }
            }
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, e(jSONObject.opt(next)));
            }
            return map;
        }
        if (!(obj instanceof JSONArray)) {
            if (obj == JSONObject.NULL) {
                return null;
            }
            throw new IllegalArgumentException("Object cannot be decoded from JSON: " + obj);
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            JSONArray jSONArray = (JSONArray) obj;
            if (i10 >= jSONArray.length()) {
                return arrayList;
            }
            arrayList.add(e(jSONArray.opt(i10)));
            i10++;
        }
    }

    public static Object f(Object obj) throws JSONException {
        boolean z2;
        boolean z10;
        if (obj == null || obj == JSONObject.NULL) {
            return JSONObject.NULL;
        }
        if (obj instanceof Long) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("@type", "type.googleapis.com/google.protobuf.Int64Value");
                jSONObject.put("value", obj.toString());
                return jSONObject;
            } catch (JSONException e10) {
                throw new RuntimeException("Error encoding Long.", e10);
            }
        }
        if ((obj instanceof Number) || (obj instanceof String) || (obj instanceof Boolean) || ((z2 = obj instanceof JSONObject)) || ((z10 = obj instanceof JSONArray))) {
            return obj;
        }
        if (obj instanceof Map) {
            JSONObject jSONObject2 = new JSONObject();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                if (!(obj2 instanceof String)) {
                    throw new IllegalArgumentException("Object keys must be strings.");
                }
                try {
                    jSONObject2.put((String) obj2, f(map.get(obj2)));
                } catch (JSONException e11) {
                    throw new RuntimeException(e11);
                }
            }
            return jSONObject2;
        }
        if (obj instanceof List) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(f(it.next()));
            }
            return jSONArray;
        }
        if (z2) {
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject4.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next == null) {
                    throw new IllegalArgumentException("Object keys cannot be null.");
                }
                try {
                    jSONObject3.put(next, f(jSONObject4.opt(next)));
                } catch (JSONException e12) {
                    throw new RuntimeException(e12);
                }
            }
            return jSONObject3;
        }
        if (!z10) {
            throw new IllegalArgumentException("Object cannot be encoded in JSON: " + obj);
        }
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = (JSONArray) obj;
        for (int i10 = 0; i10 < jSONArray3.length(); i10++) {
            jSONArray2.put(f(jSONArray3.opt(i10)));
        }
        return jSONArray2;
    }

    public static Object g(Context context, j jVar, n nVar) throws PackageManager.NameNotFoundException {
        qj.l lVar = new qj.l(1, u3.a.g(nVar));
        lVar.p();
        CancellationSignal cancellationSignal = new CancellationSignal();
        lVar.s(new e(cancellationSignal, 1));
        y.n nVar2 = new y.n(lVar);
        n.a aVar = new n.a(1);
        fj.l.f(context, "context");
        nd.j jVar2 = new nd.j(context, 1);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            h hVar = new h(context);
            eVarB = hVar.isAvailableOnDevice() ? hVar : null;
            if (eVarB == null) {
                eVarB = jVar2.b();
            }
        } else if (i10 <= 33) {
            eVarB = jVar2.b();
        }
        z4.e eVar = eVarB;
        if (eVar == null) {
            nVar2.b(new b("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", "androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION"));
        } else {
            eVar.onGetCredential(context, jVar, cancellationSignal, aVar, nVar2);
        }
        Object objO = lVar.o();
        ui.a aVar2 = ui.a.f17085a;
        return objO;
    }

    @Override // xg.a
    public p a(k kVar, p pVar, boolean z2) {
        return null;
    }

    @Override // ag.l
    public Object b(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }

    public boolean h(CharSequence charSequence) {
        return charSequence instanceof d;
    }

    @Override // ug.a
    public long millis() {
        return System.currentTimeMillis();
    }

    public String toString() {
        switch (this.f12822a) {
            case 13:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    public a() {
        this.f12822a = 6;
        new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US).setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // t4.q
    public void c(boolean z2, int i10, int i11, int i12) {
    }

    @Override // t4.q
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }
}
