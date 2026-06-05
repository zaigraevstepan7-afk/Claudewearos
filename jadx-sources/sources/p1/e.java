package p1;

import c1.e5;
import f1.i0;
import f1.t1;
import fj.y;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final int f12637a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12638b;

    /* renamed from: c, reason: collision with root package name */
    public Object f12639c;

    /* renamed from: d, reason: collision with root package name */
    public t1 f12640d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f12641e;

    public e(Object obj, boolean z2, int i10) {
        this.f12637a = i10;
        this.f12638b = z2;
        this.f12639c = obj;
    }

    public final Object b(int i10, i0 i0Var) {
        i0Var.c0(this.f12637a);
        k(i0Var);
        int iA = i10 | (i0Var.f(this) ? j.a(2, 0) : j.a(1, 0));
        Object obj = this.f12639c;
        fj.l.d(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        y.c(2, obj);
        Object objInvoke = ((ej.e) obj).invoke(i0Var, Integer.valueOf(iA));
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new d(2, this, e.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return objInvoke;
    }

    @Override // ej.f
    public final /* bridge */ /* synthetic */ Object c(Object obj, Object obj2, Object obj3) {
        return f(obj, (i0) obj2, ((Number) obj3).intValue());
    }

    @Override // ej.j
    public final /* bridge */ /* synthetic */ Object d(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, Object obj5, Integer num) {
        return h(obj, bool, obj2, obj3, obj4, (i0) obj5, num.intValue());
    }

    @Override // ej.g
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        return i(obj, obj2, (i0) obj3, ((Number) obj4).intValue());
    }

    public final Object f(Object obj, i0 i0Var, int i10) {
        i0Var.c0(this.f12637a);
        k(i0Var);
        int iA = i0Var.f(this) ? j.a(2, 1) : j.a(1, 1);
        Object obj2 = this.f12639c;
        fj.l.d(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        y.c(3, obj2);
        Object objC = ((ej.f) obj2).c(obj, i0Var, Integer.valueOf(iA | i10));
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new d0.j(this, i10, 8, obj);
        }
        return objC;
    }

    @Override // ej.h
    public final /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return j(obj, obj2, obj3, (i0) obj4, ((Number) obj5).intValue());
    }

    public final Object h(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, i0 i0Var, int i10) {
        i0Var.c0(this.f12637a);
        k(i0Var);
        int iA = i0Var.f(this) ? j.a(2, 6) : j.a(1, 6);
        Object obj5 = this.f12639c;
        fj.l.d(obj5, "null cannot be cast to non-null type kotlin.Function8<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        y.c(8, obj5);
        Object objD = ((ej.j) obj5).d(obj, bool, obj2, obj3, obj4, i0Var, Integer.valueOf(i10 | iA));
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new e5(this, obj, bool, obj2, obj3, obj4, i10);
        }
        return objD;
    }

    public final Object i(Object obj, Object obj2, i0 i0Var, int i10) {
        i0Var.c0(this.f12637a);
        k(i0Var);
        int iA = i0Var.f(this) ? j.a(2, 2) : j.a(1, 2);
        Object obj3 = this.f12639c;
        fj.l.d(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        y.c(4, obj3);
        Object objE = ((ej.g) obj3).e(obj, obj2, i0Var, Integer.valueOf(iA | i10));
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new b6.e(this, obj, obj2, i10, 6);
        }
        return objE;
    }

    @Override // ej.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return b(((Number) obj2).intValue(), (i0) obj);
    }

    public final Object j(Object obj, Object obj2, Object obj3, i0 i0Var, int i10) {
        i0Var.c0(this.f12637a);
        k(i0Var);
        int iA = i0Var.f(this) ? j.a(2, 3) : j.a(1, 3);
        Object obj4 = this.f12639c;
        fj.l.d(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        y.c(5, obj4);
        Object objG = ((ej.h) obj4).g(obj, obj2, obj3, i0Var, Integer.valueOf(iA | i10));
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new b6.d(this, obj, obj2, obj3, i10, 5);
        }
        return objG;
    }

    public final void k(i0 i0Var) {
        t1 t1VarB;
        if (!this.f12638b || (t1VarB = i0Var.B()) == null) {
            return;
        }
        i0Var.getClass();
        t1VarB.f();
        if (j.e(this.f12640d, t1VarB)) {
            this.f12640d = t1VarB;
            return;
        }
        ArrayList arrayList = this.f12641e;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f12641e = arrayList2;
            arrayList2.add(t1VarB);
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (j.e((t1) arrayList.get(i10), t1VarB)) {
                arrayList.set(i10, t1VarB);
                return;
            }
        }
        arrayList.add(t1VarB);
    }
}
