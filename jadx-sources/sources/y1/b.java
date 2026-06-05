package y1;

import android.view.DragEvent;
import android.view.View;
import c2.x0;
import fj.r;
import q.f;
import v2.d2;
import v2.n;
import w8.h;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements View.OnDragListener, c {

    /* renamed from: a, reason: collision with root package name */
    public final e f20157a;

    /* renamed from: b, reason: collision with root package name */
    public final f f20158b;

    /* renamed from: c, reason: collision with root package name */
    public final a f20159c;

    public b() {
        e eVar = new e();
        eVar.J = 0L;
        this.f20157a = eVar;
        this.f20158b = new f(0);
        this.f20159c = new a(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        h hVar = new h(dragEvent);
        int action = dragEvent.getAction();
        f fVar = this.f20158b;
        e eVar = this.f20157a;
        switch (action) {
            case 1:
                r rVar = new r();
                p2.e eVar2 = new p2.e(hVar, eVar, rVar);
                if (eVar2.invoke(eVar) == d2.f17606a) {
                    n.E(eVar, eVar2);
                }
                boolean z2 = rVar.f6803a;
                fVar.getClass();
                q.a aVar = new q.a(fVar);
                while (aVar.hasNext()) {
                    ((e) aVar.next()).u1(hVar);
                }
                break;
            case 2:
                eVar.t1(hVar);
                break;
            case 4:
                x0 x0Var = new x0(hVar, 27);
                if (x0Var.invoke(eVar) == d2.f17606a) {
                    n.E(eVar, x0Var);
                }
                fVar.clear();
                break;
            case 5:
                eVar.r1(hVar);
                break;
            case 6:
                eVar.s1(hVar);
                break;
        }
        return false;
    }
}
