package nj;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c implements Iterator, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f12345a;

    /* renamed from: b, reason: collision with root package name */
    public int f12346b;

    /* renamed from: c, reason: collision with root package name */
    public int f12347c;

    /* renamed from: d, reason: collision with root package name */
    public int f12348d;

    /* renamed from: e, reason: collision with root package name */
    public int f12349e;

    public c(CharSequence charSequence) {
        fj.l.f(charSequence, "string");
        this.f12345a = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.f12346b;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.f12349e < 0) {
            this.f12346b = 2;
            return false;
        }
        CharSequence charSequence = this.f12345a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i13 = this.f12347c; i13 < length2; i13++) {
            char cCharAt = charSequence.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < charSequence.length() && charSequence.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.f12346b = 1;
                this.f12349e = i10;
                this.f12348d = length;
                return true;
            }
        }
        i10 = -1;
        this.f12346b = 1;
        this.f12349e = i10;
        this.f12348d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f12346b = 0;
        int i10 = this.f12348d;
        int i11 = this.f12347c;
        this.f12347c = this.f12349e + i10;
        return this.f12345a.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
