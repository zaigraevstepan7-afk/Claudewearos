package wa;

import android.os.SystemClock;
import f1.a1;
import f1.h1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k0 extends vi.i implements ej.e {
    public final /* synthetic */ h1 A;
    public final /* synthetic */ h1 B;

    /* renamed from: a, reason: collision with root package name */
    public int f19112a;

    /* renamed from: b, reason: collision with root package name */
    public int f19113b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0.h0 f19114c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f19115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a1 f19116e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a1 f19117f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ a1 f19118z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(g0.h0 h0Var, a1 a1Var, a1 a1Var2, a1 a1Var3, a1 a1Var4, h1 h1Var, h1 h1Var2, ti.c cVar) {
        super(2, cVar);
        this.f19114c = h0Var;
        this.f19115d = a1Var;
        this.f19116e = a1Var2;
        this.f19117f = a1Var3;
        this.f19118z = a1Var4;
        this.A = h1Var;
        this.B = h1Var2;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        return new k0(this.f19114c, this.f19115d, this.f19116e, this.f19117f, this.f19118z, this.A, this.B, cVar);
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int iIntValue;
        Integer num;
        int i10;
        Throwable th2;
        Integer num2;
        Integer num3;
        ui.a aVar = ui.a.f17085a;
        int i11 = this.f19113b;
        pi.o oVar = pi.o.f13011a;
        h1 h1Var = this.B;
        a1 a1Var = this.f19117f;
        a1 a1Var2 = this.f19115d;
        if (i11 == 0) {
            uk.c.R(obj);
            float f10 = l0.f19120a;
            Integer num4 = (Integer) a1Var2.getValue();
            if (num4 != null) {
                iIntValue = num4.intValue();
                this.f19112a = iIntValue;
                this.f19113b = 1;
                if (qj.b0.i(500L, this) != aVar) {
                }
                return aVar;
            }
            return oVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f19112a;
            try {
                uk.c.R(obj);
                long jUptimeMillis = SystemClock.uptimeMillis();
                float f11 = l0.f19120a;
                h1Var.h(jUptimeMillis);
                a1Var.setValue(Boolean.FALSE);
                num3 = (Integer) a1Var2.getValue();
                if (num3 != null && num3.intValue() == i10) {
                    a1Var2.setValue(null);
                    return oVar;
                }
                return oVar;
            } catch (Throwable th3) {
                th2 = th3;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                float f12 = l0.f19120a;
                h1Var.h(jUptimeMillis2);
                a1Var.setValue(Boolean.FALSE);
                num2 = (Integer) a1Var2.getValue();
                if (num2 != null) {
                    a1Var2.setValue(null);
                }
                throw th2;
            }
        }
        int i12 = this.f19112a;
        uk.c.R(obj);
        iIntValue = i12;
        float f13 = l0.f19120a;
        if (((q0) this.f19116e.getValue()) != null && (num = (Integer) a1Var2.getValue()) != null && num.intValue() == iIntValue && !((Boolean) a1Var.getValue()).booleanValue() && !((Boolean) this.f19118z.getValue()).booleanValue() && SystemClock.uptimeMillis() >= this.A.g()) {
            a1Var.setValue(Boolean.TRUE);
            try {
                g0.h0 h0Var = this.f19114c;
                this.f19112a = iIntValue;
                this.f19113b = 2;
                if (g0.h0.g(h0Var, iIntValue, null, this, 6) != aVar) {
                    i10 = iIntValue;
                    long jUptimeMillis3 = SystemClock.uptimeMillis();
                    float f112 = l0.f19120a;
                    h1Var.h(jUptimeMillis3);
                    a1Var.setValue(Boolean.FALSE);
                    num3 = (Integer) a1Var2.getValue();
                    if (num3 != null) {
                        a1Var2.setValue(null);
                        return oVar;
                    }
                }
                return aVar;
            } catch (Throwable th4) {
                i10 = iIntValue;
                th2 = th4;
                long jUptimeMillis22 = SystemClock.uptimeMillis();
                float f122 = l0.f19120a;
                h1Var.h(jUptimeMillis22);
                a1Var.setValue(Boolean.FALSE);
                num2 = (Integer) a1Var2.getValue();
                if (num2 != null && num2.intValue() == i10) {
                    a1Var2.setValue(null);
                }
                throw th2;
            }
        }
        return oVar;
    }
}
