package d2;

import c2.w;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final c f4657a;

    /* renamed from: b, reason: collision with root package name */
    public final c f4658b;

    /* renamed from: c, reason: collision with root package name */
    public final c f4659c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f4660d;

    public g(c cVar, c cVar2, c cVar3, float[] fArr) {
        this.f4657a = cVar;
        this.f4658b = cVar2;
        this.f4659c = cVar3;
        this.f4660d = fArr;
    }

    public long a(long j) {
        float fI = w.i(j);
        float fH = w.h(j);
        float f10 = w.f(j);
        float fE = w.e(j);
        c cVar = this.f4658b;
        long jD = cVar.d(fI, fH, f10);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE2 = cVar.e(fI, fH, f10);
        float[] fArr = this.f4660d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE2 *= fArr[2];
        }
        float f11 = fIntBitsToFloat;
        float f12 = fIntBitsToFloat2;
        return this.f4659c.f(f11, f12, fE2, fE, this.f4657a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(d2.c r9, d2.c r10, int r11) {
        /*
            r8 = this;
            long r0 = r9.f4628b
            long r2 = d2.b.f4622a
            boolean r0 = d2.b.a(r0, r2)
            if (r0 == 0) goto Lf
            d2.c r0 = d2.j.a(r9)
            goto L10
        Lf:
            r0 = r9
        L10:
            long r4 = r10.f4628b
            boolean r1 = d2.b.a(r4, r2)
            if (r1 == 0) goto L1d
            d2.c r1 = d2.j.a(r10)
            goto L1e
        L1d:
            r1 = r10
        L1e:
            r4 = 3
            if (r11 != r4) goto L69
            long r5 = r9.f4628b
            boolean r11 = d2.b.a(r5, r2)
            long r5 = r10.f4628b
            boolean r2 = d2.b.a(r5, r2)
            if (r11 == 0) goto L32
            if (r2 == 0) goto L32
            goto L69
        L32:
            if (r11 != 0) goto L36
            if (r2 == 0) goto L69
        L36:
            if (r11 == 0) goto L39
            goto L3a
        L39:
            r9 = r10
        L3a:
            d2.q r9 = (d2.q) r9
            d2.s r9 = r9.f4681d
            float[] r3 = d2.j.f4666e
            if (r11 == 0) goto L47
            float[] r11 = r9.a()
            goto L48
        L47:
            r11 = r3
        L48:
            if (r2 == 0) goto L4e
            float[] r3 = r9.a()
        L4e:
            r9 = 0
            r2 = r11[r9]
            r5 = r3[r9]
            float r2 = r2 / r5
            r5 = 1
            r6 = r11[r5]
            r7 = r3[r5]
            float r6 = r6 / r7
            r7 = 2
            r11 = r11[r7]
            r3 = r3[r7]
            float r11 = r11 / r3
            float[] r3 = new float[r4]
            r3[r9] = r2
            r3[r5] = r6
            r3[r7] = r11
            goto L6a
        L69:
            r3 = 0
        L6a:
            r8.<init>(r10, r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.g.<init>(d2.c, d2.c, int):void");
    }
}
