package rc;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import wh.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f14341c = false;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f14342d = false;

    /* renamed from: a, reason: collision with root package name */
    public final List f14344a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f14340b = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final HashSet f14343e = new HashSet(Arrays.asList(new String[0]));

    public h() {
        this.f14344a = !c() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    public static boolean c() {
        boolean z2;
        synchronized (f14340b) {
            try {
                z2 = false;
                if (f14341c && f14342d) {
                    z2 = true;
                }
            } finally {
            }
        }
        return z2;
    }

    public static void e(JsonWriter jsonWriter, Map map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!f14343e.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        k.d("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void a(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        if (c()) {
            d("onNetworkRequest", new s(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr));
        }
    }

    public final void b(HttpURLConnection httpURLConnection, int i10) throws IOException {
        if (c()) {
            String responseMessage = null;
            d("onNetworkResponse", new k4.d(i10, httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields())));
            if (i10 < 200 || i10 >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (IOException e10) {
                    k.g("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e10.getMessage())));
                }
                d("onNetworkRequestError", new f(responseMessage));
            }
        }
    }

    public final void d(String str, g gVar) throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(System.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.f14344a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            gVar.f(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e10) {
            k.e("unable to log", e10);
        }
        String string = stringWriter.toString();
        synchronized (h.class) {
            try {
                k.f("GMA Debug BEGIN");
                int i10 = 0;
                while (i10 < string.length()) {
                    int i11 = i10 + 4000;
                    k.f("GMA Debug CONTENT ".concat(String.valueOf(string.substring(i10, Math.min(i11, string.length())))));
                    i10 = i11;
                }
                k.f("GMA Debug FINISH");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
