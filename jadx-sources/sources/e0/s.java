package e0;

import android.graphics.Rect;
import f0.m0;
import java.util.Collection;
import java.util.List;
import t2.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5313a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5314b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5315c;

    public /* synthetic */ s(int i10, int i11, Object obj) {
        this.f5313a = i11;
        this.f5315c = obj;
        this.f5314b = i10;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f5313a) {
            case 0:
                m0 m0Var = (m0) obj;
                d0.a aVar = ((v) this.f5315c).f5327a;
                t1.g gVarF = t1.r.f();
                t1.r.n(gVarF, t1.r.k(gVarF), gVarF != null ? gVarF.e() : null);
                aVar.getClass();
                int i10 = m0Var.f6169a;
                if (i10 == -1) {
                    i10 = 2;
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    m0Var.a(this.f5314b + i11);
                }
                return pi.o.f13011a;
            case 1:
                return Boolean.valueOf(((List) obj).addAll(this.f5314b, (Collection) this.f5315c));
            default:
                t1.t tVar = (t1.t) this.f5315c;
                t2.w wVar = (t2.w) obj;
                fj.l.f(wVar, "coordinates");
                b2.c cVarF = z.f(wVar, true);
                tVar.put(Integer.valueOf(this.f5314b), new Rect((int) cVarF.f1502a, (int) cVarF.f1503b, (int) cVarF.f1504c, (int) cVarF.f1505d));
                return pi.o.f13011a;
        }
    }

    public /* synthetic */ s(int i10, Collection collection) {
        this.f5313a = 1;
        this.f5314b = i10;
        this.f5315c = collection;
    }
}
