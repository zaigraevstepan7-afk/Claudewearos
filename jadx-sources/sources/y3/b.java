package y3;

import java.util.ArrayList;
import p1.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    public final a f20173d;

    /* renamed from: a, reason: collision with root package name */
    public f f20170a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f20171b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f20172c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f20174e = false;

    public b(l lVar) {
        this.f20173d = new a(this, lVar);
    }

    public final void a(c cVar, int i10) {
        this.f20173d.g(cVar.j(i10), 1.0f);
        this.f20173d.g(cVar.j(i10), -1.0f);
    }

    public final void b(f fVar, f fVar2, f fVar3, int i10) {
        boolean z2 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z2 = true;
            }
            this.f20171b = i10;
        }
        if (z2) {
            this.f20173d.g(fVar, 1.0f);
            this.f20173d.g(fVar2, -1.0f);
            this.f20173d.g(fVar3, -1.0f);
        } else {
            this.f20173d.g(fVar, -1.0f);
            this.f20173d.g(fVar2, 1.0f);
            this.f20173d.g(fVar3, 1.0f);
        }
    }

    public final void c(f fVar, f fVar2, f fVar3, int i10) {
        boolean z2 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z2 = true;
            }
            this.f20171b = i10;
        }
        if (z2) {
            this.f20173d.g(fVar, 1.0f);
            this.f20173d.g(fVar2, -1.0f);
            this.f20173d.g(fVar3, 1.0f);
        } else {
            this.f20173d.g(fVar, -1.0f);
            this.f20173d.g(fVar2, 1.0f);
            this.f20173d.g(fVar3, -1.0f);
        }
    }

    public f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f20170a == null && this.f20171b == 0.0f && this.f20173d.d() == 0;
    }

    public final f f(boolean[] zArr, f fVar) {
        int i10;
        int iD = this.f20173d.d();
        f fVar2 = null;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < iD; i11++) {
            float f11 = this.f20173d.f(i11);
            if (f11 < 0.0f) {
                f fVarE = this.f20173d.e(i11);
                if ((zArr == null || !zArr[fVarE.f20197b]) && fVarE != fVar && (((i10 = fVarE.E) == 3 || i10 == 4) && f11 < f10)) {
                    f10 = f11;
                    fVar2 = fVarE;
                }
            }
        }
        return fVar2;
    }

    public final void g(f fVar) {
        f fVar2 = this.f20170a;
        if (fVar2 != null) {
            this.f20173d.g(fVar2, -1.0f);
            this.f20170a.f20198c = -1;
            this.f20170a = null;
        }
        float fH = this.f20173d.h(fVar, true) * (-1.0f);
        this.f20170a = fVar;
        if (fH == 1.0f) {
            return;
        }
        this.f20171b /= fH;
        a aVar = this.f20173d;
        int i10 = aVar.f20168h;
        for (int i11 = 0; i10 != -1 && i11 < aVar.f20161a; i11++) {
            float[] fArr = aVar.f20167g;
            fArr[i10] = fArr[i10] / fH;
            i10 = aVar.f20166f[i10];
        }
    }

    public final void h(c cVar, f fVar, boolean z2) {
        if (fVar.f20201f) {
            float fC = this.f20173d.c(fVar);
            this.f20171b = (fVar.f20200e * fC) + this.f20171b;
            this.f20173d.h(fVar, z2);
            if (z2) {
                fVar.b(this);
            }
            if (this.f20173d.d() == 0) {
                this.f20174e = true;
                cVar.f20177a = true;
            }
        }
    }

    public void i(c cVar, b bVar, boolean z2) {
        a aVar = this.f20173d;
        aVar.getClass();
        float fC = aVar.c(bVar.f20170a);
        aVar.h(bVar.f20170a, z2);
        a aVar2 = bVar.f20173d;
        int iD = aVar2.d();
        for (int i10 = 0; i10 < iD; i10++) {
            f fVarE = aVar2.e(i10);
            aVar.a(fVarE, aVar2.c(fVarE) * fC, z2);
        }
        this.f20171b = (bVar.f20171b * fC) + this.f20171b;
        if (z2) {
            bVar.f20170a.b(this);
        }
        if (this.f20170a == null || this.f20173d.d() != 0) {
            return;
        }
        this.f20174e = true;
        cVar.f20177a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            y3.f r0 = r10.f20170a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            y3.f r1 = r10.f20170a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = t.m1.v(r0, r1)
            float r1 = r10.f20171b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f20171b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r4
            goto L3a
        L39:
            r1 = r3
        L3a:
            y3.a r5 = r10.f20173d
            int r5 = r5.d()
        L40:
            if (r3 >= r5) goto La0
            y3.a r6 = r10.f20173d
            y3.f r6 = r6.e(r3)
            if (r6 != 0) goto L4b
            goto L9d
        L4b:
            y3.a r7 = r10.f20173d
            float r7 = r7.f(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L56
            goto L9d
        L56:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L6a
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L7a
            java.lang.String r1 = "- "
            java.lang.String r0 = t.m1.v(r0, r1)
        L68:
            float r7 = r7 * r9
            goto L7a
        L6a:
            if (r8 <= 0) goto L73
            java.lang.String r1 = " + "
            java.lang.String r0 = t.m1.v(r0, r1)
            goto L7a
        L73:
            java.lang.String r1 = " - "
            java.lang.String r0 = t.m1.v(r0, r1)
            goto L68
        L7a:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L85
            java.lang.String r0 = t.m1.v(r0, r6)
            goto L9c
        L85:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L9c:
            r1 = r4
        L9d:
            int r3 = r3 + 1
            goto L40
        La0:
            if (r1 != 0) goto La8
            java.lang.String r1 = "0.0"
            java.lang.String r0 = t.m1.v(r0, r1)
        La8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.b.toString():java.lang.String");
    }
}
