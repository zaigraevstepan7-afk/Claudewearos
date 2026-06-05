package bb;

import f1.f1;
import ra.o1;
import t.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements tj.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1665a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f1666b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1 f1667c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1 f1668d;

    public /* synthetic */ e(s sVar, f1 f1Var, f1 f1Var2, int i10) {
        this.f1665a = i10;
        this.f1666b = sVar;
        this.f1667c = f1Var;
        this.f1668d = f1Var2;
    }

    @Override // tj.f
    public final Object b(Object obj, ti.c cVar) {
        int i10 = this.f1665a;
        pi.o oVar = pi.o.f13011a;
        f1 f1Var = this.f1667c;
        s sVar = this.f1666b;
        f1 f1Var2 = this.f1668d;
        switch (i10) {
            case 0:
                f1Var2.h(f1Var.g() * sVar.c(((Number) obj).floatValue() / (f1Var.g() * 1.5f)));
                break;
            default:
                float fFloatValue = ((Number) obj).floatValue();
                j0.d dVar = o1.f14113a;
                f1Var2.h(f1Var.g() * sVar.c(fFloatValue / (f1Var.g() * 1.5f)));
                break;
        }
        return oVar;
    }
}
