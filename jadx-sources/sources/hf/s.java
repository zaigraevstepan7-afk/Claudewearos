package hf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import m.g0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class s extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7950a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f7951b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7952c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f7953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f7954e;

    public s(u uVar, int i10, TextView textView, int i11, TextView textView2) {
        this.f7954e = uVar;
        this.f7950a = i10;
        this.f7951b = textView;
        this.f7952c = i11;
        this.f7953d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g0 g0Var;
        int i10 = this.f7950a;
        u uVar = this.f7954e;
        uVar.f7968n = i10;
        uVar.f7966l = null;
        TextView textView = this.f7951b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f7952c == 1 && (g0Var = uVar.f7972r) != null) {
                g0Var.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f7953d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f7953d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
