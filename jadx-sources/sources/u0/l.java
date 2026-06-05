package u0;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import c2.w;
import c2.z0;
import fj.y;
import i2.h0;
import i2.u;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import qj.b0;
import qj.i0;
import qj.t;
import qj.y1;
import u6.z;
import vj.q;
import x.o1;
import zg.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static i2.f f16544a;

    /* renamed from: b, reason: collision with root package name */
    public static i2.f f16545b;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(p2.o0 r7, vi.a r8) {
        /*
            boolean r0 = r8 instanceof v0.x
            if (r0 == 0) goto L13
            r0 = r8
            v0.x r0 = (v0.x) r0
            int r1 = r0.f17528c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17528c = r1
            goto L18
        L13:
            v0.x r0 = new v0.x
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f17527b
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f17528c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p2.o0 r7 = r0.f17526a
            uk.c.R(r8)
            goto L41
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            uk.c.R(r8)
        L34:
            p2.o r8 = p2.o.f12744b
            r0.f17526a = r7
            r0.f17528c = r3
            java.lang.Object r8 = r7.l(r8, r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            p2.n r8 = (p2.n) r8
            java.lang.Object r2 = r8.f12734a
            int r4 = r2.size()
            r5 = 0
        L4a:
            if (r5 >= r4) goto L5c
            java.lang.Object r6 = r2.get(r5)
            p2.w r6 = (p2.w) r6
            boolean r6 = p2.v.a(r6)
            if (r6 != 0) goto L59
            goto L34
        L59:
            int r5 = r5 + 1
            goto L4a
        L5c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.l.a(p2.o0, vi.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c4, code lost:
    
        if (r15 == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(p2.o0 r11, k0.b1 r12, p2.n r13, int r14, vi.a r15) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.l.b(p2.o0, k0.b1, p2.n, int, vi.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if (a.a.j(r0.getWidth(), r0.getHeight(), (int) (r4 >> 32), (int) (r4 & 4294967295L), r11) == 1.0d) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap c(android.graphics.drawable.Drawable r8, android.graphics.Bitmap.Config r9, s8.h r10, s8.g r11, boolean r12) {
        /*
            boolean r0 = r8 instanceof android.graphics.drawable.BitmapDrawable
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r3 = 32
            if (r0 == 0) goto L4c
            r0 = r8
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            android.graphics.Bitmap$Config r4 = r0.getConfig()
            if (r9 == 0) goto L1f
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.HARDWARE
            if (r9 != r5) goto L1d
            goto L1f
        L1d:
            r5 = r9
            goto L21
        L1f:
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
        L21:
            if (r4 != r5) goto L4c
            if (r12 == 0) goto L26
            goto L4b
        L26:
            int r12 = r0.getWidth()
            int r4 = r0.getHeight()
            s8.h r5 = s8.h.f14786c
            long r4 = a.a.i(r12, r4, r10, r11, r5)
            long r6 = r4 >> r3
            int r12 = (int) r6
            long r4 = r4 & r1
            int r4 = (int) r4
            int r5 = r0.getWidth()
            int r6 = r0.getHeight()
            double r4 = a.a.j(r5, r6, r12, r4, r11)
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 != 0) goto L4c
        L4b:
            return r0
        L4c:
            android.graphics.drawable.Drawable r8 = r8.mutate()
            int r12 = v8.m.b(r8)
            r0 = 512(0x200, float:7.17E-43)
            if (r12 <= 0) goto L59
            goto L5a
        L59:
            r12 = r0
        L5a:
            int r4 = v8.m.a(r8)
            if (r4 <= 0) goto L61
            r0 = r4
        L61:
            s8.h r4 = s8.h.f14786c
            long r4 = a.a.i(r12, r0, r10, r11, r4)
            long r6 = r4 >> r3
            int r10 = (int) r6
            long r1 = r1 & r4
            int r1 = (int) r1
            double r10 = a.a.j(r12, r0, r10, r1, r11)
            double r1 = (double) r12
            double r1 = r1 * r10
            int r12 = hj.a.G(r1)
            double r0 = (double) r0
            double r10 = r10 * r0
            int r10 = hj.a.G(r10)
            if (r9 == 0) goto L82
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.HARDWARE
            if (r9 != r11) goto L84
        L82:
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
        L84:
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r12, r10, r9)
            android.graphics.Rect r11 = r8.getBounds()
            int r0 = r11.left
            int r1 = r11.top
            int r2 = r11.right
            int r11 = r11.bottom
            r3 = 0
            r8.setBounds(r3, r3, r12, r10)
            android.graphics.Canvas r10 = new android.graphics.Canvas
            r10.<init>(r9)
            r8.draw(r10)
            r8.setBounds(r0, r1, r2, r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.l.c(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, s8.h, s8.g, boolean):android.graphics.Bitmap");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] d(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            jArr[i10] = iArr[i10];
        }
        return jArr;
    }

    public static kg.b e(String str, String str2) {
        yh.a aVar = new yh.a(str, str2);
        kg.a aVarA = kg.b.a(yh.a.class);
        aVarA.f9605e = 1;
        aVarA.f9606f = new ac.h(aVar, 14);
        return aVarA.b();
    }

    public static final void f(e7.a aVar) throws Exception {
        fj.l.f(aVar, "connection");
        ri.c cVarR = yd.f.r();
        e7.c cVarD0 = aVar.d0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cVarD0.a0()) {
            try {
                cVarR.add(cVarD0.M(0));
            } finally {
            }
        }
        uk.c.q(cVarD0, null);
        ListIterator listIterator = yd.f.m(cVarR).listIterator(0);
        while (true) {
            ri.a aVar2 = (ri.a) listIterator;
            if (!aVar2.hasNext()) {
                return;
            }
            String str = (String) aVar2.next();
            if (nj.l.A0(str, "room_fts_content_sync_")) {
                uk.c.y(aVar, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static kg.b g(String str, b0.b bVar) {
        kg.a aVarA = kg.b.a(yh.a.class);
        aVarA.f9605e = 1;
        aVarA.a(kg.j.b(Context.class));
        aVarA.f9606f = new ac.l(17, str, bVar);
        return aVarA.b();
    }

    public static final i2.f h() {
        i2.f fVar = f16544a;
        if (fVar != null) {
            return fVar;
        }
        i2.e eVar = new i2.e("Outlined.ChevronRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = h0.f8270a;
        z0 z0Var = new z0(w.f3052b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new i2.n(10.0f, 6.0f));
        arrayList.add(new i2.m(8.59f, 7.41f));
        arrayList.add(new i2.m(13.17f, 12.0f));
        arrayList.add(new u(-4.58f, 4.59f));
        arrayList.add(new i2.m(10.0f, 18.0f));
        arrayList.add(new u(6.0f, -6.0f));
        arrayList.add(new u(-6.0f, -6.0f));
        arrayList.add(i2.j.f8278c);
        i2.e.a(eVar, arrayList, z0Var);
        i2.f fVarB = eVar.b();
        f16544a = fVarB;
        return fVarB;
    }

    public static final boolean i(g3.f fVar) {
        int length = fVar.f7081b.length();
        List list = fVar.f7080a;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                g3.d dVar = (g3.d) list.get(i10);
                if ((dVar.f7045a instanceof g3.l) && g3.g.b(0, length, dVar.f7046b, dVar.f7047c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean j(r rVar) {
        if (rVar.c().isEmpty()) {
            return rVar.isEmpty() || (rVar instanceof zg.i) || (rVar instanceof zg.u) || (rVar instanceof zg.h);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0166, code lost:
    
        if (r3 == r9) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd A[Catch: all -> 0x0056, TryCatch #1 {all -> 0x0056, blocks: (B:21:0x0052, B:44:0x00b5, B:46:0x00bd, B:48:0x00c9, B:50:0x00d5, B:41:0x009b), top: B:98:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(p2.o0 r17, p2.h r18, ak.x r19, p2.n r20, vi.a r21) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.l.k(p2.o0, p2.h, ak.x, p2.n, vi.a):java.lang.Object");
    }

    public static final int l(e0.m mVar, o1 o1Var) {
        return (int) (o1Var == o1.f19664a ? mVar.f5288o & 4294967295L : mVar.f5288o >> 32);
    }

    public static r m(rg.h hVar, Object obj) {
        String str;
        zg.j jVar = zg.j.f20603e;
        r rVarB = c.b(obj, jVar);
        if (rVarB instanceof zg.o) {
            rVarB = new zg.i(Double.valueOf(((zg.o) rVarB).f20611c), jVar);
        }
        if (j(rVarB)) {
            return rVarB;
        }
        StringBuilder sb2 = new StringBuilder();
        if (hVar != null) {
            str = "Path '" + hVar + "'";
        } else {
            str = "Node";
        }
        throw new mg.c(m6.a.j(sb2, str, " contains invalid priority: Must be a string, double, ServerValue, or null"));
    }

    public static final Cursor n(u6.u uVar, z zVar) {
        fj.l.f(uVar, "db");
        uVar.a();
        uVar.b();
        return uVar.j().H().r(zVar);
    }

    public static final Object o(q qVar, boolean z2, q qVar2, ej.e eVar) {
        Object tVar;
        Object objS;
        try {
            if (eVar instanceof vi.a) {
                y.c(2, eVar);
                tVar = eVar.invoke(qVar2, qVar);
            } else {
                tVar = u3.a.p(eVar, qVar2, qVar);
            }
        } catch (i0 e10) {
            Throwable th2 = e10.f13584a;
            qVar.R(new t(false, th2));
            throw th2;
        } catch (Throwable th3) {
            tVar = new t(false, th3);
        }
        ui.a aVar = ui.a.f17085a;
        if (tVar == aVar || (objS = qVar.S(tVar)) == b0.f13552e) {
            return aVar;
        }
        qVar.k0();
        if (!(objS instanceof t)) {
            return b0.E(objS);
        }
        if (!z2) {
            Throwable th4 = ((t) objS).f13622a;
            if ((th4 instanceof y1) && ((y1) th4).f13643a == qVar) {
                if (tVar instanceof t) {
                    throw ((t) tVar).f13622a;
                }
                return tVar;
            }
        }
        throw ((t) objS).f13622a;
    }

    public static boolean p(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i10 = 0; i10 < bArr2.length; i10++) {
                if (bArr[i10] == bArr2[i10]) {
                }
            }
            return true;
        }
        return false;
    }

    public static int q(Context context, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        if (r14 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(p2.o0 r11, k0.b1 r12, p2.n r13, vi.a r14) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.l.r(p2.o0, k0.b1, p2.n, vi.a):java.lang.Object");
    }
}
