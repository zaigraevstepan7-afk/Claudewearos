package p7;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.internal.i0;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzfpa;
import com.google.android.gms.internal.ads.zzftr;
import com.google.android.gms.internal.ads.zzfts;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.android.gms.tasks.OnFailureListener;
import f1.a1;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import m.g1;
import nb.w;
import nc.t;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import rg.h0;
import rg.y;
import s3.q;
import t4.j1;
import t4.l0;
import t4.m1;
import t4.u;
import tj.r0;
import v2.a2;
import v2.f0;
import w3.c0;
import w5.a0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k implements WebMessageListenerBoundaryInterface, ag.j, wb.b, com.google.android.gms.common.internal.e, t4.m, f7.g, OnFailureListener, g1, m.k, zzfpa, zzfts, mg.l, y, c0 {

    /* renamed from: c, reason: collision with root package name */
    public static k f12811c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12812a;

    /* renamed from: b, reason: collision with root package name */
    public Object f12813b;

    public /* synthetic */ k(int i10, boolean z2) {
        this.f12812a = i10;
    }

    @Override // m.g1
    public void a(l.h hVar, MenuItem menuItem) {
        ((l.e) this.f12813b).f9767f.removeCallbacksAndMessages(hVar);
    }

    @Override // f7.g
    public String b() {
        return ((h7.e) this.f12813b).f7684b;
    }

    @Override // mg.l
    public void c(mg.b bVar) {
        fj.l.f(bVar, "error");
    }

    @Override // w3.c0
    public long d(s3.k kVar, long j, s3.m mVar, long j4) {
        long j10 = ((s3.j) ((ej.a) this.f12813b).a()).f14745a;
        return (w.b.a(mVar == s3.m.f14752a, kVar.f14747a + ((int) (j10 >> 32)), (int) (j4 >> 32), (int) (j >> 32)) << 32) | (w.b.a(true, kVar.f14748b + ((int) (j10 & 4294967295L)), (int) (j4 & 4294967295L), (int) (j & 4294967295L)) & 4294967295L);
    }

    @Override // f7.g
    public void e(f7.f fVar) {
        h7.e eVar = (h7.e) this.f12813b;
        int length = eVar.f7679d.length;
        for (int i10 = 1; i10 < length; i10++) {
            int i11 = eVar.f7679d[i10];
            if (i11 == 1) {
                fVar.v(i10, eVar.f7680e[i10]);
            } else if (i11 == 2) {
                fVar.o(i10, eVar.f7681f[i10]);
            } else if (i11 == 3) {
                String str = eVar.f7682z[i10];
                fj.l.c(str);
                fVar.k(i10, str);
            } else if (i11 == 4) {
                byte[] bArr = eVar.A[i10];
                fj.l.c(bArr);
                fVar.E(i10, bArr);
            } else if (i11 == 5) {
                fVar.R(i10);
            }
        }
    }

    @Override // m.g1
    public void f(l.h hVar, l.i iVar) {
        l.e eVar = (l.e) this.f12813b;
        Handler handler = eVar.f9767f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.A;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (hVar == ((l.d) arrayList.get(i10)).f9761b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        handler.postAtTime(new ad.f(4, this, i11 < arrayList.size() ? (l.d) arrayList.get(i11) : null, iVar, hVar, false), hVar, SystemClock.uptimeMillis() + 200);
    }

    public void g(f0 f0Var) {
        if (!f0Var.G()) {
            s2.a.b("DepthSortedSet.add called on an unattached node");
        }
        ((a2) this.f12813b).add(f0Var);
    }

    @Override // oi.a
    public Object get() {
        return new bc.j((Context) ((oi.a) this.f12813b).get(), "com.google.android.datatransport.events", Integer.valueOf(bc.j.f1743d).intValue());
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    public long h(long j) {
        q2.b bVar = (q2.b) this.f12813b;
        bVar.getClass();
        if (q.b(j) <= 0.0f || q.c(j) <= 0.0f) {
            s2.a.b("maximumVelocity should be a positive value. You specified=" + ((Object) q.g(j)));
        }
        return mk.b.f(((q2.d) bVar.f13183b).b(q.b(j)), ((q2.d) bVar.f13184c).b(q.c(j)));
    }

    @Override // t4.m
    public m1 i(View view, m1 m1Var) {
        j1 j1Var = m1Var.f15751a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f12813b;
        if (!Objects.equals(coordinatorLayout.G, m1Var)) {
            coordinatorLayout.G = m1Var;
            boolean z2 = m1Var.a() > 0;
            coordinatorLayout.H = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            if (!j1Var.o()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = coordinatorLayout.getChildAt(i10);
                    Field field = l0.f15744a;
                    if (childAt.getFitsSystemWindows() && ((f4.d) childAt.getLayoutParams()).f6623a != null && j1Var.o()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return m1Var;
    }

    public void j(w8.c cVar) {
        fj.l.f(cVar, "billingResult");
        if (cVar.f18942a != 0) {
            r0 r0Var = nb.o.f12042r;
            w wVar = new w(t.m1.i("Billing setup failed: ", cVar.f18943b));
            r0Var.getClass();
            r0Var.k(null, wVar);
            return;
        }
        nb.o oVar = nb.o.f12026a;
        Activity activity = (Activity) this.f12813b;
        nb.q qVar = nb.o.A;
        List listK = yd.f.K(new w8.i());
        w8.h hVar = new w8.h();
        if (listK.isEmpty()) {
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
        HashSet hashSet = new HashSet();
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            ((w8.i) it.next()).getClass();
            hashSet.add("subs");
        }
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        zzco zzcoVarZzk = zzco.zzk(listK);
        hVar.f18959a = zzcoVarZzk;
        if (zzcoVarZzk == null) {
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }
        a0 a0Var = new a0(hVar);
        w8.a aVar = nb.o.f12050z;
        if (aVar != null) {
            aVar.e(a0Var, new ac.l(12, qVar, activity));
        }
    }

    public boolean k(f0 f0Var) {
        if (!f0Var.G()) {
            s2.a.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((a2) this.f12813b).remove(f0Var);
    }

    public void l(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.f12813b;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            RecyclerView.H(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }

    @Override // rg.y
    public void m(wg.h hVar, rg.a0 a0Var, h0 h0Var, h0 h0Var2) {
        pg.q qVar = ((rg.k) this.f12813b).f14433c;
        ArrayList arrayListB = hVar.f19305a.b();
        HashMap mapA = hVar.f19306b.a();
        Long lValueOf = a0Var != null ? Long.valueOf(a0Var.f14381a) : null;
        qh.c cVar = new qh.c(this, h0Var2);
        HashMap map = qVar.f12939p;
        pg.p pVar = new pg.p(arrayListB, mapA);
        p1.l lVar = qVar.f12948y;
        if (lVar.A()) {
            lVar.l(null, "Listening on " + pVar, new Object[0]);
        }
        hj.a.z(!map.containsKey(pVar), "listen() called twice for same QuerySpec.", new Object[0]);
        if (lVar.A()) {
            lVar.l(null, "Adding listen query: " + pVar, new Object[0]);
        }
        pg.n nVar = new pg.n(cVar, pVar, lValueOf, h0Var);
        map.put(pVar, nVar);
        if (qVar.a()) {
            qVar.l(nVar);
        }
        qVar.b();
    }

    @Override // mg.l
    public void n(mg.a aVar) {
        Boolean bool = (Boolean) aVar.a("showNoWifi").c(Boolean.TYPE);
        if (bool != null) {
            ((a1) this.f12813b).setValue(bool);
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        if (exc instanceof cg.l) {
            qd.a aVar = jg.g.f8886f;
            aVar.e("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            jg.g gVar = (jg.g) ((a8.e) this.f12813b).f202c;
            int i10 = (int) gVar.f8888b;
            gVar.f8888b = (i10 == 30 || i10 == 60 || i10 == 120 || i10 == 240 || i10 == 480) ? 2 * gVar.f8888b : i10 != 960 ? 30L : 960L;
            gVar.f8887a = (gVar.f8888b * 1000) + System.currentTimeMillis();
            aVar.e(t.m1.g(gVar.f8887a, "Scheduling refresh for "), new Object[0]);
            gVar.f8890d.postDelayed(gVar.f8891e, gVar.f8888b * 1000);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPostMessage(android.webkit.WebView r8, java.lang.reflect.InvocationHandler r9, android.net.Uri r10, boolean r11, java.lang.reflect.InvocationHandler r12) {
        /*
            r7 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebMessageBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessageBoundaryInterface.class
            java.lang.Object r9 = mk.b.k(r0, r9)
            org.chromium.support_lib_boundary.WebMessageBoundaryInterface r9 = (org.chromium.support_lib_boundary.WebMessageBoundaryInterface) r9
            java.lang.reflect.InvocationHandler[] r0 = r9.getPorts()
            int r1 = r0.length
            yh.c[] r1 = new yh.c[r1]
            r2 = 0
        L10:
            int r3 = r0.length
            if (r2 >= r3) goto L2c
            yh.c r3 = new yh.c
            r4 = r0[r2]
            r5 = 11
            r6 = 0
            r3.<init>(r5, r6)
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface> r5 = org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface.class
            java.lang.Object r4 = mk.b.k(r5, r4)
            org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface r4 = (org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface) r4
            r3.f20314b = r4
            r1[r2] = r3
            int r2 = r2 + 1
            goto L10
        L2c:
            p7.b r0 = p7.n.f12815a
            boolean r0 = r0.b()
            if (r0 == 0) goto L61
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface.class
            java.lang.reflect.InvocationHandler r9 = r9.getMessagePayload()
            java.lang.Object r9 = mk.b.k(r0, r9)
            org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface r9 = (org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface) r9
            int r0 = r9.getType()
            if (r0 == 0) goto L57
            r1 = 1
            if (r0 == r1) goto L4c
            r9 = 0
            r3 = r9
            goto L6b
        L4c:
            o7.c r0 = new o7.c
            byte[] r9 = r9.getAsArrayBuffer()
            r0.<init>(r9)
        L55:
            r3 = r0
            goto L6b
        L57:
            o7.c r0 = new o7.c
            java.lang.String r9 = r9.getAsString()
            r0.<init>(r9)
            goto L55
        L61:
            o7.c r0 = new o7.c
            java.lang.String r9 = r9.getData()
            r0.<init>(r9)
            goto L55
        L6b:
            if (r3 == 0) goto L8d
            java.lang.Class<org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface> r9 = org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface.class
            java.lang.Object r9 = mk.b.k(r9, r12)
            org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface r9 = (org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface) r9
            h6.c r12 = new h6.c
            r0 = 2
            r12.<init>(r9, r0)
            java.lang.Object r9 = r9.getOrCreatePeer(r12)
            r6 = r9
            p7.i r6 = (p7.i) r6
            java.lang.Object r9 = r7.f12813b
            r1 = r9
            o7.d r1 = (o7.d) r1
            r2 = r8
            r4 = r10
            r5 = r11
            r1.onPostMessage(r2, r3, r4, r5, r6)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.k.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    @Override // ag.j
    public Object q(String str) {
        return ((ag.l) this.f12813b).b(str, null);
    }

    @Override // rg.y
    public void r(wg.h hVar) {
        pg.q qVar = ((rg.k) this.f12813b).f14433c;
        ArrayList arrayListB = hVar.f19305a.b();
        HashMap mapA = hVar.f19306b.a();
        qVar.getClass();
        pg.p pVar = new pg.p(arrayListB, mapA);
        p1.l lVar = qVar.f12948y;
        if (lVar.A()) {
            lVar.l(null, "unlistening on " + pVar, new Object[0]);
        }
        pg.n nVarF = qVar.f(pVar);
        if (nVarF != null) {
            pg.p pVar2 = nVarF.f12916b;
            if (qVar.a()) {
                HashMap map = new HashMap();
                map.put("p", hj.a.E(pVar2.f12923a));
                Long l10 = nVarF.f12918d;
                if (l10 != null) {
                    map.put("q", pVar2.f12924b);
                    map.put("t", l10);
                }
                qVar.n("n", false, map, null);
            }
        }
        qVar.b();
    }

    public String toString() {
        switch (this.f12812a) {
            case 28:
                return ((a2) this.f12813b).toString();
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpa
    public void zza(int i10, long j) {
        ((mc.i) this.f12813b).A.zzd(i10, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfpa
    public void zzb(int i10, long j, String str) {
        ((mc.i) this.f12813b).A.zze(i10, System.currentTimeMillis() - j, str);
    }

    public /* synthetic */ k(Object obj, int i10) {
        this.f12812a = i10;
        this.f12813b = obj;
    }

    public k(int i10) {
        this.f12812a = i10;
        switch (i10) {
            case 8:
                this.f12813b = null;
                break;
            case 19:
                this.f12813b = new q2.b();
                break;
            case 27:
                this.f12813b = wd.a.u(Looper.getMainLooper());
                break;
            case 28:
                this.f12813b = new a2(v2.n.f17730a);
                break;
            default:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                this.f12813b = new dk.f();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public void zza(zzftr zzftrVar) {
        i0 i0Var = (i0) this.f12813b;
        if (!TextUtils.isEmpty(zzftrVar.zzb())) {
            if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzlK)).booleanValue()) {
                i0Var.f3552b = zzftrVar.zzb();
            }
        }
        switch (zzftrVar.zza()) {
            case 8152:
                String str = "onLMDOverlayOpened";
                zzcad.zzf.execute(new b8.b(i0Var, str, new HashMap(), 6, false));
                break;
            case 8153:
                String str2 = "onLMDOverlayClicked";
                zzcad.zzf.execute(new b8.b(i0Var, str2, new HashMap(), 6, false));
                break;
            case 8155:
                String str3 = "onLMDOverlayClose";
                zzcad.zzf.execute(new b8.b(i0Var, str3, new HashMap(), 6, false));
                break;
            case 8157:
                i0Var.f3552b = null;
                i0Var.f3553c = null;
                i0Var.f3551a = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put("error", String.valueOf(zzftrVar.zza()));
                zzcad.zzf.execute(new b8.b(i0Var, "onLMDOverlayFailedToOpen", map, 6, false));
                break;
        }
    }

    public k(boolean z2) {
        this.f12812a = 17;
        this.f12813b = new AtomicBoolean(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a A[PHI: r10
      0x002a: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v4 int) binds: [B:5:0x001a, B:10:0x0023, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(int[] r22, float[] r23, float[][] r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            r2 = 23
            r0.f12812a = r2
            r0.<init>()
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            t.r[][] r4 = new t.r[r2][]
            r5 = 0
            r7 = r3
            r8 = r7
            r6 = r5
        L14:
            if (r6 >= r2) goto L6b
            r9 = r22[r6]
            r10 = 3
            r11 = 2
            if (r9 == 0) goto L2a
            if (r9 == r3) goto L33
            if (r9 == r11) goto L31
            if (r9 == r10) goto L2c
            r10 = 4
            if (r9 == r10) goto L2a
            r10 = 5
            if (r9 == r10) goto L2a
            r13 = r8
            goto L35
        L2a:
            r13 = r10
            goto L35
        L2c:
            if (r7 != r3) goto L33
            goto L31
        L2f:
            r13 = r7
            goto L35
        L31:
            r7 = r11
            goto L2f
        L33:
            r7 = r3
            goto L2f
        L35:
            r8 = r24[r6]
            int r9 = r6 + 1
            r10 = r24[r9]
            r14 = r1[r6]
            r15 = r1[r9]
            int r12 = r8.length
            int r12 = r12 / r11
            int r3 = r8.length
            int r3 = r3 % r11
            int r3 = r3 + r12
            t.r[] r11 = new t.r[r3]
            r12 = r5
        L47:
            if (r12 >= r3) goto L65
            int r16 = r12 * 2
            r17 = r12
            t.r r12 = new t.r
            r18 = r16
            r16 = r8[r18]
            int r19 = r18 + 1
            r20 = r17
            r17 = r8[r19]
            r18 = r10[r18]
            r19 = r10[r19]
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r11[r20] = r12
            int r12 = r20 + 1
            goto L47
        L65:
            r4[r6] = r11
            r6 = r9
            r8 = r13
            r3 = 1
            goto L14
        L6b:
            r0.f12813b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.k.<init>(int[], float[], float[][]):void");
    }

    public k(View view) {
        this.f12812a = 25;
        if (Build.VERSION.SDK_INT >= 30) {
            u uVar = new u(view, 24);
            uVar.f15779c = view;
            this.f12813b = uVar;
            return;
        }
        this.f12813b = new ag.i(view, 24);
    }
}
