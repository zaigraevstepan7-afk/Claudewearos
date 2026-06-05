package ra;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.e f14022b;

    public /* synthetic */ i(int i10, ej.e eVar) {
        this.f14021a = i10;
        this.f14022b = eVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        s1.e eVar;
        switch (this.f14021a) {
            case 0:
                xa.f fVar = (xa.f) obj;
                Rect rect = (Rect) obj2;
                fj.l.f(fVar, "app");
                fj.l.f(rect, "iconBounds");
                this.f14022b.invoke(fVar, rect);
                break;
            case 1:
                xa.f fVar2 = (xa.f) obj;
                Rect rect2 = (Rect) obj2;
                fj.l.f(fVar2, "app");
                fj.l.f(rect2, "iconBounds");
                this.f14022b.invoke(fVar2, rect2);
                break;
            case 2:
                xa.f fVar3 = (xa.f) obj;
                Rect rect3 = (Rect) obj2;
                fj.l.f(fVar3, "app");
                fj.l.f(rect3, "iconBounds");
                this.f14022b.invoke(fVar3, rect3);
                break;
            default:
                s1.a aVar = (s1.a) obj;
                List list = (List) this.f14022b.invoke(aVar, obj2);
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj3 = list.get(i10);
                    if (obj3 != null && (eVar = aVar.f14715b) != null && !eVar.b(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i10 + " can't be saved: " + obj3).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
        }
        return pi.o.f13011a;
    }
}
