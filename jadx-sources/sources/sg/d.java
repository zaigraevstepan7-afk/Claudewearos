package sg;

import ug.l;
import wg.g;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final d f15033d = new d(1, null, false);

    /* renamed from: e, reason: collision with root package name */
    public static final d f15034e = new d(2, null, false);

    /* renamed from: a, reason: collision with root package name */
    public final int f15035a;

    /* renamed from: b, reason: collision with root package name */
    public final g f15036b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15037c;

    public d(int i10, g gVar, boolean z2) {
        this.f15035a = i10;
        this.f15036b = gVar;
        this.f15037c = z2;
        l.c(!z2 || i10 == 2);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OperationSource{source=");
        int i10 = this.f15035a;
        sb2.append(i10 != 1 ? i10 != 2 ? "null" : "Server" : "User");
        sb2.append(", queryParams=");
        sb2.append(this.f15036b);
        sb2.append(", tagged=");
        sb2.append(this.f15037c);
        sb2.append('}');
        return sb2.toString();
    }
}
