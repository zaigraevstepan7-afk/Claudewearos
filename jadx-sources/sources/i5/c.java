package i5;

import a5.e;
import android.content.Context;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.internal.e0;
import fj.l;
import hd.j;
import hd.o;
import java.util.List;
import java.util.concurrent.Executor;
import z4.d;
import z4.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends f5.a {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f8348i = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Context f8349d;

    /* renamed from: e, reason: collision with root package name */
    public d f8350e;

    /* renamed from: f, reason: collision with root package name */
    public Executor f8351f;

    /* renamed from: g, reason: collision with root package name */
    public CancellationSignal f8352g;

    /* renamed from: h, reason: collision with root package name */
    public final g5.c f8353h;

    public c(Context context) {
        l.f(context, "context");
        this.f8349d = context;
        this.f8353h = new g5.c(this, new Handler(Looper.getMainLooper()), 1);
    }

    public static j d(z4.j jVar) {
        l.f(jVar, "request");
        List list = jVar.f20377a;
        if (list.size() != 1) {
            throw new e("GetSignInWithGoogleOption cannot be combined with other options.");
        }
        Object obj = list.get(0);
        l.d(obj, "null cannot be cast to non-null type com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption");
        le.a aVar = (le.a) obj;
        String str = aVar.f10929d;
        e0.i(str);
        return new j(str, null, null, aVar.f10930e, false, 0);
    }

    public final k e(o oVar) throws a5.b {
        String str = oVar.f7883z;
        le.b bVar = null;
        if (str != null) {
            String str2 = oVar.f7877a;
            l.e(str2, "response.id");
            String str3 = oVar.f7878b;
            if (str3 == null) {
                str3 = null;
            }
            String str4 = oVar.f7879c;
            String str5 = str4 != null ? str4 : null;
            String str6 = oVar.f7880d;
            if (str6 == null) {
                str6 = null;
            }
            String str7 = oVar.A;
            String str8 = str7 != null ? str7 : null;
            Uri uri = oVar.f7881e;
            bVar = new le.b(str2, str, str3, str6, str5, uri != null ? uri : null, str8);
        } else {
            Log.w("GetSignInIntent", "Credential returned but no google Id found");
        }
        if (bVar != null) {
            return new k(bVar);
        }
        throw new a5.b("When attempting to convert get response, null credential found", 3);
    }

    public final d f() {
        d dVar = this.f8350e;
        if (dVar != null) {
            return dVar;
        }
        l.l("callback");
        throw null;
    }

    public final Executor g() {
        Executor executor = this.f8351f;
        if (executor != null) {
            return executor;
        }
        l.l("executor");
        throw null;
    }
}
