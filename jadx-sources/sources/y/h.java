package y;

import f1.j1;
import fj.s;
import java.util.concurrent.CancellationException;
import pi.o;
import x.s1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20135a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f20136b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f20137c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1 f20138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ej.c f20139e;

    public /* synthetic */ h(float f10, s sVar, s1 s1Var, ej.c cVar, int i10) {
        this.f20135a = i10;
        this.f20136b = f10;
        this.f20137c = sVar;
        this.f20138d = s1Var;
        this.f20139e = cVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        float fA;
        switch (this.f20135a) {
            case 0:
                t.i iVar = (t.i) obj;
                j1 j1Var = iVar.f15184e;
                float fAbs = Math.abs(((Number) j1Var.getValue()).floatValue());
                float f10 = this.f20136b;
                float fAbs2 = Math.abs(f10);
                s sVar = this.f20137c;
                s1 s1Var = this.f20138d;
                ej.c cVar = this.f20139e;
                if (fAbs >= fAbs2) {
                    float fD = k.d(((Number) j1Var.getValue()).floatValue(), f10);
                    k.c(iVar, s1Var, cVar, fD - sVar.f6804a);
                    iVar.a();
                    sVar.f6804a = fD;
                } else {
                    k.c(iVar, s1Var, cVar, ((Number) j1Var.getValue()).floatValue() - sVar.f6804a);
                    sVar.f6804a = ((Number) j1Var.getValue()).floatValue();
                }
                break;
            default:
                s1 s1Var2 = this.f20138d;
                t.i iVar2 = (t.i) obj;
                float fD2 = k.d(((Number) iVar2.f15184e.getValue()).floatValue(), this.f20136b);
                s sVar2 = this.f20137c;
                float f11 = fD2 - sVar2.f6804a;
                try {
                    fA = s1Var2.a(f11);
                } catch (CancellationException unused) {
                    iVar2.a();
                    fA = 0.0f;
                }
                this.f20139e.invoke(Float.valueOf(fA));
                if (Math.abs(f11 - fA) > 0.5f || fD2 != ((Number) iVar2.f15184e.getValue()).floatValue()) {
                    iVar2.a();
                }
                sVar2.f6804a += fA;
                break;
        }
        return o.f13011a;
    }
}
