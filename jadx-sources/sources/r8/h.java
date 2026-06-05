package r8;

import qi.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final gf.f f13887a = new gf.f(s.f13520a);

    /* renamed from: b, reason: collision with root package name */
    public static final gf.f f13888b;

    /* renamed from: c, reason: collision with root package name */
    public static final gf.f f13889c;

    /* renamed from: d, reason: collision with root package name */
    public static final gf.f f13890d;

    static {
        wd.a.d(4096);
        s8.a aVar = new s8.a(4096);
        wd.a.d(4096);
        f13888b = new gf.f(new s8.h(aVar, new s8.a(4096)));
        f13889c = new gf.f(Boolean.FALSE);
        f13890d = new gf.f(Boolean.TRUE);
    }

    public static final void a(d dVar, boolean z2) {
        h8.h hVar;
        int i10 = z2 ? 200 : 0;
        gf.f fVar = i.f13891a;
        Object bVar = i10 > 0 ? new u8.b(i10) : u8.f.f16868a;
        Object obj = dVar.f13844o;
        if (obj instanceof h8.h) {
            hVar = (h8.h) obj;
        } else {
            if (!(obj instanceof h8.i)) {
                throw new AssertionError();
            }
            h8.h hVar2 = new h8.h((h8.i) obj);
            dVar.f13844o = hVar2;
            hVar = hVar2;
        }
        hVar.f7701a.put(i.f13891a, bVar);
    }
}
