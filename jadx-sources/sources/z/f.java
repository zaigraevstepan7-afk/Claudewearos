package z;

import f1.a1;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f implements tj.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20338a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f20339b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f20340c;

    public /* synthetic */ f(ArrayList arrayList, a1 a1Var, int i10) {
        this.f20338a = i10;
        this.f20339b = arrayList;
        this.f20340c = a1Var;
    }

    @Override // tj.f
    public final Object b(Object obj, ti.c cVar) {
        switch (this.f20338a) {
            case 0:
                j jVar = (j) obj;
                boolean z2 = jVar instanceof d;
                ArrayList arrayList = this.f20339b;
                if (z2) {
                    arrayList.add(jVar);
                } else if (jVar instanceof e) {
                    arrayList.remove(((e) jVar).f20337a);
                }
                this.f20340c.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            default:
                j jVar2 = (j) obj;
                boolean z10 = jVar2 instanceof m;
                ArrayList arrayList2 = this.f20339b;
                if (z10) {
                    arrayList2.add(jVar2);
                } else if (jVar2 instanceof n) {
                    arrayList2.remove(((n) jVar2).f20349a);
                } else if (jVar2 instanceof l) {
                    arrayList2.remove(((l) jVar2).f20347a);
                }
                this.f20340c.setValue(Boolean.valueOf(!arrayList2.isEmpty()));
                break;
        }
        return pi.o.f13011a;
    }
}
