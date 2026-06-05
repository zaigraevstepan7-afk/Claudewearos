package mb;

import f1.a1;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11486a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.c f11487b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11488c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11489d;

    public /* synthetic */ o(int i10, ej.c cVar, a1 a1Var) {
        this.f11489d = a1Var;
        this.f11487b = cVar;
        this.f11488c = i10;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f11486a) {
            case 0:
                this.f11487b.invoke(((b) ((List) this.f11489d).get(this.f11488c)).f11438a);
                break;
            default:
                a1 a1Var = (a1) this.f11489d;
                a1Var.setValue(Integer.valueOf(((Number) a1Var.getValue()).intValue() + 1));
                this.f11487b.invoke(new ta.k(this.f11488c));
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ o(ej.c cVar, List list, int i10) {
        this.f11487b = cVar;
        this.f11489d = list;
        this.f11488c = i10;
    }
}
