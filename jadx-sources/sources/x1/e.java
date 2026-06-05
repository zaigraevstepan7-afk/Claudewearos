package x1;

import a2.i;
import ac.o;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import d3.r;
import d3.u;
import java.util.ArrayList;
import java.util.List;
import q.k;
import q.l;
import q.v;
import t.m1;
import t2.l0;
import v.z1;
import w2.c2;
import w2.s1;
import w2.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements androidx.lifecycle.e, View.OnAttachStateChangeListener {
    public v B;
    public long C;
    public final v D;
    public c2 E;
    public boolean F;
    public final o G;

    /* renamed from: a, reason: collision with root package name */
    public final t f19789a;

    /* renamed from: b, reason: collision with root package name */
    public final i f19790b;

    /* renamed from: c, reason: collision with root package name */
    public q5.b f19791c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f19792d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final long f19793e = 100;

    /* renamed from: f, reason: collision with root package name */
    public a f19794f = a.f19781a;

    /* renamed from: z, reason: collision with root package name */
    public boolean f19795z = true;
    public final sj.c A = u6.v.a(1, 6, null);

    public e(t tVar, i iVar) {
        this.f19789a = tVar;
        this.f19790b = iVar;
        new Handler(Looper.getMainLooper());
        v vVar = l.f13102a;
        fj.l.d(vVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.B = vVar;
        this.D = new v();
        r rVarA = tVar.getSemanticsOwner().a();
        fj.l.d(vVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.E = new c2(rVarA, vVar);
        this.G = new o(this, 28);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0083 -> B:17:0x0047). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(vi.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof x1.c
            if (r0 == 0) goto L13
            r0 = r8
            x1.c r0 = (x1.c) r0
            int r1 = r0.f19787d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19787d = r1
            goto L18
        L13:
            x1.c r0 = new x1.c
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f19785b
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f19787d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            sj.b r2 = r0.f19784a
            uk.c.R(r8)
            goto L47
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            sj.b r2 = r0.f19784a
            uk.c.R(r8)
            goto L52
        L3a:
            uk.c.R(r8)
            sj.c r8 = r7.A
            r8.getClass()
            sj.b r2 = new sj.b
            r2.<init>(r8)
        L47:
            r0.f19784a = r2
            r0.f19787d = r4
            java.lang.Object r8 = r2.b(r0)
            if (r8 != r1) goto L52
            goto L85
        L52:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L86
            r2.c()
            boolean r8 = r7.h()
            if (r8 == 0) goto L66
            r7.i()
        L66:
            w2.t r8 = r7.f19789a
            android.os.Handler r8 = r8.getHandler()
            boolean r5 = r7.F
            if (r5 != 0) goto L79
            if (r8 == 0) goto L79
            r7.F = r4
            ac.o r5 = r7.G
            r8.post(r5)
        L79:
            r0.f19784a = r2
            r0.f19787d = r3
            long r5 = r7.f19793e
            java.lang.Object r8 = qj.b0.i(r5, r0)
            if (r8 != r1) goto L47
        L85:
            return r1
        L86:
            pi.o r8 = pi.o.f13011a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.e.a(vi.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(q.k r35) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.e.c(q.k):void");
    }

    public final void d(r rVar, ej.e eVar) {
        rVar.getClass();
        List listJ = r.j(4, rVar);
        int size = listJ.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = listJ.get(i11);
            if (f().a(((r) obj).f4768f)) {
                eVar.invoke(Integer.valueOf(i10), obj);
                i10++;
            }
        }
    }

    public final k f() {
        if (this.f19795z) {
            this.f19795z = false;
            this.B = u.b(this.f19789a.getSemanticsOwner(), d.f19788a);
            this.C = System.currentTimeMillis();
        }
        return this.B;
    }

    @Override // androidx.lifecycle.e
    public final void g(androidx.lifecycle.t tVar) {
        o(this.f19789a.getSemanticsOwner().a());
        i();
        this.f19791c = null;
    }

    public final boolean h() {
        return this.f19791c != null;
    }

    public final void i() {
        q5.b bVar = this.f19791c;
        if (bVar == null) {
            return;
        }
        Object obj = bVar.f13235b;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.f19792d;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = (f) arrayList.get(i10);
            int iOrdinal = fVar.f19798c.ordinal();
            if (iOrdinal == 0) {
                s1 s1Var = fVar.f19799d;
                if (s1Var != null) {
                    ViewStructure viewStructure = (ViewStructure) s1Var.f18374b;
                    if (Build.VERSION.SDK_INT >= 29) {
                        k7.a.g(z1.e(obj), viewStructure);
                    }
                }
            } else {
                if (iOrdinal != 1) {
                    throw new b3.e();
                }
                AutofillId autofillIdT = bVar.t(fVar.f19796a);
                if (autofillIdT != null && Build.VERSION.SDK_INT >= 29) {
                    k7.a.h(z1.e(obj), autofillIdT);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            k7.a.j(z1.e(obj), ((View) bVar.f13236c).getAutofillId(), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    public final void j(r rVar, c2 c2Var) {
        d(rVar, new l0(2, c2Var, this));
        List listJ = r.j(4, rVar);
        int size = listJ.size();
        for (int i10 = 0; i10 < size; i10++) {
            r rVar2 = (r) listJ.get(i10);
            k kVarF = f();
            int i11 = rVar2.f4768f;
            if (kVarF.a(i11)) {
                v vVar = this.D;
                if (vVar.a(i11)) {
                    Object objB = vVar.b(i11);
                    if (objB == null) {
                        throw m1.e("node not present in pruned tree before this change");
                    }
                    j(rVar2, (c2) objB);
                } else {
                    continue;
                }
            }
        }
    }

    public final void k(int i10, String str) {
        q5.b bVar;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29 && (bVar = this.f19791c) != null) {
            AutofillId autofillIdT = bVar.t(i10);
            if (autofillIdT == null) {
                throw m1.e("Invalid content capture ID");
            }
            if (i11 >= 29) {
                k7.a.i(z1.e(bVar.f13235b), autofillIdT, str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r18, d3.r r19) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.e.m(int, d3.r):void");
    }

    @Override // androidx.lifecycle.e
    public final void n(androidx.lifecycle.t tVar) {
        this.f19791c = (q5.b) this.f19790b.a();
        m(-1, this.f19789a.getSemanticsOwner().a());
        i();
    }

    public final void o(r rVar) {
        if (h()) {
            this.f19792d.add(new f(rVar.f4768f, this.C, g.f19801b, null));
            List listJ = r.j(4, rVar);
            int size = listJ.size();
            for (int i10 = 0; i10 < size; i10++) {
                o((r) listJ.get(i10));
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.f19789a.getHandler();
        fj.l.c(handler);
        handler.removeCallbacks(this.G);
        this.f19791c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() {
        /*
            r17 = this;
            r0 = r17
            q.v r1 = r0.D
            r1.c()
            q.k r2 = r0.f()
            int[] r3 = r2.f13097b
            java.lang.Object[] r4 = r2.f13098c
            long[] r2 = r2.f13096a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L5e
            r7 = 0
        L17:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L31:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            d3.s r13 = (d3.s) r13
            w2.c2 r15 = new w2.c2
            d3.r r13 = r13.f4769a
            q.k r6 = r0.f()
            r15.<init>(r13, r6)
            r1.i(r14, r15)
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L31
        L57:
            if (r10 != r11) goto L5e
        L59:
            if (r7 == r5) goto L5e
            int r7 = r7 + 1
            goto L17
        L5e:
            w2.c2 r1 = new w2.c2
            w2.t r2 = r0.f19789a
            d3.t r2 = r2.getSemanticsOwner()
            d3.r r2 = r2.a()
            q.k r3 = r0.f()
            r1.<init>(r2, r3)
            r0.E = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.e.p():void");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
