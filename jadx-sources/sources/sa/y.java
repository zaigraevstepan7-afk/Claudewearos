package sa;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14952a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f14953b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f14954c;

    public /* synthetic */ y(long j, boolean z2, int i10) {
        this.f14952a = i10;
        this.f14953b = j;
        this.f14954c = z2;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        e2.d dVar = (e2.d) obj;
        switch (this.f14952a) {
            case 0:
                fj.l.f(dVar, "$this$Canvas");
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.a() & 4294967295L)) * 0.6666667f;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar.a() >> 32));
                float f10 = 2;
                long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.a() >> 32)) / f10) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
                long jFloatToRawIntBits2 = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat / f10) & 4294967295L);
                long jF = b2.b.f(jFloatToRawIntBits2, (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32));
                long jF2 = b2.b.f(jF, (Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32));
                long jF3 = b2.b.f(jF2, (Float.floatToRawIntBits(-fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32));
                c2.j jVarA = c2.l.a();
                int i10 = (int) (jFloatToRawIntBits >> 32);
                int i11 = (int) (jFloatToRawIntBits & 4294967295L);
                jVarA.h(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
                jVarA.g(Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)));
                jVarA.g(Float.intBitsToFloat((int) (jF >> 32)), Float.intBitsToFloat((int) (jF & 4294967295L)));
                jVarA.g(Float.intBitsToFloat((int) (jF2 >> 32)), Float.intBitsToFloat((int) (jF2 & 4294967295L)));
                jVarA.g(Float.intBitsToFloat((int) (jF3 >> 32)), Float.intBitsToFloat((int) (jF3 & 4294967295L)));
                jVarA.g(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
                jVarA.d();
                e2.d.F(dVar, jVarA, this.f14953b, this.f14954c ? e2.g.f5743a : new e2.h(1, 0, dVar.w0(1), 0.0f, 26), 52);
                break;
            default:
                fj.l.f(dVar, "$this$Canvas");
                e2.d.V0(dVar, this.f14953b, Float.intBitsToFloat((int) (dVar.a() >> 32)) / 2, 0L, this.f14954c ? e2.g.f5743a : new e2.h(0, 0, dVar.w0(1), 0.0f, 30), 108);
                break;
        }
        return pi.o.f13011a;
    }
}
