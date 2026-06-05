package q;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object[] f13103a = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f13104b = new b0(0);

    public static final void a(int i10, List list) {
        int size = list.size();
        if (i10 < 0 || i10 >= size) {
            r.a.d("Index " + i10 + " is out of bounds. The list has " + size + " elements.");
            throw null;
        }
    }

    public static final void b(int i10, int i11, List list) {
        int size = list.size();
        if (i10 > i11) {
            r.a.c("Indices are out of order. fromIndex (" + i10 + ") is greater than toIndex (" + i11 + ").");
            throw null;
        }
        if (i10 < 0) {
            r.a.d("fromIndex (" + i10 + ") is less than 0.");
            throw null;
        }
        if (i11 <= size) {
            return;
        }
        r.a.d("toIndex (" + i11 + ") is more than than the list size (" + size + ')');
        throw null;
    }
}
