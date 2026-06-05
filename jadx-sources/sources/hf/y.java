package hf;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class y implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7994a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7995b;

    public /* synthetic */ y(Object obj, int i10) {
        this.f7994a = i10;
        this.f7995b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f7994a) {
            case 0:
                ((TextInputLayout) this.f7995b).P0.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ef.i iVar = ((BottomSheetBehavior) this.f7995b).f3807i;
                if (iVar != null) {
                    ef.g gVar = iVar.f6000b;
                    if (gVar.j != fFloatValue) {
                        gVar.j = fFloatValue;
                        iVar.f6004f = true;
                        iVar.f6005z = true;
                        iVar.invalidateSelf();
                        break;
                    }
                }
                break;
            default:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                t6.k kVar = (t6.k) this.f7995b;
                kVar.f15925c.setAlpha(iFloatValue);
                kVar.f15926d.setAlpha(iFloatValue);
                kVar.f15940s.invalidate();
                break;
        }
    }
}
