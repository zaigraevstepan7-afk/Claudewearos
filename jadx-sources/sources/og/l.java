package og;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class l implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12523a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f12524b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterable f12525c;

    public l(rg.h hVar) {
        this.f12525c = hVar;
        this.f12524b = hVar.f14416b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f12523a) {
            case 0:
                if (this.f12524b >= 0) {
                }
                break;
            default:
                if (this.f12524b < ((rg.h) this.f12525c).f14417c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f12523a) {
            case 0:
                int i10 = this.f12524b;
                h hVar = new h();
                Math.pow(2.0d, i10);
                this.f12524b--;
                return hVar;
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException("No more elements.");
                }
                zg.c[] cVarArr = ((rg.h) this.f12525c).f14415a;
                int i11 = this.f12524b;
                zg.c cVar = cVarArr[i11];
                this.f12524b = i11 + 1;
                return cVar;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f12523a) {
            case 0:
                return;
            default:
                throw new UnsupportedOperationException("Can't remove component from immutable Path!");
        }
    }

    public l(m mVar) {
        this.f12525c = mVar;
        this.f12524b = mVar.f12527b - 1;
    }

    private final void a() {
    }
}
