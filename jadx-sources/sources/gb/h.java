package gb;

import androidx.lifecycle.h0;
import c2.f0;
import c2.w;
import qj.b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hb.h f7294b;

    public /* synthetic */ h(hb.h hVar, int i10) {
        this.f7293a = i10;
        this.f7294b = hVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f7293a) {
            case 0:
                f0 f0Var = (f0) obj;
                fj.l.f(f0Var, "$this$drawBackdrop");
                float fL = u3.c.l(1.0f, ((f0Var.e() * 16.0f) / Float.intBitsToFloat((int) (f0Var.a() >> 32))) + 1.0f, this.f7294b.a());
                f0Var.p(fL);
                f0Var.j(fL);
                break;
            case 1:
                f0 f0Var2 = (f0) obj;
                fj.l.f(f0Var2, "$this$graphicsLayer");
                hb.h hVar = this.f7294b;
                f0Var2.p(((Number) hVar.f7810o.e()).floatValue());
                f0Var2.j(((Number) hVar.f7811p.e()).floatValue());
                break;
            case 2:
                fi.e eVar = (fi.e) obj;
                fj.l.f(eVar, "$this$drawBackdrop");
                float fA = this.f7294b.a();
                yd.f.l(eVar, (1.0f - fA) * eVar.f6754a * 8.0f);
                float f10 = eVar.f6754a;
                a.a.J(eVar, 10.0f * f10 * fA, f10 * 14.0f * fA, false, (12 & 8) == 0);
                break;
            case 3:
                e2.d dVar = (e2.d) obj;
                fj.l.f(dVar, "$this$drawBackdrop");
                e2.d.c1(dVar, w.c(w.f3054d, 1.0f - this.f7294b.a()), 0L, 0L, 0.0f, null, 0, 126);
                break;
            case 4:
                p2.w wVar = (p2.w) obj;
                fj.l.f(wVar, "down");
                hb.h hVar2 = this.f7294b;
                hVar2.f7800d.invoke(hVar2, new b2.b(wVar.f12762c));
                q2.b bVar = (q2.b) hVar2.f7813r.f12813b;
                q2.d dVar2 = (q2.d) bVar.f13183b;
                q2.a[] aVarArr = (q2.a[]) dVar2.f13192e;
                qi.k.m0(0, aVarArr.length, null, aVarArr);
                dVar2.f13189b = 0;
                q2.d dVar3 = (q2.d) bVar.f13184c;
                q2.a[] aVarArr2 = (q2.a[]) dVar3.f13192e;
                qi.k.m0(0, aVarArr2.length, null, aVarArr2);
                dVar3.f13189b = 0;
                bVar.f13182a = 0L;
                b0.w(hVar2.f7797a, null, new ab.r(hVar2, null, 1), 3);
                break;
            case 5:
                fj.l.f((p2.w) obj, "it");
                hb.h hVar3 = this.f7294b;
                hVar3.f7801e.invoke(hVar3);
                b0.w(hVar3.f7797a, null, new h0(hVar3, (ti.c) null, 13), 3);
                break;
            default:
                hb.h hVar4 = this.f7294b;
                p7.k kVar = hVar4.f7813r;
                ((q2.b) kVar.f12813b).a(System.currentTimeMillis(), (Float.floatToRawIntBits(hVar4.c()) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
                float fB = s3.q.b(kVar.h(mk.b.f(Float.MAX_VALUE, Float.MAX_VALUE)));
                kj.e eVar2 = hVar4.f7798b;
                b0.w(hVar4.f7797a, null, new hb.a(hVar4, fB / (((Number) eVar2.e()).floatValue() - ((Number) eVar2.b()).floatValue()), null, 2), 3);
                break;
        }
        return pi.o.f13011a;
    }
}
