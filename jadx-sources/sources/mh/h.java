package mh;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final long f11709d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f11710e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f11711a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11712b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11713c;

    public h(String str, String str2, long j) {
        this.f11711a = str;
        this.f11712b = str2;
        this.f11713c = j;
    }

    public static String a(String str, String str2, long j) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e10) {
            String strValueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 24);
            sb2.append("Failed to encode token: ");
            sb2.append(strValueOf);
            Log.w("FirebaseInstanceId", sb2.toString());
            return null;
        }
    }

    public static h b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new h(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new h(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e10) {
            String strValueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 23);
            sb2.append("Failed to parse token: ");
            sb2.append(strValueOf);
            Log.w("FirebaseInstanceId", sb2.toString());
            return null;
        }
    }
}
