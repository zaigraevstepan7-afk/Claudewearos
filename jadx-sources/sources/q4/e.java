package q4;

import java.util.ArrayList;
import q.p0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements s4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13218a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13219b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f13218a = i10;
        this.f13219b = obj;
    }

    @Override // s4.a
    public final void accept(Object obj) {
        switch (this.f13218a) {
            case 0:
                f fVar = (f) obj;
                if (fVar == null) {
                    fVar = new f(-3);
                }
                ((mh.g) this.f13219b).x(fVar);
                return;
            default:
                f fVar2 = (f) obj;
                synchronized (g.f13224c) {
                    try {
                        p0 p0Var = g.f13225d;
                        ArrayList arrayList = (ArrayList) p0Var.get((String) this.f13219b);
                        if (arrayList == null) {
                            return;
                        }
                        p0Var.remove((String) this.f13219b);
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((s4.a) arrayList.get(i10)).accept(fVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
