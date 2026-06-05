package hb;

import android.graphics.RuntimeShader;
import android.os.Build;
import c2.e0;
import c2.f0;
import c2.t;
import c2.w;
import pi.o;
import qj.b0;
import v2.h0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f7822b;

    public /* synthetic */ k(n nVar, int i10) {
        this.f7821a = i10;
        this.f7822b = nVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f7821a) {
            case 0:
                h0 h0Var = (h0) obj;
                fj.l.f(h0Var, "$this$drawWithContent");
                n nVar = this.f7822b;
                float fFloatValue = ((Number) nVar.f7833e.e()).floatValue();
                if (fFloatValue > 0.0f) {
                    if (Build.VERSION.SDK_INT < 33 || nVar.f7836h == null) {
                        e2.d.c1(h0Var, w.c(w.f3054d, fFloatValue * 0.25f), 0L, 0L, 0.0f, null, 12, 62);
                    } else {
                        long j = w.f3054d;
                        e2.d.c1(h0Var, w.c(j, 0.08f * fFloatValue), 0L, 0L, 0.0f, null, 12, 62);
                        RuntimeShader runtimeShader = nVar.f7836h;
                        ej.e eVar = nVar.f7830b;
                        e2.b bVar = h0Var.f17669a;
                        long j4 = ((b2.b) eVar.invoke(new b2.e(bVar.a()), nVar.f7834f.e())).f1500a;
                        runtimeShader.setFloatUniform("size", Float.intBitsToFloat((int) (bVar.a() >> 32)), Float.intBitsToFloat((int) (bVar.a() & 4294967295L)));
                        runtimeShader.setColorUniform("color", e0.E(w.c(j, fFloatValue * 0.15f)));
                        runtimeShader.setFloatUniform("radius", b2.e.d(bVar.a()) * 1.5f);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bVar.a() >> 32));
                        if (fIntBitsToFloat < 0.0f) {
                            fIntBitsToFloat = 0.0f;
                        }
                        if (fIntBitsToFloat <= fIntBitsToFloat2) {
                            fIntBitsToFloat2 = fIntBitsToFloat;
                        }
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j4 & 4294967295L));
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (bVar.a() & 4294967295L));
                        float f10 = fIntBitsToFloat3 < 0.0f ? 0.0f : fIntBitsToFloat3;
                        if (f10 <= fIntBitsToFloat4) {
                            fIntBitsToFloat4 = f10;
                        }
                        runtimeShader.setFloatUniform("position", fIntBitsToFloat2, fIntBitsToFloat4);
                        e2.d.P(h0Var, new t(nVar.f7836h), 0L, 0L, 0.0f, null, null, 12, 62);
                    }
                }
                h0Var.f();
                break;
            case 1:
                p2.w wVar = (p2.w) obj;
                fj.l.f(wVar, "down");
                long j10 = wVar.f12762c;
                n nVar2 = this.f7822b;
                nVar2.f7835g = j10;
                b0.w(nVar2.f7829a, null, new m(nVar2, null, 0), 3);
                break;
            case 2:
                fj.l.f((p2.w) obj, "it");
                n nVar3 = this.f7822b;
                b0.w(nVar3.f7829a, null, new m(nVar3, null, 1), 3);
                break;
            default:
                f0 f0Var = (f0) obj;
                fj.l.f(f0Var, "$this$drawBackdrop");
                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (f0Var.a() >> 32));
                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (f0Var.a() & 4294967295L));
                n nVar4 = this.f7822b;
                float fL = u3.c.l(1.0f, ((f0Var.e() * 4.0f) / fIntBitsToFloat6) + 1.0f, ((Number) nVar4.f7833e.e()).floatValue());
                float fD = b2.e.d(f0Var.a());
                long jE = b2.b.e(((b2.b) nVar4.f7834f.e()).f1500a, nVar4.f7835g);
                f0Var.s(((float) Math.tanh((Float.intBitsToFloat(r4) * 0.05f) / fD)) * fD);
                int i10 = (int) (jE & 4294967295L);
                f0Var.h(fD * ((float) Math.tanh((Float.intBitsToFloat(i10) * 0.05f) / fD)));
                float fE = (f0Var.e() * 4.0f) / fIntBitsToFloat6;
                double dAtan2 = (float) Math.atan2(Float.intBitsToFloat(i10), Float.intBitsToFloat(r4));
                float fAbs = Math.abs((Float.intBitsToFloat((int) (jE >> 32)) * ((float) Math.cos(dAtan2))) / b2.e.c(f0Var.a())) * fE;
                float f11 = fIntBitsToFloat5 / fIntBitsToFloat6;
                if (f11 > 1.0f) {
                    f11 = 1.0f;
                }
                f0Var.p((fAbs * f11) + fL);
                float f12 = fIntBitsToFloat6 / fIntBitsToFloat5;
                f0Var.j((Math.abs((Float.intBitsToFloat(i10) * ((float) Math.sin(dAtan2))) / b2.e.c(f0Var.a())) * fE * (f12 <= 1.0f ? f12 : 1.0f)) + fL);
                break;
        }
        return o.f13011a;
    }
}
