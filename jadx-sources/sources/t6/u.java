package t6;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u extends r5.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16064d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(e0 e0Var, int i10) {
        super(e0Var);
        this.f16064d = i10;
    }

    @Override // r5.g
    public final int d(View view) {
        int right;
        int i10;
        switch (this.f16064d) {
            case 0:
                f0 f0Var = (f0) view.getLayoutParams();
                ((e0) this.f13731b).getClass();
                right = view.getRight() + ((f0) view.getLayoutParams()).f15894b.right;
                i10 = ((ViewGroup.MarginLayoutParams) f0Var).rightMargin;
                break;
            default:
                f0 f0Var2 = (f0) view.getLayoutParams();
                ((e0) this.f13731b).getClass();
                right = view.getBottom() + ((f0) view.getLayoutParams()).f15894b.bottom;
                i10 = ((ViewGroup.MarginLayoutParams) f0Var2).bottomMargin;
                break;
        }
        return right + i10;
    }

    @Override // r5.g
    public final int e(View view) {
        int iA;
        int i10;
        switch (this.f16064d) {
            case 0:
                f0 f0Var = (f0) view.getLayoutParams();
                ((e0) this.f13731b).getClass();
                iA = e0.A(view) + ((ViewGroup.MarginLayoutParams) f0Var).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) f0Var).rightMargin;
                break;
            default:
                f0 f0Var2 = (f0) view.getLayoutParams();
                ((e0) this.f13731b).getClass();
                iA = e0.z(view) + ((ViewGroup.MarginLayoutParams) f0Var2).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) f0Var2).bottomMargin;
                break;
        }
        return iA + i10;
    }

    @Override // r5.g
    public final int f(View view) {
        int iZ;
        int i10;
        switch (this.f16064d) {
            case 0:
                f0 f0Var = (f0) view.getLayoutParams();
                ((e0) this.f13731b).getClass();
                iZ = e0.z(view) + ((ViewGroup.MarginLayoutParams) f0Var).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) f0Var).bottomMargin;
                break;
            default:
                f0 f0Var2 = (f0) view.getLayoutParams();
                ((e0) this.f13731b).getClass();
                iZ = e0.A(view) + ((ViewGroup.MarginLayoutParams) f0Var2).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) f0Var2).rightMargin;
                break;
        }
        return iZ + i10;
    }

    @Override // r5.g
    public final int g(View view) {
        int left;
        int i10;
        switch (this.f16064d) {
            case 0:
                f0 f0Var = (f0) view.getLayoutParams();
                ((e0) this.f13731b).getClass();
                left = view.getLeft() - ((f0) view.getLayoutParams()).f15894b.left;
                i10 = ((ViewGroup.MarginLayoutParams) f0Var).leftMargin;
                break;
            default:
                f0 f0Var2 = (f0) view.getLayoutParams();
                ((e0) this.f13731b).getClass();
                left = view.getTop() - ((f0) view.getLayoutParams()).f15894b.top;
                i10 = ((ViewGroup.MarginLayoutParams) f0Var2).topMargin;
                break;
        }
        return left - i10;
    }

    @Override // r5.g
    public final int h() {
        switch (this.f16064d) {
            case 0:
                return ((e0) this.f13731b).f15881n;
            default:
                return ((e0) this.f13731b).f15882o;
        }
    }

    @Override // r5.g
    public final int i() {
        int i10;
        int iF;
        switch (this.f16064d) {
            case 0:
                e0 e0Var = (e0) this.f13731b;
                i10 = e0Var.f15881n;
                iF = e0Var.F();
                break;
            default:
                e0 e0Var2 = (e0) this.f13731b;
                i10 = e0Var2.f15882o;
                iF = e0Var2.D();
                break;
        }
        return i10 - iF;
    }

    @Override // r5.g
    public final int j() {
        switch (this.f16064d) {
            case 0:
                return ((e0) this.f13731b).F();
            default:
                return ((e0) this.f13731b).D();
        }
    }

    @Override // r5.g
    public final int k() {
        switch (this.f16064d) {
            case 0:
                return ((e0) this.f13731b).f15879l;
            default:
                return ((e0) this.f13731b).f15880m;
        }
    }

    @Override // r5.g
    public final int l() {
        switch (this.f16064d) {
            case 0:
                return ((e0) this.f13731b).f15880m;
            default:
                return ((e0) this.f13731b).f15879l;
        }
    }

    @Override // r5.g
    public final int m() {
        switch (this.f16064d) {
            case 0:
                return ((e0) this.f13731b).E();
            default:
                return ((e0) this.f13731b).G();
        }
    }

    @Override // r5.g
    public final int n() {
        int iE;
        int iF;
        switch (this.f16064d) {
            case 0:
                e0 e0Var = (e0) this.f13731b;
                iE = e0Var.f15881n - e0Var.E();
                iF = e0Var.F();
                break;
            default:
                e0 e0Var2 = (e0) this.f13731b;
                iE = e0Var2.f15882o - e0Var2.G();
                iF = e0Var2.D();
                break;
        }
        return iE - iF;
    }

    @Override // r5.g
    public final int o(View view) {
        switch (this.f16064d) {
            case 0:
                e0 e0Var = (e0) this.f13731b;
                Rect rect = (Rect) this.f13732c;
                e0Var.K(view, rect);
                return rect.right;
            default:
                e0 e0Var2 = (e0) this.f13731b;
                Rect rect2 = (Rect) this.f13732c;
                e0Var2.K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // r5.g
    public final int p(View view) {
        switch (this.f16064d) {
            case 0:
                e0 e0Var = (e0) this.f13731b;
                Rect rect = (Rect) this.f13732c;
                e0Var.K(view, rect);
                return rect.left;
            default:
                e0 e0Var2 = (e0) this.f13731b;
                Rect rect2 = (Rect) this.f13732c;
                e0Var2.K(view, rect2);
                return rect2.top;
        }
    }

    @Override // r5.g
    public final void q(int i10) {
        switch (this.f16064d) {
            case 0:
                ((e0) this.f13731b).O(i10);
                break;
            default:
                ((e0) this.f13731b).P(i10);
                break;
        }
    }
}
