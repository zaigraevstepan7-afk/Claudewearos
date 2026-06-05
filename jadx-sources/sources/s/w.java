package s;

import t2.e1;
import t2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w extends fj.m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14696a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f14697b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(f1 f1Var, int i10) {
        super(1);
        this.f14696a = i10;
        this.f14697b = f1Var;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f14696a) {
            case 0:
                ((e1) obj).z(this.f14697b, 0, 0, 0.0f);
                break;
            case 1:
                ((e1) obj).z(this.f14697b, 0, 0, 0.0f);
                break;
            case 2:
                ((e1) obj).z(this.f14697b, 0, 0, 0.0f);
                break;
            case 3:
                e1.E((e1) obj, this.f14697b, 0, 0);
                break;
            case 4:
                ((e1) obj).z(this.f14697b, 0, 0, 0.0f);
                break;
            case 5:
                e1.D((e1) obj, this.f14697b, 0, 0);
                break;
            default:
                e1.D((e1) obj, this.f14697b, 0, 0);
                break;
        }
        return pi.o.f13011a;
    }
}
