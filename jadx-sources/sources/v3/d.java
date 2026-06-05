package v3;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import t2.q0;
import t2.r0;
import t2.s0;
import v2.f0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f17816a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f17817b;

    public d(w wVar, f0 f0Var) {
        this.f17816a = wVar;
        this.f17817b = f0Var;
    }

    @Override // t2.q0
    public final r0 a(s0 s0Var, List list, long j) {
        w wVar = this.f17816a;
        int childCount = wVar.getChildCount();
        qi.t tVar = qi.t.f13521a;
        if (childCount == 0) {
            return s0Var.B(s3.a.j(j), s3.a.i(j), tVar, b.f17809c);
        }
        if (s3.a.j(j) != 0) {
            wVar.getChildAt(0).setMinimumWidth(s3.a.j(j));
        }
        if (s3.a.i(j) != 0) {
            wVar.getChildAt(0).setMinimumHeight(s3.a.i(j));
        }
        int iJ = s3.a.j(j);
        int iH = s3.a.h(j);
        ViewGroup.LayoutParams layoutParams = wVar.getLayoutParams();
        fj.l.c(layoutParams);
        int iK = h.k(wVar, iJ, iH, layoutParams.width);
        int i10 = s3.a.i(j);
        int iG = s3.a.g(j);
        ViewGroup.LayoutParams layoutParams2 = wVar.getLayoutParams();
        fj.l.c(layoutParams2);
        wVar.measure(iK, h.k(wVar, i10, iG, layoutParams2.height));
        return s0Var.B(wVar.getMeasuredWidth(), wVar.getMeasuredHeight(), tVar, new c(wVar, this.f17817b, 1));
    }

    @Override // t2.q0
    public final int f(t2.r rVar, List list, int i10) {
        w wVar = this.f17816a;
        ViewGroup.LayoutParams layoutParams = wVar.getLayoutParams();
        fj.l.c(layoutParams);
        wVar.measure(h.k(wVar, 0, i10, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return wVar.getMeasuredHeight();
    }

    @Override // t2.q0
    public final int g(t2.r rVar, List list, int i10) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        w wVar = this.f17816a;
        ViewGroup.LayoutParams layoutParams = wVar.getLayoutParams();
        fj.l.c(layoutParams);
        wVar.measure(iMakeMeasureSpec, h.k(wVar, 0, i10, layoutParams.height));
        return wVar.getMeasuredWidth();
    }

    @Override // t2.q0
    public final int h(t2.r rVar, List list, int i10) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        w wVar = this.f17816a;
        ViewGroup.LayoutParams layoutParams = wVar.getLayoutParams();
        fj.l.c(layoutParams);
        wVar.measure(iMakeMeasureSpec, h.k(wVar, 0, i10, layoutParams.height));
        return wVar.getMeasuredWidth();
    }

    @Override // t2.q0
    public final int i(t2.r rVar, List list, int i10) {
        w wVar = this.f17816a;
        ViewGroup.LayoutParams layoutParams = wVar.getLayoutParams();
        fj.l.c(layoutParams);
        wVar.measure(h.k(wVar, 0, i10, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return wVar.getMeasuredHeight();
    }
}
