package ra;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public int f14108a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f14109b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14110c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r0 f14111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f14112e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(ArrayList arrayList, int i10, r0 r0Var, ArrayList arrayList2, ti.c cVar) {
        super(2, cVar);
        this.f14109b = arrayList;
        this.f14110c = i10;
        this.f14111d = r0Var;
        this.f14112e = arrayList2;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        return new o0(this.f14109b, this.f14110c, this.f14111d, this.f14112e, cVar);
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((o0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        ui.a aVar = ui.a.f17085a;
        int i10 = this.f14108a;
        if (i10 == 0) {
            uk.c.R(obj);
            String string = UUID.randomUUID().toString();
            fj.l.e(string, "toString(...)");
            List listM0 = qi.l.M0(this.f14109b, 9);
            ArrayList arrayList = new ArrayList(qi.m.s0(listM0));
            Iterator it = listM0.iterator();
            while (it.hasNext()) {
                arrayList.add(((wa.o0) it.next()).f19130a);
            }
            r0 r0Var = this.f14111d;
            Bitmap bitmapD = va.a.d(arrayList, this.f14110c, ((Number) r0Var.f14167y.getValue()).floatValue(), ((Number) r0Var.f14168z.getValue()).floatValue());
            ArrayList arrayList2 = this.f14112e;
            ja.j jVar = new ja.j(string, "Folder", arrayList2, false);
            r0Var.j.c(jVar);
            String strB = jVar.b();
            xa.e eVar = xa.e.f19859a;
            fj.l.f(strB, "packageName");
            xj.e eVar2 = qj.m0.f13601a;
            rj.d dVar = vj.n.f18117a;
            h0.g gVar = new h0.g(r0Var, string, jVar, bitmapD, arrayList2, null);
            this.f14108a = 1;
            if (qj.b0.G(dVar, gVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uk.c.R(obj);
        }
        return pi.o.f13011a;
    }
}
