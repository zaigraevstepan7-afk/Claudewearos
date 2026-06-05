package t6;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v extends t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ w f16067q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, Context context) {
        super(context);
        this.f16067q = wVar;
    }

    @Override // t6.t
    public final float d(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // t6.t
    public final int e(int i10) {
        return Math.min(100, super.e(i10));
    }

    @Override // t6.t
    public final void h(View view, o0 o0Var) {
        w wVar = this.f16067q;
        int[] iArrA = wVar.a(wVar.f16070a.getLayoutManager(), view);
        int i10 = iArrA[0];
        int i11 = iArrA[1];
        int iCeil = (int) Math.ceil(e(Math.max(Math.abs(i10), Math.abs(i11))) / 0.3356d);
        if (iCeil > 0) {
            o0Var.f15980a = i10;
            o0Var.f15981b = i11;
            o0Var.f15982c = iCeil;
            o0Var.f15984e = this.j;
            o0Var.f15985f = true;
        }
    }
}
