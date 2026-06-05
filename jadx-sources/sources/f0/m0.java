package f0;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6169a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6170b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0 f6171c;

    public m0(o0 o0Var, int i10) {
        this.f6171c = o0Var;
        this.f6169a = i10;
    }

    public final void a(int i10) {
        o0 o0Var = this.f6171c;
        a1 a1Var = o0Var.f6178c;
        if (a1Var == null) {
            return;
        }
        this.f6170b.add(new z0(a1Var, i10, o0Var.f6177b, null));
    }
}
