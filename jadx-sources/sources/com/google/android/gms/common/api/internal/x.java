package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import w2.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x implements xg.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3595a;

    /* renamed from: b, reason: collision with root package name */
    public int f3596b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3597c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3598d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3599e;

    public /* synthetic */ x() {
        this.f3595a = 0;
    }

    public r0 a() {
        com.google.android.gms.common.internal.e0.a("execute parameter required", ((t) this.f3598d) != null);
        return new r0(this, (nd.d[]) this.f3599e, this.f3597c, this.f3596b);
    }

    public void b(int i10) {
        switch (this.f3595a) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f3599e;
                WeakReference weakReference = sideSheetBehavior.f3935p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f3596b = i10;
                    if (!this.f3597c) {
                        ((View) sideSheetBehavior.f3935p.get()).postOnAnimation((ac.o) this.f3598d);
                        this.f3597c = true;
                        break;
                    }
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f3599e;
                WeakReference weakReference2 = bottomSheetBehavior.W;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f3596b = i10;
                    if (!this.f3597c) {
                        ((View) bottomSheetBehavior.W.get()).postOnAnimation((ah.d) this.f3598d);
                        this.f3597c = true;
                        break;
                    }
                }
                break;
        }
    }

    @Override // xg.b
    public yh.c e() {
        return (yh.c) ((a8.j) this.f3598d).f215a;
    }

    @Override // xg.b
    public boolean f() {
        return true;
    }

    @Override // xg.b
    public zg.k getIndex() {
        return (zg.k) this.f3599e;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0154  */
    @Override // xg.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zg.l h(zg.l r18, zg.c r19, zg.r r20, rg.h r21, xg.a r22, rg.a r23) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.x.h(zg.l, zg.c, zg.r, rg.h, xg.a, rg.a):zg.l");
    }

    @Override // xg.b
    public zg.l i(zg.l lVar, zg.l lVar2, rg.a aVar) {
        zg.l lVar3;
        Iterator it;
        zg.p pVar;
        zg.p pVar2;
        int i10;
        zg.k kVar = (zg.k) this.f3599e;
        a8.j jVar = (a8.j) this.f3598d;
        zg.r rVar = lVar2.f20605a;
        if (rVar.n() || rVar.isEmpty()) {
            lVar3 = new zg.l(zg.j.f20603e, kVar);
        } else {
            lVar3 = new zg.l(lVar2.f20605a.m(zg.j.f20603e), lVar2.f20607c, lVar2.f20606b);
            if (this.f3597c) {
                lVar2.b();
                it = com.google.android.gms.common.internal.e0.l(lVar2.f20606b, zg.l.f20604d) ? rVar.u() : new og.e(lVar2.f20606b.f12516a.u(), 0);
                pVar = (zg.p) jVar.f218d;
                pVar2 = (zg.p) jVar.f217c;
                i10 = -1;
            } else {
                it = lVar2.iterator();
                pVar = (zg.p) jVar.f217c;
                pVar2 = (zg.p) jVar.f218d;
                i10 = 1;
            }
            boolean z2 = false;
            int i11 = 0;
            while (it.hasNext()) {
                zg.p pVar3 = (zg.p) it.next();
                if (!z2 && kVar.compare(pVar, pVar3) * i10 <= 0) {
                    z2 = true;
                }
                if (!z2 || i11 >= this.f3596b || kVar.compare(pVar3, pVar2) * i10 > 0) {
                    lVar3 = lVar3.i(pVar3.f20614a, zg.j.f20603e);
                } else {
                    i11++;
                }
            }
        }
        ((yh.c) jVar.f215a).i(lVar, lVar3, aVar);
        return lVar3;
    }

    public x(wg.g gVar) {
        this.f3595a = 4;
        this.f3598d = new a8.j(gVar);
        this.f3599e = gVar.f19304e;
        throw new IllegalArgumentException("Cannot get limit if limit has not been set");
    }

    public x(SideSheetBehavior sideSheetBehavior) {
        this.f3595a = 1;
        this.f3599e = sideSheetBehavior;
        this.f3598d = new ac.o(this, 8);
    }

    public x(BottomSheetBehavior bottomSheetBehavior) {
        this.f3595a = 2;
        this.f3599e = bottomSheetBehavior;
        this.f3598d = new ah.d(this, 24);
    }

    public x(Context context, w2.p pVar) {
        this.f3595a = 3;
        this.f3598d = pVar;
        this.f3596b = 0;
        this.f3599e = new GestureDetector(context, new m1(this));
    }

    @Override // xg.b
    public zg.l g(zg.l lVar, zg.r rVar) {
        return lVar;
    }
}
