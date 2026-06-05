package o6;

import android.content.Context;
import android.os.Build;
import androidx.lifecycle.h0;
import c2.z;
import cg.b;
import fj.l;
import q6.d;
import q6.g;
import qj.b0;
import qj.m0;
import vj.n;
import xj.e;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final g f12421a;

    public a(g gVar) {
        this.f12421a = gVar;
    }

    public static final a a(Context context) {
        d dVar;
        l.f(context, "context");
        int i10 = Build.VERSION.SDK_INT;
        l6.a aVar = l6.a.f10013a;
        if ((i10 >= 30 ? aVar.a() : 0) >= 5) {
            Object systemService = context.getSystemService((Class<Object>) z.z());
            l.e(systemService, "context.getSystemService\u2026opicsManager::class.java)");
            dVar = new d(z.j(systemService), 1);
        } else {
            if ((i10 >= 30 ? aVar.a() : 0) == 4) {
                Object systemService2 = context.getSystemService((Class<Object>) z.z());
                l.e(systemService2, "context.getSystemService\u2026opicsManager::class.java)");
                dVar = new d(z.j(systemService2), 0);
            } else {
                dVar = null;
            }
        }
        if (dVar != null) {
            return new a(dVar);
        }
        return null;
    }

    public mf.a b(q6.a aVar) {
        l.f(aVar, "request");
        e eVar = m0.f13601a;
        return b.h(b0.d(b0.b(n.f18117a), null, new h0(this, aVar, null, 25), 3));
    }
}
