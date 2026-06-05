package ra;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14078a = 2;

    /* renamed from: b, reason: collision with root package name */
    public int f14079b;

    /* renamed from: c, reason: collision with root package name */
    public int f14080c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14082e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(f1.a1 a1Var, f1.a1 a1Var2, ti.c cVar) {
        super(2, cVar);
        this.f14081d = a1Var;
        this.f14082e = a1Var2;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f14078a) {
            case 0:
                return new m0((r0) this.f14081d, this.f14080c, (LinkedHashMap) this.f14082e, cVar);
            case 1:
                return new m0((g0.d) this.f14081d, (ib.j) this.f14082e, this.f14080c, cVar);
            default:
                return new m0((f1.a1) this.f14081d, (f1.a1) this.f14082e, cVar);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f14078a) {
        }
        return ((m0) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        int i10;
        Integer num;
        Integer num2;
        int i11 = this.f14078a;
        pi.o oVar = pi.o.f13011a;
        Object obj2 = this.f14081d;
        Object obj3 = this.f14082e;
        int i12 = 1;
        switch (i11) {
            case 0:
                r0 r0Var = (r0) obj2;
                ui.a aVar = ui.a.f17085a;
                int i13 = this.f14079b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return oVar;
                }
                uk.c.R(obj);
                Collection<ja.j> collectionValues = r0Var.A.values();
                int i14 = this.f14080c;
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
                for (ja.j jVar : collectionValues) {
                    List list = jVar.f8786c;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        xa.f fVar = (xa.f) linkedHashMap.get((String) it.next());
                        if (fVar != null) {
                            arrayList.add(fVar);
                        }
                    }
                    r0Var.B.put(jVar.f8784a, va.a.d(arrayList, i14, ((Number) r0Var.f14167y.getValue()).floatValue(), ((Number) r0Var.f14168z.getValue()).floatValue()));
                }
                xj.e eVar = qj.m0.f13601a;
                rj.d dVar = vj.n.f18117a;
                l0 l0Var = new l0(r0Var, null, i12);
                this.f14079b = 1;
                return qj.b0.G(dVar, l0Var, this) == aVar ? aVar : oVar;
            case 1:
                ui.a aVar2 = ui.a.f17085a;
                int i15 = this.f14079b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return oVar;
                }
                uk.c.R(obj);
                int i16 = ((ib.i) ((ib.j) obj3)).f8434a;
                t.o1 o1VarT = t.d.t(this.f14080c, 0, t.y.f15326a, 2);
                this.f14079b = 1;
                return g0.h0.g((g0.d) obj2, i16, o1VarT, this, 2) == aVar2 ? aVar2 : oVar;
            default:
                f1.a1 a1Var = (f1.a1) obj3;
                f1.a1 a1Var2 = (f1.a1) obj2;
                ui.a aVar3 = ui.a.f17085a;
                int i17 = this.f14080c;
                if (i17 == 0) {
                    uk.c.R(obj);
                    float f10 = wa.l0.f19120a;
                    Integer num3 = (Integer) a1Var2.getValue();
                    if (num3 == null) {
                        return oVar;
                    }
                    int iIntValue = num3.intValue();
                    this.f14079b = iIntValue;
                    this.f14080c = 1;
                    if (qj.b0.i(650L, this) == aVar3) {
                        return aVar3;
                    }
                    i10 = iIntValue;
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = this.f14079b;
                    uk.c.R(obj);
                }
                float f11 = wa.l0.f19120a;
                wa.q0 q0Var = (wa.q0) a1Var.getValue();
                if (q0Var == null || (num = q0Var.f19145i) == null || num.intValue() != i10 || (num2 = (Integer) a1Var2.getValue()) == null || num2.intValue() != i10) {
                    return oVar;
                }
                a1Var.setValue(wa.q0.a(q0Var, 0.0f, 0.0f, null, new Integer(i10), 511));
                return oVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(g0.d dVar, ib.j jVar, int i10, ti.c cVar) {
        super(2, cVar);
        this.f14081d = dVar;
        this.f14082e = jVar;
        this.f14080c = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(r0 r0Var, int i10, LinkedHashMap linkedHashMap, ti.c cVar) {
        super(2, cVar);
        this.f14081d = r0Var;
        this.f14080c = i10;
        this.f14082e = linkedHashMap;
    }
}
