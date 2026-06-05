package g5;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import ce.i;
import ce.u;
import ce.x;
import fj.l;
import hd.o;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import nj.e;
import org.json.JSONObject;
import t.m1;
import z4.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends f5.a {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f7207i = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Context f7208d;

    /* renamed from: e, reason: collision with root package name */
    public z4.d f7209e;

    /* renamed from: f, reason: collision with root package name */
    public Executor f7210f;

    /* renamed from: g, reason: collision with root package name */
    public CancellationSignal f7211g;

    /* renamed from: h, reason: collision with root package name */
    public final c f7212h;

    public d(Context context) {
        l.f(context, "context");
        this.f7208d = context;
        this.f7212h = new c(this, new Handler(Looper.getMainLooper()), 0);
    }

    public final k d(o oVar) throws a5.b, a5.c {
        z4.c lVar;
        String string;
        x xVar = oVar.B;
        String str = oVar.f7883z;
        String str2 = oVar.f7877a;
        String str3 = oVar.f7882f;
        if (str3 != null) {
            l.e(str2, "response.id");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", str2);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str3);
            lVar = new z4.l(str3, bundle, 0);
        } else {
            le.b bVar = null;
            if (str != null) {
                l.e(str2, "response.id");
                String str4 = oVar.f7878b;
                String str5 = str4 != null ? str4 : null;
                String str6 = oVar.f7879c;
                String str7 = str6 != null ? str6 : null;
                String str8 = oVar.f7880d;
                String str9 = str8 != null ? str8 : null;
                String str10 = oVar.A;
                String str11 = str10 != null ? str10 : null;
                Uri uri = oVar.f7881e;
                bVar = new le.b(str2, str, str5, str9, str7, uri != null ? uri : null, str11);
            } else if (xVar != null) {
                LinkedHashMap linkedHashMap = h5.a.f7654a;
                JSONObject jSONObject = new JSONObject();
                Object obj = xVar.f3332d;
                if (obj == null && (obj = xVar.f3333e) == null && (obj = xVar.f3334f) == null) {
                    throw new IllegalStateException("No response set.");
                }
                if (obj instanceof ce.k) {
                    ce.k kVar = (ce.k) obj;
                    u uVar = kVar.f3285a;
                    l.e(uVar, "authenticatorResponse.errorCode");
                    String str12 = kVar.f3286b;
                    b5.a aVar = (b5.a) h5.a.f7654a.get(uVar);
                    if (aVar == null) {
                        throw new a5.c(new b5.a(26), m1.i("unknown fido gms exception - ", str12));
                    }
                    if (uVar == u.NOT_ALLOWED_ERR && str12 != null && e.C0(str12, "Unable to get sync account", false)) {
                        throw new a5.b("Passkey retrieval was cancelled by the user.", 0);
                    }
                    throw new a5.c(aVar, str12);
                }
                if (obj instanceof i) {
                    try {
                        string = xVar.b().toString();
                        l.e(string, "publicKeyCred.toJson()");
                    } catch (Throwable th2) {
                        throw new a5.b("The PublicKeyCredential response json had an unexpected exception when parsing: " + th2.getMessage(), 3);
                    }
                } else {
                    Log.e("PublicKeyUtility", "AuthenticatorResponse expected assertion response but got: ".concat(obj.getClass().getName()));
                    string = jSONObject.toString();
                    l.e(string, "json.toString()");
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", string);
                lVar = new z4.l(string, bundle2, 1);
            } else {
                Log.w("BeginSignIn", "Credential returned but no google Id or password or passkey found");
            }
            lVar = bVar;
        }
        if (lVar != null) {
            return new k(lVar);
        }
        throw new a5.b("When attempting to convert get response, null credential found", 3);
    }

    public final z4.d e() {
        z4.d dVar = this.f7209e;
        if (dVar != null) {
            return dVar;
        }
        l.l("callback");
        throw null;
    }

    public final Executor f() {
        Executor executor = this.f7210f;
        if (executor != null) {
            return executor;
        }
        l.l("executor");
        throw null;
    }
}
