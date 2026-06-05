package ta;

import android.os.Build;
import f1.a1;
import v.b1;
import v.e1;
import v.q1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16199a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s3.c f16200b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f16201c;

    public /* synthetic */ t(s3.c cVar, a1 a1Var, int i10) {
        this.f16199a = i10;
        this.f16200b = cVar;
        this.f16201c = a1Var;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f16199a) {
            case 0:
                this.f16201c.setValue(new s3.f(this.f16200b.h0(((Integer) obj).intValue())));
                break;
            case 1:
                c1.l lVar = new c1.l(8, (ej.a) obj);
                t tVar = new t(this.f16200b, this.f16201c, 2);
                if (e1.a()) {
                    return e1.a() ? new b1(lVar, tVar, Build.VERSION.SDK_INT == 28 ? q1.f17264b : q1.f17265c) : v1.l.f17564b;
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            default:
                float fB = s3.h.b(((s3.h) obj).f14744a);
                s3.c cVar = this.f16200b;
                this.f16201c.setValue(new s3.l((cVar.I0(fB) << 32) | (cVar.I0(s3.h.a(r7.f14744a)) & 4294967295L)));
                break;
        }
        return pi.o.f13011a;
    }
}
