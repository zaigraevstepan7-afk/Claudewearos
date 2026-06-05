package pe;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b extends a.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12870c;

    @Override // a.a
    public final int E(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int measuredHeight;
        int i10;
        switch (this.f12870c) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i10 = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i10 = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i10 = marginLayoutParams.rightMargin;
                break;
        }
        return measuredHeight + i10;
    }

    @Override // a.a
    public final int G() {
        switch (this.f12870c) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }

    @Override // a.a
    public final ViewPropertyAnimator H(View view, int i10) {
        switch (this.f12870c) {
            case 0:
                return view.animate().translationY(i10);
            case 1:
                return view.animate().translationX(-i10);
            default:
                return view.animate().translationX(i10);
        }
    }
}
