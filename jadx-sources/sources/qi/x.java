package qi;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class x extends d {

    /* renamed from: a, reason: collision with root package name */
    public final List f13526a;

    public x(List list) {
        fj.l.f(list, "delegate");
        this.f13526a = list;
    }

    @Override // qi.a
    public final int b() {
        return this.f13526a.size();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        if (i10 >= 0 && i10 <= yd.f.B(this)) {
            return this.f13526a.get(yd.f.B(this) - i10);
        }
        StringBuilder sbP = gk.b.p(i10, "Element index ", " must be in range [");
        sbP.append(new kj.h(0, yd.f.B(this), 1));
        sbP.append("].");
        throw new IndexOutOfBoundsException(sbP.toString());
    }

    @Override // qi.d, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new w(this, 0);
    }

    @Override // qi.d, java.util.List
    public final ListIterator listIterator() {
        return new w(this, 0);
    }

    @Override // qi.d, java.util.List
    public final ListIterator listIterator(int i10) {
        return new w(this, i10);
    }
}
