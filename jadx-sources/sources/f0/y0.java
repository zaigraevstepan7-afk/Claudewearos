package f0;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f6215a;

    /* renamed from: b, reason: collision with root package name */
    public final List[] f6216b;

    /* renamed from: c, reason: collision with root package name */
    public int f6217c;

    /* renamed from: d, reason: collision with root package name */
    public int f6218d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z0 f6220f;

    public y0(z0 z0Var, List list) {
        this.f6220f = z0Var;
        this.f6215a = list;
        this.f6216b = new List[list.size()];
        if (list.isEmpty()) {
            a0.a.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
