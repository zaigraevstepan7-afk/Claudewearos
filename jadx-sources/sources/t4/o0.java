package t4;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f15756a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1 f15757b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m1 f15758c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f15760e;

    public o0(v0 v0Var, m1 m1Var, m1 m1Var2, int i10, View view) {
        this.f15756a = v0Var;
        this.f15757b = m1Var;
        this.f15758c = m1Var2;
        this.f15759d = i10;
        this.f15760e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        v0 v0Var = this.f15756a;
        u0 u0Var = v0Var.f15784a;
        u0Var.e(animatedFraction);
        m1 m1Var = this.f15757b;
        j1 j1Var = m1Var.f15751a;
        float fC = u0Var.c();
        PathInterpolator pathInterpolator = q0.f15766e;
        int i10 = Build.VERSION.SDK_INT;
        b1 a1Var = i10 >= 34 ? new a1(m1Var) : i10 >= 31 ? new z0(m1Var) : i10 >= 30 ? new y0(m1Var) : i10 >= 29 ? new x0(m1Var) : new w0(m1Var);
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((this.f15759d & i11) == 0) {
                a1Var.c(i11, j1Var.g(i11));
            } else {
                l4.b bVarG = j1Var.g(i11);
                l4.b bVarG2 = this.f15758c.f15751a.g(i11);
                float f10 = 1.0f - fC;
                a1Var.c(i11, m1.b(bVarG, (int) (((bVarG.f9967a - bVarG2.f9967a) * f10) + 0.5d), (int) (((bVarG.f9968b - bVarG2.f9968b) * f10) + 0.5d), (int) (((bVarG.f9969c - bVarG2.f9969c) * f10) + 0.5d), (int) (((bVarG.f9970d - bVarG2.f9970d) * f10) + 0.5d)));
            }
        }
        q0.h(this.f15760e, a1Var.b(), Collections.singletonList(v0Var));
    }
}
