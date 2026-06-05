package u1;

import android.util.LongSparseArray;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import android.webkit.MimeTypeMap;
import d3.r;
import d3.s;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import qj.b0;
import t2.z;
import u6.c0;
import u6.d0;
import u6.u;
import u6.w;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static i2.f f16567a;

    /* renamed from: b, reason: collision with root package name */
    public static i2.f f16568b;

    /* renamed from: c, reason: collision with root package name */
    public static i2.f f16569c;

    public static final z.k a() {
        return new z.k();
    }

    public static final int b(e7.c cVar, String str) {
        fj.l.f(cVar, "<this>");
        int iC = c(cVar, str);
        if (iC >= 0) {
            return iC;
        }
        int iC2 = c(cVar, "`" + str + '`');
        if (iC2 >= 0) {
            return iC2;
        }
        return -1;
    }

    public static final int c(e7.c cVar, String str) {
        fj.l.f(cVar, "<this>");
        fj.l.f(str, "name");
        int columnCount = cVar.getColumnCount();
        for (int i10 = 0; i10 < columnCount; i10++) {
            if (str.equals(cVar.getColumnName(i10))) {
                return i10;
            }
        }
        return -1;
    }

    public static final Object d(u uVar, ej.c cVar, ti.c cVar2) {
        d0 d0Var;
        if (uVar.m() && uVar.p() && uVar.n()) {
            return cVar.invoke(cVar2);
        }
        if (cVar2.getContext().C(w.f16798a) == null) {
            return cVar.invoke(cVar2);
        }
        t0.f fVar = new t0.f(cVar, (ti.c) null, 2);
        c0 c0Var = (c0) cVar2.getContext().C(c0.f16686b);
        ti.e eVar = c0Var != null ? c0Var.f16687a : null;
        if (eVar != null) {
            return b0.G(eVar, fVar, cVar2);
        }
        qj.l lVar = new qj.l(1, u3.a.g(cVar2));
        lVar.p();
        try {
            d0Var = uVar.f16790c;
        } catch (RejectedExecutionException e10) {
            lVar.x(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e10));
        }
        if (d0Var == null) {
            fj.l.l("internalTransactionExecutor");
            throw null;
        }
        d0Var.execute(new b8.b(lVar, uVar, fVar, 8, false));
        Object objO = lVar.o();
        ui.a aVar = ui.a.f17085a;
        return objO;
    }

    public static void e(x1.e eVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        s sVar;
        r rVar;
        ej.c cVar;
        int size = longSparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            long jKeyAt = longSparseArray.keyAt(i10);
            ViewTranslationResponse viewTranslationResponseB = x1.b.b(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseB != null && (value = viewTranslationResponseB.getValue("android:text")) != null && (text = value.getText()) != null && (sVar = (s) eVar.f().b((int) jKeyAt)) != null && (rVar = sVar.f4769a) != null) {
                Object objG = rVar.f4766d.f4758a.g(d3.m.f4743l);
                if (objG == null) {
                    objG = null;
                }
                d3.a aVar = (d3.a) objG;
                if (aVar != null && (cVar = (ej.c) aVar.f4704b) != null) {
                }
            }
        }
    }

    public static String f(String str) {
        if (nj.e.K0(str)) {
            return null;
        }
        String strY0 = nj.e.Y0(nj.e.Y0(str, '#'), '?');
        String strW0 = nj.e.W0('.', nj.e.W0('/', strY0, strY0), "");
        if (nj.e.K0(strW0)) {
            return null;
        }
        String lowerCase = strW0.toLowerCase(Locale.ROOT);
        fj.l.e(lowerCase, "toLowerCase(...)");
        String str2 = (String) v8.j.f17894a.get(lowerCase);
        return str2 == null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase) : str2;
    }

    public static String g(float f10) {
        return "CellUnit(value=" + f10 + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean h(java.lang.Throwable r6, ej.a r7) {
        /*
            java.lang.String r0 = "<this>"
            fj.l.f(r6, r0)
            java.lang.Integer r0 = yi.a.f20315a
            r1 = 0
            if (r0 == 0) goto L27
            int r0 = r0.intValue()
            r2 = 19
            if (r0 < r2) goto L13
            goto L27
        L13:
            java.lang.reflect.Method r0 = xi.a.f20073b
            if (r0 == 0) goto L24
            java.lang.Object r0 = r0.invoke(r6, r1)
            if (r0 == 0) goto L24
            java.lang.Throwable[] r0 = (java.lang.Throwable[]) r0
            java.util.List r0 = qi.k.c0(r0)
            goto L34
        L24:
            qi.s r0 = qi.s.f13520a
            goto L34
        L27:
            java.lang.Throwable[] r0 = r6.getSuppressed()
            java.lang.String r2 = "getSuppressed(...)"
            fj.l.e(r0, r2)
            java.util.List r0 = qi.k.c0(r0)
        L34:
            int r2 = r0.size()
            r3 = 0
            r4 = r3
        L3a:
            if (r4 >= r2) goto L4a
            java.lang.Object r5 = r0.get(r4)
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            boolean r5 = r5 instanceof u1.h
            if (r5 == 0) goto L47
            return r3
        L47:
            int r4 = r4 + 1
            goto L3a
        L4a:
            java.lang.Object r7 = r7.a()     // Catch: java.lang.Throwable -> L6d
            u1.a r7 = (u1.a) r7     // Catch: java.lang.Throwable -> L6d
            if (r7 == 0) goto L76
            java.util.List r0 = r7.f16559a     // Catch: java.lang.Throwable -> L6d
            boolean r2 = r7.f16560b     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L6f
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L6d
            r4 = r3
        L5d:
            if (r4 >= r2) goto L76
            java.lang.Object r5 = r0.get(r4)     // Catch: java.lang.Throwable -> L6d
            u1.c r5 = (u1.c) r5     // Catch: java.lang.Throwable -> L6d
            com.google.android.gms.common.api.internal.i0 r5 = r5.f16565b     // Catch: java.lang.Throwable -> L6d
            if (r5 == 0) goto L6a
            goto L75
        L6a:
            int r4 = r4 + 1
            goto L5d
        L6d:
            r7 = move-exception
            goto L81
        L6f:
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L76
        L75:
            r3 = 1
        L76:
            if (r3 == 0) goto L82
            u1.h r1 = new u1.h     // Catch: java.lang.Throwable -> L6d
            fj.l.c(r7)     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L6d
            goto L82
        L81:
            r1 = r7
        L82:
            if (r1 == 0) goto L87
            mk.b.i(r6, r1)
        L87:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.d.h(java.lang.Throwable, ej.a):boolean");
    }

    public static final b2.c i(t2.w wVar) {
        b2.c cVarF = z.f(wVar, true);
        long jA0 = wVar.a0(cVarF.d());
        float f10 = cVarF.f1504c;
        float f11 = cVarF.f1505d;
        long jA02 = wVar.a0((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
        return new b2.c(Float.intBitsToFloat((int) (jA0 >> 32)), Float.intBitsToFloat((int) (jA0 & 4294967295L)), Float.intBitsToFloat((int) (jA02 >> 32)), Float.intBitsToFloat((int) (jA02 & 4294967295L)));
    }
}
