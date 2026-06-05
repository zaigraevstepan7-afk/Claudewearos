package fb;

import pi.o;
import qj.b0;
import qj.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements ej.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t.c f6669a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t.c f6670b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t.c f6671c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f6672d;

    public /* synthetic */ f(t.c cVar, t.c cVar2, t.c cVar3, z zVar) {
        this.f6669a = cVar;
        this.f6670b = cVar2;
        this.f6671c = cVar3;
        this.f6672d = zVar;
    }

    @Override // ej.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        float fFloatValue = ((Float) obj3).floatValue();
        float fFloatValue2 = ((Float) obj4).floatValue();
        t.c cVar = this.f6669a;
        long j = ((b2.b) cVar.e()).f1500a;
        t.c cVar2 = this.f6670b;
        float fFloatValue3 = ((Number) cVar2.e()).floatValue();
        t.c cVar3 = this.f6671c;
        float f10 = fFloatValue3 * fFloatValue;
        float fFloatValue4 = ((Number) cVar3.e()).floatValue() + fFloatValue2;
        long j4 = ((b2.b) obj2).f1500a;
        double d10 = fFloatValue4 * 0.017453292519943295d;
        double dCos = Math.cos(d10);
        double dSin = Math.sin(d10);
        int i10 = (int) (j4 >> 32);
        int i11 = (int) (j4 & 4294967295L);
        float fIntBitsToFloat = (float) ((Float.intBitsToFloat(i11) * dCos) + (Float.intBitsToFloat(i10) * dSin));
        b0.w(this.f6672d, null, new g(cVar, b2.b.f(j, b2.b.g((Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits((float) ((Float.intBitsToFloat(i10) * dCos) - (Float.intBitsToFloat(i11) * dSin))) << 32), f10)), cVar2, f10, cVar3, fFloatValue4, null), 3);
        return o.f13011a;
    }
}
