package o2;

import a2.e0;
import fj.m;
import fj.v;
import v1.n;
import v2.e2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j extends m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12392a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f12393b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(v vVar, int i10) {
        super(1);
        this.f12392a = i10;
        this.f12393b = vVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        boolean z2;
        switch (this.f12392a) {
            case 0:
                Object obj2 = (e2) obj;
                if (((n) obj2).f17565a.G) {
                    this.f12393b.f6807a = obj2;
                    z2 = false;
                } else {
                    z2 = true;
                }
                break;
            case 1:
                p2.g gVar = (p2.g) obj;
                v vVar = this.f12393b;
                Object obj3 = vVar.f6807a;
                if (obj3 == null && gVar.J) {
                    vVar.f6807a = gVar;
                } else if (obj3 != null) {
                    gVar.getClass();
                }
                break;
            default:
                this.f12393b.f6807a = (e0) obj;
                break;
        }
        return Boolean.TRUE;
    }
}
