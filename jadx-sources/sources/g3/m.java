package g3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7138a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f7139b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7140c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7142e;

    public /* synthetic */ m(long j, fj.s sVar, mi.b0 b0Var, Context context) {
        this.f7139b = j;
        this.f7140c = sVar;
        this.f7141d = b0Var;
        this.f7142e = context;
    }

    @Override // ej.c
    public final Object invoke(Object obj) throws Throwable {
        int i10;
        boolean z2;
        h3.j jVar;
        float fA;
        float fA2;
        long j;
        c2.h hVar;
        c2.u uVarH;
        b2.c cVarG;
        c2.h hVar2;
        c2.u uVarH2;
        int i11 = this.f7138a;
        pi.o oVar = pi.o.f13011a;
        Object obj2 = this.f7140c;
        Object obj3 = this.f7142e;
        Object obj4 = this.f7141d;
        switch (i11) {
            case 0:
                float[] fArr = (float[]) obj4;
                fj.t tVar = (fj.t) obj3;
                fj.s sVar = (fj.s) obj2;
                q qVar = (q) obj;
                int i12 = qVar.f7167b;
                fk.g gVar = qVar.f7166a;
                int iE = qVar.f7168c;
                long j4 = this.f7139b;
                int iF = i12 > m0.f(j4) ? qVar.f7167b : m0.f(j4);
                if (iE >= m0.e(j4)) {
                    iE = m0.e(j4);
                }
                long jB = e0.b(qVar.d(iF), qVar.d(iE));
                int i13 = tVar.f6805a;
                h3.j jVar2 = (h3.j) gVar.f6828d;
                int iF2 = m0.f(jB);
                int iE2 = m0.e(jB);
                Layout layout = jVar2.f7607f;
                int length = layout.getText().length();
                if (iF2 < 0) {
                    m3.a.a("startOffset must be > 0");
                }
                if (iF2 >= length) {
                    m3.a.a("startOffset must be less than text length");
                }
                if (iE2 <= iF2) {
                    m3.a.a("endOffset must be greater than startOffset");
                }
                if (iE2 > length) {
                    m3.a.a("endOffset must be smaller or equal to text length");
                }
                if (fArr.length - i13 < (iE2 - iF2) * 4) {
                    m3.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(iF2);
                int lineForOffset2 = layout.getLineForOffset(iE2 - 1);
                c3.h hVar3 = new c3.h(jVar2);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        int i14 = i13;
                        int iF3 = jVar2.f(lineForOffset);
                        int iMax = Math.max(iF2, lineStart);
                        int iMin = Math.min(iE2, iF3);
                        float fG = jVar2.g(lineForOffset);
                        float fE = jVar2.e(lineForOffset);
                        boolean z10 = layout.getParagraphDirection(lineForOffset) == 1;
                        int i15 = iMax;
                        int i16 = i14;
                        while (i15 < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(i15);
                            if (!z10 || zIsRtlCharAt) {
                                i10 = iMin;
                                z2 = z10;
                                if (z2 && zIsRtlCharAt) {
                                    float fA3 = hVar3.a(i15, false, false, false);
                                    jVar = jVar2;
                                    fA = hVar3.a(i15 + 1, true, true, false);
                                    fA2 = fA3;
                                } else {
                                    jVar = jVar2;
                                    if (z2 || !zIsRtlCharAt) {
                                        fA = hVar3.a(i15, false, false, false);
                                        fA2 = hVar3.a(i15 + 1, true, true, false);
                                    } else {
                                        fA2 = hVar3.a(i15, false, false, true);
                                        fA = hVar3.a(i15 + 1, true, true, true);
                                    }
                                }
                                fArr[i16] = fA;
                                fArr[i16 + 1] = fG;
                                fArr[i16 + 2] = fA2;
                                fArr[i16 + 3] = fE;
                                i16 += 4;
                                i15++;
                                iMin = i10;
                                z10 = z2;
                                jVar2 = jVar;
                            } else {
                                i10 = iMin;
                                z2 = z10;
                                fA = hVar3.a(i15, false, false, true);
                                jVar = jVar2;
                                fA2 = hVar3.a(i15 + 1, true, true, true);
                            }
                            fArr[i16] = fA;
                            fArr[i16 + 1] = fG;
                            fArr[i16 + 2] = fA2;
                            fArr[i16 + 3] = fE;
                            i16 += 4;
                            i15++;
                            iMin = i10;
                            z10 = z2;
                            jVar2 = jVar;
                        }
                        h3.j jVar3 = jVar2;
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            i13 = i16;
                            jVar2 = jVar3;
                        }
                    }
                }
                int iD = (m0.d(jB) * 4) + tVar.f6805a;
                for (int i17 = tVar.f6805a; i17 < iD; i17 += 4) {
                    int i18 = i17 + 1;
                    float f10 = fArr[i18];
                    float f11 = sVar.f6804a;
                    fArr[i18] = f10 + f11;
                    int i19 = i17 + 3;
                    fArr[i19] = fArr[i19] + f11;
                }
                tVar.f6805a = iD;
                sVar.f6804a = gVar.j() + sVar.f6804a;
                return oVar;
            case 1:
                fj.s sVar2 = (fj.s) obj2;
                mi.b0 b0Var = (mi.b0) obj4;
                Context context = (Context) obj3;
                e2.d dVar = (e2.d) obj;
                fj.l.f(dVar, "$this$record");
                long j10 = this.f7139b;
                long j11 = j10 ^ (-9223372034707292160L);
                long jG = b2.e.g(dVar.a(), sVar2.f6804a);
                mi.i iVar = b0Var.f11730a;
                Object obj5 = mi.k.f11767a;
                long j12 = j10;
                mi.d.d(dVar, j11, jG, iVar.f11763c0 != null, new ab.k(b0Var, 25));
                long jA = dVar.a();
                float f12 = 2;
                float fMax = Math.max(Float.intBitsToFloat((int) (j12 >> 32)), 0.0f) * f12;
                float fMax2 = Math.max(Float.intBitsToFloat((int) (j12 & 4294967295L)), 0.0f) * f12;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32)) + fMax;
                long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (jA & 4294967295L)) + fMax2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                float fE2 = mi.k.e(iVar);
                if (fE2 > 0.0f) {
                    j = 4294967297L;
                    if (((((j11 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) != 0 || b2.b.c(j11, 0L)) {
                        ag.i iVar2 = mi.u.f11788a;
                        c2.h hVarA = mi.u.a(iVar2);
                        q.h0 h0Var = (q.h0) iVar2.f449b;
                        try {
                            hVarA.f2999a.setAntiAlias(true);
                            hVarA.c(cg.b.o(fE2, 0.0f, 1.0f));
                            Bitmap bitmapC = mi.x.c(context);
                            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                            BitmapShader bitmapShader = new BitmapShader(bitmapC, tileMode, tileMode);
                            float f13 = sVar2.f6804a;
                            if (f13 <= 0.0f) {
                                f13 = 1.0f;
                            }
                            if (Math.abs(f13 - 1.0f) >= 0.001f) {
                                Matrix matrix = new Matrix();
                                float f14 = 1.0f / f13;
                                matrix.setScale(f14, f14);
                                bitmapShader.setLocalMatrix(matrix);
                            }
                            hVarA.h(bitmapShader);
                            hVarA.d(9);
                            uVarH = dVar.C0().h();
                            cVarG = uk.c.g(0L, jFloatToRawIntBits);
                            uVarH.getClass();
                        } catch (Throwable th2) {
                            th = th2;
                            hVar = hVarA;
                        }
                        try {
                            uVarH.k(cVarG.f1502a, cVarG.f1503b, cVarG.f1504c, cVarG.f1505d, hVarA);
                            hVarA.f2999a.reset();
                            if (h0Var.f13084d < 3) {
                                h0Var.j(hVarA);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            hVar = hVarA;
                            hVar.f2999a.reset();
                            if (h0Var.f13084d < 3) {
                                h0Var.j(hVar);
                            }
                            throw th;
                        }
                    } else {
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 >> 32));
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j11 & 4294967295L));
                        ((ld.i) dVar.C0().f373b).U(fIntBitsToFloat2, fIntBitsToFloat3);
                        try {
                            ag.i iVar3 = mi.u.f11788a;
                            c2.h hVarA2 = mi.u.a(iVar3);
                            try {
                                hVarA2.f2999a.setAntiAlias(true);
                                hVarA2.c(cg.b.o(fE2, 0.0f, 1.0f));
                                Bitmap bitmapC2 = mi.x.c(context);
                                Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
                                BitmapShader bitmapShader2 = new BitmapShader(bitmapC2, tileMode2, tileMode2);
                                float f15 = sVar2.f6804a;
                                if (f15 <= 0.0f) {
                                    f15 = 1.0f;
                                }
                                if (Math.abs(f15 - 1.0f) >= 0.001f) {
                                    Matrix matrix2 = new Matrix();
                                    float f16 = 1.0f / f15;
                                    matrix2.setScale(f16, f16);
                                    bitmapShader2.setLocalMatrix(matrix2);
                                }
                                hVarA2.h(bitmapShader2);
                                hVarA2.d(9);
                                uVarH2 = dVar.C0().h();
                            } catch (Throwable th4) {
                                th = th4;
                                hVar2 = hVarA2;
                            }
                            try {
                                b2.c cVarG2 = uk.c.g(0L, jFloatToRawIntBits);
                                uVarH2.getClass();
                                uVarH2.k(cVarG2.f1502a, cVarG2.f1503b, cVarG2.f1504c, cVarG2.f1505d, hVarA2);
                                hVarA2.f2999a.reset();
                                q.h0 h0Var2 = (q.h0) iVar3.f449b;
                                if (h0Var2.f13084d < 3) {
                                    h0Var2.j(hVarA2);
                                }
                                ((ld.i) dVar.C0().f373b).U(-fIntBitsToFloat2, -fIntBitsToFloat3);
                                jFloatToRawIntBits = jFloatToRawIntBits;
                            } catch (Throwable th5) {
                                th = th5;
                                hVar2 = hVarA2;
                                hVar2.f2999a.reset();
                                q.h0 h0Var3 = (q.h0) iVar3.f449b;
                                if (h0Var3.f13084d < 3) {
                                    h0Var3.j(hVar2);
                                }
                                throw th;
                            }
                        } finally {
                        }
                    }
                } else {
                    j = 4294967297L;
                }
                if (((((j11 & 9187343241974906880L) ^ 9187343241974906880L) - j) & (-9223372034707292160L)) != 0 || b2.b.c(j11, 0L)) {
                    Iterator it = mi.k.f(iVar).iterator();
                    while (it.hasNext()) {
                        mi.d.e(dVar, (mi.s) it.next(), iVar, j12, jFloatToRawIntBits);
                    }
                } else {
                    ((ld.i) dVar.C0().f373b).U(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
                    try {
                        Iterator it2 = mi.k.f(iVar).iterator();
                        while (it2.hasNext()) {
                            mi.i iVar4 = iVar;
                            long j13 = j12;
                            mi.d.e(dVar, (mi.s) it2.next(), iVar4, j13, jFloatToRawIntBits);
                            iVar = iVar4;
                            j12 = j13;
                        }
                    } finally {
                    }
                }
                return oVar;
            default:
                b2.c cVar = (b2.c) obj4;
                fj.v vVar = (fj.v) obj3;
                long j14 = this.f7139b;
                c2.n nVar = (c2.n) obj2;
                v2.h0 h0Var4 = (v2.h0) obj;
                h0Var4.f();
                float f17 = cVar.f1502a;
                float f18 = cVar.f1503b;
                e2.b bVar = h0Var4.f17669a;
                ((ld.i) bVar.f5738b.f373b).U(f17, f18);
                try {
                    e2.d.K0(h0Var4, (c2.g) vVar.f6807a, j14, 0L, 0.0f, nVar, 0, 890);
                    return oVar;
                } finally {
                    ((ld.i) bVar.f5738b.f373b).U(-f17, -f18);
                }
        }
    }

    public /* synthetic */ m(long j, float[] fArr, fj.t tVar, fj.s sVar) {
        this.f7139b = j;
        this.f7141d = fArr;
        this.f7142e = tVar;
        this.f7140c = sVar;
    }

    public /* synthetic */ m(b2.c cVar, fj.v vVar, long j, c2.n nVar) {
        this.f7141d = cVar;
        this.f7142e = vVar;
        this.f7139b = j;
        this.f7140c = nVar;
    }
}
