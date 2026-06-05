package jg;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.internal.p002firebaseauthapi.zzac;
import com.google.android.gms.internal.p002firebaseauthapi.zzxy;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final qd.a f8892a = new qd.a("JSONParser", new String[0]);

    public static ArrayList a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object objC = jSONArray.get(i10);
            if (objC instanceof JSONArray) {
                objC = a((JSONArray) objC);
            } else if (objC instanceof JSONObject) {
                objC = c((JSONObject) objC);
            }
            arrayList.add(objC);
        }
        return arrayList;
    }

    public static Map b(String str) {
        e0.e(str);
        List<String> listZza = zzac.zza('.').zza((CharSequence) str);
        int size = listZza.size();
        qd.a aVar = f8892a;
        if (size < 2) {
            aVar.c(m1.i("Invalid idToken ", str), new Object[0]);
            return new HashMap();
        }
        try {
            q.e eVarD = d(new String(ud.c.g(listZza.get(1)), "UTF-8"));
            return eVarD == null ? new HashMap() : eVarD;
        } catch (UnsupportedEncodingException e10) {
            aVar.b("Unable to decode token", e10, new Object[0]);
            return new HashMap();
        }
    }

    public static q.e c(JSONObject jSONObject) throws JSONException {
        q.e eVar = new q.e(0);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objC = jSONObject.get(next);
            if (objC instanceof JSONArray) {
                objC = a((JSONArray) objC);
            } else if (objC instanceof JSONObject) {
                objC = c((JSONObject) objC);
            }
            eVar.put(next, objC);
        }
        return eVar;
    }

    public static q.e d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return c(jSONObject);
            }
            return null;
        } catch (Exception e10) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzxy(e10);
        }
    }
}
