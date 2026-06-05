package o;

import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f12352a;

    /* renamed from: b, reason: collision with root package name */
    public c f12353b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12354c;

    public b(c cVar, c cVar2, int i10) {
        this.f12354c = i10;
        this.f12352a = cVar2;
        this.f12353b = cVar;
    }

    @Override // o.e
    public final void a(c cVar) {
        c cVar2;
        c cVarB = null;
        if (this.f12352a == cVar && cVar == this.f12353b) {
            this.f12353b = null;
            this.f12352a = null;
        }
        c cVar3 = this.f12352a;
        if (cVar3 == cVar) {
            switch (this.f12354c) {
                case 0:
                    cVar2 = cVar3.f12358d;
                    break;
                default:
                    cVar2 = cVar3.f12357c;
                    break;
            }
            this.f12352a = cVar2;
        }
        c cVar4 = this.f12353b;
        if (cVar4 == cVar) {
            c cVar5 = this.f12352a;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.f12353b = cVarB;
        }
    }

    public final c b(c cVar) {
        switch (this.f12354c) {
            case 0:
                return cVar.f12357c;
            default:
                return cVar.f12358d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12353b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f12353b;
        c cVar2 = this.f12352a;
        this.f12353b = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
