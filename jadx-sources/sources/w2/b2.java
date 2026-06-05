package w2;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b2 implements v2.s1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f18206a;

    /* renamed from: b, reason: collision with root package name */
    public final List f18207b;

    /* renamed from: c, reason: collision with root package name */
    public Float f18208c = null;

    /* renamed from: d, reason: collision with root package name */
    public Float f18209d = null;

    /* renamed from: e, reason: collision with root package name */
    public d3.k f18210e = null;

    /* renamed from: f, reason: collision with root package name */
    public d3.k f18211f = null;

    public b2(ArrayList arrayList, int i10) {
        this.f18206a = i10;
        this.f18207b = arrayList;
    }

    @Override // v2.s1
    public final boolean M() {
        return this.f18207b.contains(this);
    }
}
