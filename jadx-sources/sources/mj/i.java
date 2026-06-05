package mj;

import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class i implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11827a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11828b;

    public /* synthetic */ i(Object obj, int i10) {
        this.f11827a = i10;
        this.f11828b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ej.e, vi.h] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Iterable, java.lang.Object] */
    @Override // mj.f
    public final Iterator iterator() {
        switch (this.f11827a) {
            case 0:
                return mk.b.y((vi.h) this.f11828b);
            case 1:
                return (Iterator) this.f11828b;
            case 2:
                return new nj.c((CharSequence) this.f11828b);
            default:
                return this.f11828b.iterator();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(ej.e eVar) {
        this.f11827a = 0;
        this.f11828b = (vi.h) eVar;
    }
}
