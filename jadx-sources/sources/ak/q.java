package ak;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final a8.j f686a;

    /* renamed from: b, reason: collision with root package name */
    public final List f687b;

    /* renamed from: c, reason: collision with root package name */
    public final List f688c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f689d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f690e;

    /* renamed from: f, reason: collision with root package name */
    public final b f691f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f692g;

    /* renamed from: h, reason: collision with root package name */
    public final j f693h;

    /* renamed from: i, reason: collision with root package name */
    public final SocketFactory f694i;
    public final SSLSocketFactory j;

    /* renamed from: k, reason: collision with root package name */
    public final cg.b f695k;

    /* renamed from: l, reason: collision with root package name */
    public final jk.c f696l;

    /* renamed from: m, reason: collision with root package name */
    public final d f697m;

    /* renamed from: n, reason: collision with root package name */
    public final b f698n;

    /* renamed from: o, reason: collision with root package name */
    public final b f699o;

    /* renamed from: p, reason: collision with root package name */
    public final p7.k f700p;

    /* renamed from: q, reason: collision with root package name */
    public final b f701q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f702r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f703s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f704t;

    /* renamed from: u, reason: collision with root package name */
    public int f705u;

    /* renamed from: v, reason: collision with root package name */
    public final int f706v;

    /* renamed from: w, reason: collision with root package name */
    public int f707w;

    /* renamed from: x, reason: collision with root package name */
    public final int f708x;

    public q() {
        this.f689d = new ArrayList();
        this.f690e = new ArrayList();
        this.f686a = new a8.j(2);
        this.f687b = r.R;
        this.f688c = r.S;
        this.f691f = new b();
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f692g = proxySelector;
        if (proxySelector == null) {
            this.f692g = new ik.a();
        }
        this.f693h = j.f656a;
        this.f694i = SocketFactory.getDefault();
        this.f696l = jk.c.f8988a;
        this.f697m = d.f606c;
        b bVar = b.f589a;
        this.f698n = bVar;
        this.f699o = bVar;
        this.f700p = new p7.k(2);
        this.f701q = b.f590b;
        this.f702r = true;
        this.f703s = true;
        this.f704t = true;
        this.f705u = 0;
        this.f706v = 10000;
        this.f707w = 10000;
        this.f708x = 10000;
    }

    public q(r rVar) {
        ArrayList arrayList = new ArrayList();
        this.f689d = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f690e = arrayList2;
        this.f686a = rVar.f709a;
        this.f687b = rVar.f710b;
        this.f688c = rVar.f711c;
        arrayList.addAll(rVar.f712d);
        arrayList2.addAll(rVar.f713e);
        this.f691f = rVar.f714f;
        this.f692g = rVar.f715z;
        this.f693h = rVar.A;
        this.f694i = rVar.B;
        this.j = rVar.C;
        this.f695k = rVar.D;
        this.f696l = rVar.E;
        this.f697m = rVar.F;
        this.f698n = rVar.G;
        this.f699o = rVar.H;
        this.f700p = rVar.I;
        this.f701q = rVar.J;
        this.f702r = rVar.K;
        this.f703s = rVar.L;
        this.f704t = rVar.M;
        this.f705u = rVar.N;
        this.f706v = rVar.O;
        this.f707w = rVar.P;
        this.f708x = rVar.Q;
    }
}
