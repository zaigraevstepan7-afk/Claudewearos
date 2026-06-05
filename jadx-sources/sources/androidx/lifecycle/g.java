package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1080a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1081b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1082c;

    public g(e eVar, r rVar) {
        fj.l.f(eVar, "defaultLifecycleObserver");
        this.f1081b = eVar;
        this.f1082c = rVar;
    }

    @Override // androidx.lifecycle.r
    public final void e(t tVar, n nVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.f1080a) {
            case 0:
                e eVar = (e) this.f1081b;
                switch (f.f1079a[nVar.ordinal()]) {
                    case 1:
                        eVar.getClass();
                        break;
                    case 2:
                        eVar.n(tVar);
                        break;
                    case 3:
                        eVar.b(tVar);
                        break;
                    case 4:
                        eVar.getClass();
                        break;
                    case 5:
                        eVar.g(tVar);
                        break;
                    case 6:
                        eVar.l(tVar);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new b3.e();
                }
                r rVar = (r) this.f1082c;
                if (rVar != null) {
                    rVar.e(tVar, nVar);
                    return;
                }
                return;
            case 1:
                if (nVar == n.ON_START) {
                    ((v) this.f1081b).f(this);
                    ((mh.g) this.f1082c).C();
                    return;
                }
                return;
            default:
                HashMap map = ((b) this.f1082c).f1062a;
                List list = (List) map.get(nVar);
                Object obj = this.f1081b;
                b.a(list, tVar, nVar, obj);
                b.a((List) map.get(n.ON_ANY), tVar, nVar, obj);
                return;
        }
    }

    public g(s sVar) {
        this.f1081b = sVar;
        d dVar = d.f1076c;
        Class<?> cls = sVar.getClass();
        b bVar = (b) dVar.f1077a.get(cls);
        this.f1082c = bVar == null ? dVar.a(cls, null) : bVar;
    }

    public g(v vVar, mh.g gVar) {
        this.f1081b = vVar;
        this.f1082c = gVar;
    }
}
