package wi;

import fj.l;
import java.io.Serializable;
import java.util.RandomAccess;
import qi.d;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b extends d implements a, RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Enum[] f19417a;

    public b(Enum[] enumArr) {
        l.f(enumArr, "entries");
        this.f19417a = enumArr;
    }

    @Override // qi.a
    public final int b() {
        return this.f19417a.length;
    }

    @Override // qi.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r42 = (Enum) obj;
        int iOrdinal = r42.ordinal();
        Enum[] enumArr = this.f19417a;
        l.f(enumArr, "<this>");
        return ((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r42;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Enum[] enumArr = this.f19417a;
        int length = enumArr.length;
        if (i10 < 0 || i10 >= length) {
            throw new IndexOutOfBoundsException(gk.b.l(i10, length, "index: ", ", size: "));
        }
        return enumArr[i10];
    }

    @Override // qi.d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r52 = (Enum) obj;
        int iOrdinal = r52.ordinal();
        Enum[] enumArr = this.f19417a;
        l.f(enumArr, "<this>");
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r52) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // qi.d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r52 = (Enum) obj;
        int iOrdinal = r52.ordinal();
        Enum[] enumArr = this.f19417a;
        l.f(enumArr, "<this>");
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r52) {
            return iOrdinal;
        }
        return -1;
    }
}
