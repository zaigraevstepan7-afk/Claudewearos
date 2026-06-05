package w6;

import u6.f0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i implements u6.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18814a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f18815b;

    public /* synthetic */ i(f0 f0Var, int i10) {
        this.f18814a = i10;
        this.f18815b = f0Var;
    }

    @Override // u6.m
    public final Object b(String str, ej.c cVar, vi.c cVar2) {
        switch (this.f18814a) {
            case 0:
                return ((m) this.f18815b).b(str, cVar, cVar2);
            default:
                return ((y) this.f18815b).b(str, cVar, cVar2);
        }
    }
}
