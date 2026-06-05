package d1;

import f1.q2;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q2 f4588b;

    public /* synthetic */ v0(q2 q2Var, int i10) {
        this.f4587a = i10;
        this.f4588b = q2Var;
    }

    @Override // ej.a
    public final Object a() {
        int i10 = this.f4587a;
        q2 q2Var = this.f4588b;
        switch (i10) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                ib.v0 v0Var = (ib.v0) q2Var.getValue();
                fj.l.f(v0Var, "<this>");
                ib.p0 p0Var = new ib.p0(v0Var.f8462a, v0Var.f8463b, v0Var.f8464c, v0Var.f8465d, v0Var.f8475o);
                ib.f fVar = new ib.f(v0Var.f8466e, v0Var.f8470i, v0Var.f8473m);
                List list = v0Var.f8467f;
                List list2 = v0Var.f8468g;
                Set set = v0Var.f8469h;
                List list3 = v0Var.j;
                Map map = v0Var.f8474n;
                String str = v0Var.f8477q;
                break;
            case 3:
                break;
            default:
                t.m mVar = v0.h0.f17397a;
                break;
        }
        return new b2.b(((b2.b) q2Var.getValue()).f1500a);
    }
}
