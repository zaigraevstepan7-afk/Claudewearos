package qi;

import java.util.List;
import java.util.ListIterator;
import t1.f0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class w implements ListIterator, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13523a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13524b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13525c;

    public w(x xVar, int i10) {
        this.f13525c = xVar;
        List list = xVar.f13526a;
        if (i10 >= 0 && i10 <= xVar.b()) {
            this.f13524b = list.listIterator(xVar.b() - i10);
            return;
        }
        StringBuilder sbP = gk.b.p(i10, "Position index ", " must be in range [");
        sbP.append(new kj.h(0, xVar.b(), 1));
        sbP.append("].");
        throw new IndexOutOfBoundsException(sbP.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f13523a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f13523a) {
            case 0:
                return ((ListIterator) this.f13524b).hasPrevious();
            default:
                return ((fj.t) this.f13524b).f6805a < ((f0) this.f13525c).f15437d - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f13523a) {
            case 0:
                return ((ListIterator) this.f13524b).hasNext();
            default:
                return ((fj.t) this.f13524b).f6805a >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f13523a) {
            case 0:
                return ((ListIterator) this.f13524b).previous();
            default:
                fj.t tVar = (fj.t) this.f13524b;
                int i10 = tVar.f6805a + 1;
                f0 f0Var = (f0) this.f13525c;
                t1.r.a(i10, f0Var.f15437d);
                tVar.f6805a = i10;
                return f0Var.get(i10);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f13523a) {
            case 0:
                x xVar = (x) this.f13525c;
                return yd.f.B(xVar) - ((ListIterator) this.f13524b).previousIndex();
            default:
                return ((fj.t) this.f13524b).f6805a + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f13523a) {
            case 0:
                return ((ListIterator) this.f13524b).next();
            default:
                fj.t tVar = (fj.t) this.f13524b;
                int i10 = tVar.f6805a;
                f0 f0Var = (f0) this.f13525c;
                t1.r.a(i10, f0Var.f15437d);
                tVar.f6805a = i10 - 1;
                return f0Var.get(i10);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f13523a) {
            case 0:
                x xVar = (x) this.f13525c;
                return yd.f.B(xVar) - ((ListIterator) this.f13524b).nextIndex();
            default:
                return ((fj.t) this.f13524b).f6805a;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f13523a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f13523a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public w(fj.t tVar, f0 f0Var) {
        this.f13524b = tVar;
        this.f13525c = f0Var;
    }
}
