package ai;

import android.util.Log;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f540e;

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f541f;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f542a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Executor f543b;

    /* renamed from: c, reason: collision with root package name */
    public final e f544c;

    /* renamed from: d, reason: collision with root package name */
    public final e f545d;

    static {
        Charset.forName("UTF-8");
        f540e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f541f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public k(Executor executor, e eVar, e eVar2) {
        this.f543b = executor;
        this.f544c = eVar;
        this.f545d = eVar2;
    }

    public static String b(e eVar, String str) {
        g gVarC = eVar.c();
        if (gVarC == null) {
            return null;
        }
        try {
            return gVarC.f517b.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void c(String str, String str2) {
        Log.w("FirebaseRemoteConfig", m1.k("No value of type '", str2, "' exists for parameter key '", str, "'."));
    }

    public final void a(String str, g gVar) {
        if (gVar == null) {
            return;
        }
        synchronized (this.f542a) {
            try {
                Iterator it = this.f542a.iterator();
                while (it.hasNext()) {
                    this.f543b.execute(new ac.o((zh.g) it.next(), str, gVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
