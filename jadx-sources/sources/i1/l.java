package i1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import qi.y;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l implements Iterator, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8159a;

    /* renamed from: b, reason: collision with root package name */
    public int f8160b;

    /* renamed from: c, reason: collision with root package name */
    public int f8161c;

    /* renamed from: d, reason: collision with root package name */
    public int f8162d;

    /* renamed from: e, reason: collision with root package name */
    public Object f8163e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f8164f;

    public l(y yVar) {
        this.f8159a = 2;
        this.f8164f = yVar;
        this.f8161c = yVar.f13530d;
        this.f8162d = yVar.f13529c;
    }

    public void a() {
        pi.h hVar;
        mj.d dVar = (mj.d) this.f8164f;
        CharSequence charSequence = (CharSequence) dVar.f11818b;
        int i10 = this.f8162d;
        if (i10 < 0) {
            this.f8160b = 0;
            this.f8163e = null;
            return;
        }
        if (i10 <= charSequence.length() && (hVar = (pi.h) ((ej.e) dVar.f11819c).invoke(charSequence, Integer.valueOf(this.f8162d))) != null) {
            int iIntValue = ((Number) hVar.f13000a).intValue();
            int iIntValue2 = ((Number) hVar.f13001b).intValue();
            this.f8163e = cg.b.T(this.f8161c, iIntValue);
            int i11 = iIntValue + iIntValue2;
            this.f8161c = i11;
            this.f8162d = i11 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.f8163e = new kj.h(this.f8161c, nj.e.F0(charSequence), 1);
            this.f8162d = -1;
        }
        this.f8160b = 1;
    }

    public boolean b() {
        this.f8160b = 3;
        int i10 = this.f8161c;
        if (i10 == 0) {
            this.f8160b = 2;
        } else {
            y yVar = (y) this.f8164f;
            Object[] objArr = yVar.f13527a;
            int i11 = this.f8162d;
            this.f8163e = objArr[i11];
            this.f8160b = 1;
            this.f8162d = (i11 + 1) % yVar.f13528b;
            this.f8161c = i10 - 1;
        }
        return this.f8160b == 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8159a) {
            case 0:
                throw null;
            case 1:
                if (this.f8160b == -1) {
                    a();
                }
                return this.f8160b == 1;
            default:
                int i10 = this.f8160b;
                if (i10 == 0) {
                    return b();
                }
                if (i10 == 1) {
                    return true;
                }
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f8159a) {
            case 0:
                throw null;
            case 1:
                if (this.f8160b == -1) {
                    a();
                }
                if (this.f8160b == 0) {
                    throw new NoSuchElementException();
                }
                kj.h hVar = (kj.h) this.f8163e;
                fj.l.d(hVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f8163e = null;
                this.f8160b = -1;
                return hVar;
            default:
                int i10 = this.f8160b;
                if (i10 == 1) {
                    this.f8160b = 0;
                    return this.f8163e;
                }
                if (i10 == 2 || !b()) {
                    throw new NoSuchElementException();
                }
                this.f8160b = 0;
                return this.f8163e;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f8159a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public l(mj.d dVar) {
        this.f8159a = 1;
        this.f8164f = dVar;
        this.f8160b = -1;
        int iP = cg.b.p(0, 0, ((CharSequence) dVar.f11818b).length());
        this.f8161c = iP;
        this.f8162d = iP;
    }

    public l(h hVar, int i10, c cVar, v vVar) {
        this.f8159a = 0;
        this.f8163e = hVar;
        this.f8160b = i10;
        this.f8164f = vVar;
        this.f8161c = hVar.A;
    }
}
