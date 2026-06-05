package g3;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import c2.u0;
import c2.v0;
import c2.z0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final ak.v f7154a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7155b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7156c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7157d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7158e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7159f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f7160g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f7161h;

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public o(ak.v vVar, long j, int i10, int i11) {
        int i12;
        boolean z2;
        int i13;
        int iG;
        int i14;
        this.f7154a = vVar;
        this.f7155b = i10;
        if (s3.a.j(j) != 0 || s3.a.i(j) != 0) {
            m3.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) vVar.f734e;
        int size = arrayList2.size();
        float f10 = 0.0f;
        int i15 = 0;
        int i16 = 0;
        while (i15 < size) {
            r rVar = (r) arrayList2.get(i15);
            o3.c cVar = rVar.f7173a;
            int iH = s3.a.h(j);
            if (s3.a.c(j)) {
                i13 = i15;
                iG = s3.a.g(j) - ((int) Math.ceil(f10));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                i13 = i15;
                iG = s3.a.g(j);
            }
            i12 = 0;
            fk.g gVar = new fk.g(cVar, this.f7155b - i16, i11, s3.b.b(0, iH, 0, iG, 5));
            h3.j jVar = (h3.j) gVar.f6828d;
            float fJ = gVar.j() + f10;
            int i17 = i16 + jVar.f7608g;
            arrayList.add(new q(gVar, rVar.f7174b, rVar.f7175c, i16, i17, f10, fJ));
            if (!jVar.f7605d) {
                if (i17 == this.f7155b) {
                    i14 = i13;
                    if (i14 != yd.f.B((ArrayList) this.f7154a.f734e)) {
                    }
                } else {
                    i14 = i13;
                }
                i15 = i14 + 1;
                i16 = i17;
                f10 = fJ;
            }
            z2 = true;
            i16 = i17;
            f10 = fJ;
            break;
        }
        i12 = 0;
        z2 = false;
        this.f7158e = f10;
        this.f7159f = i16;
        this.f7156c = z2;
        this.f7161h = arrayList;
        this.f7157d = s3.a.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i18 = i12; i18 < size2; i18++) {
            q qVar = (q) arrayList.get(i18);
            ?? r82 = qVar.f7166a.f6830f;
            ArrayList arrayList4 = new ArrayList(r82.size());
            int size3 = r82.size();
            for (int i19 = i12; i19 < size3; i19++) {
                b2.c cVar2 = (b2.c) r82.get(i19);
                arrayList4.add(cVar2 != null ? qVar.a(cVar2) : null);
            }
            qi.q.u0(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.f7154a.f731b).size()) {
            int size4 = ((List) this.f7154a.f731b).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i20 = i12; i20 < size4; i20++) {
                arrayList5.add(null);
            }
            arrayList3 = qi.l.I0(arrayList3, arrayList5);
        }
        this.f7160g = arrayList3;
    }

    public static void i(o oVar, c2.u uVar, long j, v0 v0Var, r3.l lVar, e2.e eVar) {
        uVar.f();
        ArrayList arrayList = oVar.f7161h;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = (q) arrayList.get(i10);
            qVar.f7166a.o(uVar, j, v0Var, lVar, eVar);
            uVar.p(0.0f, qVar.f7166a.j());
        }
        uVar.q();
    }

    public static void j(o oVar, c2.u uVar, c2.s sVar, float f10, v0 v0Var, r3.l lVar, e2.e eVar) {
        uVar.f();
        ArrayList arrayList = oVar.f7161h;
        if (arrayList.size() <= 1 || (sVar instanceof z0)) {
            o3.j.b(oVar, uVar, sVar, f10, v0Var, lVar, eVar);
        } else {
            if (!(sVar instanceof u0)) {
                throw new b3.e();
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fJ = 0.0f;
            for (int i10 = 0; i10 < size; i10++) {
                q qVar = (q) arrayList.get(i10);
                fJ += qVar.f7166a.j();
                fMax = Math.max(fMax, qVar.f7166a.l());
            }
            Shader shaderB = ((u0) sVar).b((Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fJ) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                fk.g gVar = ((q) arrayList.get(i11)).f7166a;
                gVar.p(uVar, new c2.t(shaderB), f10, v0Var, lVar, eVar);
                uVar.p(0.0f, gVar.j());
                matrix.setTranslate(0.0f, -gVar.j());
                shaderB.setLocalMatrix(matrix);
            }
        }
        uVar.q();
    }

    public final void a(long j, float[] fArr) {
        k(m0.f(j));
        l(m0.e(j));
        fj.t tVar = new fj.t();
        tVar.f6805a = 0;
        e0.g(this.f7161h, j, new m(j, fArr, tVar, new fj.s()));
    }

    public final float b(int i10) {
        m(i10);
        ArrayList arrayList = this.f7161h;
        q qVar = (q) arrayList.get(e0.e(i10, arrayList));
        fk.g gVar = qVar.f7166a;
        return ((h3.j) gVar.f6828d).e(i10 - qVar.f7169d) + qVar.f7171f;
    }

    public final int c(int i10, boolean z2) {
        int iF;
        m(i10);
        ArrayList arrayList = this.f7161h;
        q qVar = (q) arrayList.get(e0.e(i10, arrayList));
        fk.g gVar = qVar.f7166a;
        int i11 = i10 - qVar.f7169d;
        h3.j jVar = (h3.j) gVar.f6828d;
        if (z2) {
            Layout layout = jVar.f7607f;
            ThreadLocal threadLocal = h3.k.f7618a;
            if (layout.getEllipsisCount(i11) <= 0 || jVar.f7603b != TextUtils.TruncateAt.END) {
                ak.v vVarC = jVar.c();
                Layout layout2 = (Layout) vVarC.f730a;
                iF = vVarC.w(layout2.getLineEnd(i11), layout2.getLineStart(i11));
            } else {
                iF = layout.getEllipsisStart(i11) + layout.getLineStart(i11);
            }
        } else {
            iF = jVar.f(i11);
        }
        return iF + qVar.f7167b;
    }

    public final int d(int i10) {
        int length = ((f) this.f7154a.f730a).f7081b.length();
        ArrayList arrayList = this.f7161h;
        q qVar = (q) arrayList.get(i10 >= length ? yd.f.B(arrayList) : i10 < 0 ? 0 : e0.d(i10, arrayList));
        return ((h3.j) qVar.f7166a.f6828d).f7607f.getLineForOffset(qVar.d(i10)) + qVar.f7169d;
    }

    public final int e(float f10) {
        ArrayList arrayList = this.f7161h;
        q qVar = (q) arrayList.get(e0.f(arrayList, f10));
        int i10 = qVar.f7168c - qVar.f7167b;
        int i11 = qVar.f7169d;
        if (i10 == 0) {
            return i11;
        }
        fk.g gVar = qVar.f7166a;
        float f11 = f10 - qVar.f7171f;
        h3.j jVar = (h3.j) gVar.f6828d;
        return jVar.f7607f.getLineForVertical(((int) f11) - jVar.f7609h) + i11;
    }

    public final float f(int i10) {
        m(i10);
        ArrayList arrayList = this.f7161h;
        q qVar = (q) arrayList.get(e0.e(i10, arrayList));
        fk.g gVar = qVar.f7166a;
        return ((h3.j) gVar.f6828d).g(i10 - qVar.f7169d) + qVar.f7171f;
    }

    public final int g(long j) {
        int i10 = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        ArrayList arrayList = this.f7161h;
        q qVar = (q) arrayList.get(e0.f(arrayList, fIntBitsToFloat));
        int i11 = qVar.f7168c;
        int i12 = qVar.f7167b;
        if (i11 - i12 == 0) {
            return i12;
        }
        fk.g gVar = qVar.f7166a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i10) - qVar.f7171f;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32);
        h3.j jVar = (h3.j) gVar.f6828d;
        int lineForVertical = jVar.f7607f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits))) - jVar.f7609h);
        return jVar.f7607f.getOffsetForHorizontal(lineForVertical, (jVar.b(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i12;
    }

    public final long h(b2.c cVar, int i10, b0.b bVar) {
        long jB;
        long j;
        float f10 = cVar.f1503b;
        ArrayList arrayList = this.f7161h;
        int iF = e0.f(arrayList, f10);
        float f11 = ((q) arrayList.get(iF)).f7172g;
        float f12 = cVar.f1505d;
        if (f11 >= f12 || iF == yd.f.B(arrayList)) {
            q qVar = (q) arrayList.get(iF);
            return qVar.b(qVar.f7166a.k(qVar.c(cVar), i10, bVar), true);
        }
        int iF2 = e0.f(arrayList, f12);
        long jB2 = m0.f7143b;
        while (true) {
            jB = m0.f7143b;
            if (!m0.b(jB2, jB) || iF > iF2) {
                break;
            }
            q qVar2 = (q) arrayList.get(iF);
            jB2 = qVar2.b(qVar2.f7166a.k(qVar2.c(cVar), i10, bVar), true);
            iF++;
        }
        if (m0.b(jB2, jB)) {
            return jB;
        }
        while (true) {
            j = m0.f7143b;
            if (!m0.b(jB, j) || iF > iF2) {
                break;
            }
            q qVar3 = (q) arrayList.get(iF2);
            jB = qVar3.b(qVar3.f7166a.k(qVar3.c(cVar), i10, bVar), true);
            iF2--;
        }
        return m0.b(jB, j) ? jB2 : e0.b((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void k(int i10) {
        boolean z2 = false;
        ak.v vVar = this.f7154a;
        if (i10 >= 0 && i10 < ((f) vVar.f730a).f7081b.length()) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        StringBuilder sbP = gk.b.p(i10, "offset(", ") is out of bounds [0, ");
        sbP.append(((f) vVar.f730a).f7081b.length());
        sbP.append(')');
        m3.a.a(sbP.toString());
    }

    public final void l(int i10) {
        boolean z2 = false;
        ak.v vVar = this.f7154a;
        if (i10 >= 0 && i10 <= ((f) vVar.f730a).f7081b.length()) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        StringBuilder sbP = gk.b.p(i10, "offset(", ") is out of bounds [0, ");
        sbP.append(((f) vVar.f730a).f7081b.length());
        sbP.append(']');
        m3.a.a(sbP.toString());
    }

    public final void m(int i10) {
        boolean z2 = false;
        int i11 = this.f7159f;
        if (i10 >= 0 && i10 < i11) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        m3.a.a("lineIndex(" + i10 + ") is out of bounds [0, " + i11 + ')');
    }
}
