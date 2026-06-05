package b6;

import androidx.lifecycle.t;
import f1.a0;
import fj.v;
import java.util.Map;
import q.g0;
import s.r;
import t1.q;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1603b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1604c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1605d;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i10) {
        this.f1602a = i10;
        this.f1603b = obj;
        this.f1604c = obj2;
        this.f1605d = obj3;
    }

    @Override // f1.a0
    public final void a() {
        switch (this.f1602a) {
            case 0:
                ((t) this.f1603b).h().f((f) this.f1604c);
                d.f fVar = (d.f) ((v) this.f1605d).f6807a;
                if (fVar != null) {
                    fVar.a();
                    break;
                }
                break;
            case 1:
                mg.d dVar = (mg.d) this.f1603b;
                dVar.b("config").f((p7.k) this.f1604c);
                dVar.b("devlogs").f((yh.c) this.f1605d);
                break;
            case 2:
                q qVar = (q) this.f1603b;
                Object obj = this.f1604c;
                qVar.remove(obj);
                ((r) this.f1605d).f14668c.k(obj);
                break;
            default:
                s1.c cVar = (s1.c) this.f1603b;
                g0 g0Var = cVar.f14723b;
                Object obj2 = this.f1604c;
                Object objK = g0Var.k(obj2);
                s1.i iVar = (s1.i) this.f1605d;
                if (objK == iVar) {
                    Map map = cVar.f14722a;
                    Map mapC = iVar.c();
                    if (!mapC.isEmpty()) {
                        map.put(obj2, mapC);
                        break;
                    } else {
                        map.remove(obj2);
                        break;
                    }
                }
                break;
        }
    }
}
