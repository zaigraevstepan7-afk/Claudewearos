package gh;

import eh.f;
import eh.g;
import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d implements fh.a {

    /* renamed from: f, reason: collision with root package name */
    public static final b f7411f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f7412g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7414a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f7415b;

    /* renamed from: c, reason: collision with root package name */
    public final a f7416c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7417d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f7410e = new a(0);

    /* renamed from: h, reason: collision with root package name */
    public static final c f7413h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [gh.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [gh.b] */
    static {
        final int i10 = 0;
        f7411f = new f() { // from class: gh.b
            @Override // eh.a
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((g) obj2).b((String) obj);
                        break;
                    default:
                        ((g) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i11 = 1;
        f7412g = new f() { // from class: gh.b
            @Override // eh.a
            public final void a(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        ((g) obj2).b((String) obj);
                        break;
                    default:
                        ((g) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap map = new HashMap();
        this.f7414a = map;
        HashMap map2 = new HashMap();
        this.f7415b = map2;
        this.f7416c = f7410e;
        this.f7417d = false;
        map2.put(String.class, f7411f);
        map.remove(String.class);
        map2.put(Boolean.class, f7412g);
        map.remove(Boolean.class);
        map2.put(Date.class, f7413h);
        map.remove(Date.class);
    }

    public final fh.a a(Class cls, eh.d dVar) {
        this.f7414a.put(cls, dVar);
        this.f7415b.remove(cls);
        return this;
    }
}
