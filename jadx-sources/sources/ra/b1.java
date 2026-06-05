package ra;

import c1.v7;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class b1 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13947b;

    public /* synthetic */ b1(long j, int i10) {
        this.f13946a = i10;
        this.f13947b = j;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13946a) {
            case 0:
                f1.i0 i0Var = (f1.i0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    v7.a("Type or paste emoji\u2026", null, this.f13947b, hj.a.x(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 24582, 0, 262122);
                } else {
                    i0Var.W();
                }
                break;
            case 1:
                f1.i0 i0Var2 = (f1.i0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (i0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    v7.a("Development Note", null, this.f13947b, hj.a.x(20), k3.s.B, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var2, 1597830, 0, 262058);
                } else {
                    i0Var2.W();
                }
                break;
            default:
                f1.i0 i0Var3 = (f1.i0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (i0Var3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    v7.a("Many features couldn't be completed for beta 6. Everything will be ready for beta 7,Such as lock screen, folder customization, app resizing and folder resizing, aaaaaaand much more. To create a folder, go to edit, select a few apps, then click the plus button on top left corner. This will change too btw. Lots of ui is unfinished.. so beta7 will be better", null, this.f13947b, hj.a.x(15), null, null, 0L, null, hj.a.x(22), 0, false, 0, 0, null, i0Var3, 24966, 48, 260074);
                } else {
                    i0Var3.W();
                }
                break;
        }
        return pi.o.f13011a;
    }
}
