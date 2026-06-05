package ri;

import fj.l;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d extends f implements Iterator, gj.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14531e;

    public d(g gVar, int i10) {
        this.f14531e = i10;
        l.f(gVar, "map");
        this.f14538d = gVar;
        this.f14536b = -1;
        this.f14537c = gVar.A;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f14531e) {
            case 0:
                b();
                int i10 = this.f14535a;
                g gVar = (g) this.f14538d;
                if (i10 >= gVar.f14544f) {
                    throw new NoSuchElementException();
                }
                this.f14535a = i10 + 1;
                this.f14536b = i10;
                e eVar = new e(gVar, i10);
                e();
                return eVar;
            case 1:
                b();
                int i11 = this.f14535a;
                g gVar2 = (g) this.f14538d;
                if (i11 >= gVar2.f14544f) {
                    throw new NoSuchElementException();
                }
                this.f14535a = i11 + 1;
                this.f14536b = i11;
                Object obj = gVar2.f14539a[i11];
                e();
                return obj;
            default:
                b();
                int i12 = this.f14535a;
                g gVar3 = (g) this.f14538d;
                if (i12 >= gVar3.f14544f) {
                    throw new NoSuchElementException();
                }
                this.f14535a = i12 + 1;
                this.f14536b = i12;
                Object[] objArr = gVar3.f14540b;
                l.c(objArr);
                Object obj2 = objArr[this.f14536b];
                e();
                return obj2;
        }
    }
}
