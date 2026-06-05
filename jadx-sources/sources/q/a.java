package q;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a implements Iterator, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public int f13021a;

    /* renamed from: b, reason: collision with root package name */
    public int f13022b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13023c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13025e;

    public a(int i10) {
        this.f13021a = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13022b < this.f13021a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f13022b;
        switch (this.f13024d) {
            case 0:
                objF = ((e) this.f13025e).f(i10);
                break;
            case 1:
                objF = ((e) this.f13025e).i(i10);
                break;
            default:
                objF = ((f) this.f13025e).f13065b[i10];
                break;
        }
        this.f13022b++;
        this.f13023c = true;
        return objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f13023c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i10 = this.f13022b - 1;
        this.f13022b = i10;
        switch (this.f13024d) {
            case 0:
                ((e) this.f13025e).g(i10);
                break;
            case 1:
                ((e) this.f13025e).g(i10);
                break;
            default:
                ((f) this.f13025e).b(i10);
                break;
        }
        this.f13021a--;
        this.f13023c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        this(fVar.f13066c);
        this.f13024d = 2;
        this.f13025e = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(e eVar, int i10) {
        this(eVar.f13117c);
        this.f13024d = i10;
        switch (i10) {
            case 1:
                this.f13025e = eVar;
                this(eVar.f13117c);
                break;
            default:
                this.f13025e = eVar;
                break;
        }
    }
}
