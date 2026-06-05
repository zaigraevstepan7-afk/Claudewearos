package fi;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import fj.l;
import java.util.ArrayList;
import pi.o;
import sa.x;
import t6.i0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s3.c f6769b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ej.c f6770c;

    public /* synthetic */ h(s3.c cVar, ej.c cVar2, int i10) {
        this.f6768a = i10;
        this.f6769b = cVar;
        this.f6770c = cVar2;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f6768a) {
            case 0:
                ej.c cVar = this.f6770c;
                e2.d dVar = (e2.d) obj;
                l.f(dVar, "$this$record");
                s3.c cVarK = dVar.C0().k();
                dVar.C0().O(this.f6769b);
                try {
                    cVar.invoke(dVar);
                    dVar.C0().O(cVarK);
                    return o.f13011a;
                } catch (Throwable th2) {
                    dVar.C0().O(cVarK);
                    throw th2;
                }
            default:
                Context context = (Context) obj;
                l.f(context, "ctx");
                float f10 = sa.g.f14849b;
                s3.c cVar2 = this.f6769b;
                x xVar = new x(context, cVar2.I0(f10));
                xVar.setLayoutManager(new GridLayoutManager());
                xVar.setHasFixedSize(true);
                xVar.setClipToPadding(false);
                xVar.setClipChildren(true);
                xVar.setOverScrollMode(0);
                xVar.setNestedScrollingEnabled(true);
                float f11 = 10;
                xVar.setPadding(cVar2.I0(f11), cVar2.I0(12), cVar2.I0(f11), 0);
                i0 i0VarA = xVar.getRecycledViewPool().a(0);
                i0VarA.f15916b = 50;
                ArrayList arrayList = i0VarA.f15915a;
                while (arrayList.size() > 50) {
                    arrayList.remove(arrayList.size() - 1);
                }
                xVar.g(new sa.f());
                xVar.post(new ac.o(xVar, 18));
                this.f6770c.invoke(xVar);
                return xVar;
        }
    }
}
