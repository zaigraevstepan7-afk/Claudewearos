package g1;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements ListIterator, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7021a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7022b;

    /* renamed from: c, reason: collision with root package name */
    public int f7023c;

    public d(int i10, int i11, List list) {
        this.f7021a = i11;
        switch (i11) {
            case 1:
                this.f7022b = list;
                this.f7023c = i10 - 1;
                break;
            default:
                this.f7022b = list;
                this.f7023c = i10;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f7021a) {
            case 0:
                this.f7022b.add(this.f7023c, obj);
                this.f7023c++;
                break;
            default:
                int i10 = this.f7023c + 1;
                this.f7023c = i10;
                this.f7022b.add(i10, obj);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f7021a) {
            case 0:
                return this.f7023c < this.f7022b.size();
            default:
                return this.f7023c < this.f7022b.size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f7021a) {
            case 0:
                if (this.f7023c > 0) {
                }
                break;
            default:
                if (this.f7023c >= 0) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f7021a) {
            case 0:
                int i10 = this.f7023c;
                this.f7023c = i10 + 1;
                return this.f7022b.get(i10);
            default:
                int i11 = this.f7023c + 1;
                this.f7023c = i11;
                return this.f7022b.get(i11);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f7021a) {
            case 0:
                return this.f7023c;
            default:
                return this.f7023c + 1;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f7021a) {
            case 0:
                int i10 = this.f7023c - 1;
                this.f7023c = i10;
                return this.f7022b.get(i10);
            default:
                int i11 = this.f7023c;
                this.f7023c = i11 - 1;
                return this.f7022b.get(i11);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f7021a) {
            case 0:
                return this.f7023c - 1;
            default:
                return this.f7023c;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f7021a) {
            case 0:
                int i10 = this.f7023c - 1;
                this.f7023c = i10;
                this.f7022b.remove(i10);
                break;
            default:
                this.f7022b.remove(this.f7023c);
                this.f7023c--;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f7021a) {
            case 0:
                this.f7022b.set(this.f7023c, obj);
                break;
            default:
                this.f7022b.set(this.f7023c, obj);
                break;
        }
    }
}
