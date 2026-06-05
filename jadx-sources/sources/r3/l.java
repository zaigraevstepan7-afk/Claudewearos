package r3;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final l f13685b = new l(0);

    /* renamed from: c, reason: collision with root package name */
    public static final l f13686c = new l(1);

    /* renamed from: d, reason: collision with root package name */
    public static final l f13687d = new l(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f13688a;

    public l(int i10) {
        this.f13688a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.f13688a == ((l) obj).f13688a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13688a;
    }

    public final String toString() {
        int i10 = this.f13688a;
        if (i10 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return m6.a.i(new StringBuilder("TextDecoration["), u3.b.a(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
