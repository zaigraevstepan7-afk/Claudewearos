package sb;

import android.content.Context;
import android.net.ConnectivityManager;
import gh.d;
import java.net.MalformedURLException;
import java.net.URL;
import t.m1;
import tb.c;
import tb.f;
import tb.g;
import tb.h;
import tb.i;
import tb.j;
import tb.k;
import tb.l;
import tb.n;
import tb.o;
import tb.q;
import tb.r;
import tb.s;
import tb.v;
import vb.e;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final d8.e f14964a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f14965b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f14966c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f14967d;

    /* renamed from: e, reason: collision with root package name */
    public final dc.a f14968e;

    /* renamed from: f, reason: collision with root package name */
    public final dc.a f14969f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14970g;

    public b(Context context, dc.a aVar, dc.a aVar2) {
        d dVar = new d();
        c cVar = c.f16242a;
        dVar.a(o.class, cVar);
        dVar.a(i.class, cVar);
        f fVar = f.f16255a;
        dVar.a(s.class, fVar);
        dVar.a(l.class, fVar);
        tb.d dVar2 = tb.d.f16244a;
        dVar.a(q.class, dVar2);
        dVar.a(j.class, dVar2);
        tb.b bVar = tb.b.f16230a;
        dVar.a(tb.a.class, bVar);
        dVar.a(h.class, bVar);
        tb.e eVar = tb.e.f16247a;
        dVar.a(r.class, eVar);
        dVar.a(k.class, eVar);
        g gVar = g.f16263a;
        dVar.a(v.class, gVar);
        dVar.a(n.class, gVar);
        dVar.f7417d = true;
        this.f14964a = new d8.e(dVar);
        this.f14966c = context;
        this.f14965b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f14967d = b(a.f14958c);
        this.f14968e = aVar2;
        this.f14969f = aVar;
        this.f14970g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(m1.i("Invalid url: ", str), e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ub.h a(ub.h r7) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sb.b.a(ub.h):ub.h");
    }
}
