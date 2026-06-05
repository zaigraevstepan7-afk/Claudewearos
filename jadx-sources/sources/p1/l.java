package p1;

import ak.v;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.LogPrinter;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.gridlayout.widget.GridLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.OverwritingInputMerger;
import com.google.android.gms.internal.ads.zzbec;
import com.google.android.gms.internal.ads.zzbed;
import com.google.android.gms.internal.ads.zzhgo;
import com.google.firebase.messaging.FirebaseMessagingService;
import f0.a1;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import q.g0;
import r5.p;
import r5.r;
import r5.u;
import r5.x;
import r5.y;
import t.m1;
import t4.l0;
import t6.t0;
import v2.a2;
import v2.f0;
import v2.t;
import wh.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l implements zzbec, s1.d, wb.b, xg.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12659a;

    /* renamed from: b, reason: collision with root package name */
    public Object f12660b;

    /* renamed from: c, reason: collision with root package name */
    public Object f12661c;

    /* renamed from: d, reason: collision with root package name */
    public Object f12662d;

    public /* synthetic */ l(int i10, boolean z2) {
        this.f12659a = i10;
    }

    public static Object[] j(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        LogPrinter logPrinter = GridLayout.B;
        int iMax = -1;
        for (int i10 : iArr) {
            iMax = Math.max(iMax, i10);
        }
        Object[] objArr2 = (Object[]) Array.newInstance(componentType, iMax + 1);
        for (int i11 = 0; i11 < length; i11++) {
            objArr2[iArr[i11]] = objArr[i11];
        }
        return objArr2;
    }

    public static boolean m(Editable editable, KeyEvent keyEvent, boolean z2) {
        y[] yVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (yVarArr = (y[]) editable.getSpans(selectionStart, selectionEnd, y.class)) != null && yVarArr.length > 0) {
                for (y yVar : yVarArr) {
                    int spanStart = editable.getSpanStart(yVar);
                    int spanEnd = editable.getSpanEnd(yVar);
                    if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean A() {
        return y3.e.b(((k4.d) this.f12660b).f9420a) <= 0;
    }

    public Object B(CharSequence charSequence, int i10, int i11, int i12, boolean z2, p pVar) {
        int i13;
        char c6;
        r rVar = new r((u) ((a8.j) this.f12661c).f217c);
        int iCodePointAt = Character.codePointAt(charSequence, i10);
        int i14 = 0;
        boolean zD = true;
        int iCharCount = i10;
        loop0: while (true) {
            i13 = iCharCount;
            while (iCharCount < i11 && i14 < i12 && zD) {
                SparseArray sparseArray = rVar.f13751c.f13763a;
                u uVar = sparseArray == null ? null : (u) sparseArray.get(iCodePointAt);
                if (rVar.f13749a == 2) {
                    if (uVar != null) {
                        rVar.f13751c = uVar;
                        rVar.f13754f++;
                    } else {
                        if (iCodePointAt == 65038) {
                            rVar.a();
                        } else if (iCodePointAt != 65039) {
                            u uVar2 = rVar.f13751c;
                            if (uVar2.f13764b != null) {
                                if (rVar.f13754f != 1) {
                                    rVar.f13752d = uVar2;
                                    rVar.a();
                                } else if (rVar.b()) {
                                    rVar.f13752d = rVar.f13751c;
                                    rVar.a();
                                } else {
                                    rVar.a();
                                }
                                c6 = 3;
                            } else {
                                rVar.a();
                            }
                        }
                        c6 = 1;
                    }
                    c6 = 2;
                } else if (uVar == null) {
                    rVar.a();
                    c6 = 1;
                } else {
                    rVar.f13749a = 2;
                    rVar.f13751c = uVar;
                    rVar.f13754f = 1;
                    c6 = 2;
                }
                rVar.f13753e = iCodePointAt;
                if (c6 == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i13)) + i13;
                    if (iCharCount < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c6 == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c6 == 3) {
                    if (z2 || !x(charSequence, i13, iCharCount, rVar.f13752d.f13764b)) {
                        zD = pVar.d(charSequence, i13, iCharCount, rVar.f13752d.f13764b);
                        i14++;
                    }
                }
            }
            break loop0;
        }
        if (rVar.f13749a == 2 && rVar.f13751c.f13764b != null && ((rVar.f13754f > 1 || rVar.b()) && i14 < i12 && zD && (z2 || !x(charSequence, i13, iCharCount, rVar.f13751c.f13764b)))) {
            pVar.d(charSequence, i13, iCharCount, rVar.f13751c.f13764b);
        }
        return pVar.c();
    }

    public void C(Object obj) {
        long jB = j.b();
        if (jB == n.f12666a) {
            this.f12662d = obj;
            return;
        }
        synchronized (this.f12661c) {
            m mVar = (m) ((AtomicReference) this.f12660b).get();
            int iA = mVar.a(jB);
            if (iA < 0) {
                ((AtomicReference) this.f12660b).set(mVar.b(jB, obj));
            } else {
                mVar.f12665c[iA] = obj;
            }
        }
    }

    public void D(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f12660b = str;
    }

    public void E(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
        }
        this.f12660b = Integer.valueOf(i10);
    }

    public l F(rg.h hVar) {
        zg.c cVarZ = hVar.z();
        l lVar = this;
        while (true) {
            ug.j jVar = (ug.j) lVar.f12662d;
            if (cVarZ == null) {
                return lVar;
            }
            l lVar2 = new l(cVarZ, lVar, jVar.f17080a.containsKey(cVarZ) ? (ug.j) jVar.f17080a.get(cVarZ) : new ug.j(), 12);
            hVar = hVar.C();
            cVarZ = hVar.z();
            lVar = lVar2;
        }
    }

    public String G(String str, Object... objArr) {
        String str2 = (String) this.f12662d;
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        return str2 == null ? str : m1.w(str2, " - ", str);
    }

    public void H(View view) {
        if (((ArrayList) this.f12662d).remove(view)) {
            p7.k kVar = (p7.k) this.f12660b;
            t0 t0VarH = RecyclerView.H(view);
            if (t0VarH != null) {
                RecyclerView recyclerView = (RecyclerView) kVar.f12813b;
                int i10 = t0VarH.f16060p;
                if (recyclerView.K()) {
                    t0VarH.f16061q = i10;
                    recyclerView.J0.add(t0VarH);
                } else {
                    View view2 = t0VarH.f16046a;
                    Field field = l0.f15744a;
                    view2.setImportantForAccessibility(i10);
                }
                t0VarH.f16060p = 0;
            }
        }
    }

    public void I() {
        g0 g0Var = (g0) this.f12660b;
        String str = (String) this.f12661c;
        List list = (List) g0Var.k(str);
        if (list != null) {
            list.remove((ej.a) this.f12662d);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        g0Var.m(str, list);
    }

    public void J(String str) {
        String strG = G(str, new Object[0]);
        k4.d dVar = (k4.d) this.f12660b;
        String str2 = (String) this.f12661c;
        System.currentTimeMillis();
        dVar.g(3, str2, strG);
    }

    public void K(String str, double d10, double d11) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) this.f12661c;
        ArrayList arrayList3 = (ArrayList) this.f12662d;
        int i10 = 0;
        while (true) {
            arrayList = (ArrayList) this.f12660b;
            if (i10 >= arrayList.size()) {
                break;
            }
            double dDoubleValue = ((Double) arrayList3.get(i10)).doubleValue();
            double dDoubleValue2 = ((Double) arrayList2.get(i10)).doubleValue();
            if (d10 < dDoubleValue || (dDoubleValue == d10 && d11 < dDoubleValue2)) {
                break;
            } else {
                i10++;
            }
        }
        arrayList.add(i10, str);
        arrayList3.add(i10, Double.valueOf(d10));
        arrayList2.add(i10, Double.valueOf(d11));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    @Override // xg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zg.p a(zg.k r5, zg.p r6, boolean r7) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f12662d
            zg.r r0 = (zg.r) r0
            if (r0 == 0) goto L7
            goto Lf
        L7:
            java.lang.Object r0 = r4.f12661c
            q5.b r0 = (q5.b) r0
            zg.r r0 = r0.n()
        Lf:
            java.lang.Object r1 = r4.f12660b
            q5.b r1 = (q5.b) r1
            java.lang.Object r2 = r1.f13236c
            rg.h0 r2 = (rg.h0) r2
            java.lang.Object r1 = r1.f13235b
            rg.h r1 = (rg.h) r1
            java.lang.Object r2 = r2.f14419a
            rg.b r2 = (rg.b) r2
            rg.b r1 = r2.x(r1)
            rg.h r2 = rg.h.f14414d
            zg.r r2 = r1.z(r2)
            r3 = 0
            if (r2 == 0) goto L2d
            goto L33
        L2d:
            if (r0 == 0) goto L61
            zg.r r2 = r1.i(r0)
        L33:
            java.util.Iterator r0 = r2.iterator()
        L37:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L61
            java.lang.Object r1 = r0.next()
            zg.p r1 = (zg.p) r1
            if (r7 == 0) goto L4a
            int r2 = r5.compare(r6, r1)
            goto L4e
        L4a:
            int r2 = r5.compare(r1, r6)
        L4e:
            if (r2 <= 0) goto L37
            if (r3 == 0) goto L5f
            if (r7 == 0) goto L59
            int r2 = r5.compare(r3, r1)
            goto L5d
        L59:
            int r2 = r5.compare(r1, r3)
        L5d:
            if (r2 >= 0) goto L37
        L5f:
            r3 = r1
            goto L37
        L61:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.l.a(zg.k, zg.p, boolean):zg.p");
    }

    public void b(f0 f0Var, t tVar) {
        p7.k kVar = (p7.k) this.f12660b;
        p7.k kVar2 = (p7.k) this.f12661c;
        p7.k kVar3 = (p7.k) this.f12662d;
        int iOrdinal = tVar.ordinal();
        if (iOrdinal == 0) {
            kVar.g(f0Var);
            kVar3.g(f0Var);
            return;
        }
        if (iOrdinal == 1) {
            kVar2.g(f0Var);
            kVar3.g(f0Var);
            return;
        }
        if (iOrdinal == 2) {
            if (f0Var.A != null) {
                kVar3.g(f0Var);
                return;
            } else {
                kVar.g(f0Var);
                return;
            }
        }
        if (iOrdinal != 3) {
            throw new b3.e();
        }
        if (f0Var.A != null) {
            kVar3.g(f0Var);
        } else {
            kVar2.g(f0Var);
        }
    }

    public void c(View view, int i10, boolean z2) {
        RecyclerView recyclerView = (RecyclerView) ((p7.k) this.f12660b).f12813b;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : s(i10);
        ((mc.e) this.f12661c).f(childCount, z2);
        if (z2) {
            y(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.H(view);
    }

    public void d(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z2) {
        RecyclerView recyclerView = (RecyclerView) ((p7.k) this.f12660b).f12813b;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : s(i10);
        ((mc.e) this.f12661c).f(childCount, z2);
        if (z2) {
            y(view);
        }
        t0 t0VarH = RecyclerView.H(view);
        if (t0VarH != null) {
            if (!t0VarH.j() && !t0VarH.o()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + t0VarH + recyclerView.x());
            }
            t0VarH.j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public t7.n e() {
        UUID uuid = (UUID) this.f12660b;
        c8.i iVar = (c8.i) this.f12661c;
        HashSet hashSet = (HashSet) this.f12662d;
        t7.n nVar = new t7.n();
        nVar.f16124a = uuid;
        nVar.f16125b = iVar;
        nVar.f16126c = hashSet;
        t7.c cVar = iVar.j;
        boolean z2 = cVar.f16109h.f16112a.size() > 0 || cVar.f16105d || cVar.f16103b || cVar.f16104c;
        if (((c8.i) this.f12661c).f3136q && z2) {
            throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
        }
        this.f12660b = UUID.randomUUID();
        c8.i iVar2 = (c8.i) this.f12661c;
        c8.i iVar3 = new c8.i();
        iVar3.f3122b = 1;
        t7.f fVar = t7.f.f16114c;
        iVar3.f3125e = fVar;
        iVar3.f3126f = fVar;
        iVar3.j = t7.c.f16101i;
        iVar3.f3131l = 1;
        iVar3.f3132m = 30000L;
        iVar3.f3135p = -1L;
        iVar3.f3137r = 1;
        iVar3.f3121a = iVar2.f3121a;
        iVar3.f3123c = iVar2.f3123c;
        iVar3.f3122b = iVar2.f3122b;
        iVar3.f3124d = iVar2.f3124d;
        iVar3.f3125e = new t7.f(iVar2.f3125e);
        iVar3.f3126f = new t7.f(iVar2.f3126f);
        iVar3.f3127g = iVar2.f3127g;
        iVar3.f3128h = iVar2.f3128h;
        iVar3.f3129i = iVar2.f3129i;
        t7.c cVar2 = iVar2.j;
        t7.c cVar3 = new t7.c();
        cVar3.f16102a = 1;
        cVar3.f16107f = -1L;
        cVar3.f16108g = -1L;
        cVar3.f16109h = new t7.e();
        cVar3.f16103b = cVar2.f16103b;
        cVar3.f16104c = cVar2.f16104c;
        cVar3.f16102a = cVar2.f16102a;
        cVar3.f16105d = cVar2.f16105d;
        cVar3.f16106e = cVar2.f16106e;
        cVar3.f16109h = cVar2.f16109h;
        iVar3.j = cVar3;
        iVar3.f3130k = iVar2.f3130k;
        iVar3.f3131l = iVar2.f3131l;
        iVar3.f3132m = iVar2.f3132m;
        iVar3.f3133n = iVar2.f3133n;
        iVar3.f3134o = iVar2.f3134o;
        iVar3.f3135p = iVar2.f3135p;
        iVar3.f3136q = iVar2.f3136q;
        iVar3.f3137r = iVar2.f3137r;
        this.f12661c = iVar3;
        iVar3.f3121a = ((UUID) this.f12660b).toString();
        return nVar;
    }

    public ub.i f() {
        String strConcat = ((String) this.f12660b) == null ? " backendName" : "";
        if (((rb.d) this.f12662d) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new ub.i((String) this.f12660b, (byte[]) this.f12661c, (rb.d) this.f12662d);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public vf.a g() throws GeneralSecurityException {
        d8.e eVar;
        bg.a aVarA;
        vf.d dVar = (vf.d) this.f12660b;
        if (dVar == null || (eVar = (d8.e) this.f12661c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (dVar.f18039b != ((bg.a) eVar.f5001a).f1773a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        vf.c cVar = dVar.f18041d;
        vf.c cVar2 = vf.c.f18028f;
        if (cVar != cVar2 && ((Integer) this.f12662d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (cVar == cVar2 && ((Integer) this.f12662d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (cVar == cVar2) {
            aVarA = bg.a.a(new byte[0]);
        } else if (cVar == vf.c.f18027e || cVar == vf.c.f18026d) {
            aVarA = bg.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f12662d).intValue()).array());
        } else {
            if (cVar != vf.c.f18025c) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + ((vf.d) this.f12660b).f18041d);
            }
            aVarA = bg.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f12662d).intValue()).array());
        }
        return new vf.a((vf.d) this.f12660b, aVarA);
    }

    @Override // oi.a
    public Object get() {
        switch (this.f12659a) {
            case 0:
                long jB = j.b();
                if (jB == n.f12666a) {
                    return this.f12662d;
                }
                m mVar = (m) ((AtomicReference) this.f12660b).get();
                int iA = mVar.a(jB);
                if (iA >= 0) {
                    return mVar.f12665c[iA];
                }
                return null;
            case 11:
                return new ub.p(new y9.a(), new x9.b(4), (zb.b) ((v) this.f12660b).get(), (ac.n) ((nc.p) this.f12661c).get(), (a8.j) ((s) this.f12662d).get());
            default:
                return new ac.d((Context) ((oi.a) this.f12660b).get(), (bc.d) ((oi.a) this.f12661c).get(), (ac.b) ((x9.b) this.f12662d).get(), 0);
        }
    }

    public vf.d h() throws GeneralSecurityException {
        Integer num = (Integer) this.f12660b;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (((Integer) this.f12661c) == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (((vf.c) this.f12662d) != null) {
            return new vf.d(num.intValue(), ((Integer) this.f12661c).intValue(), (vf.c) this.f12662d);
        }
        throw new GeneralSecurityException("variant not set");
    }

    public vf.i i() throws GeneralSecurityException {
        d8.e eVar;
        bg.a aVarA;
        vf.k kVar = (vf.k) this.f12660b;
        if (kVar == null || (eVar = (d8.e) this.f12661c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (kVar.f18050b != ((bg.a) eVar.f5001a).f1773a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        vf.c cVar = kVar.f18052d;
        vf.c cVar2 = vf.c.f18036o;
        if (cVar != cVar2 && ((Integer) this.f12662d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (cVar == cVar2 && ((Integer) this.f12662d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (cVar == cVar2) {
            aVarA = bg.a.a(new byte[0]);
        } else if (cVar == vf.c.f18035n || cVar == vf.c.f18034m) {
            aVarA = bg.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f12662d).intValue()).array());
        } else {
            if (cVar != vf.c.f18033l) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: " + ((vf.k) this.f12660b).f18052d);
            }
            aVarA = bg.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f12662d).intValue()).array());
        }
        return new vf.i((vf.k) this.f12660b, aVarA);
    }

    public boolean k(f0 f0Var) {
        return !(f0Var.A == null) && (((a2) ((p7.k) this.f12660b).f12813b).contains(f0Var) || ((a2) ((p7.k) this.f12661c).f12813b).contains(f0Var));
    }

    public void l(Throwable th2, String str, Object... objArr) {
        if (A()) {
            String strG = G(str, objArr);
            if (th2 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strG);
                sb2.append("\n");
                StringWriter stringWriter = new StringWriter();
                th2.printStackTrace(new PrintWriter(stringWriter));
                sb2.append(stringWriter.toString());
                strG = sb2.toString();
            }
            k4.d dVar = (k4.d) this.f12660b;
            String str2 = (String) this.f12661c;
            System.currentTimeMillis();
            dVar.g(1, str2, strG);
        }
    }

    public void n(int i10) {
        t0 t0VarH;
        int iS = s(i10);
        ((mc.e) this.f12661c).h(iS);
        RecyclerView recyclerView = (RecyclerView) ((p7.k) this.f12660b).f12813b;
        View childAt = recyclerView.getChildAt(iS);
        if (childAt != null && (t0VarH = RecyclerView.H(childAt)) != null) {
            if (t0VarH.j() && !t0VarH.o()) {
                throw new IllegalArgumentException("called detach on an already detached child " + t0VarH + recyclerView.x());
            }
            t0VarH.a(256);
        }
        recyclerView.detachViewFromParent(iS);
    }

    public void o(String str, Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(G(str, new Object[0]));
        sb2.append("\n");
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        sb2.append(stringWriter.toString());
        String string = sb2.toString();
        k4.d dVar = (k4.d) this.f12660b;
        String str2 = (String) this.f12661c;
        System.currentTimeMillis();
        dVar.g(4, str2, string);
    }

    public void p(yh.c cVar, boolean z2) {
        if (z2) {
            ((rg.k) cVar.f20314b).a(this);
        }
        for (Object obj : ((ug.j) this.f12662d).f17080a.entrySet().toArray()) {
            Map.Entry entry = (Map.Entry) obj;
            new l((zg.c) entry.getKey(), this, (ug.j) entry.getValue(), 12).p(cVar, true);
        }
    }

    public View q(int i10) {
        return ((RecyclerView) ((p7.k) this.f12660b).f12813b).getChildAt(s(i10));
    }

    public int r() {
        return ((RecyclerView) ((p7.k) this.f12660b).f12813b).getChildCount() - ((ArrayList) this.f12662d).size();
    }

    public int s(int i10) {
        mc.e eVar = (mc.e) this.f12661c;
        if (i10 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((p7.k) this.f12660b).f12813b).getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            int iB = i10 - (i11 - eVar.b(i11));
            if (iB == 0) {
                while (eVar.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iB;
        }
        return -1;
    }

    public rg.h t() {
        zg.c cVar = (zg.c) this.f12660b;
        l lVar = (l) this.f12661c;
        if (lVar == null) {
            return cVar != null ? new rg.h(cVar) : rg.h.f14414d;
        }
        ug.l.c(cVar != null);
        return lVar.t().i(cVar);
    }

    public String toString() {
        switch (this.f12659a) {
            case 7:
                return ((mc.e) this.f12661c).toString() + ", hidden list:" + ((ArrayList) this.f12662d).size();
            case 12:
                zg.c cVar = (zg.c) this.f12660b;
                StringBuilder sbK = m6.a.k("", cVar == null ? "<anon>" : cVar.f20592a, "\n");
                sbK.append(((ug.j) this.f12662d).a("\t"));
                return sbK.toString();
            default:
                return super.toString();
        }
    }

    public View u(int i10) {
        return ((RecyclerView) ((p7.k) this.f12660b).f12813b).getChildAt(i10);
    }

    public int v() {
        return ((RecyclerView) ((p7.k) this.f12660b).f12813b).getChildCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0381 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0510 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0231  */
    /* JADX WARN: Type inference failed for: r0v113 */
    /* JADX WARN: Type inference failed for: r0v170 */
    /* JADX WARN: Type inference failed for: r0v171 */
    /* JADX WARN: Type inference failed for: r0v88, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean w() throws org.json.JSONException, android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 1437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.l.w():boolean");
    }

    public boolean x(CharSequence charSequence, int i10, int i11, x xVar) {
        if ((xVar.f13772c & 3) == 0) {
            r5.h hVar = (r5.h) this.f12662d;
            s5.a aVarB = xVar.b();
            int iA = aVarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) aVarB.f14538d).getShort(iA + aVarB.f14535a);
            }
            r5.d dVar = (r5.d) hVar;
            dVar.getClass();
            ThreadLocal threadLocal = r5.d.f13724b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i10 < i11) {
                sb2.append(charSequence.charAt(i10));
                i10++;
            }
            TextPaint textPaint = dVar.f13725a;
            String string = sb2.toString();
            int i12 = l4.c.f9971a;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i13 = xVar.f13772c & 4;
            xVar.f13772c = zHasGlyph ? i13 | 2 : i13 | 1;
        }
        return (xVar.f13772c & 3) == 2;
    }

    public void y(View view) {
        ((ArrayList) this.f12662d).add(view);
        p7.k kVar = (p7.k) this.f12660b;
        t0 t0VarH = RecyclerView.H(view);
        if (t0VarH != null) {
            View view2 = t0VarH.f16046a;
            RecyclerView recyclerView = (RecyclerView) kVar.f12813b;
            int i10 = t0VarH.f16061q;
            if (i10 != -1) {
                t0VarH.f16060p = i10;
            } else {
                Field field = l0.f15744a;
                t0VarH.f16060p = view2.getImportantForAccessibility();
            }
            if (recyclerView.K()) {
                t0VarH.f16061q = 4;
                recyclerView.J0.add(t0VarH);
            } else {
                Field field2 = l0.f15744a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public boolean z() {
        return !(((a2) ((p7.k) this.f12660b).f12813b).isEmpty() && ((a2) ((p7.k) this.f12662d).f12813b).isEmpty() && ((a2) ((p7.k) this.f12661c).f12813b).isEmpty());
    }

    @Override // com.google.android.gms.internal.ads.zzbec
    public void zza() {
        zzbed zzbedVar = (zzbed) this.f12660b;
        t0.j jVarA = new a1(zzbedVar.zza()).a();
        Intent intent = (Intent) jVarA.f15363b;
        Context context = (Context) this.f12661c;
        intent.setPackage(zzhgo.zza(context));
        intent.setData((Uri) this.f12662d);
        i4.c.startActivity(context, intent, (Bundle) jVarA.f15364c);
        zzbedVar.zzf((Activity) context);
    }

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, int i10) {
        this.f12659a = i10;
        this.f12660b = obj;
        this.f12661c = obj2;
        this.f12662d = obj3;
    }

    public l(int i10) {
        this.f12659a = i10;
        switch (i10) {
            case 1:
                this.f12660b = new ArrayList();
                this.f12661c = new ArrayList();
                this.f12662d = new ArrayList();
                break;
            case 9:
                List list = Collections.EMPTY_LIST;
                this.f12660b = list;
                this.f12661c = list;
                break;
            case 13:
                this.f12660b = new p7.k(28);
                this.f12661c = new p7.k(28);
                this.f12662d = new p7.k(28);
                break;
            default:
                this.f12660b = new AtomicReference(j.f12648b);
                this.f12661c = new Object();
                break;
        }
    }

    public l(p7.k kVar) {
        this.f12659a = 7;
        this.f12660b = kVar;
        this.f12661c = new mc.e(1);
        this.f12662d = new ArrayList();
    }

    public l(FirebaseMessagingService firebaseMessagingService, ld.i iVar, ExecutorService executorService) {
        this.f12659a = 19;
        this.f12660b = executorService;
        this.f12661c = firebaseMessagingService;
        this.f12662d = iVar;
    }

    public l(Runnable runnable) {
        this.f12659a = 6;
        this.f12661c = new CopyOnWriteArrayList();
        this.f12662d = new HashMap();
        this.f12660b = runnable;
    }

    public l(Class cls) {
        this.f12659a = 8;
        HashSet hashSet = new HashSet();
        this.f12662d = hashSet;
        this.f12660b = UUID.randomUUID();
        this.f12661c = new c8.i(((UUID) this.f12660b).toString(), cls.getName());
        hashSet.add(cls.getName());
        ((c8.i) this.f12661c).f3124d = OverwritingInputMerger.class.getName();
    }

    public l(a8.j jVar, h9.a aVar, r5.d dVar, Set set) {
        this.f12659a = 3;
        this.f12660b = aVar;
        this.f12661c = jVar;
        this.f12662d = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            ah.g gVar = new ah.g();
            gVar.f477a = str;
            B(str, 0, str.length(), 1, true, gVar);
        }
    }

    public l(Object[] objArr, Object[] objArr2) {
        this.f12659a = 23;
        int length = objArr.length;
        int[] iArr = new int[length];
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = objArr[i10];
            Integer numValueOf = (Integer) map.get(obj);
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(map.size());
                map.put(obj, numValueOf);
            }
            iArr[i10] = numValueOf.intValue();
        }
        this.f12660b = iArr;
        this.f12661c = j(objArr, iArr);
        this.f12662d = j(objArr2, iArr);
    }
}
