package w3;

import f1.i0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q extends fj.m implements ej.e {

    /* renamed from: b, reason: collision with root package name */
    public static final q f18531b;

    /* renamed from: c, reason: collision with root package name */
    public static final q f18532c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18533a;

    static {
        int i10 = 2;
        f18531b = new q(i10, 0);
        f18532c = new q(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i10, int i11) {
        super(i10);
        this.f18533a = i11;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18533a) {
            case 0:
                i0 i0Var = (i0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i0Var.W();
                }
                break;
            default:
                i0 i0Var2 = (i0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!i0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    i0Var2.W();
                }
                break;
        }
        return pi.o.f13011a;
    }
}
