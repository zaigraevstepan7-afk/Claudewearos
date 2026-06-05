package p1;

import f1.i0;
import qj.b0;
import s3.q;
import x.d2;
import x.e2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class d extends fj.a implements ej.e {
    public final /* synthetic */ int A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, Object obj, Class cls, String str, String str2, int i11, int i12) {
        super(i10, i11, cls, obj, str, str2);
        this.A = i12;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                int iIntValue = ((Number) obj2).intValue();
                ((e) this.f6780a).b(iIntValue, (i0) obj);
                break;
            case 1:
                long j = ((q) obj).f14760a;
                e2 e2Var = (e2) this.f6780a;
                b0.w(e2Var.f19507e0.c(), null, new d2(e2Var, j, null, 2), 3);
                break;
            default:
                long j4 = ((q) obj).f14760a;
                e2 e2Var2 = (e2) this.f6780a;
                b0.w(e2Var2.f19507e0.c(), null, new d2(e2Var2, j4, null, 1), 3);
                break;
        }
        return pi.o.f13011a;
    }
}
