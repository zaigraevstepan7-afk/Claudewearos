package l1;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9853c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9854d;

    public d(Object[] objArr, int i10, int i11) {
        super(i10, i11);
        this.f9854d = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f9853c) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f9854d;
                int i10 = this.f9849a;
                this.f9849a = i10 + 1;
                return objArr[i10];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f9849a++;
                return this.f9854d;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f9853c) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f9854d;
                int i10 = this.f9849a - 1;
                this.f9849a = i10;
                return objArr[i10];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f9849a--;
                return this.f9854d;
        }
    }

    public d(Object obj, int i10) {
        super(i10, 1);
        this.f9854d = obj;
    }
}
