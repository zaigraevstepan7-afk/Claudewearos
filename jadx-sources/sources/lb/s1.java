package lb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f10642b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jb.d f10643c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.q2 f10644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mi.p f10645e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f10646f;

    public /* synthetic */ s1(float f10, jb.d dVar, f1.q2 q2Var, mi.p pVar, boolean z2, int i10) {
        this.f10641a = i10;
        this.f10642b = f10;
        this.f10643c = dVar;
        this.f10644d = q2Var;
        this.f10645e = pVar;
        this.f10646f = z2;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i10 = this.f10641a;
        b0.y yVar = (b0.y) obj;
        f1.i0 i0Var = (f1.i0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i10) {
            case 0:
                fj.l.f(yVar, "$this$BoxWithConstraints");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= i0Var.f(yVar) ? 4 : 2;
                }
                if (i0Var.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    float fC = yVar.c();
                    f1.q2 q2Var = this.f10644d;
                    int size = ((List) q2Var.getValue()).size();
                    float f10 = this.f10642b;
                    jb.d dVar = this.f10643c;
                    float fN = q3.N(fC, f10, dVar, size, i0Var);
                    f1.s.b(new f1.r1[]{jb.f.f8821a.a(new s3.f(f10 * fN)), jb.f.f8827g.a(q3.Q(dVar, fN))}, p1.j.d(-1260654546, new m1(this.f10645e, this.f10646f, q2Var, 1), i0Var), i0Var, 56);
                } else {
                    i0Var.W();
                }
                break;
            default:
                fj.l.f(yVar, "$this$BoxWithConstraints");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= i0Var.f(yVar) ? 4 : 2;
                }
                if (i0Var.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    List listM0 = qi.l.M0(((ib.v0) this.f10644d.getValue()).f8466e, 4);
                    ArrayList arrayList = new ArrayList(qi.m.s0(listM0));
                    Iterator it = listM0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new ta.f(((ta.f) it.next()).f16163a));
                    }
                    float fC2 = yVar.c();
                    int size2 = arrayList.size();
                    float f11 = this.f10642b;
                    jb.d dVar2 = this.f10643c;
                    float fN2 = q3.N(fC2, f11, dVar2, size2, i0Var);
                    f1.s.b(new f1.r1[]{jb.f.f8821a.a(new s3.f(f11 * fN2)), jb.f.f8827g.a(q3.Q(dVar2, fN2))}, p1.j.d(-490148010, new r1(arrayList, this.f10645e, this.f10646f), i0Var), i0Var, 56);
                } else {
                    i0Var.W();
                }
                break;
        }
        return pi.o.f13011a;
    }
}
