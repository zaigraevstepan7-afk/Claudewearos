package q5;

import ac.l;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.animation.Animation;
import android.view.autofill.AutofillId;
import com.google.android.gms.common.internal.e0;
import f1.j1;
import g0.c0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import ld.i;
import pg.s;
import qc.r0;
import r5.a0;
import r5.p;
import r5.x;
import r5.y;
import rg.d0;
import rg.h;
import rg.h0;
import t2.m0;
import t2.m1;
import t2.n1;
import t2.q0;
import t6.c1;
import t6.d1;
import t7.q;
import t7.r;
import v.z1;
import v1.n;
import v2.b0;
import v2.f0;
import v2.k;
import v2.o;
import zg.j;
import zg.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements rc.d, p, s, m1, r, wb.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13234a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13235b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13236c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.f13234a = i10;
        this.f13235b = obj;
        this.f13236c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void j(f0 f0Var) {
        if (f0Var.f17636i0 > 0) {
            if (f0Var.Z.f17692d == b0.f17579e && !f0Var.p() && !f0Var.q() && !f0Var.f17637j0 && f0Var.H()) {
                n nVar = f0Var.Y.f17586f;
                if ((nVar.f17568d & 256) != 0) {
                    while (nVar != null) {
                        if ((nVar.f17567c & 256) != 0) {
                            k kVarE = nVar;
                            ?? eVar = 0;
                            while (kVarE != 0) {
                                if (kVarE instanceof o) {
                                    o oVar = (o) kVarE;
                                    oVar.N0(v2.n.v(oVar, 256));
                                } else if ((kVarE.f17567c & 256) != 0 && (kVarE instanceof k)) {
                                    n nVar2 = kVarE.I;
                                    int i10 = 0;
                                    kVarE = kVarE;
                                    eVar = eVar;
                                    while (nVar2 != null) {
                                        if ((nVar2.f17567c & 256) != 0) {
                                            i10++;
                                            eVar = eVar;
                                            if (i10 == 1) {
                                                kVarE = nVar2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new g1.e(new n[16]);
                                                }
                                                if (kVarE != 0) {
                                                    eVar.b(kVarE);
                                                    kVarE = 0;
                                                }
                                                eVar.b(nVar2);
                                            }
                                        }
                                        nVar2 = nVar2.f17570f;
                                        kVarE = kVarE;
                                        eVar = eVar;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                kVarE = v2.n.e(eVar);
                            }
                        }
                        if ((nVar.f17568d & 256) == 0) {
                            break;
                        } else {
                            nVar = nVar.f17570f;
                        }
                    }
                }
            }
            f0Var.f17635h0 = false;
            g1.e eVarY = f0Var.y();
            Object[] objArr = eVarY.f7024a;
            int i11 = eVarY.f7026c;
            for (int i12 = 0; i12 < i11; i12++) {
                j((f0) objArr[i12]);
            }
        }
    }

    public static int p(int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            i12++;
            if (i12 == i11) {
                i13++;
                i12 = 0;
            } else if (i12 > i11) {
                i13++;
                i12 = 1;
            }
        }
        return i12 + 1 > i11 ? i13 + 1 : i13;
    }

    public static void v(zg.r rVar, q2.d dVar) {
        if (!rVar.n()) {
            if (rVar.isEmpty()) {
                throw new IllegalArgumentException("Can't calculate hash on empty node!");
            }
            if (rVar instanceof zg.f) {
                ((zg.f) rVar).e(new zg.g(dVar), true);
                return;
            } else {
                throw new IllegalStateException("Expected children node, but got: " + rVar);
            }
        }
        dVar.e();
        dVar.f13188a = dVar.f13189b;
        ((StringBuilder) dVar.f13191d).append(((zg.n) rVar).g(2));
        dVar.f13190c = true;
        ug.f fVar = (ug.f) dVar.f13195h;
        fVar.getClass();
        if (((StringBuilder) dVar.f13191d).length() > fVar.f17074a) {
            if (dVar.c(dVar.f13189b).isEmpty() || !dVar.c(dVar.f13189b).y().equals(zg.c.f20591d)) {
                dVar.d();
            }
        }
    }

    @Override // t2.m1
    public boolean a(l lVar) {
        return true;
    }

    @Override // t2.m1
    public n1 apply() {
        return ((m0) this.f13235b).f(this.f13236c);
    }

    @Override // pg.s
    public void b(String str, String str2) {
        mg.b bVarA = str != null ? mg.b.a(str, str2) : null;
        rg.k kVar = (rg.k) this.f13236c;
        d0 d0Var = (d0) this.f13235b;
        rg.k.b(kVar, "Persisted write", d0Var.f14392b, bVarA);
        rg.k.c(kVar, d0Var.f14391a, d0Var.f14392b, bVarA);
    }

    @Override // r5.p
    public Object c() {
        return (a0) this.f13235b;
    }

    @Override // r5.p
    public boolean d(CharSequence charSequence, int i10, int i11, x xVar) {
        if ((xVar.f13772c & 4) > 0) {
            return true;
        }
        if (((a0) this.f13235b) == null) {
            this.f13235b = new a0(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((h9.a) this.f13236c).getClass();
        ((a0) this.f13235b).setSpan(new y(xVar), i10, i11, 33);
        return true;
    }

    @Override // t2.m1
    public boolean e() {
        return true;
    }

    public zg.r f(zg.c cVar, wg.a aVar) {
        h0 h0Var = (h0) this.f13236c;
        h hVar = (h) this.f13235b;
        h0Var.getClass();
        h hVarI = hVar.i(cVar);
        zg.r rVarZ = ((rg.b) h0Var.f14419a).z(hVarI);
        if (rVarZ != null) {
            return rVarZ;
        }
        if (aVar.a(cVar)) {
            return ((rg.b) h0Var.f14419a).x(hVarI).i(aVar.f19286a.f20605a.t(cVar));
        }
        return null;
    }

    public zg.r g(zg.r rVar) {
        h0 h0Var = (h0) this.f13236c;
        h hVar = (h) this.f13235b;
        h0Var.getClass();
        zg.r rVarD = j.f20603e;
        zg.r<zg.p> rVarZ = ((rg.b) h0Var.f14419a).z(hVar);
        if (rVarZ != null) {
            if (!rVarZ.n()) {
                for (zg.p pVar : rVarZ) {
                    rVarD = rVarD.d(pVar.f20614a, pVar.f20615b);
                }
            }
            return rVarD;
        }
        rg.b bVarX = ((rg.b) h0Var.f14419a).x(hVar);
        Iterator it = rVar.iterator();
        while (it.hasNext()) {
            zg.p pVar2 = (zg.p) it.next();
            rVarD = rVarD.d(pVar2.f20614a, bVarX.x(new h(pVar2.f20614a)).i(pVar2.f20615b));
        }
        ArrayList arrayList = new ArrayList();
        ug.e eVar = bVarX.f14383a;
        Object obj = eVar.f17072a;
        if (obj != null) {
            for (zg.p pVar3 : (zg.r) obj) {
                arrayList.add(new zg.p(pVar3.f20614a, pVar3.f20615b));
            }
        } else {
            for (Map.Entry entry : eVar.f17073b) {
                ug.e eVar2 = (ug.e) entry.getValue();
                if (eVar2.f17072a != null) {
                    arrayList.add(new zg.p((zg.c) entry.getKey(), (zg.r) eVar2.f17072a));
                }
            }
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            zg.p pVar4 = (zg.p) obj2;
            rVarD = rVarD.d(pVar4.f20614a, pVar4.f20615b);
        }
        return rVarD;
    }

    @Override // oi.a
    public Object get() {
        return new vb.d((Context) ((h.a) this.f13235b).f7555a, (p1.l) ((i) this.f13236c).get());
    }

    public zg.r h(h hVar, zg.r rVar, zg.r rVar2) {
        h0 h0Var = (h0) this.f13236c;
        h hVar2 = (h) this.f13235b;
        h0Var.getClass();
        ug.l.b("Either existingEventSnap or existingServerSnap must exist", (rVar == null && rVar2 == null) ? false : true);
        h hVarE = hVar2.e(hVar);
        if (((rg.b) h0Var.f14419a).z(hVarE) != null) {
            return null;
        }
        rg.b bVarX = ((rg.b) h0Var.f14419a).x(hVarE);
        return bVarX.f14383a.isEmpty() ? rVar2.l(hVar) : bVarX.i(rVar2.l(hVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f13235b
            g1.e r0 = (g1.e) r0
            v2.o1 r1 = v2.o1.f17734b
            r0.o(r1)
            int r1 = r0.f7026c
            java.lang.Object r2 = r6.f13236c
            v2.f0[] r2 = (v2.f0[]) r2
            if (r2 == 0) goto L14
            int r3 = r2.length
            if (r3 >= r1) goto L1c
        L14:
            r2 = 16
            int r2 = java.lang.Math.max(r2, r1)
            v2.f0[] r2 = new v2.f0[r2]
        L1c:
            r3 = 0
            r6.f13236c = r3
            r4 = 0
        L20:
            if (r4 >= r1) goto L2b
            java.lang.Object[] r5 = r0.f7024a
            r5 = r5[r4]
            r2[r4] = r5
            int r4 = r4 + 1
            goto L20
        L2b:
            r0.h()
            int r1 = r1 + (-1)
        L30:
            r0 = -1
            if (r0 >= r1) goto L44
            r0 = r2[r1]
            fj.l.c(r0)
            boolean r4 = r0.f17635h0
            if (r4 == 0) goto L3f
            j(r0)
        L3f:
            r2[r1] = r3
            int r1 = r1 + (-1)
            goto L30
        L44:
            r6.f13236c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.b.i():void");
    }

    public View k(int i10, int i11, int i12, int i13) {
        c1 c1Var = (c1) this.f13236c;
        d1 d1Var = (d1) this.f13235b;
        int iH = d1Var.h();
        int iL = d1Var.l();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewS = d1Var.s(i10);
            int iE = d1Var.e(viewS);
            int iV = d1Var.v(viewS);
            c1Var.f15850b = iH;
            c1Var.f15851c = iL;
            c1Var.f15852d = iE;
            c1Var.f15853e = iV;
            if (i12 != 0) {
                c1Var.f15849a = i12;
                if (c1Var.a()) {
                    return viewS;
                }
            }
            if (i13 != 0) {
                c1Var.f15849a = i13;
                if (c1Var.a()) {
                    view = viewS;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public void l(ArrayList arrayList, int i10, ArrayList arrayList2, List list, zg.l lVar) {
        wg.c cVar;
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            wg.c cVar2 = (wg.c) obj;
            if (y3.e.a(cVar2.f19292a, i10)) {
                arrayList3.add(cVar2);
            }
        }
        Collections.sort(arrayList3, new wg.f(this));
        int size2 = arrayList3.size();
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            wg.c cVar3 = (wg.c) obj2;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                rg.f fVar = (rg.f) it.next();
                if (fVar.f(i10)) {
                    int i13 = cVar3.f19292a;
                    zg.l lVar2 = cVar3.f19293b;
                    zg.c cVar4 = cVar3.f19295d;
                    int i14 = cVar3.f19292a;
                    if (y3.e.a(i13, 5) || y3.e.a(i14, 1)) {
                        cVar = cVar3;
                    } else {
                        zg.r rVar = lVar2.f20605a;
                        zg.k kVar = (zg.k) this.f13236c;
                        zg.k kVar2 = lVar.f20607c;
                        if (!kVar2.equals(m.f20608a) && !kVar2.equals(kVar)) {
                            throw new IllegalArgumentException("Index not available in IndexedNode!");
                        }
                        lVar.b();
                        if (e0.l(lVar.f20606b, zg.l.f20604d)) {
                            lVar.f20605a.q(cVar4);
                        }
                        cVar = new wg.c(i14, lVar2, cVar4, cVar3.f19294c);
                    }
                    arrayList.add(fVar.b(cVar, (wg.h) this.f13235b));
                }
            }
        }
    }

    public zg.r m() {
        wg.a aVar = (wg.a) this.f13235b;
        if (aVar.f19287b) {
            return aVar.f19286a.f20605a;
        }
        return null;
    }

    public zg.r n() {
        wg.a aVar = (wg.a) this.f13236c;
        if (aVar.f19287b) {
            return aVar.f19286a.f20605a;
        }
        return null;
    }

    public q0 o() {
        return (q0) ((j1) this.f13236c).getValue();
    }

    public void q() {
        ((SparseIntArray) this.f13235b).clear();
    }

    public boolean r(View view) {
        c1 c1Var = (c1) this.f13236c;
        d1 d1Var = (d1) this.f13235b;
        int iH = d1Var.h();
        int iL = d1Var.l();
        int iE = d1Var.e(view);
        int iV = d1Var.v(view);
        c1Var.f15850b = iH;
        c1Var.f15851c = iL;
        c1Var.f15852d = iE;
        c1Var.f15853e = iV;
        c1Var.f15849a = 24579;
        return c1Var.a();
    }

    public void s() throws IOException {
        String str = (String) this.f13235b;
        if (((FileChannel) this.f13236c) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.f13236c = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th2) {
            FileChannel fileChannel = (FileChannel) this.f13236c;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.f13236c = null;
            throw new IllegalStateException(t.m1.j("Unable to lock file: '", str, "'."), th2);
        }
    }

    public AutofillId t(long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return k7.a.e(z1.e(this.f13235b), ((View) this.f13236c).getAutofillId(), j);
        }
        return null;
    }

    public String toString() {
        switch (this.f13234a) {
            case 7:
                return "Bounds{lower=" + ((l4.b) this.f13235b) + " upper=" + ((l4.b) this.f13236c) + "}";
            default:
                return super.toString();
        }
    }

    public void u(String str) {
        ((ScheduledExecutorService) this.f13235b).execute(new rg.d((pg.b) this.f13236c, str, 0));
    }

    public void w(hj.a aVar) {
        e8.k kVar = (e8.k) this.f13236c;
        ((androidx.lifecycle.b0) this.f13235b).g(aVar);
        if (aVar instanceof q) {
            kVar.h((q) aVar);
        } else if (aVar instanceof t7.o) {
            kVar.i(((t7.o) aVar).f16127f);
        }
    }

    public zg.r x(h hVar) {
        h0 h0Var = (h0) this.f13236c;
        return ((rg.b) h0Var.f14419a).z(((h) this.f13235b).e(hVar));
    }

    public b y(zg.l lVar, boolean z2, boolean z10) {
        return new b(20, new wg.a(lVar, z2, z10), (wg.a) this.f13236c);
    }

    @Override // rc.d
    public rc.n zza(String str) {
        qc.m0 m0Var = r0.f13445l;
        r0 r0Var = mc.n.D.f11577c;
        new qc.b0((Context) this.f13235b, (String) this.f13236c, str, null).zzb();
        return rc.n.f14353a;
    }

    public b(f0 f0Var, q0 q0Var) {
        this.f13234a = 12;
        this.f13235b = f0Var;
        this.f13236c = f1.s.A(q0Var);
    }

    public b(List list, List list2) {
        this.f13234a = 23;
        if (list.size() == list2.size() - 1) {
            this.f13235b = list;
            this.f13236c = list2;
            return;
        }
        throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
    }

    public b(String str) {
        this.f13234a = 14;
        this.f13235b = str.concat(".lck");
    }

    public b(wg.h hVar) {
        this.f13234a = 19;
        this.f13235b = hVar;
        this.f13236c = hVar.f19306b.f19304e;
    }

    public b(g0.h0 h0Var, g0.p pVar, c0 c0Var) {
        this.f13234a = 21;
        this.f13235b = h0Var;
        this.f13236c = pVar;
    }

    public b(d1 d1Var) {
        this.f13234a = 9;
        this.f13235b = d1Var;
        c1 c1Var = new c1();
        c1Var.f15849a = 0;
        this.f13236c = c1Var;
    }

    @Override // t2.m1
    public void cancel() {
    }

    public b(Animation animation) {
        this.f13234a = 17;
        this.f13235b = animation;
        this.f13236c = null;
    }

    public b(Animator animator) {
        this.f13234a = 17;
        this.f13235b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f13236c = animatorSet;
        animatorSet.play(animator);
    }

    public b(int i10) {
        this.f13234a = i10;
        switch (i10) {
            case 8:
                this.f13235b = new SparseIntArray();
                this.f13236c = new SparseIntArray();
                break;
            case 11:
                this.f13235b = new androidx.lifecycle.b0();
                this.f13236c = new e8.k();
                w(r.f16129s);
                break;
            case 13:
                this.f13235b = new g1.e(new f0[16]);
                break;
            case 16:
                this.f13235b = new g1.e(new Reference[16]);
                this.f13236c = new ReferenceQueue();
                break;
            case 18:
                break;
            default:
                this.f13235b = Choreographer.getInstance();
                this.f13236c = Looper.myLooper();
                break;
        }
    }

    public b(WindowInsetsAnimation.Bounds bounds) {
        this.f13234a = 7;
        this.f13235b = l4.b.d(bounds.getLowerBound());
        this.f13236c = l4.b.d(bounds.getUpperBound());
    }

    public b(rg.k kVar, d0 d0Var) {
        this.f13234a = 4;
        this.f13236c = kVar;
        this.f13235b = d0Var;
    }
}
