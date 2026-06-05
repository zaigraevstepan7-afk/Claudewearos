package f0;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f6149a;

    public i0(int i10) {
        switch (i10) {
            case 1:
                this.f6149a = new Object();
                break;
            case 2:
            default:
                q.v vVar = q.l.f13102a;
                this.f6149a = new q.v();
                break;
            case 3:
                this.f6149a = new ArrayList();
                break;
        }
    }

    public boolean a(int i10, i1.c cVar, Object obj) {
        ArrayList arrayListD = cVar.d();
        boolean z2 = false;
        if (arrayListD != null) {
            int size = arrayListD.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj2 = arrayListD.get(i11);
                if (obj2 instanceof i1.b) {
                    if (obj2.equals(obj)) {
                        b(cVar.e(), cVar, obj2);
                        return true;
                    }
                } else {
                    if (!(obj2 instanceof i1.c)) {
                        throw new IllegalStateException(("Unexpected child source info " + obj2).toString());
                    }
                    if (a(i10, (i1.c) obj2, obj)) {
                        b(cVar.e(), cVar, obj2);
                        return true;
                    }
                }
            }
        } else {
            if (!cVar.a()) {
                b(i10, cVar, null);
                return true;
            }
            int iC = cVar.c();
            int iB = cVar.b();
            if (obj instanceof Integer) {
                Number number = (Number) obj;
                int iIntValue = number.intValue();
                if ((iC <= iIntValue && iIntValue < iB) || (iC == iB && iC == number.intValue())) {
                    z2 = true;
                }
                if (z2) {
                    b(cVar.e(), cVar, null);
                }
                return z2;
            }
        }
        return false;
    }

    public void b(int i10, i1.c cVar, Object obj) {
        ((ArrayList) this.f6149a).add(new u1.c(i10, null, null));
    }

    public abstract void c(a8.j jVar);

    public abstract void d(sj.r rVar);

    public abstract void e();

    public abstract com.google.crypto.tink.shaded.protobuf.a f(com.google.crypto.tink.shaded.protobuf.a aVar);

    public abstract void g();

    public abstract String h();

    public List i(g0 g0Var, int i10, long j) {
        q.v vVar = (q.v) this.f6149a;
        List list = (List) vVar.b(i10);
        if (list != null) {
            return list;
        }
        List listF = g0Var.f(i10);
        int size = listF.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(((t2.p0) listF.get(i11)).Y(j));
        }
        vVar.i(i10, arrayList);
        return arrayList;
    }

    public abstract int j(i1.b bVar);

    public boolean k() {
        int i10;
        w5.s0 s0Var = (w5.s0) this.f6149a;
        View view = s0Var.f18743c.Z;
        if (view != null) {
            i10 = 4;
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    i10 = 2;
                } else if (visibility != 4) {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(m6.a.d(visibility, "Unknown visibility "));
                    }
                    i10 = 3;
                }
            }
        } else {
            i10 = 0;
        }
        int i11 = s0Var.f18741a;
        if (i10 != i11) {
            return (i10 == 2 || i11 == 2) ? false : true;
        }
        return true;
    }

    public Map l() {
        return Collections.EMPTY_MAP;
    }

    public abstract com.google.crypto.tink.shaded.protobuf.a m(com.google.crypto.tink.shaded.protobuf.i iVar);

    public void n(int i10, Object obj, i1.c cVar, Object obj2) {
        if (fj.l.b(obj, f1.m.f6385a)) {
            b(i10, cVar, null);
        }
    }

    public abstract ej.c o(sj.r rVar);

    public abstract void p(sj.g gVar);

    public abstract i1.c q(i1.b bVar);

    public i1.c r(Object obj) {
        if (obj instanceof i1.b) {
            return q((i1.b) obj);
        }
        if (obj instanceof i1.c) {
            return (i1.c) obj;
        }
        throw new IllegalStateException(("Unexpected child source info " + obj).toString());
    }

    public abstract void s(com.google.crypto.tink.shaded.protobuf.a aVar);

    public i0(Class cls) {
        this.f6149a = cls;
    }

    public i0(w5.s0 s0Var) {
        fj.l.f(s0Var, "operation");
        this.f6149a = s0Var;
    }
}
