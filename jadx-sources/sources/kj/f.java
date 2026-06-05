package kj;

import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class f implements Iterable, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f9665a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9666b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9667c;

    public f(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f9665a = i10;
        this.f9666b = u0.c.n(i10, i11, i12);
        this.f9667c = i12;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        if (isEmpty() && ((f) obj).isEmpty()) {
            return true;
        }
        f fVar = (f) obj;
        return this.f9665a == fVar.f9665a && this.f9666b == fVar.f9666b && this.f9667c == fVar.f9667c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f9665a * 31) + this.f9666b) * 31) + this.f9667c;
    }

    public boolean isEmpty() {
        int i10 = this.f9667c;
        int i11 = this.f9666b;
        int i12 = this.f9665a;
        return i10 > 0 ? i12 > i11 : i12 < i11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new g(this.f9665a, this.f9666b, this.f9667c);
    }

    public String toString() {
        StringBuilder sb2;
        int i10 = this.f9666b;
        int i11 = this.f9665a;
        int i12 = this.f9667c;
        if (i12 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append("..");
            sb2.append(i10);
            sb2.append(" step ");
            sb2.append(i12);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append(" downTo ");
            sb2.append(i10);
            sb2.append(" step ");
            sb2.append(-i12);
        }
        return sb2.toString();
    }
}
