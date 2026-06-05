package b0;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class p1 implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1392a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1393b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1394c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1396e;

    public /* synthetic */ p1(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f1392a = i11;
        this.f1394c = obj;
        this.f1395d = obj2;
        this.f1396e = obj3;
        this.f1393b = i10;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f1392a) {
            case 0:
                t2.f1[] f1VarArr = (t2.f1[]) this.f1394c;
                q1 q1Var = (q1) this.f1395d;
                int[] iArr = (int[]) this.f1396e;
                t2.e1 e1Var = (t2.e1) obj;
                int length = f1VarArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    t2.f1 f1Var = f1VarArr[i10];
                    int i12 = i11 + 1;
                    fj.l.c(f1Var);
                    Object objC0 = f1Var.c0();
                    n1 n1Var = objC0 instanceof n1 ? (n1) objC0 : null;
                    f0 f0Var = n1Var != null ? n1Var.f1383c : null;
                    int i13 = this.f1393b;
                    e1Var.z(f1Var, iArr[i11], f0Var != null ? f0Var.f1310a.a(f1Var.f15551b, i13, s3.m.f14752a) : q1Var.f1402b.a(f1Var.f15551b, i13), 0.0f);
                    i10++;
                    i11 = i12;
                }
                return pi.o.f13011a;
            case 1:
                ArrayList arrayList = (ArrayList) this.f1394c;
                t2.s0 s0Var = (t2.s0) this.f1395d;
                float f10 = c1.j.f2255c;
                ArrayList arrayList2 = (ArrayList) this.f1396e;
                t2.e1 e1Var2 = (t2.e1) obj;
                int size = arrayList.size();
                for (int i14 = 0; i14 < size; i14++) {
                    List list = (List) arrayList.get(i14);
                    int size2 = list.size();
                    int[] iArr2 = new int[size2];
                    int i15 = 0;
                    while (i15 < size2) {
                        iArr2[i15] = ((t2.f1) list.get(i15)).f15550a + (i15 < yd.f.B(list) ? s0Var.I0(f10) : 0);
                        i15++;
                    }
                    int[] iArr3 = new int[size2];
                    j.f1360b.c(s0Var, this.f1393b, iArr2, s0Var.getLayoutDirection(), iArr3);
                    int size3 = list.size();
                    for (int i16 = 0; i16 < size3; i16++) {
                        e1Var2.z((t2.f1) list.get(i16), iArr3[i16], ((Number) arrayList2.get(i14)).intValue(), 0.0f);
                    }
                }
                return pi.o.f13011a;
            case 2:
                f1.y yVar = (f1.y) this.f1394c;
                p1.f fVar = (p1.f) this.f1395d;
                q.a0 a0Var = (q.a0) this.f1396e;
                if (obj == yVar) {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                if (obj instanceof t1.a0) {
                    int i17 = fVar.f12642a - this.f1393b;
                    int iD = a0Var.d(obj);
                    a0Var.g(Math.min(i17, iD >= 0 ? a0Var.f13028c[iD] : com.google.android.gms.common.api.f.API_PRIORITY_OTHER), obj);
                }
                return pi.o.f13011a;
            case 3:
                k0.o0 o0Var = (k0.o0) this.f1394c;
                t2.s0 s0Var2 = (t2.s0) this.f1395d;
                t2.f1 f1Var2 = (t2.f1) this.f1396e;
                t2.e1 e1Var3 = (t2.e1) obj;
                int i18 = o0Var.f9194c;
                k0.p1 p1Var = o0Var.f9193b;
                l3.a0 a0Var2 = o0Var.f9195d;
                k0.s1 s1Var = (k0.s1) o0Var.f9196e.a();
                p1Var.a(x.o1.f19665b, k0.s.j(e1Var3, i18, a0Var2, s1Var != null ? s1Var.f9254a : null, s0Var2.getLayoutDirection() == s3.m.f14753b, f1Var2.f15550a), this.f1393b, f1Var2.f15550a);
                t2.e1.D(e1Var3, f1Var2, Math.round(-p1Var.f9230a.g()), 0);
                return pi.o.f13011a;
            default:
                List list2 = (List) this.f1394c;
                g0.h0 h0Var = (g0.h0) this.f1395d;
                f1.f1 f1Var3 = (f1.f1) this.f1396e;
                float fFloatValue = ((Float) obj).floatValue();
                int i19 = this.f1393b;
                if (((mb.b) list2.get(i19)).f11440c && i19 == h0Var.o()) {
                    float fG = f1Var3.g() + fFloatValue;
                    if (fG > 0.0f) {
                        fG = 0.0f;
                    }
                    f1Var3.h(fG);
                }
                return pi.o.f13011a;
        }
    }

    public /* synthetic */ p1(ArrayList arrayList, t2.s0 s0Var, int i10, ArrayList arrayList2) {
        this.f1392a = 1;
        float f10 = c1.j.f2253a;
        this.f1394c = arrayList;
        this.f1395d = s0Var;
        this.f1393b = i10;
        this.f1396e = arrayList2;
    }

    public /* synthetic */ p1(List list, int i10, g0.h0 h0Var, f1.f1 f1Var) {
        this.f1392a = 4;
        this.f1394c = list;
        this.f1393b = i10;
        this.f1395d = h0Var;
        this.f1396e = f1Var;
    }

    public /* synthetic */ p1(t2.f1[] f1VarArr, q1 q1Var, int i10, int[] iArr) {
        this.f1392a = 0;
        this.f1394c = f1VarArr;
        this.f1395d = q1Var;
        this.f1393b = i10;
        this.f1396e = iArr;
    }
}
